
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import project.Select;
import project.UpdateData;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zhengkai Xie
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
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

        titleText = new javax.swing.JLabel();
        closeButton = new javax.swing.JButton();
        subtitleText = new javax.swing.JLabel();
        nameOrEmailText = new javax.swing.JLabel();
        nameOrEmailInput = new javax.swing.JTextField();
        passwordText = new javax.swing.JLabel();
        passwordInput = new javax.swing.JPasswordField();
        loginButton = new javax.swing.JButton();
        signupButton = new javax.swing.JButton();
        passwordFindbackButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

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
        getContentPane().add(titleText, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 30, -1, -1));

        closeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/close-button.png"))); // NOI18N
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(closeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 0, 30, 30));

        subtitleText.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        subtitleText.setForeground(new java.awt.Color(255, 255, 255));
        subtitleText.setText("Log in");
        getContentPane().add(subtitleText, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 270, -1, -1));

        nameOrEmailText.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nameOrEmailText.setForeground(new java.awt.Color(255, 255, 255));
        nameOrEmailText.setText("User Name/Email");
        getContentPane().add(nameOrEmailText, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 350, -1, -1));

        nameOrEmailInput.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(nameOrEmailInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 350, 300, -1));

        passwordText.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        passwordText.setForeground(new java.awt.Color(255, 255, 255));
        passwordText.setText("Password");
        getContentPane().add(passwordText, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 390, -1, -1));

        passwordInput.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(passwordInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 390, 300, -1));

        loginButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        loginButton.setText("Log in");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        getContentPane().add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 440, -1, -1));

        signupButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        signupButton.setText("Sign up");
        signupButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupButtonActionPerformed(evt);
            }
        });
        getContentPane().add(signupButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 440, -1, -1));

        passwordFindbackButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        passwordFindbackButton.setText("Forgot Password?");
        passwordFindbackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFindbackButtonActionPerformed(evt);
            }
        });
        getContentPane().add(passwordFindbackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 390, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/background.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        int a=JOptionPane.showConfirmDialog(null, "Do you want to exit the application?", "Select", JOptionPane.YES_NO_OPTION);
        if(a==0){
            System.exit(0);
        }
    }//GEN-LAST:event_closeButtonActionPerformed

    private void signupButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupButtonActionPerformed
        setVisible(false);
        new Signup().setVisible(true);
    }//GEN-LAST:event_signupButtonActionPerformed

    private void passwordFindbackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFindbackButtonActionPerformed
        setVisible(false);
        new resetPassword().setVisible(true);
    }//GEN-LAST:event_passwordFindbackButtonActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        int check=0;
        StringBuilder nameorEmailSb = new StringBuilder(nameOrEmailInput.getText());
        String nameorEmail = UpdateData.dealSpcialSymbols(nameorEmailSb);
        StringBuilder passwordSb = new StringBuilder(passwordInput.getText());
        String password = UpdateData.dealSpcialSymbols(passwordSb);
        if(nameorEmail.equals("") || password.equals("")){
            check=1;
            JOptionPane.showMessageDialog(null, "Every field is required.");
        }else if(nameorEmail.equals("admin") && password.equals("adminadmin")){
            check=1;
            setVisible(false);
            new administrator().setVisible(true);
        }else{
            ResultSet rs=Select.getData("select *from users where (userName='"+nameorEmail+"' or email='"+nameorEmail+"') and password='"+password+"'");
            try{
                //means user data exists after using getData(String query)
                if(rs.next()){
                    check=1;
                    String name = rs.getString(1);
                    if(rs.getString(6).equals("true")){
                        setVisible(false);
                        new userHome(name).setVisible(true);
                    }else{
                        JOptionPane.showMessageDialog(null, "Account is not active.");
                    }
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
            }
        }
        if(check==0){
            JOptionPane.showMessageDialog(null, "Incorrect Email or Password");
        }
    }//GEN-LAST:event_loginButtonActionPerformed

    private void titleTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titleTextMouseClicked
        setVisible(false);
        new home(false, "").setVisible(true);
    }//GEN-LAST:event_titleTextMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton loginButton;
    private javax.swing.JTextField nameOrEmailInput;
    private javax.swing.JLabel nameOrEmailText;
    private javax.swing.JButton passwordFindbackButton;
    private javax.swing.JPasswordField passwordInput;
    private javax.swing.JLabel passwordText;
    private javax.swing.JButton signupButton;
    private javax.swing.JLabel subtitleText;
    private javax.swing.JLabel titleText;
    // End of variables declaration//GEN-END:variables
}
