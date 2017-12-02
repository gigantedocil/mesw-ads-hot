/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hot.domain.entities.device.commands;

import hot.domain.entities.device.Device;

/**
 *
 * @author joao
 */
public class DeviceOnCommand implements ICommand {

    Device device;

    public DeviceOnCommand(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.setIsOn(true);
    }
}
