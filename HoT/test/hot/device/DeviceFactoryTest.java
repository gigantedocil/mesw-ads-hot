/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hot.device;

import hot.domain.entities.device.Device;
import hot.domain.entities.device.concrete.Heater;
import hot.domain.entities.device.factories.DeviceFactory;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author joao
 */
public class DeviceFactoryTest {
    
    public DeviceFactoryTest() {
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
    public void instantitateDeviceWithFactoryTest() {
        Heater heater = (Heater) DeviceFactory.create("Heater");
        assertTrue(heater instanceof Heater);
    }
}
