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
public class Queue_MgrTest {
    
    public Queue_MgrTest() {
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
    public void testAddQueue() {
        System.out.println("addQueue");
        Queue_Mgr instance = null;
        instance.addQueue();
        int expResult = instance.getNrQueues();
        int result = 1;
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testAddClient() {
        System.out.println("addClient");
        Client c = null;
        Queue_Mgr instance = null;
        instance.addClient(c);
        fail("The test case is a prototype.");
    }

    @Test
    public void testRedistribuire() {
        System.out.println("redistribuire");
        Queue_Mgr instance = null;
        instance.redistribuire();
        fail("The test case is a prototype.");
    }

    @Test
    public void testTick() {
        System.out.println("tick");
        boolean simStop = false;
        Queue_Mgr instance = null;
        instance.tick(simStop);
        fail("The test case is a prototype.");
    }

    @Test
    public void testView() {
        System.out.println("view");
        Queue_Mgr instance = null;
        String expResult = "";
        String result = instance.view();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetNrQueues() {
        System.out.println("getNrQueues");
        Queue_Mgr instance = new Queue_Mgr(3,null);
        int expResult = 3;
        int result = instance.getNrQueues();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testGetQ() {
        System.out.println("getQ");
        int i = 0;
        Queue_Mgr instance = null;
        Queue expResult = null;
        Queue result = instance.getQ(i);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testStopThreads() {
        System.out.println("stopThreads");
        Queue_Mgr instance = null;
        instance.stopThreads();
        fail("The test case is a prototype.");
    }
    
}
