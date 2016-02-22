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

/**
 *
 * @author lhtc9
 */
public class DFactura {
    private int idFactura;
    private String fecha;
    private String Descripcion;
    private double subtotal;
    private double ivaCero;
    private double ivaDoce;
    private double total;
    private int idEventos;
    public DFactura() {
    }

    public DFactura(int idFactura, String fecha, String Descripcion, double subtotal, double ivaCero, double ivaDoce, double total, int idEventos) {
        this.idFactura = idFactura;
        this.fecha = fecha;
        this.Descripcion = Descripcion;
        this.subtotal = subtotal;
        this.ivaCero = ivaCero;
        this.ivaDoce = ivaDoce;
        this.total = total;
        this.idEventos = idEventos;
    }
    public String InsertarFactura(DFactura df) throws SQLException{
        Connection con = new Conexion().getCon();
        CallableStatement calStat=null;
        ResultSet rs=null;
        String resp="";
        String query ="{call insertar_Factura(?,?,?,?,?,?,?)}";
        try{
            calStat = con.prepareCall(query);
            calStat.setString(1, df.getFecha());
            calStat.setString(2, df.getDescripcion());
            calStat.setDouble(3, df.getSubtotal());
            calStat.setDouble(4, df.getIvaCero());
            calStat.setDouble(5, df.getIvaDoce());
            calStat.setDouble(6, df.getTotal());
            calStat.setInt(7, df.getIdEventos());
            rs=calStat.executeQuery();
            if(rs!=null){
               resp = "OK";
            }else{
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
    public ResultSet Mostrar() throws SQLException{
        Connection con = new Conexion().getCon();
        Statement st =con.createStatement();
        ResultSet rs=null;
        String query ="select * from Mostrar_Factura";
        try{            
            rs = st.executeQuery(query);
        }
        catch(Exception e){
            rs=null;
            System.out.println(e);
        }
        return rs;
    }
    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getIvaCero() {
        return ivaCero;
    }

    public void setIvaCero(double ivaCero) {
        this.ivaCero = ivaCero;
    }

    public double getIvaDoce() {
        return ivaDoce;
    }

    public void setIvaDoce(double ivaDoce) {
        this.ivaDoce = ivaDoce;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getIdEventos() {
        return idEventos;
    }

    public void setIdEventos(int idEventos) {
        this.idEventos = idEventos;
    }
    
    
}
