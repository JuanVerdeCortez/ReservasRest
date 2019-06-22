package com.respaq.rest.util;

import java.util.Date;

public final class Constantes {

    public static class General {

        public static java.sql.Date fechaActual(){
            Date fecha = new Date();
            java.sql.Date fechaSQL = new java.sql.Date(fecha.getTime());
            return fechaSQL;
        }
    }
}
