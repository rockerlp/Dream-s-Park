/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaNegocios;

import CapaDatos.DFactura;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author lhtc9
 */
public class NFactura {
    public NFactura() {
    }
    public ResultSet Mostrar() throws SQLException{
        return new DFactura().Mostrar();
    }
    public static String Insertar(String fecha, String desc, double subt, double ivaC, double ivaD, double total, int idE) throws SQLException{
        DFactura obj = new DFactura();
        obj.setFecha(fecha);
        obj.setDescripcion(desc);
        obj.setSubtotal(subt);
        obj.setIvaCero(ivaC);
        obj.setIvaDoce(ivaD);
        obj.setTotal(total);
        obj.setIdEventos(idE);
        return obj.InsertarFactura(obj);        
    }
    
}
