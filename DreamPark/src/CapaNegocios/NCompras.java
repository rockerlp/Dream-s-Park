/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaNegocios;

import CapaDatos.DCompras;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author lhtc9
 * 
 */
public class NCompras {
    public NCompras() {
    }
    public ResultSet Mostrar() throws SQLException{
        return new DCompras().Mostrar();
    }
    public ResultSet MostrarProv() throws SQLException{
        return new DCompras().mostrarProv();
    }
    public ResultSet MostrarEmp() throws SQLException{
        return new DCompras().mostrarEmpleado();
    }
    
    public static String Insertar(String fecha, String desc, int cant, double precio, int prov, int emp) throws SQLException{
        DCompras obj = new DCompras();
        obj.setFechaC(fecha);
        obj.setDescrC(desc);
        obj.setCantidadC(cant);
        obj.setpCompra(precio);
        obj.setIdProv(prov);
        obj.setIdEmp(emp);
        return obj.InsertarCompras(obj);        
    }
    public static String Editar(int idC,String fecha, String desc, int cant,double precio,int prov,int emp) throws SQLException{
        DCompras obj = new DCompras();
        obj.setIdCompras(idC);
        obj.setFechaC(fecha);
        obj.setDescrC(desc);
        obj.setCantidadC(cant);
        obj.setpCompra(precio);
        obj.setIdProv(prov);
        obj.setIdEmp(emp);
        return obj.EditarCompras(obj);
        
    }
    public static String Eliminar(int idC,String fecha, String desc, int cant,double precio,int prov,int emp) throws SQLException{
        DCompras obj = new DCompras();
        obj.setIdCompras(idC);
        obj.setFechaC(fecha);
        obj.setDescrC(desc);
        obj.setCantidadC(cant);
        obj.setpCompra(precio);
        obj.setIdProv(prov);
        obj.setIdEmp(emp);
        return obj.EliminarCompras(obj);
        
    }
    public static int BuscarProveedorNombre(String nombre) throws SQLException{
        return new DCompras().BuscarProveedorNombre(nombre);
    }
    public static int BuscarEmpleadoNombre(String nombre,String ape) throws SQLException{
        return new DCompras().BuscarEmpleadoNombre(nombre, ape);
    }
}