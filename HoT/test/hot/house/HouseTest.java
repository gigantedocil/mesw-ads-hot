/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hot.house;

import hot.domain.entities.device.Device;
import hot.domain.entities.device.concrete.AirConditioner;
import hot.domain.entities.device.concrete.Heater;
import hot.domain.entities.device.concrete.LightBulb;
import hot.domain.entities.device.concrete.Oven;
import hot.domain.entities.device.concrete.Refrigerator;
import hot.domain.entities.device.extensions.IActuator;
import hot.domain.entities.device.factories.DeviceFactory;
import hot.domain.entities.house.House;
import hot.domain.entities.room.Room;
import java.util.ArrayList;
import java.util.List;
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
public class HouseTest {

    public HouseTest() {
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
     * Test of initializeRoom method, of class House.
     */
    @Test
    public void initializeRoomTest() {
        Room room = new Room();

        LightBulb light = (LightBulb) DeviceFactory.create("LightBulb");
        AirConditioner airConditioner = (AirConditioner) DeviceFactory.create("AirConditioner");
        Heater heater = (Heater) DeviceFactory.create("Heater");
        Oven oven = (Oven) DeviceFactory.create("Oven");
        Refrigerator refrigerator = (Refrigerator) DeviceFactory.create("Refrigerator");

        room.addDevice(light);
        room.addDevice(airConditioner);
        room.addDevice(heater);
        room.addDevice(oven);
        room.addDevice(refrigerator);

        House house = new House();
        house.initializeRoom(room);

        boolean turnedOn = true;

        for (Device device : room.getDevices()) {
            if (device instanceof IActuator) {
                turnedOn = turnedOn && ((IActuator) device).isOn();
            }
        }

        assertTrue(turnedOn);
    }

    /**
     * Test of shutDownRoom method, of class House.
     */
    @Test
    public void shutDownRoomTest() {
        Room room = new Room();

        LightBulb light = (LightBulb) DeviceFactory.create("LightBulb");
        AirConditioner airConditioner = (AirConditioner) DeviceFactory.create("AirConditioner");
        Heater heater = (Heater) DeviceFactory.create("Heater");
        Oven oven = (Oven) DeviceFactory.create("Oven");
        Refrigerator refrigerator = (Refrigerator) DeviceFactory.create("Refrigerator");

        room.addDevice(light);
        room.addDevice(airConditioner);
        room.addDevice(heater);
        room.addDevice(oven);
        room.addDevice(refrigerator);

        House house = new House();

        house.initializeRoom(room);

        house.shutDownRoom(room);

        boolean turnedOff = true;

        for (Device device : room.getDevices()) {
            if (device instanceof IActuator) {
                turnedOff = turnedOff && ((IActuator) device).isOn();
            }
        }

        assertFalse(turnedOff);
    }

    /**
     * Test of massiveInitialization method, of class House.
     */
    @Test
    public void massiveInitializationTest() {
        Room room1 = new Room();
        LightBulb light = (LightBulb) DeviceFactory.create("LightBulb");
        AirConditioner airConditioner = (AirConditioner) DeviceFactory.create("AirConditioner");
        Heater heater = (Heater) DeviceFactory.create("Heater");
        Oven oven = (Oven) DeviceFactory.create("Oven");
        Refrigerator refrigerator = (Refrigerator) DeviceFactory.create("Refrigerator");
        room1.addDevice(light);
        room1.addDevice(airConditioner);
        room1.addDevice(heater);
        room1.addDevice(oven);
        room1.addDevice(refrigerator);

        Room room2 = new Room();
        LightBulb light2 = (LightBulb) DeviceFactory.create("LightBulb");
        AirConditioner airConditioner2 = (AirConditioner) DeviceFactory.create("AirConditioner");
        Heater heater2 = (Heater) DeviceFactory.create("Heater");
        Oven oven2 = (Oven) DeviceFactory.create("Oven");
        Refrigerator refrigerator2 = (Refrigerator) DeviceFactory.create("Refrigerator");
        room2.addDevice(light2);
        room2.addDevice(airConditioner2);
        room2.addDevice(heater2);
        room2.addDevice(oven2);
        room2.addDevice(refrigerator2);

        House house = new House();

        house.getRoomRepository().add(room1);

        house.getRoomRepository().add(room2);

        house.massiveInitialization();

        boolean turnedOn = true;

        for (Room room : house.getRoomRepository().retrieveAll()) {
            for (Device device : room.getDevices()) {
                if (device instanceof IActuator) {
                    turnedOn = turnedOn && ((IActuator) device).isOn();
                }
            }
        }

        assertTrue(turnedOn);
    }

    /**
     * Test of massiveShutdown method, of class House.
     */
    @Test
    public void massiveShutdownTest() {
        Room room1 = new Room();
        LightBulb light = (LightBulb) DeviceFactory.create("LightBulb");
        AirConditioner airConditioner = (AirConditioner) DeviceFactory.create("AirConditioner");
        Heater heater = (Heater) DeviceFactory.create("Heater");
        Oven oven = (Oven) DeviceFactory.create("Oven");
        Refrigerator refrigerator = (Refrigerator) DeviceFactory.create("Refrigerator");
        room1.addDevice(light);
        room1.addDevice(airConditioner);
        room1.addDevice(heater);
        room1.addDevice(oven);
        room1.addDevice(refrigerator);

        Room room2 = new Room();
        LightBulb light2 = (LightBulb) DeviceFactory.create("LightBulb");
        AirConditioner airConditioner2 = (AirConditioner) DeviceFactory.create("AirConditioner");
        Heater heater2 = (Heater) DeviceFactory.create("Heater");
        Oven oven2 = (Oven) DeviceFactory.create("Oven");
        Refrigerator refrigerator2 = (Refrigerator) DeviceFactory.create("Refrigerator");
        room2.addDevice(light2);
        room2.addDevice(airConditioner2);
        room2.addDevice(heater2);
        room2.addDevice(oven2);
        room2.addDevice(refrigerator2);

        House house = new House();

        house.getRoomRepository().add(room1);

        house.getRoomRepository().add(room2);

        house.massiveInitialization();
        house.massiveShutdown();

        boolean turnedOff = true;

        for (Room room : house.getRoomRepository().retrieveAll()) {
            for (Device device : room.getDevices()) {
                if (device instanceof IActuator) {
                    turnedOff = turnedOff && ((IActuator) device).isOn();
                }
            }
        }

        assertFalse(turnedOff);
    }
}
