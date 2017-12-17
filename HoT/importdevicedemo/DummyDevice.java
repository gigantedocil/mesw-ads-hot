/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hot.domain.entities.device.concrete;

import hot.domain.entities.device.Device;
import hot.domain.entities.device.extensions.IActuator;
import hot.domain.entities.device.extensions.concrete.Actuator;
import java.io.Serializable;

/**
 *
 * @author joao
 */
public class DummyDevice extends Device implements IActuator, Serializable { // TODO: Add EnergyConsumptionSensor

    private final Actuator actuator;

    public DummyDevice() {
        actuator = new Actuator();
        actuator.registerObservable(this);
    }

    @Override
    public String toString() {
        return "DummyDevice " + getName();
    }

    @Override
    public boolean turnOn() {
        return actuator.turnOn();
    }

    @Override
    public boolean turnOff() {
        return actuator.turnOff();
    }

    @Override
    public boolean isOn() {
        return actuator.isOn();
    }
}