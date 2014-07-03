/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package datos;

import java.sql.ResultSet;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Java
 */
public class dbconectorTest {
    
    public dbconectorTest() {
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
     * Test of getdata method, of class dbconector.
     */
    @Test
    public void testGetdata() {
        System.out.println("getdata");
        String usuario = "aa";
        String clave = "aa";
        dbconector instance = new dbconector();
        boolean expResult = false;
        boolean result = instance.getdata(usuario, clave);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
     //   fail("The test case is a prototype.");
    }

    /**
     * Test of insertar method, of class dbconector.
     */
    @Test
    public void testInsertar() {
        System.out.println("insertar");
        String usuario = "abcdfdsdse";
        String clave = "abdscde";
        dbconector instance = new dbconector();
        boolean expResult = false;
        boolean result = instance.insertar(usuario, clave);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of buscar method, of class dbconector.
     */
    @Test
    public void testBuscar() {
        System.out.println("buscar");
        String tabla = "";
        dbconector instance = new dbconector();
        ResultSet expResult = null;
        ResultSet result = instance.buscar(tabla);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
