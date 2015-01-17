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
public class StatsTest {
    
    public StatsTest() {
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
    public void testPeak() {
        System.out.println("peak");
        int i = 0;
        Stats instance = new Stats();
        instance.peak(i);
        
    }

    @Test
    public void testTick() {
        System.out.println("tick");
        Stats instance = new Stats();
        instance.tick();
        
    }

    @Test
    public void testClientAdded() {
        System.out.println("clientAdded");
        int serveTime = 0;
        int casa = 0;
        Stats instance = new Stats();
        instance.clientAdded(serveTime, casa);
        
    }

    @Test
    public void testClientRemoved() {
        System.out.println("clientRemoved");
        int coada = 0;
        Stats instance = new Stats();
        instance.clientRemoved(coada);
    }

    @Test
    public void testQueueAdded() {
        System.out.println("queueAdded");
        Stats instance = new Stats();
        instance.queueAdded();
    }

    @Test
    public void testPaused() {
        System.out.println("paused");
        Stats instance = new Stats();
        instance.paused();
    }

    @Test
    public void testReStart() {
        System.out.println("reStart");
        Stats instance = new Stats();
        instance.reStart();
    }

    @Test
    public void testThreadStarted() {
        System.out.println("threadStarted");
        int i = 0;
        Stats instance = new Stats();
        instance.threadStarted(i);
    }

    @Test
    public void testThreadStopped() {
        System.out.println("threadStopped");
        int i = 0;
        Stats instance = new Stats();
        instance.threadStopped(i);
    }

    @Test
    public void testQueueEmpty() {
        System.out.println("queueEmpty");
        Stats instance = new Stats();
        instance.queueEmpty();
    }

    @Test
    public void testServiceTime() {
        System.out.println("serviceTime");
        int time = 0;
        Stats instance = new Stats();
        instance.serviceTime(time);
    }

    @Test
    public void testGenerate() {
        System.out.println("generate");
        Stats instance = new Stats();
        instance.generate();
    }

    @Test
    public void testGetAvgE() {
        System.out.println("getAvgE");
        Stats instance = new Stats();
        double expResult = 0.0;
        double result = instance.getAvgE();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testGetAvgW() {
        System.out.println("getAvgW");
        Stats instance = new Stats();
        double expResult = 0.0;
        double result = instance.getAvgW();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testGetAvgS() {
        System.out.println("getAvgS");
        Stats instance = new Stats();
        double expResult = 0.0;
        double result = instance.getAvgS();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testGetPh() {
        System.out.println("getPh");
        Stats instance = new Stats();
        double expResult = 0.0;
        double result = instance.getPh();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testService() {
        System.out.println("service");
        Stats instance = new Stats();
        instance.service();
    }

    @Test
    public void testWriteToFile() {
        System.out.println("writeToFile");
        String text = "";
        Stats instance = new Stats();
        instance.writeToFile(text);
        
    }

    @Test
    public void testCloseFile() {
        System.out.println("closeFile");
        Stats instance = new Stats();
        instance.closeFile();
        
    }

    @Test
    public void testWaitingTime() {
        System.out.println("waitingTime");
        int i = 0;
        Stats instance = new Stats();
        instance.waitingTime(i);
        
    }

    @Test
    public void testGetSimulationTime() {
        System.out.println("getSimulationTime");
        Stats instance = new Stats();
        int expResult = 0;
        int result = instance.getSimulationTime();
        assertEquals(expResult, result);
        
    }
    
}
