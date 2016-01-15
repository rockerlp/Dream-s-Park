/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dreampark;

import CapaDatos.Conexion;
import CapaPresentacion.MainScn;


/**
 *
 * @author jfpal
 */
public class DreamPark {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //inicializar conexion
        Conexion connect = new Conexion();
        MainScn mc = new MainScn();
        connect.getData();
        mc.setVisible(true);
    }
    
}
