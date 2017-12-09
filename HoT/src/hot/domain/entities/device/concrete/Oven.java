/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hot.domain.entities.device.concrete;

import hot.domain.entities.device.Device;
import hot.domain.entities.device.extensions.IActuator;
import hot.domain.entities.device.extensions.ITemperatureChanger;
import hot.domain.entities.device.extensions.ITemperatureSensor;
import hot.domain.entities.device.extensions.ITimer;
import hot.domain.entities.device.extensions.concrete.Actuator;
import hot.domain.entities.device.extensions.concrete.DeviceTimer;
import java.io.Serializable;

/**
 *
 * @author joao
 */
public class Oven extends Device
        implements IActuator, ITemperatureSensor, ITimer, ITemperatureChanger, Serializable {

    private final Actuator actuator;

    private final DeviceTimer timer;

    private double temperature = 0;

    public Oven() {
        actuator = new Actuator();
        actuator.registerObservable(this);
        timer = new DeviceTimer((IActuator) this);
    }

    @Override
    public String toString() {
        return "Oven " + getName();
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

    @Override
    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public void startTimer(int minutes) {
        timer.startTimer(minutes);
    }
}
