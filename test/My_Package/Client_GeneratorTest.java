/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package My_Package;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Doru
 */
public class Client_GeneratorTest {
    
    public Client_GeneratorTest() {
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

    @Test
    public void testAddClient() {
        System.out.println("addClient");
        Client_Generator instance = null;
        instance.addClient();
        fail("The test case is a prototype.");
    }

    @Test
    public void testTick() {
        System.out.println("tick");
        Client_Generator instance = null;
        instance.tick();
        fail("The test case is a prototype.");
    }
    
}
