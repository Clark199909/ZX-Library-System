/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zhengkai Xie
 */
import java.awt.Color;
import project.*;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class adminVerifyRequests extends javax.swing.JFrame {

    /**
     * Creates new form adminVerifyRequests
     */
    String myType;
    int bookId;
    int orderId;
    String userName;
    String bookTitle;
    String bookLocation;
    public adminVerifyRequests(String type) {
        initComponents();
        setComponentNames();
        myType = type;
        requestTypeOptionInput.setSelectedItem(type);
        bookIdData.setEditable(false);
        bookTitleData.setEditable(false);
        bookAuthorData.setEditable(false);
        bookGenreData.setEditable(false);
        bookPublicationYearData.setEditable(false);
        bookEditionData.setEditable(false);
        bookLocationData.setEditable(false);
        verifyRequestButton.setEnabled(false);
        declineRequestButton.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        requesTypeChoiceText = new javax.swing.JLabel();
        requestTypeOptionInput = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        orderTable = new javax.swing.JTable();
        bookIdText = new javax.swing.JLabel();
        bookTitleText = new javax.swing.JLabel();
        bookAuthorText = new javax.swing.JLabel();
        bookGenreText = new javax.swing.JLabel();
        bookPublicationYearText = new javax.swing.JLabel();
        bookEditionText = new javax.swing.JLabel();
        bookLocationText = new javax.swing.JLabel();
        bookIdData = new javax.swing.JTextField();
        bookTitleData = new javax.swing.JTextField();
        bookAuthorData = new javax.swing.JTextField();
        bookGenreData = new javax.swing.JTextField();
        bookPublicationYearData = new javax.swing.JTextField();
        bookEditionData = new javax.swing.JTextField();
        bookLocationData = new javax.swing.JTextField();
        verifyRequestButton = new javax.swing.JButton();
        declineRequestButton = new javax.swing.JButton();
        switchButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(85, 237));
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        requesTypeChoiceText.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        requesTypeChoiceText.setText("Select the type of requests to verify:");
        getContentPane().add(requesTypeChoiceText, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 37, -1, -1));

        requestTypeOptionInput.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        requestTypeOptionInput.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Borrow", "Return" }));
        requestTypeOptionInput.setToolTipText("");
        getContentPane().add(requestTypeOptionInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(439, 34, 130, -1));

        orderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order ID", "Requester", "Book ID", "Borrow Date", "Deadline", "Return Date"
            }
        ));
        orderTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                orderTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(orderTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 80, 632, 375));

        bookIdText.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bookIdText.setText("Book ID:");
        getContentPane().add(bookIdText, new org.netbeans.lib.awtextra.AbsoluteConstraints(737, 94, -1, -1));

        bookTitleText.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bookTitleText.setText("Book Title:");
        getContentPane().add(bookTitleText, new org.netbeans.lib.awtextra.AbsoluteConstraints(737, 133, -1, -1));

        bookAuthorText.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bookAuthorText.setText("Book Author:");
        getContentPane().add(bookAuthorText, new org.netbeans.lib.awtextra.AbsoluteConstraints(737, 172, -1, -1));

        bookGenreText.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bookGenreText.setText("Book Genre:");
        getContentPane().add(bookGenreText, new org.netbeans.lib.awtextra.AbsoluteConstraints(737, 211, -1, -1));

        bookPublicationYearText.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bookPublicationYearText.setText("Publication Year:");
        getContentPane().add(bookPublicationYearText, new org.netbeans.lib.awtextra.AbsoluteConstraints(737, 250, -1, -1));

        bookEditionText.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bookEditionText.setText("Book Edition:");
        getContentPane().add(bookEditionText, new org.netbeans.lib.awtextra.AbsoluteConstraints(737, 289, -1, -1));

        bookLocationText.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bookLocationText.setText("Book Location:");
        getContentPane().add(bookLocationText, new org.netbeans.lib.awtextra.AbsoluteConstraints(737, 328, -1, -1));

        bookIdData.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(bookIdData, new org.netbeans.lib.awtextra.AbsoluteConstraints(876, 93, 200, -1));

        bookTitleData.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(bookTitleData, new org.netbeans.lib.awtextra.AbsoluteConstraints(876, 132, 200, -1));

        bookAuthorData.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(bookAuthorData, new org.netbeans.lib.awtextra.AbsoluteConstraints(876, 171, 200, -1));

        bookGenreData.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(bookGenreData, new org.netbeans.lib.awtextra.AbsoluteConstraints(876, 210, 200, -1));

        bookPublicationYearData.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(bookPublicationYearData, new org.netbeans.lib.awtextra.AbsoluteConstraints(876, 249, 200, -1));

        bookEditionData.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(bookEditionData, new org.netbeans.lib.awtextra.AbsoluteConstraints(876, 288, 200, -1));

        bookLocationData.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(bookLocationData, new org.netbeans.lib.awtextra.AbsoluteConstraints(876, 327, 200, -1));

        verifyRequestButton.setBackground(new java.awt.Color(255, 255, 255));
        verifyRequestButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        verifyRequestButton.setText("Verify");
        verifyRequestButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verifyRequestButtonActionPerformed(evt);
            }
        });
        getContentPane().add(verifyRequestButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(737, 366, -1, -1));

        declineRequestButton.setBackground(new java.awt.Color(255, 255, 255));
        declineRequestButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        declineRequestButton.setText("Decline");
        declineRequestButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                declineRequestButtonActionPerformed(evt);
            }
        });
        getContentPane().add(declineRequestButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(876, 366, -1, -1));

        switchButton.setBackground(new java.awt.Color(255, 255, 255));
        switchButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        switchButton.setText("Switch");
        switchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                switchButtonActionPerformed(evt);
            }
        });
        getContentPane().add(switchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 40, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/adminFunctionsBackground.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        showData();
    }//GEN-LAST:event_formComponentShown

    private void switchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_switchButtonActionPerformed
        myType = (String)requestTypeOptionInput.getSelectedItem();
        showData();
    }//GEN-LAST:event_switchButtonActionPerformed

    private void verifyRequestButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verifyRequestButtonActionPerformed
        StringBuilder translatedUserNameSb = new StringBuilder(userName);
        String translatedUserName = UpdateData.dealSpcialSymbols(translatedUserNameSb);
        verifyRequestButton.setEnabled(false);
        declineRequestButton.setEnabled(false);
        String bookStatus = (myType == "Borrow")? "Unavailable":"Available";
        String orderStatus = (myType == "Borrow")? "Incomplete":"Complete";
        UpdateData.setData("update books set status='"+bookStatus+"' where id='"+bookId+"'", "");
        UpdateData.setData("update orders set status='"+orderStatus+"' where id='"+orderId+"'", "Request verified!");
        
        ResultSet rs = Select.getData("select *from users where userName='"+translatedUserName+"'");
        try{
            if(rs.next()){
                String email = rs.getString(2);
                String emailTitle = ""+myType+" Request Verified";
                String locationReminder = (myType.equals("Borrow"))?"Please pick up this book in "+bookLocation+".":"";
                String emailContent = "Dear "+userName+",\nYour request to " + myType.toLowerCase() + " "+bookTitle+" has been verified. "+locationReminder+" Have a great day!\n\nBest wishes,\nZX Library Admin";
                Email.sendEmail(email, emailContent, emailTitle, 2);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        setVisible(false);
        new adminVerifyRequests(myType).setVisible(true);
    }//GEN-LAST:event_verifyRequestButtonActionPerformed

    private void declineRequestButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_declineRequestButtonActionPerformed
        StringBuilder translatedUserNameSb = new StringBuilder(userName);
        String translatedUserName = UpdateData.dealSpcialSymbols(translatedUserNameSb);
        verifyRequestButton.setEnabled(false);
        declineRequestButton.setEnabled(false);
        String bookStatus = (myType == "Borrow")? "Available":"unAvailable";
        String orderStatus = (myType == "Borrow")? "Declined":"InComplete";
        UpdateData.setData("update books set status='"+bookStatus+"' where id='"+bookId+"'", "");
        if(myType == "Borrow"){
            UpdateData.setData("update orders set status='"+orderStatus+"' where id='"+orderId+"'", "Request declined!");
        }else{
            UpdateData.setData("update orders set returnDate='None', status='"+orderStatus+"' where id='"+orderId+"'", "Request Declined!");
        }
        
        ResultSet rs = Select.getData("select *from users where userName='"+translatedUserName+"'");
        try{
            if(rs.next()){
                String email = rs.getString(2);
                String emailTitle = myType + " Request Declined";
                String emailContent = "Dear "+userName+",\nYour request to " + myType.toLowerCase() + " "+bookTitle+" has been declined. \n\nBest wishes,\nZX Library Admin";
                Email.sendEmail(email, emailContent, emailTitle, 2);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        setVisible(false);
        new adminVerifyRequests(myType).setVisible(true);
    }//GEN-LAST:event_declineRequestButtonActionPerformed

    private void orderTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderTableMouseClicked
        int index = orderTable.getSelectedRow();
        TableModel model = orderTable.getModel();
        String stringId = model.getValueAt(index, 2).toString();
        orderId = Integer.parseInt(model.getValueAt(index, 0).toString());
        bookId=Integer.parseInt(stringId);  
        userName = model.getValueAt(index, 1).toString();
        ResultSet rs=Select.getData("select *from books where id='"+bookId+"'");
        try{
            if(rs.next()){
                bookIdData.setText(stringId);
                bookTitle = rs.getString(2);
                bookTitleData.setText(rs.getString(2));
                bookAuthorData.setText(rs.getString(3));
                bookGenreData.setText(rs.getString(4));
                bookPublicationYearData.setText(rs.getString(5));
                bookEditionData.setText(rs.getString(6));
                bookLocation = rs.getString(7);
                bookLocationData.setText(rs.getString(7));
                verifyRequestButton.setEnabled(true);
                declineRequestButton.setEnabled(true);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_orderTableMouseClicked

    public void showData(){
        String status;
        requestTypeOptionInput.setSelectedItem(myType);
        DefaultTableModel model=(DefaultTableModel)orderTable.getModel();
        model.setRowCount(0);
        if(myType.equals("Borrow")){
            status = "Borrow Unverified";
        }else{
            status = "Return Unverified";
        }
        ResultSet rs = Select.getData("select *from orders where status='"+status+"'");
        try{
            while(rs.next()){
                model.addRow(new Object[]{rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6)});
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private void setComponentNames() {
        verifyRequestButton.setName("verifyRequestButton");
        declineRequestButton.setName("declineRequestButton");
    }
    
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
            java.util.logging.Logger.getLogger(adminVerifyRequests.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminVerifyRequests.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminVerifyRequests.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminVerifyRequests.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminVerifyRequests("Borrow").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bookAuthorData;
    private javax.swing.JLabel bookAuthorText;
    private javax.swing.JTextField bookEditionData;
    private javax.swing.JLabel bookEditionText;
    private javax.swing.JTextField bookGenreData;
    private javax.swing.JLabel bookGenreText;
    private javax.swing.JTextField bookIdData;
    private javax.swing.JLabel bookIdText;
    private javax.swing.JTextField bookLocationData;
    private javax.swing.JLabel bookLocationText;
    private javax.swing.JTextField bookPublicationYearData;
    private javax.swing.JLabel bookPublicationYearText;
    private javax.swing.JTextField bookTitleData;
    private javax.swing.JLabel bookTitleText;
    private javax.swing.JButton declineRequestButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable orderTable;
    private javax.swing.JLabel requesTypeChoiceText;
    private javax.swing.JComboBox<String> requestTypeOptionInput;
    private javax.swing.JButton switchButton;
    private javax.swing.JButton verifyRequestButton;
    // End of variables declaration//GEN-END:variables
}
