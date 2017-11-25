/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hot.factories;

import hot.domain.entities.Device;
import hot.domain.entities.NullDevice;

/**
 *
 * @author joao
 */
public class DeviceFactory {

    public static Device create(String deviceType) {

        Device device = new NullDevice();

        try {
            return (Device) Class.forName("hot.domain.entities" + deviceType).newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            // TODO: Add to logger.
        }

        return device;
    }
}