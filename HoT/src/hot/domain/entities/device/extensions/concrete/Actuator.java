/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hot.domain.entities.device.extensions.concrete;

import hot.domain.entities.device.Device;
import hot.domain.entities.device.extensions.IActuator;
import hot.domain.entities.device.extensions.IObservableDevice;
import java.io.Serializable;

/**
 *
 * @author João, Rafael, Adélia, Leonardo, Raquel, Guilherme, Bruno, Pedro
 */
public class Actuator implements IActuator, IObservableDevice, Serializable {

    private boolean isOn;

    private Device observable;

    @Override
    public void registerObservable(Device device) {
        observable = device;
    }

    @Override
    public boolean turnOn() {
        
        isOn = true;
        
        notifyDevice();
        
        return isOn();
    }

    @Override
    public boolean turnOff() {
        
        isOn = false;
        
        notifyDevice();
        
        return !isOn();
    }

    @Override
    public boolean isOn() {
        return isOn;
    }

    @Override
    public void notifyDevice() {
        observable.setStatusChanged();
        observable.notifyObservers(isOn);
    }
}
