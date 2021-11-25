/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;



/**
 *
 * @author ok
 */

import javax.swing.*;
import java.sql.*;


    
public class conexionSQL {
    Connection conectar = null;
    public Connection Conexion(){
        try {
            String jdbcURL = "jdbc:mysql://localhost:3306/bdbasket";
            String username = "root";
            String password = "1234";
            conectar = (Connection) DriverManager.getConnection(jdbcURL, username, password);


        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"fallo de conexion"+e.getMessage());
        }
        return conectar;
    }
}


