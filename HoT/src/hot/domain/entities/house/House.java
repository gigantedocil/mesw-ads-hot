/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hot.domain.entities.house;

import hot.domain.entities.room.Room;
import hot.domain.entities.device.commands.DeviceOnCommand;
import hot.domain.entities.device.commands.DeviceOffCommand;
import hot.domain.entities.device.repositories.DeviceTypeRepository;
import hot.domain.entities.room.repositories.RoomRepository;
import hot.domain.entities.device.commands.ICommand;
import hot.domain.entities.device.extensions.IActuator;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author joao
 */
public class House {

    private final RoomRepository roomRepository = new RoomRepository();

    private final DeviceTypeRepository deviceTypeRepository = new DeviceTypeRepository();

    private final String SESSION_FILE_NAME = "hot-session.bin";

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

    public DeviceTypeRepository getDeviceTypeRepository() {
        return deviceTypeRepository;
    }

    public void loadSession() {
        ObjectInputStream binaryFileReader;
        try {
            File binaryFile = new File(SESSION_FILE_NAME);
            if (!binaryFile.exists()) {
                binaryFile.createNewFile();
                saveSession();
            }
            binaryFileReader = new ObjectInputStream(new FileInputStream(binaryFile));
            List<Room> hotRooms = (List<Room>) binaryFileReader.readObject();
            hotRooms.forEach((room) -> {
                roomRepository.add(room);
            });
            binaryFileReader.close();
        } catch (FileNotFoundException ex) {
        } catch (IOException | ClassNotFoundException ex) {
        }
    }

    public void saveSession() {
        ObjectOutputStream binaryFileWriter;
        try {
            binaryFileWriter = new ObjectOutputStream(new FileOutputStream(SESSION_FILE_NAME));
            try {
                binaryFileWriter.writeObject(roomRepository.retrieveAll());
            } catch (IOException ex) {
                Logger.getLogger(House.class.getName()).log(Level.SEVERE, null, ex);
            }
            binaryFileWriter.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(House.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(House.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
