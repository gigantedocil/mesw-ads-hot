/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hot.domain.entities.house;

import hot.domain.entities.device.Device;
import hot.domain.entities.device.commands.DeviceOnCommand;
import hot.domain.entities.device.commands.DeviceOffCommand;
import hot.domain.entities.device.commands.Command;
import hot.repositories.concrete.DeviceRepository;
import hot.repositories.concrete.DeviceTypeRepository;
import hot.repositories.concrete.RoomRepository;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author joao
 */
public class House {
    
    private final RoomRepository roomRepository = new RoomRepository();

    private final DeviceRepository deviceRepository = new DeviceRepository();
    
    private final DeviceTypeRepository deviceTypeRepository = new DeviceTypeRepository();    

    public House() {
    }   

    public void massiveShutdown(ArrayList<Room> rooms) {
        rooms.forEach((room) -> {
            shutDownRoom(room);
        });
    }

    public void massiveInitialization(ArrayList<Room> rooms) {
        rooms.forEach((room) -> {
            initializeRoom(room);
        });
    }

    public void shutDownRoom(Room room) {
        room.getDevices().forEach((device) -> {
            Command command = new DeviceOffCommand(device);
            room.massiveOperation(command);
        });
    }

    public void initializeRoom(Room room) {
        room.getDevices().forEach((device) -> {
            Command command = new DeviceOnCommand(device);
            room.massiveOperation(command);
        });
    }

    public RoomRepository getRoomRepository() {
        return roomRepository;
    }

    public DeviceRepository getDeviceRepository() {
        return deviceRepository;
    }

    public DeviceTypeRepository getDeviceTypeRepository() {
        return deviceTypeRepository;
    }        
}
