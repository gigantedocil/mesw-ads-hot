/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hot.domain.entities.device.concrete;

import hot.domain.entities.device.Device;
import hot.domain.entities.device.extensions.IActuator;
import hot.domain.entities.device.extensions.ITemperatureSensor;
import hot.domain.entities.device.extensions.concrete.Actuator;
import java.io.Serializable;

/**
 *
 * @author João, Rafael, Adélia, Leonardo, Raquel, Guilherme, Bruno, Pedro
 */
public class Heater extends Device implements IActuator, ITemperatureSensor, Serializable {

    private final Actuator actuator;

    private double temperature;

    public Heater() {
        actuator = new Actuator();
        actuator.registerObservable(this);
    }

    @Override
    public String toString() {
        return "Heater " + getName();
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

    @Override
    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
}
