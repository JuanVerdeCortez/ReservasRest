package com.respaq.rest.entidad;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "TB_PAGO_RESERVA")
public class PagoReserva implements Serializable {

    private static final Long serialVersionUID = 2L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPagoReserva;
    private Double pr_monto;
    private String pr_estado;
    private Date re_registerDate;
    private Date re_updateDate;
    private String re_userUpdate;

    public Long getIdPagoReserva() {
        return idPagoReserva;
    }

    public void setIdPagoReserva(Long idPagoReserva) {
        this.idPagoReserva = idPagoReserva;
    }

    public Double getPr_monto() {
        return pr_monto;
    }

    public void setPr_monto(Double pr_monto) {
        this.pr_monto = pr_monto;
    }

    public String getPr_estado() {
        return pr_estado;
    }

    public void setPr_estado(String pr_estado) {
        this.pr_estado = pr_estado;
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
