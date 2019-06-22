package com.respaq.rest.controller;

import com.respaq.rest.entidad.PagoReserva;
import com.respaq.rest.entidad.Reserva;
import com.respaq.rest.negocio.Negocio;
import com.respaq.rest.util.Constantes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/ReservaRest")
public class ReservaController {

    @Autowired
    private Negocio negocio;

    @GetMapping("/reservas")
    public List<Reserva> listarReservas(){
        return (List<Reserva>)  negocio.listarReservas();
    }

    @PostMapping("/reserva")
    public Reserva crearReserva(@RequestBody Reserva reserva){
        Reserva r= new Reserva();
        try {
            System.out.println("desc " + reserva.getRe_descripcion());
            r =  negocio.crearReserva(reserva);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"No es posible crear la reserva");
        }
        return r;
    }

    @PutMapping("/reserva")
    public Reserva actualizar(@RequestBody Reserva reserva){
        Reserva r = new Reserva();
        try {
            reserva.setRe_updateDate(Constantes.General.fechaActual());
            r =  negocio.actualizarReserva(reserva);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"No fue posible editar la reserva");
        }
        return r;
    }
}
