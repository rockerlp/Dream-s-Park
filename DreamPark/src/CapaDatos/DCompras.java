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
 * @author lhtc9
 * CREATE TABLE IF NOT EXISTS `ProyectoBD`.`Compras` (
  `idCompras` INT NOT NULL AUTO_INCREMENT,
  `fecha` DATE NOT NULL,
  `descripcion` VARCHAR(45) NOT NULL,
  `cantidad` INT NOT NULL,
  `precio` DOUBLE NOT NULL,
  `Proveedor_idProveedor` INT NOT NULL,
  `Empleado_idEmpleado` INT NOT NULL,
  PRIMARY KEY (`idCompras`),
  INDEX `fk_Compras_Proveedor1_idx` (`Proveedor_idProveedor` ASC),
  INDEX `fk_Compras_Empleado1_idx` (`Empleado_idEmpleado` ASC),
  CONSTRAINT `fk_Compras_Proveedor1` FOREIGN KEY (`Proveedor_idProveedor`) REFERENCES `ProyectoBD`.`Proveedor` (`idProveedor`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Compras_Empleado1` FOREIGN KEY (`Empleado_idEmpleado`) REFERENCES `ProyectoBD`.`Empleado` (`idEmpleado`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
 */
public class DCompras {
    private int idCompras;
    private String fechaC;    
    private String descrC;
    private int cantidadC;
    private double pCompra;
    private int idProv;
    private int idEmp;
    
    public DCompras(){        
    }

    public DCompras(int idCompras, String fechaC, String descrC, int cantidadC, double pCompra, int idProv, int idEmp) {
        this.idCompras = idCompras;
        this.fechaC = fechaC;
        this.descrC = descrC;
        this.cantidadC = cantidadC;
        this.pCompra = pCompra;
        this.idProv = idProv;
        this.idEmp = idEmp;
    }
    
    public ResultSet Mostrar() throws SQLException{
        Connection con = new Conexion().getCon();
        Statement st =con.createStatement();
        ResultSet rs=null;
        String query ="select * from Mostrar_Compras";
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
    public String InsertarCompras(DCompras dcp) throws SQLException{
        Connection con = new Conexion().getCon();
        CallableStatement calStat=null;
        ResultSet rs=null;
        String resp="";
        String query ="{call insertar_Compras(?,?,?,?,?,?)}";
        try{
            calStat = con.prepareCall(query);
            calStat.setString(1, dcp.getFechaC());
            calStat.setString(2, dcp.getDescrC());
            calStat.setInt(3, dcp.getCantidadC());
            calStat.setDouble(4, dcp.getpCompra());
            calStat.setInt(5, dcp.getIdProv());
            calStat.setInt(6, dcp.getIdEmp());
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
    public String EditarCompras(DCompras dcp) throws SQLException{
        Connection con = new Conexion().getCon();        
        CallableStatement calStat=null;
        ResultSet rs=null;
        int i=0;
        String resp="";
        String query ="{call Editar_Compras(?,?,?,?,?,?,?)}";        
        try{            
           calStat = con.prepareCall(query);
           calStat.setInt(1, dcp.getIdCompras());
           calStat.setString(2, dcp.getFechaC());
           calStat.setString(3, dcp.getDescrC());
           calStat.setInt(4, dcp.getCantidadC());
           calStat.setDouble(5, dcp.getpCompra());
           calStat.setInt(6, dcp.getIdProv());
           calStat.setInt(7, dcp.getIdEmp());
           rs=calStat.executeQuery();
           if(rs!=null){
               resp = "OK";
           }else{
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
    public String EliminarCompras(DCompras dcp) throws SQLException{
        Connection con = new Conexion().getCon();        
        CallableStatement calStat=null;
        ResultSet rs=null;
        int i=0;
        String resp="";
        String query ="{call Borrar_Compras(?)}";        
        try{
            calStat = con.prepareCall(query);
            calStat.setInt(1, dcp.getIdCompras());
            rs=calStat.executeQuery();
            if(rs!=null){
                resp = "OK";
            }else{
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
    public int BuscarProveedorNombre(String nombre) throws SQLException{
        Connection con = new Conexion().getCon();        
        CallableStatement calStat=null;
        ResultSet rs=null;
        int i=0;
        String resp="";
        String query ="{call Buscar_Proveedor_Nombre(?)}";        
        try{
            calStat = con.prepareCall(query);
            calStat.setString(1, nombre);
            rs=calStat.executeQuery();
            if(rs.next()){
                resp = "OK";
                return rs.getInt(1);
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
    public int BuscarEmpleadoNombre(String nombre, String ape) throws SQLException{
        Connection con = new Conexion().getCon();        
        CallableStatement calStat=null;
        ResultSet rs=null;
        int i=0;
        String resp="";
        String query ="{call Buscar_Empleado_Nombre(?,?)}";        
        try{
            calStat = con.prepareCall(query);
            calStat.setString(1, nombre);
            calStat.setString(2, ape);
            rs=calStat.executeQuery();
            if(rs.next()){
                resp = "OK";
                return rs.getInt(1);
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
    
     public ResultSet mostrarProv() throws SQLException{
        Connection con = new Conexion().getCon();
        Statement st =con.createStatement();
        ResultSet rs=null;
        String query ="select * from Mostrar_Proveedor_Nombre";
        try{
            rs = st.executeQuery(query);
        }
        catch(Exception e){
            rs=null;
            System.out.println(e);
        }
        return rs;
    }
     
     public ResultSet mostrarEmpleado() throws SQLException{
        Connection con = new Conexion().getCon();
        Statement st =con.createStatement();
        ResultSet rs=null;
        String query ="select * from Mostrar_Empleado_Nombre";
        try{
            rs = st.executeQuery(query);
        }
        catch(Exception e){
            rs=null;
            System.out.println(e);
        }
        return rs;
    }
    
    public int getIdCompras() {
        return idCompras;
    }

    public void setIdCompras(int idCompras) {
        this.idCompras = idCompras;
    }

    public String getFechaC() {
        return fechaC;
    }

    public void setFechaC(String fechaC) {
        this.fechaC = fechaC;
    }

    public String getDescrC() {
        return descrC;
    }

    public void setDescrC(String descrC) {
        this.descrC = descrC;
    }

    public int getCantidadC() {
        return cantidadC;
    }

    public void setCantidadC(int cantidadC) {
        this.cantidadC = cantidadC;
    }

    public double getpCompra() {
        return pCompra;
    }

    public void setpCompra(double pCompra) {
        this.pCompra = pCompra;
    }

    public int getIdProv() {
        return idProv;
    }

    public void setIdProv(int idProv) {
        this.idProv = idProv;
    }

    public int getIdEmp() {
        return idEmp;
    }

    public void setIdEmp(int idEmp) {
        this.idEmp = idEmp;
    }

    
    
    
    
    
    
}
