/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hot.domain.entities.device;

import java.util.Observable;

/**
 *
 * @author João, Rafael, Adélia, Leonardo, Raquel, Guilherme, Bruno, Pedro
 */
public abstract class Device extends Observable implements IDevice {

    private String name = "Device";

    @Override
    public final void init() {
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }    
    
    @Override
    public void setStatusChanged(){
        super.setChanged();
    }        
}
