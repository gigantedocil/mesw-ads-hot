/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hot.device;

import hot.domain.entities.device.Device;
import hot.factories.DeviceFactory;
import hot.repositories.concrete.DeviceRepository;
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
public class DeviceRepositoryTest {

    public DeviceRepositoryTest() {
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
     * Test of exists method, of class AbstractBaseRepository.
     */
    @Test
    public void testExists() {
        Device heater = DeviceFactory.create("Heater");

        DeviceRepository deviceRepository = new DeviceRepository();

        deviceRepository.add(heater);

        assertTrue(deviceRepository.exists(heater));
    }

    /**
     * Test of exists method, of class AbstractBaseRepository.
     */
    @Test
    public void testExistsWithDifferentObjects() {

        Device heater = DeviceFactory.create("Heater");

        Device ac = DeviceFactory.create("AirConditioner");

        DeviceRepository deviceRepository = new DeviceRepository();

        deviceRepository.add(heater);

        assertFalse(deviceRepository.exists(ac));
    }

    /**
     * Test of add method, of class AbstractBaseRepository.
     */
    @Test
    public void testAdd() {

        Device heater = DeviceFactory.create("Heater");

        DeviceRepository deviceRepository = new DeviceRepository();

        deviceRepository.add(heater);

        assertEquals(heater, deviceRepository.retrieveAll().get(0));
    }

    /**
     * Test of remove method, of class AbstractBaseRepository.
     */
    @Test
    public void testRemove() {

        Device heater = DeviceFactory.create("Heater");

        DeviceRepository deviceRepository = new DeviceRepository();

        deviceRepository.add(heater);

        deviceRepository.remove(heater);

        assertTrue(!deviceRepository.exists(heater));
    }    
}
