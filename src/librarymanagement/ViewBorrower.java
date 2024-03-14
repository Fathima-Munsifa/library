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
public class ViewBorrower extends javax.swing.JFrame {

     private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea detailsTextArea;
    
    public ViewBorrower() {
        initComponents();
        fetchDataFromDatabase();
    }
    String url = "jdbc:mysql://localhost:3306/librarymgmnt";
        String uname = "root";
        String pswd = "";
private void initComponents() {

        detailsTextArea = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane(detailsTextArea);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        detailsTextArea.setColumns(20);
        detailsTextArea.setRows(5);
        jScrollPane1 = new javax.swing.JScrollPane(detailsTextArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }
private void fetchDataFromDatabase() {
        // Modify this method to fetch data from the database
        String query = "SELECT * FROM borrower";

        try (Connection con = DriverManager.getConnection(url, uname, pswd);
             PreparedStatement statement = con.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()) {

            StringBuilder details = new StringBuilder();

            while (resultSet.next()) {
                details.append("ID: ").append(resultSet.getInt("id")).append("\n");
                details.append("Name: ").append(resultSet.getString("name")).append("\n");
                details.append("Address: ").append(resultSet.getString("address")).append("\n");
                details.append("Contact: ").append(resultSet.getString("contact")).append("\n");
                details.append("\n-----------------\n");
            }

            detailsTextArea.setText(details.toString());

        } catch (SQLException ex) {
            Logger.getLogger(ViewBorrower.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Error fetching data from the database");
        }
    }

  
    @SuppressWarnings("unchecked")
    /*
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(448, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(397, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
*/
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        AdminSection adminForm = new AdminSection(); 
        adminForm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ViewBorrower.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewBorrower.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewBorrower.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewBorrower.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewBorrower().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
