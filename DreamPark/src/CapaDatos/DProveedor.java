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
    
    public ResultSet Mostrar() throws SQLException{
        Connection con = new Conexion().getCon();
        Statement st =con.createStatement();
        ResultSet rs=null;
        String query ="select * from Proveedor";
        try{
            
            rs = st.executeQuery(query);
            //System.out.println("Records from database");
           
            //this.nombre=rs.getString("nombre");
            //this.dir=rs.getString("direccion");
            //this.telf=rs.getString("telf");
            
            
        }
        catch(Exception e){
            rs=null;
            System.out.println(e);
        }
        return rs;
    }
    
    public String InsertarProveedor(DProveedor dp) throws SQLException{
        Connection con = new Conexion().getCon();
        PreparedStatement insSt =null;
        //ResultSet rs=null;
        int i=0;
        String resp="";
        String query ="INSERT INTO Proveedor(nombre,direccion,telefono)values(?,?,?)";
        
        try{
            
           insSt = con.prepareStatement(query);
           insSt.setString(1, dp.getNombre());
           insSt.setString(2, dp.getDir());
           insSt.setString(3, dp.getTelf());
           i=insSt.executeUpdate();
           if(i>0){
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
            if(insSt !=null){
                insSt.close();
            }
            if(con!=null){
                con.close();
            }
            
        }
        return  resp;
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
