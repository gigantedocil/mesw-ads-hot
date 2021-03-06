/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.device;

import hot.domain.entities.house.adapters.SwingHouseAdapter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author João, Rafael, Adélia, Leonardo, Raquel, Guilherme, Bruno, Pedro
 */
public class AddDeviceFileChooserDialog extends javax.swing.JDialog {

    /**
     * Creates new form AddDeviceFileChooserDialog
     */
    public AddDeviceFileChooserDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Java Files", "java");
        deviceFileChooser.setFileFilter(filter);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        deviceFileChooser = new javax.swing.JFileChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        deviceFileChooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deviceFileChooserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(deviceFileChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(deviceFileChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void deviceFileChooserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deviceFileChooserActionPerformed
        if (evt.getActionCommand().equals("CancelSelection")) {
            dispose();
        } else {
            copyFile();
            dispose();
            JOptionPane.showMessageDialog(this, "New device succesfully added!");
        }
    }//GEN-LAST:event_deviceFileChooserActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser deviceFileChooser;
    // End of variables declaration//GEN-END:variables

    private void copyFile() {

        File selectedFile = deviceFileChooser.getSelectedFile();

        String filePath = selectedFile.getAbsolutePath();

        InputStream inStream = null;

        OutputStream outStream = null;

        String destinationPath = System.getProperty("user.dir");

        if (System.getProperty("os.name").split(" ")[0].equals("Windows")) {
            destinationPath += "\\src\\hot\\domain\\entities\\device\\concrete";
        } else {
            destinationPath += "/src/hot/domain/entities/device/concrete";
        }

        try {

            File source = new File(filePath);

            File dest = new File(
                    destinationPath,
                    selectedFile.getName()
            );

            inStream = new FileInputStream(source);

            outStream = new FileOutputStream(dest);

            byte[] buffer = new byte[1024];

            int length;

            while ((length = inStream.read(buffer)) > 0) {
                outStream.write(buffer, 0, length);
            }

            if (inStream != null) {
                inStream.close();
            }

            if (outStream != null) {
                outStream.close();
            }
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }

}
