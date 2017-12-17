/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.device;

import gui.Home;
import hot.domain.entities.house.adapters.SwingHouseAdapter;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

/**
 *
 * @author João, Rafael, Adélia, Leonardo, Raquel, Guilherme, Bruno, Pedro
 */
public class CreateDeviceDialog extends javax.swing.JDialog {

    private final SwingHouseAdapter swingHouseAdapter;

    private final Home parent;

    /**
     * Creates new form CreateDeviceDialog
     *
     * @param parent
     * @param modal
     */
    public CreateDeviceDialog(Home parent, boolean modal) {

        super(parent, modal);

        swingHouseAdapter = parent.getSwingHouseAdapter();

        this.parent = parent;

        initComponents();

        getRootPane().setDefaultButton(saveButton);

        deviceNameTextField.requestFocus();
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
        deviceTypeLabel = new javax.swing.JLabel();
        deviceTypeComboBox = new javax.swing.JComboBox<>();
        deviceNameLabel = new javax.swing.JLabel();
        deviceNameTextField = new javax.swing.JTextField();
        roomLabel = new javax.swing.JLabel();
        roomComboBox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        logsList = new javax.swing.JList<>();
        logsLabel = new javax.swing.JLabel();
        cancelButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add Device");
        setResizable(false);

        createDevicePanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Add Device"));

        deviceTypeLabel.setText("Device Type:");

        deviceTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(swingHouseAdapter.getDeviceTypes()));

        deviceNameLabel.setText("Device Name:");

        roomLabel.setText("Room:");

        roomComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(swingHouseAdapter.getRooms()));

        logsList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { ".LOG", ".TXT", ".CSV" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(logsList);

        logsLabel.setText("Logs:");

        javax.swing.GroupLayout createDevicePanelLayout = new javax.swing.GroupLayout(createDevicePanel);
        createDevicePanel.setLayout(createDevicePanelLayout);
        createDevicePanelLayout.setHorizontalGroup(
            createDevicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createDevicePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(createDevicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(roomComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deviceNameTextField)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(createDevicePanelLayout.createSequentialGroup()
                        .addGroup(createDevicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(roomLabel)
                            .addComponent(deviceTypeLabel)
                            .addComponent(deviceNameLabel)
                            .addComponent(logsLabel))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(deviceTypeComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        createDevicePanelLayout.setVerticalGroup(
            createDevicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createDevicePanelLayout.createSequentialGroup()
                .addComponent(roomLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(roomComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deviceTypeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deviceTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deviceNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deviceNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(createDevicePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(createDevicePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton)
                    .addComponent(cancelButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        swingHouseAdapter.addDevice(
                (String) roomComboBox.getSelectedItem(),
                (String) deviceTypeComboBox.getSelectedItem(),
                deviceNameTextField.getText().split(" ")[0],
                logsList.getSelectedValuesList()
        );
        parent.getAvailableDevicesComboBox().setModel(
                new DefaultComboBoxModel<>(
                        swingHouseAdapter.getRoomDevices(
                                (String) parent.getRoomsComboBox().getSelectedItem()
                        )
                )
        );
        parent.getAvailableDevicesComboBox().setEnabled(true);
        dispose();
    }//GEN-LAST:event_saveButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JPanel createDevicePanel;
    private javax.swing.JLabel deviceNameLabel;
    private javax.swing.JTextField deviceNameTextField;
    private javax.swing.JComboBox<String> deviceTypeComboBox;
    private javax.swing.JLabel deviceTypeLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logsLabel;
    private javax.swing.JList<String> logsList;
    private javax.swing.JComboBox<String> roomComboBox;
    private javax.swing.JLabel roomLabel;
    private javax.swing.JButton saveButton;
    // End of variables declaration//GEN-END:variables

    public JComboBox<String> getDeviceTypeComboBox() {
        return deviceTypeComboBox;
    }
}
