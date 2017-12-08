/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hot.domain.entities.device.extensions.concrete;

import hot.domain.entities.device.extensions.IActuator;
import hot.domain.entities.device.extensions.ITimer;
import java.util.TimerTask;
import java.util.Timer;

/**
 *
 * @author joao
 */
public class DeviceTimer implements ITimer {

    private final IActuator device;

    public DeviceTimer(IActuator device) {
        this.device = device;
    }

    @Override
    public void startTimer(int delay) {
        device.turnOn();
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                device.turnOff();
                System.out.println("Success y'all");
            }
        }, delay * 1000);
    }
}