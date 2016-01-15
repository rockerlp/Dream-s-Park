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
public class DEvento {
    private int idEvento;
    private String fecha;
    private String Salon;
    private int nP;
    private String desc;
    private double costo;
    private int idTipo_Evento;
    private int idTematica;

    public DEvento() {
    }

    public DEvento(int idEvento, String fecha, String Salon, int nP, String desc, double costo, int idTipo_Evento, int idTematica) {
        this.idEvento = idEvento;
        this.fecha = fecha;
        this.Salon = Salon;
        this.nP = nP;
        this.desc = desc;
        this.costo = costo;
        this.idTipo_Evento = idTipo_Evento;
        this.idTematica = idTematica;
    }

    public int getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(int idEvento) {
        this.idEvento = idEvento;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getSalon() {
        return Salon;
    }

    public void setSalon(String Salon) {
        this.Salon = Salon;
    }

    public int getnP() {
        return nP;
    }

    public void setnP(int nP) {
        this.nP = nP;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public int getIdTipo_Evento() {
        return idTipo_Evento;
    }

    public void setIdTipo_Evento(int idTipo_Evento) {
        this.idTipo_Evento = idTipo_Evento;
    }

    public int getIdTematica() {
        return idTematica;
    }

    public void setIdTematica(int idTematica) {
        this.idTematica = idTematica;
    }
    
    
    
}
