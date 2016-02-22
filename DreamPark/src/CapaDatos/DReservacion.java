/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package CapaDatos;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author jfpal
 */
public class DReservacion {
    private int idReservacion;
    private String desc;
    private String fecha;
    private double precio;
    private int idEventos;
    private int idCliente;
    private int idEstado;
    
    public DReservacion() {
    }
    
    public DReservacion(int idReservacion, String fecha,String desc ,double precio, int idEventos, int idCliente,int idEstado) {
        this.idReservacion = idReservacion;
        this.fecha = fecha;
        this.desc=desc;
        this.precio = precio;
        this.idEventos = idEventos;
        this.idCliente = idCliente;
        this.idEstado=idEstado;
        
    }
    
    public ResultSet MostrarActivos() throws SQLException{
        Connection con = new Conexion().getCon();
        Statement st =con.createStatement();
        ResultSet rs=null;
        String query ="select * from Mostrar_Evento_Cliente_EstadoAct";
        try{
            rs = st.executeQuery(query);
        }
        catch(Exception e){
            rs=null;
            System.out.println(e);
        }
        return rs;
    }
    
    public ResultSet MostrarCompletados() throws SQLException{
        Connection con = new Conexion().getCon();
        Statement st =con.createStatement();
        ResultSet rs=null;
        String query ="select * from Mostrar_Evento_Cliente_EstadoComp";
        try{
            rs = st.executeQuery(query);
        }
        catch(Exception e){
            rs=null;
            System.out.println(e);
        }
        return rs;
    }
    
    public ResultSet MostrarCancelados() throws SQLException{
        Connection con = new Conexion().getCon();
        Statement st =con.createStatement();
        ResultSet rs=null;
        String query ="select * from Mostrar_Evento_Cliente_EstadoCan";
        try{
            rs = st.executeQuery(query);
        }
        catch(Exception e){
            rs=null;
            System.out.println(e);
        }
        return rs;
    }
    
