/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaNegocios;
import CapaDatos.DCliente;
import java.sql.*;
import java.util.LinkedList;

/**
 *
 * @author lhtc9
 */
public class NCliente extends NPersona{

    public NCliente() {
    }    
    
    public ResultSet Mostrar() throws SQLException{
        return new DCliente().Mostrar();
    }
    
    public ResultSet Mostrar2() throws SQLException{
        return new DCliente().Mostrar2();
    }
    
    public ResultSet MostrarNombres() throws SQLException{
        return new DCliente().MostrarNombres();
    }
    public static String insertar(String cedRuc, String nombre, String apellido, String fechaNaci,String direccion) throws SQLException{
        DCliente obj = new DCliente();
        obj.setCiRuc(cedRuc);
        obj.setNombre(nombre);
        obj.setApellidos(apellido);
        obj.setFechaNac(fechaNaci);
        obj.setDireccion(direccion);
        return obj.InsertarCliente(obj);        
    }
    public static String Editar(int idCliente,String cedRuc, String nombre, String apellido, String fechaNaci,String direccion) throws SQLException{
        DCliente obj = new DCliente();
        obj.setIdPersona(idCliente);
        obj.setCiRuc(cedRuc);
        obj.setNombre(nombre);
        obj.setApellidos(apellido);
        obj.setFechaNac(fechaNaci);
        obj.setDireccion(direccion);
        return obj.EditarCliente(obj);
        
    }    
    public static String Eliminar(int idCliente,String cedRuc, String nombre, String apellido, String fechaNaci,String direccion) throws SQLException{
        DCliente obj = new DCliente();
        obj.setIdPersona(idCliente);
        obj.setCiRuc(cedRuc);
        obj.setNombre(nombre);
        obj.setApellidos(apellido);
        obj.setFechaNac(fechaNaci);
        obj.setDireccion(direccion);
        return obj.EliminarCliente(obj);
      
        
    }
}
