/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
    
/**
 *
 * @author ok
 */
public class ImplementacionJugador implements jugadorDAO{
    
    public conexionSQL base=new conexionSQL();
    public  PreparedStatement st;
    public  ResultSet rs;
    public  Connection c; 
    
    public boolean agregarJu (jugador jug){
        boolean existe=false;
        String sql="insert into nbas values (?,?,?,?,?,?,?,?,?)";
        c=base.Conexion();
        try {
            st=c.prepareStatement(sql);
            
                   
            st.setInt(1, jug.getIdJugador());
            st.setString(2, jug.getNombre());
            st.setDouble(3,jug.getNumero_A() );
            st.setDouble(4, jug.getAltura());
            st.setInt(5, jug.getNBA_desde());
            st.setInt(6, jug.getNBA_hasta());
            st.setInt(7, jug.getNumero_C());
            st.setString(8, jug.getClub());
            st.setInt(9, jug.getisEstado_JG());
            
                     
            
            int rowInsert = st.executeUpdate();
            if(rowInsert>0){
                existe=true;
            }
        }
        catch (SQLException ex) {
            ex.printStackTrace();
        }
        return existe;
    }
    
    public boolean actualizarJu (jugador jug){
        boolean existe=false;
        String sql="update  nbas set Nombre = ?, NumeroA=?,Altura=?,NBA_desde=?,NBA_Hasta=?,Numero_C=?,Club=?,Estado_JG=? where Id_Jugador =? ";
        c=base.Conexion();
        try {
            st=c.prepareStatement(sql);
            
                  
            st.setString(1, jug.getNombre());
            st.setDouble(2,jug.getNumero_A() );
            st.setDouble(3, jug.getAltura());
            st.setInt(4, jug.getNBA_desde());
            st.setInt(5, jug.getNBA_hasta());
            st.setInt(6, jug.getNumero_C());
            st.setString(7, jug.getClub());
            st.setInt(8, jug.getisEstado_JG());
            
            st.setInt(9, jug.getIdJugador());
            
                     
            
            int rowInsert = st.executeUpdate();
            if(rowInsert>0){
                existe=true;
            }
        }
        catch (SQLException ex) {
            ex.printStackTrace();
        }
        return existe;
}



    @Override
    public boolean agreg(jugador jug) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     public jugador getjugador(jugador jug) {
        jugador Jugador = jug;
        String sql = "SELECT * FROM nbas";
        try {
            c = base.Conexion();
            st = c.prepareStatement(sql);
            rs = st.executeQuery();
            while (rs.next()) {
                if(rs.getString(2).equals(jug.getNombre())){
                    Jugador.setIdJugador(rs.getInt(1));
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();

        }
        return Jugador;
    }
     public List getjugad() {
        List<jugador> jugadores = new ArrayList<>();
        String sql = "SELECT * FROM nbas";
        try {
            c = base.Conexion();
            st = c.prepareStatement(sql);
            rs = st.executeQuery();
            while (rs.next()) {//int Numero_C, int NBA_desde, int NBA_hasta, double altura, double Numero_A, int estado_JG, String nombre, String club
                jugador k = new jugador(rs.getInt(7), rs.getInt(5), rs.getInt(6), rs.getDouble(4), rs.getInt(3), rs.getInt(9), rs.getString(2), rs.getString(8));
                k.setIdJugador(rs.getInt(1));
                jugadores.add(k);
            }
        } catch (Exception e) {
            e.printStackTrace();

        }
        
        return jugadores;
    }

public boolean eliminarJu (int idJugador){
        boolean eliminado = false;
        String sql="delete from nbas where Id_Jugador= ? ";
        
        try {
            c=base.Conexion();
            st=c.prepareStatement(sql);      
            st.setInt(1, idJugador);
            int rowInsert = st.executeUpdate();
            if(rowInsert>0){
                System.out.print("dasdsad");
                eliminado=true;
            }
        }
        catch (SQLException ex) {
            ex.printStackTrace();
        }
        return eliminado;
}
}

