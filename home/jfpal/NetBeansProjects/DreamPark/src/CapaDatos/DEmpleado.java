/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaDatos;

/**
 *
 * @author jfpal
 */
public class DEmpleado extends DPersona{
    private String idEmpleado;
    private int idCargo;
    private int idHorario;

    public DEmpleado() {
    }

    public DEmpleado(String idEmpleado, int idCargo, int idHorario, int idPersona, String CiRuc, String nombre, String apellidos, String fechaNac, String direccion) {
        super(idPersona, CiRuc, nombre, apellidos, fechaNac, direccion);
        this.idEmpleado = idEmpleado;
        this.idCargo = idCargo;
        this.idHorario = idHorario;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public int getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(int idCargo) {
        this.idCargo = idCargo;
    }

    public int getIdHorario() {
        return idHorario;
    }

    public void setIdHorario(int idHorario) {
        this.idHorario = idHorario;
    }

    
    
    
}
