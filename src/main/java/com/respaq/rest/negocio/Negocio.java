package com.respaq.rest.negocio;

import com.respaq.rest.entidad.PagoReserva;
import com.respaq.rest.entidad.Reserva;
import com.respaq.rest.repositorio.PagoReservaRepository;
import com.respaq.rest.repositorio.ReservaRepository;
import com.respaq.rest.util.Constantes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.Date;
import java.util.List;

@Service
public class Negocio {

    @Autowired
    private PagoReservaRepository pagoReservaRepository;
    @Autowired
    private ReservaRepository reservaRepository;

    private Date fechaActual = new Date();

    public List<Reserva> listarReservas(){
        return (List<Reserva>) reservaRepository.findAll();
    }

    public Reserva crearReserva(Reserva reserva) throws Exception {
        reserva.setRe_registerDate(Constantes.General.fechaActual());
        return reservaRepository.save(reserva);
    }

    public Reserva actualizarReserva(Reserva reserva) throws Exception {
        Reserva r = reservaRepository.findById(reserva.getIdReserva()).orElseThrow(() -> new Exception("La reserva no existe"));
        r.setIdTemporal(reserva.getIdTemporal());
        r.setRe_descripcion(reserva.getRe_descripcion());
        r.setRe_estado(reserva.getRe_estado());
        return reservaRepository.save(r);
    }

    public List<PagoReserva> listarPagosReservas(){
        return (List<PagoReserva>) pagoReservaRepository.findAll();
    }

    public PagoReserva crearPagoReserva(PagoReserva pagoReserva) throws Exception {
        return pagoReservaRepository.save(pagoReserva);
    }

    public PagoReserva actualizarPagoReserva(PagoReserva pagoReserva) throws Exception {
        PagoReserva p = pagoReservaRepository.findById(pagoReserva.getIdPagoReserva()).orElseThrow(() -> new Exception("El pago no existe"));
        p.setPr_estado(pagoReserva.getPr_estado());

        p.setPr_monto(pagoReserva.getPr_monto());
        return pagoReservaRepository.save(p);
    }
}
