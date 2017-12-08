/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hot.domain.entities.device.commands;

import hot.domain.entities.device.extensions.IActuator;

/**
 *
 * @author joao
 */
public class DeviceOnCommand implements ICommand {

    private final IActuator device;

    public DeviceOnCommand(IActuator device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.turnOn();
    }
}
