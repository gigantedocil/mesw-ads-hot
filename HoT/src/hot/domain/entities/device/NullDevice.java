/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hot.domain.entities.device;

/**
 *
 * @author João, Rafael, Adélia, Leonardo, Raquel, Guilherme, Bruno, Pedro
 */
public class NullDevice extends Device {
    
    private static Device instance;

    private NullDevice() {
    }

    public static Device getInstance() {
        if (instance == null) {
            instance = new NullDevice();
        }
        return instance;
    }
}
