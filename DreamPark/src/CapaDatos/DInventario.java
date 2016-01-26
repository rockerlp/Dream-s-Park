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
public class DInventario {
    private int idInventario;
    private String nombre;
    private int cantidad;
    private int tipo;
    private String descripcion;
    private double pCompra;
    private double pVenta;
        
    private String buscar;
    
    public DInventario(){        
    }
    public DInventario(int idInventario, String nombre, int cantidad,int tipo, String descripcion,double pCompra,double pVenta) {
        this.idInventario = idInventario;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.pCompra = pCompra;
        this.pVenta = pVenta;
    }
    public ResultSet Mostrar() throws SQLException{
        Connection con = new Conexion().getCon();
        Statement st =con.createStatement();
        ResultSet rs=null;
        String query ="select * from Inventario";
        try{
            
            rs = st.executeQuery(query);
            //System.out.println("Records from database");                       
        }
        catch(Exception e){
            rs=null;
            System.out.println(e);
        }
        return rs;
    }
    public String InsertarInventario(DInventario di) throws SQLException{
        Connection con = new Conexion().getCon();
        PreparedStatement insSt =null;
        //ResultSet rs=null;
        int i=0;
        String resp="";
        String query ="INSERT INTO Inventario(nombre,cantidad,tipo,descripcion,precioCompra,precioVenta)values(?,?,?,?,?,?)";
        
        try{
            
           insSt = con.prepareStatement(query);
           insSt.setString(1, di.getNombre());
           insSt.setInt(2, di.getCantidad());
           insSt.setInt(3, di.getTipo());
           insSt.setString(4, di.getDescripcion());
           insSt.setDouble(5, di.getpCompra());
           insSt.setDouble(6, di.getpVenta());
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
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public int getTipo() {
        return tipo;
    }
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public double getpCompra() {
        return pCompra;
    }
    public void setpCompra(double pCompra) {
        this.pCompra = pCompra;
    }
    public double getpVenta() {
        return pVenta;
    }
    public void setpVenta(double pVenta) {
        this.pVenta = pVenta;
    }
    public String getBuscar() {
        return buscar;
    }
    public void setBuscar(String buscar) {
        this.buscar = buscar;
    }
    
}
