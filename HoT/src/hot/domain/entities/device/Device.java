/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hot.domain.entities.device;

import java.util.Observable;

/**
 *
 * @author joao
 */
public abstract class Device extends Observable implements IDevice {

    private String name = "Device";

    private boolean isOn;

    @Override
    public final void init() {
    }

    @Override
    public boolean isOn() {
        return isOn;
    }

    @Override
    public void setIsOn(boolean isOn) {
        this.isOn = isOn;

        notifyDevice();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    private void notifyDevice() {

        setChanged();

        notifyObservers(isOn);
    }
}
