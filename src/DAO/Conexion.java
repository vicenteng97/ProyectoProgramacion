/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author DAW
 */
public class Conexion {
    
     public Connection conectar(){
        
        Connection con=null;
        
        try{            
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://10.2.1.1:3306/ProgramacionBBDD";
            String user="ubuntuProgramacion";
            String pass="Ubuntu16_Prog";
            con = DriverManager.getConnection(url, user, pass);
        }
        catch(Exception ex){            
            System.out.println("Ha sido imposible crear la conexion");
        }
        
       return con; 
    }
    
    public void desconectar(Connection con){
        
        try{
            if (con!=null) con.close();
            
        } catch(Exception ex){
            
            System.out.println("Ha sido imposible cerrar la conexion");
        }
        
    }

}
