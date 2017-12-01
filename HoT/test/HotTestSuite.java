/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import hot.device.DeviceFactoryTest;
import hot.device.DeviceRepositoryTest;
import hot.device.DeviceTest;
import hot.logger.LoggerTest;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author joao
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
    DeviceTest.class,
    DeviceFactoryTest.class,
    DeviceRepositoryTest.class,
    LoggerTest.class        
})
public class HotTestSuite {

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
