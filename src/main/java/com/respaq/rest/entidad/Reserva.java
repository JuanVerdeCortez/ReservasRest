package com.respaq.rest.entidad;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;


@Entity
@Table(name = "TB_RESERVA")
public class Reserva implements Serializable {

    private static final Long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReserva;
    private String re_descripcion;
    //Deberia ser una relacion con la tabla Temporal
    private Long idTemporal;
    private String re_estado;
    private Date re_registerDate;
    private Date re_updateDate;
    private String re_userUpdate;

    public Long getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(Long idReserva) {
        this.idReserva = idReserva;
    }

    public String getRe_descripcion() {
        return re_descripcion;
    }

    public void setRe_descripcion(String re_descripcion) {
        this.re_descripcion = re_descripcion;
    }

    public Long getIdTemporal() {
        return idTemporal;
    }

    public void setIdTemporal(Long idTemporal) {
        this.idTemporal = idTemporal;
    }

    public String getRe_estado() {
        return re_estado;
    }

    public void setRe_estado(String re_estado) {
        this.re_estado = re_estado;
    }

    public Date getRe_registerDate() {
        return re_registerDate;
    }

    public void setRe_registerDate(Date re_registerDate) {
        this.re_registerDate = re_registerDate;
    }

    public Date getRe_updateDate() {
        return re_updateDate;
    }

    public void setRe_updateDate(Date re_updateDate) {
        this.re_updateDate = re_updateDate;
    }

    public String getRe_userUpdate() {
        return re_userUpdate;
    }

    public void setRe_userUpdate(String re_userUpdate) {
        this.re_userUpdate = re_userUpdate;
    }
}
