/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.util.List;
import modelo.ImplementacionJugador;
import modelo.jugador;
/**
 *
 * @author ok
 */
public class ControllerJug {
    ImplementacionJugador imp = new ImplementacionJugador();
    
    public boolean agreg(jugador jug){return imp.agregarJu(jug);}
    
    public jugador getjug(jugador jug){
        return imp.getjugador(jug);
    }
    public List getDatosJugadores(){
        return imp.getjugad();
    }
    
    public boolean eliminarJuga(int idJugador) {
        return imp.eliminarJu(idJugador);

    }
    
    public boolean actualizar(jugador jug) {
        return imp.actualizarJu(jug);

    }
}

