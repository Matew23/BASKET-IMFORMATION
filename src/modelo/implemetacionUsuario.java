/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
    
/**
 *
 * @author ok
 */
public class implemetacionUsuario implements usuarioDAO{
 
    public conexionSQL base=new conexionSQL();
    public  PreparedStatement st;
    public  ResultSet rs;
    public  Connection c;
    
    @Override
    public boolean validarUs(usuario usu) {
        boolean existe=false;
        String sql="select * from login";
        c=base.Conexion();
        try {
            st=c.prepareStatement(sql);
            rs=st.executeQuery();
            while(rs.next()){ 
                if (usu.getUsuario().equals(rs.getString(2)) && usu.getContraseña().equals(rs.getString(3))){
                    existe = true;
                    break;
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return existe;
        
    }
    public boolean registrarUs (usuario usu){
        boolean existe=false;
        String sql="insert into login values (?,?,?,?)";
    
        c=base.Conexion();
        
        
        try {
            st=c.prepareStatement(sql);
            
                   
            st.setInt(1, usu.getident());
            st.setString(2, usu.getUsuario());
            st.setString(3, usu.getContraseña());
            st.setString(4, usu.getNombreCompleto());                       
            int rowInsert = st.executeUpdate();
            if(rowInsert>0){
                System.out.print("dasdsad");
                existe=true;
            }
        }
        catch (SQLException ex) {
            ex.printStackTrace();
        }
        return existe;
}

    
   
}
