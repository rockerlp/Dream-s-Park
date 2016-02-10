/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaNegocios;
import CapaDatos.DTipoInv;
import java.sql.*;
/**
 *
 * @author Hortencia
 */
public class NTipInv {
    public NTipInv() {
    }
   
    
    public ResultSet Mostrar() throws SQLException{
        return new DTipoInv().MostTipInv();
    }
    public ResultSet MostrarListTInv() throws SQLException{
        return new DTipoInv().MostListaTipInv();
    }
}
