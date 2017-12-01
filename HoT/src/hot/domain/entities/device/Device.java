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
public abstract class Device extends Observable {

    private String name = "Device";

    private boolean isOn;

    public final void init() {
//       addObserver(LogFileLogger.getInstance());
//       addObserver(CsvFileLogger.getInstance());
//       addObserver(TxtFileLogger.getInstance());        
    }

    public boolean isOn() {
        return isOn;
    }

    public void setIsOn(boolean isOn) {
        this.isOn = isOn;
        
        notifyDevice();
    }

    private void notifyDevice() {

        setChanged();

        notifyObservers(isOn);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }        
}
