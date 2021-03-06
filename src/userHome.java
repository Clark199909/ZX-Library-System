
import javax.swing.JOptionPane;
import java.sql.*;
import project.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zhengkai Xie
 */
public class userHome extends javax.swing.JFrame {

    /**
     * Creates new form userHome
     */
    String myName;
    public userHome(String name) {
        initComponents();
        myName = name;
        subtitleText.setText(null);
        subtitleText.setText("Welcome, "+myName+"!");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleText = new javax.swing.JLabel();
        closeButton = new javax.swing.JButton();
        subtitleText = new javax.swing.JLabel();
        borrowButton = new javax.swing.JButton();
        returnButton = new javax.swing.JButton();
        profileButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleText.setFont(new java.awt.Font("Bernard MT Condensed", 1, 36)); // NOI18N
        titleText.setText("ZX Library System");
        titleText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                titleTextMouseClicked(evt);
            }
        });
        getContentPane().add(titleText, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 40, -1, -1));

        closeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/close-button.png"))); // NOI18N
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(closeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1231, 0, 30, 30));

        subtitleText.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        subtitleText.setForeground(new java.awt.Color(255, 255, 255));
        subtitleText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subtitleText.setText("jLabel1");
        getContentPane().add(subtitleText, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 240, 376, -1));

        borrowButton.setBackground(new java.awt.Color(255, 255, 255));
        borrowButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        borrowButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/borrow.png"))); // NOI18N
        borrowButton.setText("Borrow");
        borrowButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrowButtonActionPerformed(evt);
            }
        });
        getContentPane().add(borrowButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, -1, -1));

        returnButton.setBackground(new java.awt.Color(255, 255, 255));
        returnButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        returnButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/return.png"))); // NOI18N
        returnButton.setText("Return");
        returnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnButtonActionPerformed(evt);
            }
        });
        getContentPane().add(returnButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 380, -1, -1));

        profileButton.setBackground(new java.awt.Color(255, 255, 255));
        profileButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        profileButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/view-details.png"))); // NOI18N
        profileButton.setText("Profile");
        profileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profileButtonActionPerformed(evt);
            }
        });
        getContentPane().add(profileButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 380, -1, -1));

        logoutButton.setBackground(new java.awt.Color(255, 255, 255));
        logoutButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        logoutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logout.png"))); // NOI18N
        logoutButton.setText("Log out");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });
        getContentPane().add(logoutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 30, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/userBackground.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void titleTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titleTextMouseClicked
        setVisible(false);
        new home(true, myName).setVisible(true);
    }//GEN-LAST:event_titleTextMouseClicked

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        int a=JOptionPane.showConfirmDialog(null, "Do you want to exit the application?", "Select", JOptionPane.YES_NO_OPTION);
        if(a==0){
            System.exit(0);
        }
    }//GEN-LAST:event_closeButtonActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        int a=JOptionPane.showConfirmDialog(null, "Do you really want to log out?", "Select", JOptionPane.YES_NO_OPTION);
        if(a==0){
            setVisible(false);
            new Login().setVisible(true);
        }
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void borrowButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrowButtonActionPerformed
        setVisible(false);
        new userBorrow(myName).setVisible(true);
    }//GEN-LAST:event_borrowButtonActionPerformed

    private void returnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnButtonActionPerformed
        setVisible(false);
        new userReturn(myName).setVisible(true);
    }//GEN-LAST:event_returnButtonActionPerformed

    private void profileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileButtonActionPerformed
        setVisible(false);
        new userProfile(myName).setVisible(true);
    }//GEN-LAST:event_profileButtonActionPerformed

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
            java.util.logging.Logger.getLogger(userHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(userHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(userHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(userHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new userHome("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton borrowButton;
    private javax.swing.JButton closeButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton profileButton;
    private javax.swing.JButton returnButton;
    private javax.swing.JLabel subtitleText;
    private javax.swing.JLabel titleText;
    // End of variables declaration//GEN-END:variables
}
