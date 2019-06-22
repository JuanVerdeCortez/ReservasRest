package com.respaq.rest.repositorio;

import com.respaq.rest.entidad.Reserva;
import org.springframework.data.repository.CrudRepository;

public interface ReservaRepository extends CrudRepository<Reserva,Long> {
}
