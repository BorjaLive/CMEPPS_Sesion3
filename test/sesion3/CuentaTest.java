/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion3;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author borja
 */
public class CuentaTest {
    
    public CuentaTest() {
    }

    /**
     * Test of ingreso method, of class Cuenta.
     */
    @Test
    public void testIngreso() {
        Cuenta cuenta = new Cuenta(50);
        assertEquals(50, cuenta.getSaldo(), 0.01d);
        assertTrue(cuenta.ingreso(20));
        assertEquals(70, cuenta.getSaldo(), 0.01d);
    }

    /**
     * Test of reintegro method, of class Cuenta.
     */
    @Test
    public void testReintegro() {
        Cuenta cuenta = new Cuenta(50);
        assertEquals(50, cuenta.getSaldo(), 0.01d);
        assertTrue(cuenta.reintegro(30));
        assertEquals(20, cuenta.getSaldo(), 0.01d);
        assertFalse(cuenta.reintegro(600));
        assertEquals(20, cuenta.getSaldo(), 0.01d);
    }

    /**
     * Test of getSaldo method, of class Cuenta.
     */
    @Test
    public void testGetSaldo() {
        Cuenta cuenta = new Cuenta(50);
        assertEquals(50, cuenta.getSaldo(), 0.01d);
    }
    
    /**
     * Test of T0014.
     */
    @Test
    public void testT0014() {
        Cuenta c12345 = new Cuenta(50);
        Cuenta c67899 = new Cuenta(0);
        assertEquals(50, c12345.getSaldo(), 0.01d);
        assertEquals(0, c67899.getSaldo(), 0.01d);
        
        assertTrue(c12345.reintegro(200));  //1
        assertTrue(c67899.reintegro(350));  //2
        assertTrue(c12345.ingreso(100));    //3
        assertFalse(c67899.reintegro(200)); //4
        assertTrue(c67899.reintegro(150));  //5
        assertTrue(c12345.reintegro(200));  //6
        assertTrue(c67899.ingreso(50));     //7
        assertFalse(c67899.reintegro(100)); //8
        
        assertEquals(-250, c12345.getSaldo(), 0.01d);
        assertEquals(-450, c67899.getSaldo(), 0.01d);
    }
    
}
