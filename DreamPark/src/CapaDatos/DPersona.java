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
public class DPersona {
    private int idPersona;
    private String CiRuc;
    private String  nombre;
    private String apellidos;
    private String fechaNac;
    private String direccion;

    public DPersona() {
    }

    public DPersona(int idPersona, String CiRuc, String nombre, String apellidos, String fechaNac, String direccion) {
        this.idPersona = idPersona;
        this.CiRuc = CiRuc;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNac = fechaNac;
        this.direccion = direccion;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getCiRuc() {
        return CiRuc;
    }

    public void setCiRuc(String CiRuc) {
        this.CiRuc = CiRuc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
    
}
