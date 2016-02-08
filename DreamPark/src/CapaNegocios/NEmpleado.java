/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package CapaNegocios;

import CapaDatos.DEmpleado;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author jfpal
 */
public class NEmpleado {
    
    public NEmpleado() {
    }
    
    
    public ResultSet Mostrar() throws SQLException{
        return new DEmpleado().Mostrar();
    }
    public int buscar_Cargo_Nombre(String nombre) throws SQLException{
        return new DEmpleado().buscar_Cargo_Nombre(nombre);
    }
    
    public int buscar_Horario_Nombre(String nombre) throws SQLException{
        return new DEmpleado().buscar_Horario_Nombre(nombre);
    }
    
    public static String insertar(String CR,String nombre, String ape, String fNac,String Dir,int idCargo,int idH) throws SQLException{
        DEmpleado obj = new DEmpleado();
        obj.setCiRuc(CR);
        obj.setNombre(nombre);
        obj.setApellidos(ape);
        obj.setFechaNac(fNac);
        obj.setDireccion(Dir);
        obj.setIdCargo(idCargo);
        obj.setIdHorario(idH);
        return obj.InsertarEmpleado(obj);
        
    }
    public static String Editar(int idPers,int idEmp,String CR,String nombre, String ape, String fNac,String Dir,int idCargo,int idH) throws SQLException{
        DEmpleado obj = new DEmpleado();
        obj.setIdPersona(idPers);
        obj.setIdEmpleado(idEmp);
        obj.setCiRuc(CR);
        obj.setNombre(nombre);
        obj.setApellidos(ape);
        obj.setFechaNac(fNac);
        obj.setDireccion(Dir);
        obj.setIdCargo(idCargo);
        obj.setIdHorario(idH);
        return obj.EditarEmpleado(obj);
        
    }
    public static String Eliminar(int idPers,int idEmp,String CR,String nombre, String ape, String fNac,String Dir,int idCargo,int idH) throws SQLException{
        DEmpleado obj = new DEmpleado();
        obj.setIdPersona(idPers);
        obj.setIdEmpleado(idEmp);
        obj.setCiRuc(CR);
        obj.setNombre(nombre);
        obj.setApellidos(ape);
        obj.setFechaNac(fNac);
        obj.setDireccion(Dir);
        obj.setIdCargo(idCargo);
        obj.setIdHorario(idH);
        return obj.EliminarEmpleado(obj);
        
    }
}
