/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hot.device;

import hot.domain.entities.device.Device;
import hot.factories.DeviceFactory;
import hot.logger.CsvFileLogger;
import hot.logger.LogFileLogger;
import hot.logger.TxtFileLogger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author joao
 */
public class DeviceTest {

    public DeviceTest() {
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
    public void addDeviceObserverTest() {

        Device heater = DeviceFactory.create("Heater");

        heater.setName("Aquecedor Quentinho da Sala");

        heater.addObserver(LogFileLogger.getInstance());

        heater.addObserver(CsvFileLogger.getInstance());

        heater.addObserver(TxtFileLogger.getInstance());

        heater.setIsOn(true);

        heater.setIsOn(false);
    }
}