    public String InsertarReservacion(DReservacion dr) throws SQLException{
        Connection con = new Conexion().getCon();
        CallableStatement calStat=null;
        ResultSet rs=null;
        int i=0;
        String resp="";
        String query ="{call insertar_Reservacion(?,?,?,?,?,?)}";
        try{
            calStat = con.prepareCall(query);
            calStat.setString(1, dr.getFecha());
            calStat.setString(2, dr.getDesc());
            calStat.setDouble(3, dr.getPrecio());
            calStat.setInt(4, dr.getIdEventos());
            calStat.setInt(5, dr.getIdCliente());
            calStat.setInt(6, dr.getIdEstado());
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
    
    public String EditarReservacion(DReservacion dr) throws SQLException{
        Connection con = new Conexion().getCon();
        CallableStatement calStat=null;
        ResultSet rs=null;
        int i=0;
        String resp="";
        String query ="{call Editar_Reservacion(?,?,?,?,?,?,?)}";
        try{
            calStat = con.prepareCall(query);
            calStat.setInt(1, dr.getIdReservacion());
            calStat.setString(2, dr.getFecha());
            calStat.setString(3, dr.getDesc());
            calStat.setDouble(4, dr.getPrecio());
            calStat.setInt(5, dr.getIdEventos());
            calStat.setInt(6, dr.getIdCliente());
            calStat.setInt(7, dr.getIdEstado());
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
    public String EliminarRerservacion(DReservacion dr) throws SQLException{
        Connection con = new Conexion().getCon();
        CallableStatement calStat=null;
        ResultSet rs=null;
        int i=0;
        String resp="";
        String query ="{call Borrar_Reservacion(?)}";
        try{
            calStat = con.prepareCall(query);
            calStat.setInt(1, dr.getIdReservacion());
            
            rs=calStat.executeQuery();
            
            if(rs!=null){
                resp = "OK";
            }
            else{
                resp="No se Elimino el Registro...";
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
    
    public int BuscarEvento(String fecha,String desc,String sal,int np,double cost) throws SQLException{
        
        Connection con = new Conexion().getCon();
        CallableStatement calStat=null;
        ResultSet rs=null;
        int i=0;
        String resp="";
        String query ="{call Buscar_Evento(?,?,?,?,?)}";
        try{
            calStat = con.prepareCall(query);
            calStat.setString(1, fecha);
            calStat.setString(2, desc);
            calStat.setString(3, sal);
            calStat.setInt(4, np);
            calStat.setDouble(5, cost);
            
            rs=calStat.executeQuery();
            
            if(rs.next()){
                resp = "OK";
                
                return rs.getInt(1);
            }
            else{
                resp="No se obtuvieron datos...";
            }
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(new JFrame(),"No se ha podido realizar la busqueda","Error",JOptionPane.ERROR_MESSAGE);
            
        }
        finally{
            if(calStat !=null){
                calStat.close();
            }
            if(con!=null){
                con.close();
            }
        }
        return 0;
    }
    
    public int BuscarIdReservacion(int idEv,String fecha,int idC) throws SQLException{
        
        Connection con = new Conexion().getCon();
        CallableStatement calStat=null;
        ResultSet rs=null;
        int i=0;
        String resp="";
        String query ="{call BuscarId_Reservacion(?,?,?)}";
        try{
            calStat = con.prepareCall(query);
            calStat.setInt(1, idEv);
            calStat.setString(2, fecha);
            calStat.setInt(3, idC);
            
            
            rs=calStat.executeQuery();
            
            if(rs.next()){
                resp = "OK";
                
                return rs.getInt(1);
            }
            else{
                resp="No se obtuvieron datos...";
            }
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(new JFrame(),"No se ha podido realizar la busqueda","Error",JOptionPane.ERROR_MESSAGE);
            
        }
        finally{
            if(calStat !=null){
                calStat.close();
            }
            if(con!=null){
                con.close();
            }
        }
        return 0;
    }
    
    public int BuscarCliente(String nom,String ape) throws SQLException{
        
        Connection con = new Conexion().getCon();
        CallableStatement calStat=null;
        ResultSet rs=null;
        int i=0;
        String resp="";
        String query ="{call Buscar_Cliente_Nombre(?,?)}";
        try{
            calStat = con.prepareCall(query);
            calStat.setString(1, nom);
            calStat.setString(2, ape);
            
            rs=calStat.executeQuery();
            
            if(rs.next()){
                resp = "OK";
                
                return rs.getInt(1);
            }
            else{
                resp="No se obtuvieron datos...";
            }
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(new JFrame(),"No se ha podido realizar la busqueda","Error",JOptionPane.ERROR_MESSAGE);
            
        }
        finally{
            if(calStat !=null){
                calStat.close();
            }
            if(con!=null){
                con.close();
            }
        }
        return 0;
    }
    
    public int BuscarEstadoReservacion(String nom) throws SQLException{
        
        Connection con = new Conexion().getCon();
        CallableStatement calStat=null;
        ResultSet rs=null;
        int i=0;
        String resp="";
        String query ="{call Buscar_Estado_Reservacion_Nombre(?)}";
        try{
            calStat = con.prepareCall(query);
            calStat.setString(1, nom);
            
            rs=calStat.executeQuery();
            
            if(rs.next()){
                resp = "OK";
                
                return rs.getInt(1);
            }
            else{
                resp="No se obtuvieron datos...";
            }
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(new JFrame(),"No se ha podido realizar la busqueda","Error",JOptionPane.ERROR_MESSAGE);
            
        }
        finally{
            if(calStat !=null){
                calStat.close();
            }
            if(con!=null){
                con.close();
            }
        }
        return 0;
    }
    
     public ResultSet MostrarClientes() throws SQLException{
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
     
     public ResultSet MostrarTematicas() throws SQLException{
        Connection con = new Conexion().getCon();
        Statement st =con.createStatement();
        ResultSet rs=null;
        String query ="select * from Mostrar_Tematica_Nombres";
        try{
            rs = st.executeQuery(query);
        }
        catch(Exception e){
            rs=null;
            System.out.println(e);
        }
        return rs;
    }
     
     public ResultSet MostrarTipos() throws SQLException{
        Connection con = new Conexion().getCon();
        Statement st =con.createStatement();
        ResultSet rs=null;
        String query ="select * from Mostrar_Tipo_Evento_nombre";
        try{
            rs = st.executeQuery(query);
        }
        catch(Exception e){
            rs=null;
            System.out.println(e);
        }
        return rs;
    }
    
     public ResultSet GetInfoEvento(String fech,String nom,String ape){
         Connection con = new Conexion().getCon();
        CallableStatement calStat=null;
        ResultSet rs=null;
        int i=0;
        String resp="";
        String query ="{call Buscar_Evento_Cliente_Activo(?,?,?)}";
        try{
            calStat = con.prepareCall(query);
            calStat.setString(1, fech);
             calStat.setString(2, nom);
              calStat.setString(3, ape);
            
            rs=calStat.executeQuery();
           
            
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(new JFrame(),"No se ha podido realizar la busqueda","Error",JOptionPane.ERROR_MESSAGE);
            
        }
        
        return rs;
     }
     
    public String getDesc() {
        return desc;
    }
    
    public void setDesc(String desc) {
        this.desc = desc;
    }
    
    public int getIdEstado() {
        return idEstado;
    }
    
    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }
    
    
    
    public int getIdReservacion() {
        return idReservacion;
    }
    
    public void setIdReservacion(int idReservacion) {
        this.idReservacion = idReservacion;
    }
    
    public String getFecha() {
        return fecha;
    }
    
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    public double getPrecio() {
        return precio;
    }
    
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public int getIdEventos() {
        return idEventos;
    }
    
    public void setIdEventos(int idEventos) {
        this.idEventos = idEventos;
    }
    
    public int getIdCliente() {
        return idCliente;
    }
    
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    
    
    
}
