/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import modelo.implemetacionUsuario;
import modelo.usuario;

public class ControllerUsu {
    implemetacionUsuario im = new implemetacionUsuario();
    public boolean ingresar(usuario usu){return im.validarUs(usu);}
    
    public boolean regis(usuario usu){return im.registrarUs(usu);}
    
    
}


