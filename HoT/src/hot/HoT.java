/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hot;

import gui.Home;
import hot.domain.entities.devicedecorators.ActuatorDecorator;
import hot.domain.entities.Device;
import hot.domain.entities.LightBulb;
import hot.domain.entities.devicedecorators.SensorDecorator;
import java.util.ArrayList;

/**
 *
 * @author joao
 */
public class HoT {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        new HoT();
    }

    public HoT() {
        if (setLookAndFeel()) {
            initialize();
        }
    }

    private void initialize() {
        java.awt.EventQueue.invokeLater(() -> {
            new Home().setVisible(true);
        });
    }

    private boolean setLookAndFeel() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }        

    private void massiveShutdown(ArrayList<Device> todos) {
//        todos.stream().map(x -> x.off()).collect(Collectors.toList());
//
//        todos.forEach((todo) -> {
//            todo.off();
//        });
    }
}
