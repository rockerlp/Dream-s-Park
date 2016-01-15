/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaDatos;

import java.util.logging.Logger;

/**
 *
 * @author jfpal
 */
public class DCliente extends DPersona{
    private String idCliente;

    public DCliente() {
    }

    public DCliente(String idCliente, int idPersona, String CiRuc, String nombre, String apellidos, String fechaNac, String direccion) {
        super(idPersona, CiRuc, nombre, apellidos, fechaNac, direccion);
        this.idCliente = idCliente;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }
    
    
    
}
