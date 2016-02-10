/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaDatos;
import java.sql.*;

/**
 *
 * @author lhtc9
 */
public class DTipoInv {
    private int idTInv;
    private String nombInv;
    private String dscrpInv;

    public DTipoInv() {
    }

    public DTipoInv(int idTInv, String nombInv, String dscrpInv) {
        this.idTInv = idTInv;
        this.nombInv = nombInv;
        this.dscrpInv = dscrpInv;
    }
    public ResultSet MostTipInv() throws SQLException{
        Connection con = new Conexion().getCon();
        Statement st =con.createStatement();
        ResultSet rs=null;
        String query ="select * from Mostrar_Tipo_Inventario";
        try{            
            rs = st.executeQuery(query);           
        }
        catch(Exception e){
            rs=null;
            System.out.println(e);
        }        
        return rs;
    }
    public ResultSet MostListaTipInv() throws SQLException{
        Connection con = new Conexion().getCon();
        Statement st =con.createStatement();
        ResultSet rs=null;
        String query ="select Nombre from Mostrar_Tipo_Inventario";
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
    public String InsertTipInv(DTipoInv dti) throws SQLException{
        Connection con = new Conexion().getCon();        
        CallableStatement calStat=null;
        ResultSet rs=null;
        int i=0;
        String resp="";
        String query ="{call insertar_Tipo_Inventario(?,?)}";        
        try{            
           calStat = con.prepareCall(query);
           calStat.setString(1, dti.getNombInv());
           calStat.setString(2, dti.getDscrpInv());
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
    public String EditTipInv(DTipoInv dti) throws SQLException{
        Connection con = new Conexion().getCon();        
        CallableStatement calStat=null;
        ResultSet rs=null;
        int i=0;
        String resp="";
        String query ="{call Editar_Tipo_Inventario(?,?,?)}";        
        try{            
           calStat = con.prepareCall(query);
           calStat.setInt(1, dti.getIdTInv());
           calStat.setString(2, dti.getNombInv());
           calStat.setString(3, dti.getDscrpInv());
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
    public String DelTipInv(DTipoInv dti) throws SQLException{
        Connection con = new Conexion().getCon();        
        CallableStatement calStat=null;
        ResultSet rs=null;
        int i=0;
        String resp="";
        String query ="{call Borrar_proveedor(?)}";        
        try{            
           calStat = con.prepareCall(query);
           calStat.setInt(1, dti.getIdTInv());
           
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
    public int getIdTInv() {
        return idTInv;
    }

    public void setIdTInv(int idTInv) {
        this.idTInv = idTInv;
    }

    public String getNombInv() {
        return nombInv;
    }

    public void setNombInv(String nombInv) {
        this.nombInv = nombInv;
    }

    public String getDscrpInv() {
        return dscrpInv;
    }

    public void setDscrpInv(String dscrpInv) {
        this.dscrpInv = dscrpInv;
    }
    
    
}
