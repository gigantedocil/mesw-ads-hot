/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hot.domain.entities.house.adapters;

import hot.domain.entities.device.Device;
import hot.domain.entities.device.factories.DeviceFactory;
import hot.domain.entities.house.House;
import hot.domain.entities.room.Room;
import hot.logger.concrete.CsvFileLogger;
import hot.logger.concrete.LogFileLogger;
import hot.logger.concrete.TxtFileLogger;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Observer;
import java.util.stream.Collectors;

/**
 *
 * @author Me
 */
public class SwingHouseAdapter {

    private final House house;

    private final Map<String, Observer> loggers = new HashMap<String, Observer>() {
        {
            put(".LOG", LogFileLogger.getInstance());
            put(".TXT", TxtFileLogger.getInstance());
            put(".CSV", CsvFileLogger.getInstance());
        }
    };

    public SwingHouseAdapter(House house) {
        this.house = house;
    }

    public House getHouse() {
        return house;
    }

    public boolean addRoom(String roomName) {
        Room room = new Room();        
        
        room.setName(roomName);
        
        return house.getRoomRepository().add(room);
    }

    public boolean addDevice(String roomName, String deviceType, String deviceName, List<String> chosenLoggers) {

        Device device = DeviceFactory.create(deviceType);

        device.setName(deviceName);

        chosenLoggers.forEach((chosenLogger) -> {
            device.addObserver(loggers.get(chosenLogger));
        });

        return house.getRoomRepository().find(roomName).addDevice(device);
    }

    public String[] getRoomDevices(String roomName) {
        List<String> aux = house
                .getRoomRepository()
                .find(roomName)
                .getDevices()
                .stream()
                .map(r -> r.toString())
                .collect(Collectors.toList());

        return aux.toArray(new String[aux.size()]);
    }

    public String[] getRooms() {

        List<String> aux = house.getRoomRepository().retrieveAll().stream().map(r -> r.toString()).collect(Collectors.toList());

        return aux.toArray(new String[aux.size()]);
    }    

    public String[] getDeviceTypes() {

        List<String> aux = house.getDeviceTypeRepository().retrieveAll();

        return aux.toArray(new String[aux.size()]);
    }
}
