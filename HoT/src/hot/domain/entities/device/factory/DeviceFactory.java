/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hot.domain.entities.device.factory;

import hot.domain.entities.device.Device;
import hot.domain.entities.device.NullDevice;

/**
 *
 * @author João, Rafael, Adélia, Leonardo, Raquel, Guilherme, Bruno, Pedro
 */
public class DeviceFactory {

    public static final String DEVICES_PACKAGE_NAME = ".concrete";

    public static Device create(String deviceName) {

        Device device = new NullDevice();

        try {
            return (Device) Class.forName(
                    Device.class.getPackage().getName()
                    + DEVICES_PACKAGE_NAME
                    + "."
                    + deviceName
            ).newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            // TODO: Add to logger.
        }
        return device;
    }
}
