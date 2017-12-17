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
import java.io.Serializable;

/**
 *
 * @author João, Rafael, Adélia, Leonardo, Raquel, Guilherme, Bruno, Pedro
 */
public class Room implements Serializable {

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
    
    public boolean removeDevice(Device device) {
        return devices.remove(device);
    }

    public List<Device> getDevices() {
        return devices;
    }

    @Override
    public String toString() {
        return name;
    }
}
