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
public class QueueTest {
    
    public QueueTest() {
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
    public void testRun() {
        System.out.println("run");
        Queue instance = null;
        instance.run();
        fail("The test case is a prototype.");
    }

    @Test
    public void testStart() {
        System.out.println("start");
        Queue instance = null;
        instance.start();
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetServeTime() {
        System.out.println("getServeTime");
        Queue instance = new Queue(2,null);
               Client c = new Client(2,2);
                      Client c1 = new Client(4,4);
                              instance.addClient(c);
                                      instance.addClient(c1);
        int expResult = 6;
        int result = instance.getServeTime();
        assertEquals(expResult, result);
    }

    @Test
    public void testAddClient() {
        System.out.println("addClient");
        Client c = new Client(2,2);
        Queue instance = new Queue(2,null);
        instance.addClient(c);
        Client expResult = c;
        Client result = instance.getClient(0);
    }

    @Test
    public void testGetServeTimeS() {
        System.out.println("getServeTimeS");
        Queue instance = new Queue(2,null);
        String expResult = instance.getServeTimeS();
        String result = instance.getServeTimeS();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetSize() {
        System.out.println("getSize");
        Queue instance = new Queue(3,null);
        int expResult = 0;
        int result = instance.getSize();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetClient() {
        System.out.println("getClient");
        int i = 1;
        Queue instance = new Queue(2,null);
        Client c = new Client(2,2);
       instance.addClient(c);
        Client c1 = new Client(3,3);
        instance.addClient(c1);
        Client expResult = c1;
        Client result = instance.getClient(i);
        assertEquals(expResult, result);

    }

    @Test
    public void testRemove() {
        System.out.println("remove");
        int i = 0;
        Queue instance = new Queue(2,null);
        Client c = new Client(2,2);
        instance.addClient(c);
        Client c1 = new Client(3,3);
        instance.addClient(c1);
        instance.remove(i);
        int expResult = 1;
        int result = instance.getSize();
        assertEquals(expResult, result);
    }
    
}
