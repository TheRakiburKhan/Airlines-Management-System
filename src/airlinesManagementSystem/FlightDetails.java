/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airlinesManagementSystem;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author MD Rakibur Khan
 */
public class FlightDetails
        extends javax.swing.JInternalFrame {

    /**
     * Creates new form FlightDetails
     */
    Connection connection;
    PreparedStatement preparedStatement;
    ResultSet resultSet;
    public FlightDetails() {
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

        ttileLabel = new javax.swing.JLabel();
        flightCodeLabel = new javax.swing.JLabel();
        flightCodeTextField = new javax.swing.JTextField();
        showButton = new javax.swing.JButton();
        tableScrollPane = new javax.swing.JScrollPane();
        flightInformationTable = new javax.swing.JTable();
        closeButton = new javax.swing.JButton();

        setTitle("Flight Details");

        ttileLabel.setFont(new java.awt.Font("Kalpurush", 0, 24)); // NOI18N
        ttileLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ttileLabel.setText("Flight Information");

        flightCodeLabel.setText("Flight Code");

        showButton.setText("Show");
        showButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showButtonActionPerformed(evt);
            }
        });

        flightInformationTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Flight Code", "Flight Name", "Departure", "Destination", "Capacity", "Class Code", "Class Name"
            }
        ));
        tableScrollPane.setViewportView(flightInformationTable);

        closeButton.setText("Close");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
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
                        .addComponent(tableScrollPane))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ttileLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 672, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(flightCodeLabel)
                        .addGap(18, 18, 18)
                        .addComponent(flightCodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addComponent(showButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(closeButton)
                        .addGap(35, 35, 35)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ttileLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(flightCodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(flightCodeLabel)
                    .addComponent(showButton)
                    .addComponent(closeButton))
                .addGap(21, 21, 21)
                .addComponent(tableScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        JDesktopPane desktopPane = getDesktopPane();
        MainMenuHome mainMenuHome = new MainMenuHome();
        desktopPane.removeAll();
        try {
            desktopPane.add(mainMenuHome);
            mainMenuHome.setVisible(true);
            desktopPane.moveToFront(mainMenuHome);
            mainMenuHome.setSize(desktopPane.getWidth(),desktopPane.getHeight());
            mainMenuHome.setLocation(0,0);
        } catch (Exception e) {
        }
        
        try {
            mainMenuHome.setSelected(true);
        } catch (PropertyVetoException ex) {
           
        }
    }//GEN-LAST:event_closeButtonActionPerformed

    private void showButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showButtonActionPerformed
       String flightCode = flightCodeTextField.getText();
                
                try {
                    connection = DatabaseConnection.Connect();
                    String sql = "select f_code,f_name,src,dst,capacity,class_code,class_name from flight ,sector where f_code = '"+flightCode+"'";
                    preparedStatement = connection.prepareStatement(sql);
                    resultSet = preparedStatement.executeQuery();
                    flightInformationTable.setModel(DbUtils.resultSetToTableModel(resultSet));	
                    connection.close();
                    
                }catch(SQLException sQLException){
                    JOptionPane.showMessageDialog(null, sQLException, "SQL Error!!!", JOptionPane.ERROR_MESSAGE);
                }
    }//GEN-LAST:event_showButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeButton;
    private javax.swing.JLabel flightCodeLabel;
    private javax.swing.JTextField flightCodeTextField;
    private javax.swing.JTable flightInformationTable;
    private javax.swing.JButton showButton;
    private javax.swing.JScrollPane tableScrollPane;
    private javax.swing.JLabel ttileLabel;
    // End of variables declaration//GEN-END:variables
}
