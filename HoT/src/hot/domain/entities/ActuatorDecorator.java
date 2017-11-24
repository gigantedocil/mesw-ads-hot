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
public class ActuatorDecorator extends DeviceDecorator {
    
    private Device device;
    
    public ActuatorDecorator(Device device) {
        this.device = device;
    }

    
    public boolean on() {
        super.setIsOn(true);        
        return super.isOn();
    }

   
    public boolean off() {
        super.setIsOn(false);
        return super.isOn();
    }
    
    
}
