/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hot.domain.entities.room;

import hot.domain.entities.device.Device;
import java.util.ArrayList;
import java.util.List;
import hot.domain.entities.device.commands.ICommand;

/**
 *
 * @author joao
 */
public class Room {

    private String name;

    private final List<Device> devices = new ArrayList<>();

    public void massiveOperation(ICommand command) {
        command.execute();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public boolean addDevice(Device device) {
        return devices.add(device);
    }

    public List<Device> getDevices() {
        return devices;
    }

    @Override
    public String toString() {
        return name;
    }
}
