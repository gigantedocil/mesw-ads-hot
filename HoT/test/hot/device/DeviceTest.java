/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hot.device;

import hot.domain.entities.device.concrete.LightBulb;
import hot.domain.entities.device.concrete.Oven;
import hot.domain.entities.device.factories.DeviceFactory;
import hot.logger.concrete.CsvFileLogger;
import hot.logger.concrete.LogFileLogger;
import hot.logger.concrete.TxtFileLogger;
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

        LightBulb lightBulb = (LightBulb) DeviceFactory.create("LightBulb");

        lightBulb.setName("Lampadazinha da Sala");

        lightBulb.addObserver(LogFileLogger.getInstance());

        lightBulb.addObserver(CsvFileLogger.getInstance());

        lightBulb.addObserver(TxtFileLogger.getInstance());

        lightBulb.turnOn();
    }

    @Test
    public void deviceTimerTest() {

        Oven oven = (Oven) DeviceFactory.create("Oven");
        
        oven.addObserver(LogFileLogger.getInstance());

        oven.addObserver(CsvFileLogger.getInstance());

        oven.addObserver(TxtFileLogger.getInstance());
               
        oven.setTemperature(50);
        
        oven.startTimer(10);
        
        int a = 0;
    }
}
