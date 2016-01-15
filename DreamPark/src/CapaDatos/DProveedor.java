/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaDatos;
import java.sql.*;

/**
 *
 * @author jfpal
 */
public class DProveedor {
    private int idProveedor;
    private String nombre;
    private String dir;
    private String telf;
    
    private String buscar;

    public DProveedor() {
    }

    public DProveedor(int idProveedor, String nombre, String dir, String telf) {
        this.idProveedor = idProveedor;
        this.nombre = nombre;
        this.dir = dir;
        this.telf = telf;
    }
    
    public ResultSet Mostrar(){
        Connection con = null;
        Statement st =null;
        ResultSet rs=null;
        
        try{
            String query ="select * from Proveedor";
            rs = st.executeQuery(query);
            //System.out.println("Records from database");
            /*while(rs.next()){
                String name = rs.getString("nombre");
                String desc = rs.getString("direccion");
                String telf = rs.getString("telf"); 
            }*/
            
        }
        catch(Exception e){
            rs=null;
            System.out.println(e);
        }
        return rs;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public String getTelf() {
        return telf;
    }

    public void setTelf(String telf) {
        this.telf = telf;
    }
    
    
    
}
