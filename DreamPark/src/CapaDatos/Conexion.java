/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaDatos;

//Agregar a las dependencias del proyecto la libreria de mysqljdbcConection

//importar librerias sql
import java.sql.*;

/**
 *
 * @author jfpal
 */
public class Conexion {
    
    private Connection con;
    private Statement st;
    private ResultSet rs;
    
       
    public Conexion(){
        try{
            
            
            // This will load the MySQL driver, each DB has its own driver
            Class.forName("com.mysql.jdbc.Driver");
            //conn = DriverManager.getConnection("jdbc:mysql://localhost/EMP"+"username"+"password");
            con = DriverManager.getConnection("jdbc:mysql://localhost/ProyectoBD","root","et2345muerteSQL4");
            st =con.createStatement();
        
        }
        catch(Exception e){
            System.out.println("Error: " + e);
        }
    }
    
    public void getData(){
        try{
            String query ="select * from Cargo";
            rs = st.executeQuery(query);
            System.out.println("Records from database");
            while(rs.next()){
                String name = rs.getString("Nombre");
                String desc = rs.getString("Descripcion");
                System.out.println("Nombre "+name+" "+"Descripcion "+desc);
            }
            
        }
        catch(Exception e){
            
            System.out.println(e);
        }
    }

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }
    
}
