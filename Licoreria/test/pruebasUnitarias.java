/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import datos.dbconector;
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
public class pruebasUnitarias {
    
    public static void main(String[] args) {
        pruebasUnitarias pr = new pruebasUnitarias();
        pr.pruebaingresousuario();
        
    }
    
    public pruebasUnitarias() {
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
    
    public void pruebaingresousuario(){
        dbconector db = new dbconector();
        String st1 = "juan";
        String st2= "juan";
        db.insertar(st1,st2);
         db.insertar("miguel",null);
          db.insertar(null,null);
        
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
