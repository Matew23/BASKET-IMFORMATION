/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.fail;

/**
 *
 * @author ok
 */
public class implemetacionUsuarioTest {
    
    public implemetacionUsuarioTest() {
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
     * Test of validarUs method, of class implemetacionUsuario.
     */
    @Test
    public void testValidarUs() {
        System.out.println("validarUs");
        usuario usu = null;
        implemetacionUsuario instance = new implemetacionUsuario();
        boolean expResult = false;
        boolean result = instance.validarUs(usu);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of registrarUs method, of class implemetacionUsuario.
     */
    @Test
    public void testRegistrarUs() {
        System.out.println("registrarUs");
        usuario usu = new usuario("david", "dvera", "123");
        implemetacionUsuario instance = new implemetacionUsuario();
        boolean expResult = true;
        boolean result = instance.registrarUs(usu);
        assertEquals(expResult, result);
         if (result !=expResult) {
             fail("The test case is a prototype.");
         }
    }
    
}
