/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package librarymanagement;

/**
 *
 * @author asmah
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
public class Update extends javax.swing.JFrame {

    public Update() {
        initComponents();
    }
     String url = "jdbc:mysql://localhost:3306/librarymgmnt";
        String uname = "root";
        String pswd = "";
                                      
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        name = new javax.swing.JLabel();
        updateName = new javax.swing.JTextField();
        update = new javax.swing.JButton();
        address = new javax.swing.JLabel();
        updateAddress = new javax.swing.JTextField();
        contact = new javax.swing.JLabel();
        updateContact = new javax.swing.JTextField();
        backBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel1.setText("Update Borrower");

        jLabel2.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel2.setText("Id");

        id.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N

        name.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        name.setText("Name");

        updateName.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N

        update.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        address.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        address.setText("Address");

        updateAddress.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N

        contact.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        contact.setText("Contact");

        updateContact.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        updateContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateContactActionPerformed(evt);
            }
        });

        backBtn.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(address))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(name)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(contact))))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(updateName)
                            .addComponent(id)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(update)
                                .addGap(18, 18, 18)
                                .addComponent(backBtn))
                            .addComponent(updateContact)
                            .addComponent(updateAddress))
                        .addGap(17, 17, 17)))
                .addGap(88, 88, 88))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(address))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contact))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(update)
                    .addComponent(backBtn))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
      
    int updateId = Integer.parseInt(id.getText()); 
    String newName = updateName.getText(); 
    String newAddress = updateAddress.getText();
    String newContact = updateContact.getText();

    
    String updateQuery = "UPDATE borrower SET name = ?, address = ?, contact = ? WHERE id = ?";

    try (Connection con = DriverManager.getConnection(url, uname, pswd);
         PreparedStatement pst = con.prepareStatement(updateQuery)) {

        
        pst.setString(1, newName);
        pst.setString(2, newAddress);
        pst.setString(3, newContact);
        pst.setInt(4, updateId);

       
        int rowsAffected = pst.executeUpdate();

        
        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(this, "Details updated successfully");
        } else {
            JOptionPane.showMessageDialog(this, "Failed to update details. No record found for the given ID.");
        }

    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error updating details: " + ex.getMessage());
    }



    }//GEN-LAST:event_updateActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
         AdminSection adminForm = new AdminSection(); 
        adminForm.setVisible(true);
        this.dispose();
    
    }//GEN-LAST:event_backBtnActionPerformed

    private void updateContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateContactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateContactActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Update().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel address;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel contact;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel name;
    private javax.swing.JButton update;
    private javax.swing.JTextField updateAddress;
    private javax.swing.JTextField updateContact;
    private javax.swing.JTextField updateName;
    // End of variables declaration//GEN-END:variables
}
