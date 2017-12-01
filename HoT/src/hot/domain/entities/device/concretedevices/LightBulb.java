/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hot.domain.entities.device.concretedevices;

import hot.domain.entities.device.Device;

/**
 *
 * @author joao
 */
public class LightBulb extends Device {
        
    @Override
    public String toString() {
        return "LightBulb " + getName();
    }
}
