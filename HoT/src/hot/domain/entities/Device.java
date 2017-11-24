/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hot.domain.entities;

/**
 *
 * @author joao
 */
public abstract class Device {
    
    private String name;              
    
    private boolean isOn;
    
    public final void init() {
                
       
        
    }
        
    public boolean isOn() {
        return isOn;
    }

    public void setIsOn(boolean isOn) {
        this.isOn = isOn;
    }               
}
