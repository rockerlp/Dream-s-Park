/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaDatos;
import java.sql.*;
import java.util.LinkedList;

/**
 *
 * @author lhtc9
 * IdInventario` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(15) NOT NULL,
  `cantidad` INT NOT NULL,
  `precioCompra` DOUBLE NOT NULL,
  `precioVenta` DOUBLE NOT NULL,
  `Tipo_Inventario_idTipo_Inventario` INT NOT NULL,
 */
public class DInventario {
    private int idInventario;
    private String nombre;
    private String cantidad;
    private String pCompra;
    private String pVenta;
    private String tipoInv;        
    
    public DInventario(){        
    }

    public DInventario(int idInventario, String nombre, String cantidad, String pCompra, String pVenta, String tipoInv) {
        this.idInventario = idInventario;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.pCompra = pCompra;
        this.pVenta = pVenta;
        this.tipoInv = tipoInv;
    }
    public ResultSet Mostrar() throws SQLException{
        Connection con = new Conexion().getCon();
        Statement st =con.createStatement();
        ResultSet rs=null;
        String query ="select * from Inventario";
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
    public String InsertarInventario(DInventario di) throws SQLException{
        Connection con = new Conexion().getCon();
        CallableStatement calStat=null;
        ResultSet rs=null;
        int i=0;
        String resp="";
        String query ="{call insertar_inventario(?,?,?,?,?)}";
        
        try{
            calStat = con.prepareCall(query);
            calStat.setString(1, di.getNombre());
            calStat.setString(2, di.getCantidad());
            calStat.setString(3, di.getpCompra());
            calStat.setString(4, di.getpVenta());
            calStat.setString(5, di.getTipoInv());
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
    public String EditarInv(DInventario di) throws SQLException{
        Connection con = new Conexion().getCon();        
        CallableStatement calStat=null;
        ResultSet rs=null;
        int i=0;
        String resp="";
        String query ="{call editarInventario(?,?,?,?,?)}";        
        try{            
           calStat = con.prepareCall(query);
           calStat.setInt(1, di.getIdInventario());
           calStat.setString(2, di.getNombre());
           calStat.setString(3, di.getCantidad());
           calStat.setString(4, di.getpCompra());
           calStat.setString(5, di.getpVenta());
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
    public String EliminarInv(DInventario di) throws SQLException{
        Connection con = new Conexion().getCon();        
        CallableStatement calStat=null;
        ResultSet rs=null;
        int i=0;
        String resp="";
        String query ="{call borrarInventario(?)}";        
        try{            
           calStat = con.prepareCall(query);
           calStat.setInt(1, di.getIdInventario());
           
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

    public int getIdInventario() {
        return idInventario;
    }

    public void setIdInventario(int idInventario) {
        this.idInventario = idInventario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getpCompra() {
        return pCompra;
    }

    public void setpCompra(String pCompra) {
        this.pCompra = pCompra;
    }

    public String getpVenta() {
        return pVenta;
    }

    public void setpVenta(String pVenta) {
        this.pVenta = pVenta;
    }

    public String getTipoInv() {
        return tipoInv;
    }

    public void setTipoInv(String tipoInv) {
        this.tipoInv = tipoInv;
    }
    
}
