/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entorns;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author joana
 */
public class PilaArrayTest {
    
    public PilaArrayTest() {
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
     * Test of top method, of class PilaArray.
     */
    @Test
    public void testTop() {
        System.out.println("top");
        int expResult = 5;
        PilaArray.push(expResult);
        int result = PilaArray.top();
        assertEquals(expResult, result);

    }
    
     /**
     * Test of pop method, of class PilaArray.
     */
    @Test
    public void testPop() {
        System.out.println("pop");
        PilaArray.pop();
        
    }

    /**
     * Test of isEmpty method, of class PilaArray.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        boolean expResult = false;
        boolean result = PilaArray.isEmpty();
        assertEquals(expResult, result);

    }
    
}
