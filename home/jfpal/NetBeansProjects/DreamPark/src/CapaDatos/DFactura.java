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
