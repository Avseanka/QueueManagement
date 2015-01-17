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
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Doru
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({My_Package.TimeTest.class, My_Package.StatsTest.class, My_Package.Queue_MgrTest.class, My_Package.QueueTest.class, My_Package.ClientTest.class, My_Package.GUITest.class, My_Package.Client_GeneratorTest.class})
public class My_PackageSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
