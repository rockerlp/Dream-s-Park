/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaNegocios;
import CapaDatos.DInventario;
import java.sql.*;
import java.util.LinkedList;


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
    
    public static String insertar(String nombre, String cantidad, String pCompra, String pVenta, String tipInv) throws SQLException{
        DInventario obj = new DInventario();       
        obj.setNombre(nombre);
        obj.setCantidad(cantidad);
        obj.setpCompra(pCompra);
        obj.setpVenta(pVenta);
        obj.setTipoInv(tipInv);
        return obj.InsertarInventario(obj);
    }
    public static String Editar(int idInventario,String nombre, String cantidad, String pCmp, String pVta) throws SQLException{
        DInventario obj = new DInventario();
        obj.setIdInventario(idInventario);
        obj.setNombre(nombre);
        obj.setCantidad(cantidad);
        obj.setpCompra(pCmp);
        obj.setpVenta(pVta);
        return obj.EditarInv(obj);
        
    }
    public static String Eliminar(int idInventario,String nombre, String cantidad, String pCmp, String pVta) throws SQLException{
        DInventario obj = new DInventario();
        obj.setIdInventario(idInventario);
        obj.setNombre(nombre);
        obj.setCantidad(cantidad);
        obj.setpCompra(pCmp);
        obj.setpVenta(pVta);
        return obj.EliminarInv(obj);
        
    }
}
