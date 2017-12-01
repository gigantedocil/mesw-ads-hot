/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hot.domain.entities.house;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author joao
 */
public class House {

    private final List<Room> rooms = new ArrayList<>();

    public House() {
    }

    public List<Room> getRooms() {
        return rooms;
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
}
