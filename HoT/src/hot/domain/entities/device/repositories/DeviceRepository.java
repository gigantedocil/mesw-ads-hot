/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hot.domain.entities.device.repositories;

import hot.domain.entities.device.Device;
import hot.repositories.AbstractBaseRepository;

/**
 *
 * @author joao
 */
public class DeviceRepository extends AbstractBaseRepository<Device> {

    @Override
    public Device find(String objectName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
