/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaDatos;

import java.util.logging.Logger;
import java.sql.*;
import java.util.LinkedList;

/**
 *
 * @author lhtc9
 */
public class DCliente extends DPersona{
    private int idCliente;
    private int idPersona;
    

    public DCliente() {
    }

    public DCliente(int idCliente, int idPersona, String CiRuc, String nombre, String apellidos, String fechaNac, String direccion) {
        super(idPersona, CiRuc, nombre, apellidos, fechaNac, direccion);
        this.idCliente = idCliente;
    }

    public ResultSet Mostrar() throws SQLException{
        Connection con = new Conexion().getCon();
        Statement st =con.createStatement();
        ResultSet rs=null;
        String query ="select * from Mostrar_Cliente";
        try{            
            rs = st.executeQuery(query);           
        }
        catch(Exception e){
            rs=null;
            System.out.println(e);
        }        
        return rs;
    }
    
    public ResultSet Mostrar2() throws SQLException{
        Connection con = new Conexion().getCon();
        Statement st =con.createStatement();
        ResultSet rs=null;
        String query ="select * from Mostrar_Cliente2";
        try{            
            rs = st.executeQuery(query);           
        }
        catch(Exception e){
            rs=null;
            System.out.println(e);
        }        
        return rs;
    }
    
    public ResultSet MostrarNombres() throws SQLException{
        Connection con = new Conexion().getCon();
        Statement st =con.createStatement();
        ResultSet rs=null;
        String query ="select * from Mostrar_Cliente_NA";
        try{            
            rs = st.executeQuery(query);           
        }
        catch(Exception e){
            rs=null;
            System.out.println(e);
        }        
        return rs;
    }
    
    
    private int getResultSetSize(ResultSet rs) throws SQLException{
        int i=0;
        while(rs.next()){
            i++;
        }
        return i;
    }
    
    public String InsertarCliente(DCliente dc) throws SQLException{
        Connection con = new Conexion().getCon();        
        CallableStatement calStat=null;
        ResultSet rs=null;
        int i=0;
        String resp="";
        String query ="{call insertar_Cliente(?,?,?,?,?)}";        
        try{            
           calStat = con.prepareCall(query);
           calStat.setString(1, dc.getCiRuc());
           calStat.setString(2, dc.getNombre());
           calStat.setString(3, dc.getApellidos());
           calStat.setString(4, dc.getFechaNac());
           calStat.setString(5, dc.getDireccion());
           rs=calStat.executeQuery();          
        
           if(rs!=null){
               resp = "OK";
           }
           else{
               resp="No se Ingreso al Registro...";
           }
            
        }
        catch(Exception e){
            return resp=e.getMessage();
        }
        finally{
            if(calStat !=null){
                calStat.close();
            }
            if(con!=null){
                con.close();
            }            
        }
        return  resp;
    }
    
    public String EditarCliente(DCliente dc) throws SQLException{
        Connection con = new Conexion().getCon();        
        CallableStatement calStat=null;
        ResultSet rs=null;
        int i=0;
        String resp="";
        String query ="{call Editar_Cliente(?,?,?,?,?,?)}";        
        try{            
           calStat = con.prepareCall(query);
           calStat.setInt(1, dc.getIdPersona());
           calStat.setString(2, dc.getCiRuc());
           calStat.setString(3, dc.getNombre());
           calStat.setString(4, dc.getApellidos());
           calStat.setString(5, dc.getFechaNac());
           calStat.setString(6, dc.getDireccion());
           rs=calStat.executeQuery();          
        
           if(rs!=null){
               resp = "OK";
           }
           else{
               resp="No se Edito Registro...";
           }
            
        }
        catch(Exception e){
            return resp=e.getMessage();
        }
        finally{
            if(calStat !=null){
                calStat.close();
            }
            if(con!=null){
                con.close();
            }            
        }
        return  resp;
    }
    public String EliminarCliente(DCliente dc) throws SQLException{
        Connection con = new Conexion().getCon();        
        CallableStatement calStat=null;
        ResultSet rs=null;
        int i=0;
        String resp="";
        String query ="{call Borrar_Cliente(?)}";        
        try{            
           calStat = con.prepareCall(query);
           calStat.setInt(1, dc.getIdPersona());
           
           rs=calStat.executeQuery();          
        
           if(rs!=null){
               resp = "OK";
           }
           else{
               resp="No se Elimo el Registro...";
           }
            
        }
        catch(Exception e){
            return resp=e.getMessage();
        }
        finally{
            if(calStat !=null){
                calStat.close();
            }
            if(con!=null){
                con.close();
            }            
        }
        return  resp;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }
    
    
    
}
