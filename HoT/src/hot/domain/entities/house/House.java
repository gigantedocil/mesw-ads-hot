/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hot.domain.entities.house;

import hot.domain.entities.room.Room;
import hot.domain.entities.device.commands.DeviceOnCommand;
import hot.domain.entities.device.commands.DeviceOffCommand;
import hot.domain.entities.device.repositories.DeviceRepository;
import hot.domain.entities.device.repositories.DeviceTypeRepository;
import hot.domain.entities.room.repositories.RoomRepository;
import hot.domain.entities.device.commands.ICommand;
import hot.domain.entities.device.extensions.IActuator;

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

    public void massiveShutdown() {
        roomRepository.retrieveAll().forEach((room) -> {
            shutDownRoom(room);
        });
    }

    public void massiveInitialization() {
        roomRepository.retrieveAll().forEach((room) -> {
            initializeRoom(room);
        });
    }

    public void shutDownRoom(Room room) {
        room.getDevices().forEach((device) -> {
            if (device instanceof IActuator) {
                ICommand command = new DeviceOffCommand(
                        ((IActuator) device)
                );
                room.massiveOperation(command);
            }
        });
    }

    public void initializeRoom(Room room) {
        room.getDevices().forEach((device) -> {
            if (device instanceof IActuator) {
                ICommand command = new DeviceOnCommand(
                        ((IActuator) device)
                );
                room.massiveOperation(command);
            }
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
