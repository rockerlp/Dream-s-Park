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
public class DEvento {
    private int idEvento;
    private String fecha;
    private String Salon;
    private int nP;
    private String desc;
    private double costo;
    private int idTipo_Evento;
    private int idTematica;
    private int idEstado;

    public DEvento() {
    }

    public DEvento(int idEvento, 
            String fecha, String Salon, 
            int nP, String desc, double costo, 
            int idTipo_Evento, int idTematica,int idEstado) {
        this.idEvento = idEvento;
        this.fecha = fecha;
        this.Salon = Salon;
        this.nP = nP;
        this.desc = desc;
        this.costo = costo;
        this.idTipo_Evento = idTipo_Evento;
        this.idTematica = idTematica;
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
    
    public ResultSet MostrarNombresTematicas() throws SQLException{
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
    
    public ResultSet MostrarTematicas() throws SQLException{
        Connection con = new Conexion().getCon();
        Statement st =con.createStatement();
        ResultSet rs=null;
        String query ="select * from Mostrar_Tematica";
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
        String query ="select * from Mostrar_Tipo_Evento";
        try{            
            rs = st.executeQuery(query);           
        }
        catch(Exception e){
            rs=null;
            System.out.println(e);
        }        
        return rs;
    }
    
    public ResultSet MostrarNombresTipos() throws SQLException{
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
    
    public int BuscarTematicaNombre(String nombre) throws SQLException{
        
        Connection con = new Conexion().getCon();        
        CallableStatement calStat=null;
        ResultSet rs=null;
        int i=0;
        String resp="";
        String query ="{call Buscar_Tematica_Nombre(?)}";        
        try{            
           calStat = con.prepareCall(query);
           calStat.setString(1, nombre);
          
           rs=calStat.executeQuery();     
            //JOptionPane.showMessageDialog(new JFrame(),rs.getInt(1),"Error",JOptionPane.ERROR_MESSAGE);

           
        
           if(rs.next()){
               resp = "OK";
               //i=rs.getInt(1);
               return rs.getInt(1);
           }
           /*else{
               resp="No se obtuvieron datos...";
           }*/
            
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
    
    public int BuscarTipoNombre(String Nombre) throws SQLException{
        
        Connection con = new Conexion().getCon();        
        CallableStatement calStat=null;
        ResultSet rs=null;
        int i=0;
        String resp="";
        String query ="{call Buscar_Tipo_Nombre(?)}";        
        try{            
           calStat = con.prepareCall(query);
           calStat.setString(1, Nombre);
          
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
    
    public int BuscarEstadoNombre(String Nombre) throws SQLException{
        
        Connection con = new Conexion().getCon();        
        CallableStatement calStat=null;
        ResultSet rs=null;
        int i=0;
        String resp="";
        String query ="{call Buscar_Estado_Evento_Nombre(?)}";        
        try{            
           calStat = con.prepareCall(query);
           calStat.setString(1, Nombre);
          
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
    
    public String InsertarEvento(DEvento de) throws SQLException{
        Connection con = new Conexion().getCon();        
        CallableStatement calStat=null;
        ResultSet rs=null;
        int i=0;
        String resp="";
        String query ="{call insertar_Evento(?,?,?,?,?,?,?,?)}";        
        try{            
           calStat = con.prepareCall(query);
           calStat.setString(1, de.getFecha());
           calStat.setString(2, de.getSalon());
           calStat.setInt(3, de.getnP());
           calStat.setString(4, de.getDesc());
           calStat.setDouble(5, de.getCosto());
           calStat.setInt(6, de.getIdTematica());
           calStat.setInt(7, de.getIdTipo_Evento());
           calStat.setInt(8, de.getIdEstado());
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
    
    public String EditarEvento(DEvento de) throws SQLException{
        Connection con = new Conexion().getCon();        
        CallableStatement calStat=null;
        ResultSet rs=null;
        int i=0;
        String resp="";
        String query ="{call Editar_Evento(?,?,?,?,?,?,?,?,?)}";        
        try{            
           calStat = con.prepareCall(query);
           calStat.setInt(1, de.getIdEvento());
           calStat.setString(2, de.getFecha());
           calStat.setString(3, de.getSalon());
           calStat.setInt(4, de.getnP());
           calStat.setString(5, de.getDesc());
           calStat.setDouble(6, de.getCosto());
           calStat.setInt(7, de.getIdTematica());
           calStat.setInt(8, de.getIdTipo_Evento());
           calStat.setInt(9, de.getIdEstado());
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
    public String EliminarEvento(DEvento de) throws SQLException{
        Connection con = new Conexion().getCon();        
        CallableStatement calStat=null;
        ResultSet rs=null;
        int i=0;
        String resp="";
        String query ="{call Borrar_Eventos(?)}";        
        try{            
           calStat = con.prepareCall(query);
           calStat.setInt(1, de.getIdEvento());
           
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
    
    
    public String InsertarTematica(String nom, String desc) throws SQLException{
        Connection con = new Conexion().getCon();        
        CallableStatement calStat=null;
        ResultSet rs=null;
        int i=0;
        String resp="";
        String query ="{call insertar_Tematica(?,?)}";        
        try{            
           calStat = con.prepareCall(query);
           calStat.setString(1, nom);
           calStat.setString(2, desc);
           
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
    
    public String EditarTematica(String nom, String desc) throws SQLException{
        int idTem = BuscarTematicaNombre(nom);
        Connection con = new Conexion().getCon();        
        CallableStatement calStat=null;
        ResultSet rs=null;
        int i=0;
        String resp="";
        String query ="{call Editar_Tematica(?,?,?)}";        
        try{            
           calStat = con.prepareCall(query);
           calStat.setInt(1, idTem);
           calStat.setString(2, nom);
           calStat.setString(3, desc);
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
    public String EliminarTematica(String nom) throws SQLException{
        int idTem = BuscarTematicaNombre(nom);
        Connection con = new Conexion().getCon();        
        CallableStatement calStat=null;
        ResultSet rs=null;
        int i=0;
        String resp="";
        String query ="{call Borrar_Tematica(?)}";        
        try{            
           calStat = con.prepareCall(query);
           calStat.setInt(1, idTem);
           
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
    
    public String InsertarTipo(String nom, String desc) throws SQLException{
        Connection con = new Conexion().getCon();        
        CallableStatement calStat=null;
        ResultSet rs=null;
        int i=0;
        String resp="";
        String query ="{call insertar_Tipo_Evento(?,?)}";        
        try{            
           calStat = con.prepareCall(query);
           calStat.setString(1, nom);
           calStat.setString(2, desc);
           
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
    
    public String EditarTipo(String nom, String desc) throws SQLException{
        int idTip = BuscarTipoNombre(nom);
        Connection con = new Conexion().getCon();        
        CallableStatement calStat=null;
        ResultSet rs=null;
        int i=0;
        String resp="";
        String query ="{call Editar_Tipo_Evento(?,?,?)}";        
        try{            
           calStat = con.prepareCall(query);
           calStat.setInt(1, idTip);
           calStat.setString(2, nom);
           calStat.setString(3, desc);
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
    public String EliminarTipo(String nom) throws SQLException{
        int idTip = BuscarTipoNombre(nom);
        Connection con = new Conexion().getCon();        
        CallableStatement calStat=null;
        ResultSet rs=null;
        int i=0;
        String resp="";
        String query ="{call Borrar_Tipo_Evento(?)}";        
        try{            
           calStat = con.prepareCall(query);
           calStat.setInt(1, idTip);
           
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
     
     public ResultSet MostrarTematicasNombres() throws SQLException{
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
     
     public ResultSet MostrarTiposNombres() throws SQLException{
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

    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }
    
    public int getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(int idEvento) {
        this.idEvento = idEvento;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getSalon() {
        return Salon;
    }

    public void setSalon(String Salon) {
        this.Salon = Salon;
    }

    public int getnP() {
        return nP;
    }

    public void setnP(int nP) {
        this.nP = nP;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public int getIdTipo_Evento() {
        return idTipo_Evento;
    }

    public void setIdTipo_Evento(int idTipo_Evento) {
        this.idTipo_Evento = idTipo_Evento;
    }

    public int getIdTematica() {
        return idTematica;
    }

    public void setIdTematica(int idTematica) {
        this.idTematica = idTematica;
    }
    
    
    
}
