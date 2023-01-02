/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package com.mi.banco.recharge.integration.p2p.soap;
import java.math.BigDecimal;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author kerwin
 */
@WebService(serviceName = "ServiceSoap")
public class ServiceSoap {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "notificarPago")
    public RespuestaNotificacion notificarPago(@WebParam(name = "telefono_origen") String telefono_origen,
            @WebParam(name = "telefono_destino") String telefono_destino,
            @WebParam(name = "cedula") String cedula,
            @WebParam(name = "monto") BigDecimal monto,
            @WebParam(name = "referencia") String referencia
    ) {

        RespuestaNotificacion respuestaNotificacion = new RespuestaNotificacion("0", "TRANSACCTION EXITOSA", "123454475");

        return respuestaNotificacion;
    }
    
     /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "notificarReverso")
    public RespuestaNotificacion notificarReverso(@WebParam(name = "referencia") String referencia) {
        RespuestaNotificacion respuestaNotificacion = new RespuestaNotificacion("0", "TRANSACCTION EXITOSA", "123454475");
        return respuestaNotificacion;
    }
    
    
}
