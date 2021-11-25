/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

/**
 *
 * @author ok
 */
public class ImplementacionJugadorIT {
    
    public ImplementacionJugadorIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of agregarJu method, of class ImplementacionJugador.
     */
    @Test
    public void testAgregarJu() {
        System.out.println("agregarJu");
        jugador jug = new jugador(0, 0, 0, 0, 0, 0, "gary","psg");
        ImplementacionJugador instance = new ImplementacionJugador();
        boolean expResult = false;
        boolean result = instance.agregarJu(jug);
        assertEquals(expResult, result);
         if (result !=expResult) {
             fail("The test case is a prototype.");
         }
            
      
    }

    /**
     * Test of actualizarJu method, of class ImplementacionJugador.
     */
    @Test
    public void testActualizarJu() {
        System.out.println("actualizarJu");
        jugador jug = null;
        ImplementacionJugador instance = new ImplementacionJugador();
        boolean expResult = false;
        boolean result = instance.actualizarJu(jug);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of agreg method, of class ImplementacionJugador.
     */
    @Test
    public void testAgreg() {
        System.out.println("agreg");
        jugador jug = new jugador(0, 1, 0, 0, 0, 0, "gary", "Phoenix Suns");
        ImplementacionJugador instance = new ImplementacionJugador();
        boolean expResult = false;
        boolean result = instance.agreg(jug);
        assertEquals(expResult, result);
        if (result !=expResult) {
             fail("The test case is a prototype.");
         }
            
    }

    /**
     * Test of getjugador method, of class ImplementacionJugador.
     */
    @Test
    public void testGetjugador() {
        System.out.println("getjugador");
        jugador jug = null;
        ImplementacionJugador instance = new ImplementacionJugador();
        jugador expResult = null;
        jugador result = instance.getjugador(jug);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getjugad method, of class ImplementacionJugador.
     */
    @Test
    public void testGetjugad() {
        System.out.println("getjugad");
        ImplementacionJugador instance = new ImplementacionJugador();
        List expResult = null;
        List result = instance.getjugad();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarJu method, of class ImplementacionJugador.
     */
    @Test
     public void testEliminarJu() {
        System.out.println("eliminarJu");
        int idJugador = 1;
        ImplementacionJugador instance = new ImplementacionJugador();
        boolean expResult = false;
        boolean result = instance.eliminarJu(idJugador);
        assertEquals(expResult, result);
        if (result !=expResult) {
             fail("The test case is a prototype.");
        }
            
        }
       
    
}
