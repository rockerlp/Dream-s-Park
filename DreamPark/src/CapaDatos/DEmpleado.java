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
public class DEmpleado extends DPersona{
    private int idEmpleado;
    private int idCargo;
    private int idHorario;

    public DEmpleado() {
    }

    public DEmpleado(int idEmpleado, int idCargo, int idHorario, int idPersona, String CiRuc, String nombre, String apellidos, String fechaNac, String direccion) {
        super(idPersona, CiRuc, nombre, apellidos, fechaNac, direccion);
        this.idEmpleado = idEmpleado;
        this.idCargo = idCargo;
        this.idHorario = idHorario;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public int getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(int idCargo) {
        this.idCargo = idCargo;
    }

    public int getIdHorario() {
        return idHorario;
    }

    public void setIdHorario(int idHorario) {
        this.idHorario = idHorario;
    }

    
    public ResultSet Mostrar() throws SQLException{
        Connection con = new Conexion().getCon();
        Statement st =con.createStatement();
        ResultSet rs=null;
        String query ="select * from Mostrar_Empleado";
        try{            
            rs = st.executeQuery(query);           
        }
        catch(Exception e){
            rs=null;
            System.out.println(e);
        }        
        return rs;
    }
    
    public ResultSet MostrarNombresHorarios() throws SQLException{
        Connection con = new Conexion().getCon();
        Statement st =con.createStatement();
        ResultSet rs=null;
        String query ="select * from Mostrar_Horario_Nombre";
        try{            
            rs = st.executeQuery(query);           
        }
        catch(Exception e){
            rs=null;
            System.out.println(e);
        }        
        return rs;
    }
    public String[] MostrarHorHorario(String Nombre) throws SQLException{
        String[] h={"",""};
        Connection con = new Conexion().getCon();        
        CallableStatement calStat=null;
        ResultSet rs=null;
        int i=0;
        String resp="";
        String query ="{call Mostrar_Horario_H(?)}";        
        try{            
           calStat = con.prepareCall(query);
           calStat.setString(1, Nombre);
          
           rs=calStat.executeQuery();          
        
           if(rs!=null){
               //resp = "OK";
               h[0]=rs.getString(1);
               h[1]=rs.getString(2);
               return h;
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
        return null;
    }
    
    public String MostrarDescCargo(String Nombre) throws SQLException{
        String h="";
        Connection con = new Conexion().getCon();        
        CallableStatement calStat=null;
        ResultSet rs=null;
        int i=0;
        String resp="";
        String query ="{call Mostrar_Cargo_Desc(?)}";        
        try{            
           calStat = con.prepareCall(query);
           calStat.setString(1, Nombre);
          
           rs=calStat.executeQuery();          
        
           if(rs!=null){
               //resp = "OK";
               h=rs.getString(1);
               return h;
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
        return null;
    }
        
    public ResultSet MostrarNombresCargos() throws SQLException{
        Connection con = new Conexion().getCon();
        Statement st =con.createStatement();
        ResultSet rs=null;
        String query ="select * from Mostrar_Cargo_Nombres";
        try{            
            rs = st.executeQuery(query);           
        }
        catch(Exception e){
            rs=null;
            System.out.println(e);
        }        
        return rs;
    }
    
    public ResultSet MostrarHorarios() throws SQLException{
        Connection con = new Conexion().getCon();
        Statement st =con.createStatement();
        ResultSet rs=null;
        String query ="select * from Mostrar_Horario";
        try{            
            rs = st.executeQuery(query);           
        }
        catch(Exception e){
            rs=null;
            System.out.println(e);
        }        
        return rs;
    }
    
    public ResultSet MostrarCargos() throws SQLException{
        Connection con = new Conexion().getCon();
        Statement st =con.createStatement();
        ResultSet rs=null;
        String query ="select * from Mostrar_Cargo";
        try{            
            rs = st.executeQuery(query);           
        }
        catch(Exception e){
            rs=null;
            System.out.println(e);
        }        
        return rs;
    }
    
    public String InsertarCargo(String nom,String desc) throws SQLException{
        Connection con = new Conexion().getCon();        
        CallableStatement calStat=null;
        ResultSet rs=null;
        int i=0;
        String resp="";
        String query ="{call insertar_Cargo(?,?)}";        
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
    
    public String EditarCargo(String nom,String desc) throws SQLException{
        Connection con = new Conexion().getCon();        
        CallableStatement calStat=null;
        ResultSet rs=null;
        int i=0;
        String resp="";
        String query ="{call Editar_Cargo(?,?,?)}";        
        try{            
           calStat = con.prepareCall(query);
           calStat.setInt(1, buscar_Cargo_Nombre(nom));
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
    
    public String EliminarCargo(String nom) throws SQLException{
        Connection con = new Conexion().getCon();        
        CallableStatement calStat=null;
        ResultSet rs=null;
        int i=0;
        String resp="";
        String query ="{call Borrar_Cargo(?)}";        
        try{            
           calStat = con.prepareCall(query);
           calStat.setInt(1, buscar_Cargo_Nombre(nom));
           
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
    
    public String InsertarHorario(String nom,String hIn,String hFn) throws SQLException{
        Connection con = new Conexion().getCon();        
        CallableStatement calStat=null;
        ResultSet rs=null;
        int i=0;
        String resp="";
        String query ="{call insertar_Horario(?,?,?)}";        
        try{            
           calStat = con.prepareCall(query);
           calStat.setString(1, nom);
           calStat.setString(2, hIn);
           calStat.setString(3, hFn);
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
    
    public String EditarHorario(String nom,String hIn,String hFn) throws SQLException{
        Connection con = new Conexion().getCon();        
        CallableStatement calStat=null;
        ResultSet rs=null;
        int i=0;
        String resp="";
        String query ="{call Editar_Horario(?,?,?)}";        
        try{            
           calStat = con.prepareCall(query);
           calStat.setInt(1, buscar_Horario_Nombre(nom));
           calStat.setString(2, nom);
           calStat.setString(3, hIn);
           calStat.setString(4, hFn);
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
    
    public String EliminarHorario(String nom) throws SQLException{
        Connection con = new Conexion().getCon();        
        CallableStatement calStat=null;
        ResultSet rs=null;
        int i=0;
        String resp="";
        String query ="{call Borrar_Horario(?)}";        
        try{            
           calStat = con.prepareCall(query);
           calStat.setInt(1, buscar_Horario_Nombre(nom));
           
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
    
    private int getResultSetSize(ResultSet rs) throws SQLException{
        int i=0;
        while(rs.next()){
            i++;
        }
        return i;
    }
    
    public int buscar_Cargo_Nombre(String nombre) throws SQLException{
        Connection con = new Conexion().getCon();        
        CallableStatement calStat=null;
        ResultSet rs=null;
        int i=0;
        String resp="";
        String query ="{call Buscar_Cargo_Nombre(?)}";        
        try{            
           calStat = con.prepareCall(query);
           calStat.setString(1, nombre);
           
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
    
    public int buscar_Horario_Nombre(String nombre) throws SQLException{
        Connection con = new Conexion().getCon();        
        CallableStatement calStat=null;
        ResultSet rs=null;
        int i=0;
        String resp="";
        String query ="{call Buscar_Horario_Nombre(?)}";        
        try{            
           calStat = con.prepareCall(query);
           calStat.setString(1, nombre);
           
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
    
    public String InsertarEmpleado(DEmpleado de) throws SQLException{
        Connection con = new Conexion().getCon();        
        CallableStatement calStat=null;
        ResultSet rs=null;
        int i=0;
        String resp="";
        String query ="{call insertar_Empleado(?,?,?,?,?,?,?)}";        
        try{            
           calStat = con.prepareCall(query);
           calStat.setString(1, de.getCiRuc());
           calStat.setString(2, de.getNombre());
           calStat.setString(3, de.getApellidos());
           calStat.setString(4, de.getFechaNac());
           calStat.setString(5, de.getDireccion());
           calStat.setInt(6, de.getIdCargo());
           calStat.setInt(7, de.getIdHorario());
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
    
    public String EditarEmpleado(DEmpleado de) throws SQLException{
        Connection con = new Conexion().getCon();        
        CallableStatement calStat=null;
        ResultSet rs=null;
        int i=0;
        String resp="";
        String query ="{call Editar_Empleado(?,?,?,?,?,?,?,?,?)}";        
        try{            
           calStat = con.prepareCall(query);
           calStat.setInt(1, de.getIdPersona());
           calStat.setString(2, de.getCiRuc());
           calStat.setString(3, de.getNombre());
           calStat.setString(4, de.getApellidos());
           calStat.setString(5, de.getFechaNac());
           calStat.setString(6, de.getDireccion());
           calStat.setInt(7, de.getIdEmpleado());
           calStat.setInt(8, de.getIdCargo());
           calStat.setInt(9, de.getIdHorario());
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
    public String EliminarEmpleado(DEmpleado de) throws SQLException{
        Connection con = new Conexion().getCon();        
        CallableStatement calStat=null;
        ResultSet rs=null;
        int i=0;
        String resp="";
        String query ="{call Borrar_Empleado(?)}";        
        try{            
           calStat = con.prepareCall(query);
           calStat.setInt(1, de.getIdEmpleado());
           
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
    
}
