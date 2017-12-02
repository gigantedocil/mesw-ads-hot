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
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Me
 */
public class SwingHouseAdapter {

    private final House house;

    public SwingHouseAdapter(House house) {
        this.house = house;
    }

    public House getHouse() {
        return house;
    }

    public boolean addRoom(String roomName) {
        return house.getRoomRepository().add(new Room() {
            {
                setName(roomName);
            }
        });
    }

    public boolean addDevice(String roomName, String deviceType, String deviceName) {

        Device device = DeviceFactory.create(deviceType);

        device.setName(deviceName);

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

    public String[] getDevices() {

        List<String> aux = house.getDeviceRepository().retrieveAll().stream().map(d -> d.toString()).collect(Collectors.toList());

        return aux.toArray(new String[aux.size()]);
    }

    public String[] getDeviceTypes() {

        List<String> aux = house.getDeviceTypeRepository().retrieveAll();

        return aux.toArray(new String[aux.size()]);
    }
}
