package com.respaq.rest.controller;

import com.respaq.rest.entidad.PagoReserva;
import com.respaq.rest.negocio.Negocio;
import com.respaq.rest.util.Constantes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/PagoReservaRest")
public class PagoReservaController {

    @Autowired
    private Negocio negocio;

    @GetMapping("/pagosReservas")
    public List<PagoReserva> listarPagoReserva(){
        return (List<PagoReserva>) negocio.listarPagosReservas();
    }

    @PostMapping("/pagoReserva")
    public PagoReserva crearPagoReserva(@RequestBody PagoReserva pagoReserva){
        PagoReserva r = new PagoReserva();
        try {
            pagoReserva.setRe_registerDate(Constantes.General.fechaActual());
            r =  negocio.crearPagoReserva(pagoReserva);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"No es posible crear la reserva");
        }
        return r;
    }

    @PutMapping("/pagoReserva")
    public PagoReserva actualizarPagoReserva(@RequestBody PagoReserva pagoReserva){
        PagoReserva r = new PagoReserva();
        try {
            pagoReserva.setRe_updateDate(Constantes.General.fechaActual());
            r =  negocio.actualizarPagoReserva(pagoReserva);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"No es posible crear la reserva");
        }
        return r;
    }

}


