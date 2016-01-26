/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaNegocios;
import CapaDatos.DInventario;
import java.sql.*;

/**
 *
 * @author lhtc9
 */
public class NInventario {
    public NInventario() {
    }
    public ResultSet Mostrar() throws SQLException{
        return new DInventario().Mostrar();
    }
    
    public static String insertar(String nombre, int cantidad, int tipo, String descripcion, double pCompra, double pVenta) throws SQLException{
        DInventario obj = new DInventario();       
        obj.setNombre(nombre);
        obj.setCantidad(cantidad);
        obj.setTipo(tipo);
        obj.setDescripcion(descripcion);
        obj.setpCompra(pCompra);
        obj.setpVenta(pVenta);
        return obj.InsertarInventario(obj);
    }
}
