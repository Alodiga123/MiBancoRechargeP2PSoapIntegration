/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mi.banco.recharge.integration.p2p.soap;
/**
 *
 * @author kerwin
 */
public class RespuestaNotificacion implements java.io.Serializable {
    
    private String estatus;

    private String mensaje;

    private String referencia;

    public RespuestaNotificacion(String estatus, String mensaje, String referencia) {
        this.estatus = estatus;
        this.mensaje = mensaje;
        this.referencia = referencia;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    @Override
    public String toString() {
        return "RespuestaNotificacion{" + "estatus=" + estatus + ", mensaje=" + mensaje + ", referencia=" + referencia + '}';
    }
}
