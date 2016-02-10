/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaNegocios;


import CapaDatos.DReservacion;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author jfpal
 */
public class NReservacion {

    public NReservacion() {
    }
    
    public ResultSet MostrarActivos() throws SQLException{
        return new DReservacion().MostrarActivos();
    }
    
    public ResultSet MostrarCompletados() throws SQLException{
        return new DReservacion().MostrarCompletados();
    }
    
    public ResultSet MostrarCancelados() throws SQLException{
        return new DReservacion().MostrarCancelados();
    }
    
    public static int BuscarEvento(String fecha,String desc,String sal, int np, double cost) throws SQLException{
        return new DReservacion().BuscarEvento(fecha, desc,sal,np,cost);
    }
    
    public static int BuscarCliente(String nom,String ape) throws SQLException{
        return new DReservacion().BuscarCliente(nom, ape);
    }
    
    public static int BuscarEstadoReservacion(String nom) throws SQLException{
        return new DReservacion().BuscarEstadoReservacion(nom);
    }
    
    public static String insertar(String fecha,
            String desc, double pr, 
            int idEv,int idC,int idEst) throws SQLException
    {
        DReservacion obj = new DReservacion();
        obj.setFecha(fecha);
        obj.setDesc(desc);
        obj.setPrecio(pr);
        obj.setIdEventos(idEv);
        obj.setIdCliente(idC);
        obj.setIdEstado(idEst);
        
        return obj.InsertarReservacion(obj);
        
    }
    public static String Editar(int idR,String fecha,
            String desc, double pr, 
            int idEv,int idC,int idEst) throws SQLException{
        DReservacion obj = new DReservacion();
        obj.setIdReservacion(idR);
        obj.setFecha(fecha);
        obj.setDesc(desc);
        obj.setPrecio(pr);
        obj.setIdEventos(idEv);
        obj.setIdCliente(idC);
        obj.setIdEstado(idEst);
        return obj.EditarReservacion(obj);
        
    }
    public static String Eliminar(int idR,String fecha,
            String desc, double pr, 
            int idEv,int idC,int idE) throws SQLException{
        DReservacion obj = new DReservacion();
        obj.setIdReservacion(idR);
        obj.setFecha(fecha);
        obj.setDesc(desc);
        obj.setPrecio(pr);
        obj.setIdEventos(idEv);
        obj.setIdCliente(idC);
        obj.setIdEventos(idEv);
        return obj.EliminarRerservacion(obj);
        
    }
    
     public ResultSet MostrarClientes() throws SQLException{
        return new DReservacion().MostrarClientes();
    }
     
     public ResultSet MostrarTematicas() throws SQLException{
        return new DReservacion().MostrarTematicas();
    }
     
     public ResultSet MostrarTipos() throws SQLException{
        return new DReservacion().MostrarTipos();
    }
    
}
