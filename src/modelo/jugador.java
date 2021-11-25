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
public class jugador {
    private int idJugador, Numero_C, NBA_desde, NBA_hasta ;
    private double altura, Numero_A;
    private int estado_JG;
    private String nombre, club;

    public jugador( int Numero_C, int NBA_desde, int NBA_hasta, double altura, double Numero_A, int estado_JG, String nombre, String club) {
        
        this.Numero_C = Numero_C;
        this.NBA_desde = NBA_desde;
        this.NBA_hasta = NBA_hasta;
        this.altura = altura;
        this.Numero_A = Numero_A;
        this.estado_JG = estado_JG;
        this.nombre = nombre;
        this.club = club;
    }

    
    
    
    
    

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

   
    
    
    /*public int getId() {
        return (int) Math.floor(Math.random() * (999 - 2 + 1) + 2);
    }*/
    
    
    public int getIdJugador() {
        return idJugador;
    }

    public void setIdJugador(int idJugador) {
        this.idJugador = idJugador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public int getNumero_C() {
        return Numero_C;
    }

    public void setNumero_C(int Numero_C) {
        this.Numero_C = Numero_C;
    }

    public int getNBA_desde() {
        return NBA_desde;
    }

    public void setNBA_desde(int NBA_desde) {
        this.NBA_desde = NBA_desde;
    }

    public int getNBA_hasta() {
        return NBA_hasta;
    }

    public void setNBA_hasta(int NBA_hasta) {
        this.NBA_hasta = NBA_hasta;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getNumero_A() {
        return Numero_A;
    }

    public void setNumero_A(double Numero_A) {
        this.Numero_A = Numero_A;
    }

    public int getisEstado_JG() {
        return estado_JG;
    }

    public void getEstado_JG(int estado_JG) {
        this.estado_JG = estado_JG;
    }
    
    
    
}
