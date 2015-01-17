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
public class ClientTest {
    
    public ClientTest() {
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
    public void testGetServeTime() {
        System.out.println("getServeTime");
        Client instance = new Client(2,2);
        int expResult = 2;
        int result = instance.getServeTime();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetServeTimeInitial() {
        System.out.println("getServeTimeInitial");
        Client instance = new Client(2,2);
        int expResult = 2;
        int result = instance.getServeTimeInitial();
        assertEquals(expResult, result);
    }

    @Test
    public void testDecrement() {
        System.out.println("decrement");
        Client instance = new Client(4,4);
        int expResult = 3;
        instance.decrement();
        int result = instance.getServeTime();
        assertEquals(expResult, result);
    }

    @Test
    public void testRemove() {
        System.out.println("remove");
        Client instance = new Client(6,6);
        instance.remove();
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetArrivalTime() {
        System.out.println("setArrivalTime");
        int arrivalTime = 16;
        Client instance = new Client(3,3);
        instance.setArrivalTime(arrivalTime);
        int expResult = 16;
        int result = instance.arrivalTime;
        assertEquals(expResult, result);
    }
    
}
