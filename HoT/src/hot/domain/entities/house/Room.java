/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hot.domain.entities.house;

import hot.domain.entities.device.Device;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author joao
 */
public class Room {

    private String name;
    
    private final List<Device> devices = new ArrayList<>();

    public void massiveOperation(Command command) {        
        command.execute();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Device> getDevices() {
        return devices;
    }        
}
