/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import gui.device.AddDeviceFileChooserDialog;
import gui.room.CreateRoomDialog;
import gui.device.CreateDeviceDialog;
import gui.device.DeviceDetailsDialog;
import hot.domain.entities.device.Device;
import hot.domain.entities.house.House;
import hot.domain.entities.house.adapters.SwingHouseAdapter;
import hot.domain.entities.room.Room;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author João, Rafael, Adélia, Leonardo, Raquel, Guilherme, Bruno, Pedro
 */
public class Home extends javax.swing.JFrame {

    private final SwingHouseAdapter swingHouseAdapter;

    /**
     * Creates new form Home
     *
     * @param house
     */
    public Home(House house) {

        //house.loadSession();
        swingHouseAdapter = new SwingHouseAdapter(house);

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

        housePanel = new javax.swing.JPanel();
        shutdownHouseButton = new javax.swing.JButton();
        initHouseButton = new javax.swing.JButton();
        roomsPanel = new javax.swing.JPanel();
        roomsComboBox = new javax.swing.JComboBox<>();
        initRoomButton = new javax.swing.JButton();
        shutdownRoomButton = new javax.swing.JButton();
        devicesPanel = new javax.swing.JPanel();
        deviceDetailsButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        devicesComboBox = new javax.swing.JComboBox<>();
        deleteRoomButton = new javax.swing.JButton();
        deleteRoomsButton = new javax.swing.JButton();
        hotMenuBar = new javax.swing.JMenuBar();
        hotMenu = new javax.swing.JMenu();
        createRoomMenuItem = new javax.swing.JMenuItem();
        createDeviceMenuItem = new javax.swing.JMenuItem();
        newDeviceMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HoT");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        housePanel.setBorder(javax.swing.BorderFactory.createTitledBorder("House"));

        shutdownHouseButton.setText("Shutdown House");
        shutdownHouseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shutdownHouseButtonActionPerformed(evt);
            }
        });

        initHouseButton.setText("Init House");
        initHouseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                initHouseButtonActionPerformed(evt);
            }
        });

        roomsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Rooms"));

        roomsComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(swingHouseAdapter.getRooms()));
        roomsComboBox.setEnabled(false);
        roomsComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomsComboBoxActionPerformed(evt);
            }
        });

        initRoomButton.setText("Init Room");
        initRoomButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                initRoomButtonActionPerformed(evt);
            }
        });

        shutdownRoomButton.setText("Shutdown Room");
        shutdownRoomButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shutdownRoomButtonActionPerformed(evt);
            }
        });

        devicesPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Devices"));

        deviceDetailsButton.setText("Device Details");
        deviceDetailsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deviceDetailsButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Delete Device");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        devicesComboBox.setModel(new javax.swing.DefaultComboBoxModel<>());
        devicesComboBox.setEnabled(false);

        javax.swing.GroupLayout devicesPanelLayout = new javax.swing.GroupLayout(devicesPanel);
        devicesPanel.setLayout(devicesPanelLayout);
        devicesPanelLayout.setHorizontalGroup(
            devicesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(devicesComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(devicesPanelLayout.createSequentialGroup()
                .addComponent(deviceDetailsButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        devicesPanelLayout.setVerticalGroup(
            devicesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, devicesPanelLayout.createSequentialGroup()
                .addComponent(devicesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(devicesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deviceDetailsButton)
                    .addComponent(deleteButton)))
        );

        deleteRoomButton.setText("Delete Room");
        deleteRoomButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteRoomButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout roomsPanelLayout = new javax.swing.GroupLayout(roomsPanel);
        roomsPanel.setLayout(roomsPanelLayout);
        roomsPanelLayout.setHorizontalGroup(
            roomsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roomsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(devicesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(roomsPanelLayout.createSequentialGroup()
                .addComponent(deleteRoomButton, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(roomsComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(roomsPanelLayout.createSequentialGroup()
                .addComponent(initRoomButton, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(shutdownRoomButton, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        roomsPanelLayout.setVerticalGroup(
            roomsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roomsPanelLayout.createSequentialGroup()
                .addComponent(roomsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(roomsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(initRoomButton)
                    .addComponent(shutdownRoomButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteRoomButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(devicesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        deleteRoomsButton.setText("Delete Rooms");
        deleteRoomsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteRoomsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout housePanelLayout = new javax.swing.GroupLayout(housePanel);
        housePanel.setLayout(housePanelLayout);
        housePanelLayout.setHorizontalGroup(
            housePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(housePanelLayout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(roomsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, housePanelLayout.createSequentialGroup()
                .addGroup(housePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(deleteRoomsButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                    .addComponent(initHouseButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(50, 50, 50)
                .addComponent(shutdownHouseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        housePanelLayout.setVerticalGroup(
            housePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, housePanelLayout.createSequentialGroup()
                .addGroup(housePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(initHouseButton)
                    .addComponent(shutdownHouseButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteRoomsButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(roomsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(244, 244, 244))
        );

        hotMenu.setText("HoT");

        createRoomMenuItem.setText("Create Room");
        createRoomMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createRoomMenuItemActionPerformed(evt);
            }
        });
        hotMenu.add(createRoomMenuItem);

        createDeviceMenuItem.setText("Add Device");
        createDeviceMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createDeviceMenuItemActionPerformed(evt);
            }
        });
        hotMenu.add(createDeviceMenuItem);

        newDeviceMenuItem.setText("New Device");
        newDeviceMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newDeviceMenuItemActionPerformed(evt);
            }
        });
        hotMenu.add(newDeviceMenuItem);

        hotMenuBar.add(hotMenu);

        setJMenuBar(hotMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(housePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(housePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void createDeviceMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createDeviceMenuItemActionPerformed
        if (roomsComboBox.getSelectedItem() != null) {
            new CreateDeviceDialog(this, true) {
                {
                    setVisible(true);
                }
            };
        } else {
            JOptionPane.showMessageDialog(
                    this,
                    "There are no rooms!",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }//GEN-LAST:event_createDeviceMenuItemActionPerformed

    private void createRoomMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createRoomMenuItemActionPerformed
        new CreateRoomDialog(this, true) {
            {
                setVisible(true);
            }
        };
    }//GEN-LAST:event_createRoomMenuItemActionPerformed

    private void roomsComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomsComboBoxActionPerformed
        devicesComboBox.setModel(
                new DefaultComboBoxModel<>(
                        swingHouseAdapter.getRoomDevices(
                                (String) roomsComboBox.getSelectedItem()
                        )
                )
        );
        if (devicesComboBox.getSelectedItem() == null) {
            devicesComboBox.setEnabled(false);
        } else {
            devicesComboBox.setEnabled(true);
        }
    }//GEN-LAST:event_roomsComboBoxActionPerformed

    private void deviceDetailsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deviceDetailsButtonActionPerformed
        if (devicesComboBox.getSelectedItem() != null) {
            Device selectedDevice = swingHouseAdapter
                    .getHouse()
                    .getRoomRepository()
                    .find((String) roomsComboBox.getSelectedItem())
                    .getDevices()
                    .stream()
                    .filter(d -> d.getName().equals(((String) devicesComboBox.getSelectedItem()).split(" ")[1]))
                    .findFirst()
                    .get();
            new DeviceDetailsDialog(this, true, selectedDevice) {
                {
                    setVisible(true);
                }
            };
        } else {
            JOptionPane.showMessageDialog(this, "There are no devices!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_deviceDetailsButtonActionPerformed

    private void initHouseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_initHouseButtonActionPerformed
        if (devicesComboBox.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(
                    this,
                    "There are no rooms!",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );
            return;
        }
        swingHouseAdapter.getHouse().massiveInitialization();
        JOptionPane.showMessageDialog(this, "The house has been fully initialized.");
    }//GEN-LAST:event_initHouseButtonActionPerformed

    private void shutdownHouseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shutdownHouseButtonActionPerformed
        if (devicesComboBox.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(
                    this,
                    "There are no rooms!",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );
            return;
        }
        swingHouseAdapter.getHouse().massiveShutdown();
        JOptionPane.showMessageDialog(this, "The house has been fully shutdown.");
    }//GEN-LAST:event_shutdownHouseButtonActionPerformed

    private void initRoomButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_initRoomButtonActionPerformed
        if (devicesComboBox.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(
                    this,
                    "There are no rooms!",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );
            return;
        }
        swingHouseAdapter.getHouse().initializeRoom(
                swingHouseAdapter
                        .getHouse()
                        .getRoomRepository()
                        .find((String) roomsComboBox.getSelectedItem())
        );
        JOptionPane.showMessageDialog(this, "The room has been fully initialized.");
    }//GEN-LAST:event_initRoomButtonActionPerformed

    private void shutdownRoomButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shutdownRoomButtonActionPerformed
        if (devicesComboBox.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(
                    this,
                    "There are no rooms!",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );
            return;
        }
        swingHouseAdapter.getHouse().shutDownRoom(
                swingHouseAdapter
                        .getHouse()
                        .getRoomRepository()
                        .find((String) roomsComboBox.getSelectedItem())
        );
        JOptionPane.showMessageDialog(this, "The room has been fully shutdown.");
    }//GEN-LAST:event_shutdownRoomButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        if (devicesComboBox.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(
                    this,
                    "There are no devices!",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );
            return;
        }
        int response = JOptionPane.showConfirmDialog(
                this,
                "Are you sure you want to delete this device?",
                "Delete Device",
                JOptionPane.YES_NO_OPTION
        );
        if (response == 0) {
            Room room = swingHouseAdapter
                    .getHouse()
                    .getRoomRepository()
                    .find((String) roomsComboBox.getSelectedItem());
            Device selectedDevice = room
                    .getDevices()
                    .stream()
                    .filter(d -> d.getName().equals(((String) devicesComboBox.getSelectedItem()).split(" ")[1]))
                    .findFirst()
                    .get();
            room.removeDevice(selectedDevice);
            devicesComboBox.setModel(
                    new DefaultComboBoxModel<>(
                            swingHouseAdapter.getRoomDevices(
                                    (String) roomsComboBox.getSelectedItem()
                            )
                    )
            );
            if (devicesComboBox.getSelectedItem() == null) {
                devicesComboBox.setEnabled(false);
            }
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        //swingHouseAdapter.getHouse().saveSession();
    }//GEN-LAST:event_formWindowClosing

    private void deleteRoomButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteRoomButtonActionPerformed
        if (roomsComboBox.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(
                    this,
                    "There are no rooms!",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );
            return;
        }
        int response = JOptionPane.showConfirmDialog(
                this,
                "Are you sure you want to delete this room?\n"
                + "Deleting this room will also delete all of its devices.",
                "Delete Device",
                JOptionPane.YES_NO_OPTION
        );
        if (response == 0) {
            Room room = swingHouseAdapter
                    .getHouse()
                    .getRoomRepository()
                    .find((String) roomsComboBox.getSelectedItem());
            swingHouseAdapter
                    .getHouse()
                    .getRoomRepository().remove(room);
            roomsComboBox.setModel(
                    new DefaultComboBoxModel<>(
                            swingHouseAdapter.getRooms()
                    )
            );
            if (roomsComboBox.getSelectedItem() == null) {
                roomsComboBox.setEnabled(false);
                devicesComboBox.setEnabled(false);
            } else {
                devicesComboBox.setModel(
                        new DefaultComboBoxModel<>(
                                swingHouseAdapter.getRoomDevices(
                                        (String) roomsComboBox.getSelectedItem()
                                )
                        )
                );
                if (swingHouseAdapter.getRoomDevices((String) roomsComboBox.getSelectedItem()).length == 0) {
                    devicesComboBox.setEnabled(false);
                } else {
                    devicesComboBox.setEnabled(true);
                }
            }
        }
    }//GEN-LAST:event_deleteRoomButtonActionPerformed

    private void deleteRoomsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteRoomsButtonActionPerformed
        if (devicesComboBox.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(
                    this,
                    "There are no rooms!",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );
            return;
        }
        int response = JOptionPane.showConfirmDialog(
                this,
                "Are you sure you want to delete all rooms?\n"
                + "Deleting all rooms will also delete all of their devices.",
                "Delete Device",
                JOptionPane.YES_NO_OPTION
        );
        if (response == 0) {
            ((ArrayList<Room>) swingHouseAdapter.getHouse().getRoomRepository().retrieveAll()).clear();
            devicesComboBox.setEnabled(false);
            devicesComboBox.setModel(new DefaultComboBoxModel<>());
            roomsComboBox.setEnabled(false);            
            roomsComboBox.setModel(new DefaultComboBoxModel<>());
        }
    }//GEN-LAST:event_deleteRoomsButtonActionPerformed

    private void newDeviceMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newDeviceMenuItemActionPerformed
        new AddDeviceFileChooserDialog(this, true) {
            {
                setVisible(true);
            }
        };     
    }//GEN-LAST:event_newDeviceMenuItemActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem createDeviceMenuItem;
    private javax.swing.JMenuItem createRoomMenuItem;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton deleteRoomButton;
    private javax.swing.JButton deleteRoomsButton;
    private javax.swing.JButton deviceDetailsButton;
    private javax.swing.JComboBox<String> devicesComboBox;
    private javax.swing.JPanel devicesPanel;
    private javax.swing.JMenu hotMenu;
    private javax.swing.JMenuBar hotMenuBar;
    private javax.swing.JPanel housePanel;
    private javax.swing.JButton initHouseButton;
    private javax.swing.JButton initRoomButton;
    private javax.swing.JMenuItem newDeviceMenuItem;
    private javax.swing.JComboBox<String> roomsComboBox;
    private javax.swing.JPanel roomsPanel;
    private javax.swing.JButton shutdownHouseButton;
    private javax.swing.JButton shutdownRoomButton;
    // End of variables declaration//GEN-END:variables

    public SwingHouseAdapter getSwingHouseAdapter() {
        return swingHouseAdapter;
    }

    public JComboBox<String> getRoomsComboBox() {
        return roomsComboBox;
    }

    public JComboBox<String> getAvailableDevicesComboBox() {
        return devicesComboBox;
    }
}
