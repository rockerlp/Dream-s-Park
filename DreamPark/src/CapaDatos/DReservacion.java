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
public class DReservacion {
    private int idReservacion;
    private String fecha;
    private double precio;
    private int idEventos;
    private int idCliente;

    public DReservacion() {
    }

    public DReservacion(int idReservacion, String fecha, double precio, int idEventos, int idCliente) {
        this.idReservacion = idReservacion;
        this.fecha = fecha;
        this.precio = precio;
        this.idEventos = idEventos;
        this.idCliente = idCliente;
    }
    
    

    public int getIdReservacion() {
        return idReservacion;
    }

    public void setIdReservacion(int idReservacion) {
        this.idReservacion = idReservacion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getIdEventos() {
        return idEventos;
    }

    public void setIdEventos(int idEventos) {
        this.idEventos = idEventos;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    
    
    
}
