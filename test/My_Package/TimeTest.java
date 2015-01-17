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
public class TimeTest {
    
    public TimeTest() {
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
    public void testTick() {
        System.out.println("tick");
        Time instance = null;
        instance.tick();
        fail("The test case is a prototype.");
    }

    @Test
    public void testStart() {
        System.out.println("start");
        Time instance = null;
        instance.start();
        fail("The test case is a prototype.");
    }

    @Test
    public void testStop() {
        System.out.println("stop");
        Time instance = null;
        instance.stop();
        fail("The test case is a prototype.");
    }

    @Test
    public void testGolire() {
        System.out.println("golire");
        Time instance = null;
        instance.golire();
        fail("The test case is a prototype.");
    }

    @Test
    public void testTimerStopped() {
        System.out.println("timerStopped");
        Time instance = new Time(null,null,10,null);
        boolean expResult = false;
        boolean result = instance.timerStopped();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
