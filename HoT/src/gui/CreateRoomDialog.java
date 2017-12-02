/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import hot.domain.entities.house.adapters.SwingHouseAdapter;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author joao
 */
public class CreateRoomDialog extends javax.swing.JDialog {

    private final SwingHouseAdapter swingHouseAdapter;

    private final Home parent;

    /**
     * Creates new form CreateDeviceDialog
     *
     * @param parent
     * @param modal
     */
    public CreateRoomDialog(Home parent, boolean modal) {

        super(parent, modal);

        swingHouseAdapter = parent.getSwingHouseAdapter();

        this.parent = parent;

        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        createDevicePanel = new javax.swing.JPanel();
        deviceNameLabel = new javax.swing.JLabel();
        roomNameTextField = new javax.swing.JTextField();
        cancelButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        createDevicePanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Create Room"));

        deviceNameLabel.setText("Room name:");

        javax.swing.GroupLayout createDevicePanelLayout = new javax.swing.GroupLayout(createDevicePanel);
        createDevicePanel.setLayout(createDevicePanelLayout);
        createDevicePanelLayout.setHorizontalGroup(
            createDevicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createDevicePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(createDevicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(roomNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                    .addGroup(createDevicePanelLayout.createSequentialGroup()
                        .addComponent(deviceNameLabel)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        createDevicePanelLayout.setVerticalGroup(
            createDevicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createDevicePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(deviceNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(roomNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(168, Short.MAX_VALUE))
        );

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 198, Short.MAX_VALUE)
                        .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(createDevicePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(createDevicePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton)
                    .addComponent(cancelButton))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        
       swingHouseAdapter.addRoom(roomNameTextField.getText());
        
        parent.getRoomsComboBox().setModel(
                new DefaultComboBoxModel<>(
                        swingHouseAdapter.getRooms()
                )
        );

        dispose();
    }//GEN-LAST:event_saveButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JPanel createDevicePanel;
    private javax.swing.JLabel deviceNameLabel;
    private javax.swing.JTextField roomNameTextField;
    private javax.swing.JButton saveButton;
    // End of variables declaration//GEN-END:variables
}
