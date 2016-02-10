/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaNegocios;

import CapaDatos.DEvento;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author jfpal
 */
public class NEvento {

    public NEvento() {
    }
    
    public ResultSet MostrarActivos() throws SQLException{
        return new DEvento().MostrarActivos();
    }
    
    public ResultSet MostrarCompletos() throws SQLException{
        return new DEvento().MostrarCompletados();
    }
    
    public ResultSet MostrarCancelados() throws SQLException{
        return new DEvento().MostrarCancelados();
    }
    
    public ResultSet MostrarTematicas() throws SQLException{
        return new DEvento().MostrarTematicas();
    }
    
    public ResultSet MostrarTipos() throws SQLException{
        return new DEvento().MostrarTipos();
    }
    
    public ResultSet MostrarTematicasNombres() throws SQLException{
        return new DEvento().MostrarTematicasNombres();
    }
    
    public ResultSet MostrarTiposNombres() throws SQLException{
        return new DEvento().MostrarTiposNombres();
    }
    
    public ResultSet MostrarClientes() throws SQLException{
        return new DEvento().MostrarClientes();
    }
    
    public static String IngresarTematica(String nom, String desc) throws SQLException{
        return new DEvento().InsertarTematica(nom, desc);
    }
    
    public static String EditarTematica(String nom, String desc) throws SQLException{
        return new DEvento().EditarTematica(nom, desc);
    }
    
    public static String EliminarTematica(String nom) throws SQLException{
        return new DEvento().EliminarTematica(nom);
    }
    
    public static String IngresarTipo(String nom, String desc) throws SQLException{
        return new DEvento().InsertarTipo(nom, desc);
    }
    
    public static String EditarTipo(String nom, String desc) throws SQLException{
        return new DEvento().EditarTipo(nom, desc);
    }
    
    public static String EliminarTipo(String nom) throws SQLException{
        return new DEvento().EliminarTipo(nom);
    }
    
    
    
    public static int BuscarTematicaNombre(String nombre) throws SQLException{
        return new DEvento().BuscarTematicaNombre(nombre);
    }
    
    public static int BuscarTipoNombre(String nombre) throws SQLException{
        return new DEvento().BuscarTipoNombre(nombre);
    }
    
    public static int BuscarEstadoNombre(String nombre) throws SQLException{
        return new DEvento().BuscarEstadoNombre(nombre);
    }
    
    public static String insertar(String fecha,String salon,int np,
            String desc, double pr, 
            int idTem,int idTip,int idEst) throws SQLException
    {
        DEvento obj = new DEvento();
        obj.setFecha(fecha);
        obj.setSalon(salon);
        obj.setDesc(desc);
        obj.setnP(np);
        obj.setCosto(pr);
        obj.setIdTematica(idTem);
        obj.setIdEstado(idEst);
        obj.setIdTipo_Evento(idTip);
        
        return obj.InsertarEvento(obj);
        
    }
    public static String Editar(int idEv, String fecha,String salon,int np,
            String desc, double pr, 
            int idTem,int idTip,int idEst) throws SQLException{
        DEvento obj = new DEvento();
        obj.setIdEvento(idEst);
        obj.setFecha(fecha);
        obj.setSalon(salon);
        obj.setDesc(desc);
        obj.setnP(np);
        obj.setCosto(pr);
        obj.setIdTematica(idTem);
        obj.setIdEstado(idEst);
        obj.setIdTipo_Evento(idTip);
        return obj.EditarEvento(obj);
        
    }
    public static String Eliminar(int idEv, String fecha,String salon,int np,
            String desc, double pr, 
            int idTem,int idTip,int idEst) throws SQLException{
        DEvento obj = new DEvento();
        obj.setIdEvento(idEst);
        obj.setFecha(fecha);
        obj.setSalon(salon);
        obj.setDesc(desc);
        obj.setnP(np);
        obj.setCosto(pr);
        obj.setIdTematica(idTem);
        obj.setIdEstado(idEst);
        obj.setIdTipo_Evento(idTip);
        return obj.EliminarEvento(obj);
        
    }
   
}
