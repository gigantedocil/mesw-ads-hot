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
public class SensorDecorator extends Device {
    
    private Device device;
    
    public SensorDecorator(Device device) {
        this.device = device;
    }
    
    public int getTemperature() {
        return 0;
    }

    
    
}
