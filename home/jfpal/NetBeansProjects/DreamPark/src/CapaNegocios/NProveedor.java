/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaNegocios;
import CapaDatos.DProveedor;
import java.sql.*;
/**
 *
 * @author jfpal
 */
public class NProveedor {

    public NProveedor() {
    }
   
    
    public ResultSet Mostrar(){
        return new DProveedor().Mostrar();
    }
    
}
