import TestUtils.TestUtils;
import java.awt.event.MouseEvent;
import static java.lang.Thread.sleep;
import java.util.Random;
import org.junit.Test;
import javax.swing.*;
import project.*;
import java.sql.*;
import static org.junit.Assert.assertEquals;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zhengkai Xie
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Tests {
    String bookTitle = "aaaaaa";
    String bookAuthor = "aaaaaa";
    String bookLocation = "aaaaaa";
    String bookDescription = "aaaaaa";
    
    @Test
    public void AtestAddBook(){
        UpdateData.setData("delete from books where title='"+bookTitle+"' and author='"+bookAuthor+"' and location='"+bookLocation+"' and description='"+bookDescription+"'", "");
        try{
            sleep(2000);
        }catch(Exception e){
        }
        adminManageItems manageItems = new adminManageItems();
        manageItems.setVisible(true);
        JTextField bookTitleInput = (JTextField)TestUtils.getChildNamed(manageItems, "bookTitleInput");
        JTextField bookAuthorInput = (JTextField)TestUtils.getChildNamed(manageItems, "bookAuthorInput");
        JComboBox bookGenreInput = (JComboBox)TestUtils.getChildNamed(manageItems, "bookGenreInput");
        JComboBox bookEditionInput = (JComboBox)TestUtils.getChildNamed(manageItems, "bookEditionInput");
        JComboBox bookPublishYearInput = (JComboBox)TestUtils.getChildNamed(manageItems, "bookPublishYearInput");
        JTextField bookLocationInput = (JTextField)TestUtils.getChildNamed(manageItems, "bookLocationInput");
        JTextArea bookDescriptionInput = (JTextArea)TestUtils.getChildNamed(manageItems, "bookDescriptionInput");
        JButton addBookButton = (JButton)TestUtils.getChildNamed(manageItems, "addBookButton");
        
        bookTitleInput.setText(bookTitle);
        
        bookAuthorInput.setText(bookAuthor);
        bookGenreInput.setSelectedItem("History");
        bookEditionInput.setSelectedItem("2");
        bookPublishYearInput.setSelectedItem("2012");
        
        bookLocationInput.setText(bookLocation);
        
        bookDescriptionInput.setText(bookDescription);
        addBookButton.doClick();
        try{
            sleep(2000);
        }catch(Exception e){
        }
        ResultSet rs = Select.getData("select *from books where title='"+bookTitle+"' and author='"+bookAuthor+"' and genre='History' and year='2012' and edition='2' and location='"+bookLocation+"' and description='"+bookDescription+"'");
        boolean expResult = false;
        try{
            expResult = ((rs.next()))? true:false;
        }catch(Exception e){
        }
        assertEquals(expResult, true);
        manageItems.setVisible(false);
    }
    
    @Test
    public void BtestSearchAndBorrow() {
        userBorrow userborrow = new userBorrow("test");
        userborrow.setVisible(true);
        
        JTextField titleSearchInput = (JTextField)TestUtils.getChildNamed(userborrow, "titleSearchInput");
        JTextField authorSearchInput = (JTextField)TestUtils.getChildNamed(userborrow, "authorSearchInput");
        JComboBox genreSearchInput = (JComboBox)TestUtils.getChildNamed(userborrow, "genreSearchInput");
        JComboBox yearSearchInput = (JComboBox)TestUtils.getChildNamed(userborrow, "yearSearchInput");
        JButton searchButton = (JButton)TestUtils.getChildNamed(userborrow, "searchButton");
        JCheckBox titleOptionInput = (JCheckBox)TestUtils.getChildNamed(userborrow, "titleOptionInput");
        JCheckBox authorOptionInput = (JCheckBox)TestUtils.getChildNamed(userborrow, "authorOptionInput");
        JCheckBox genreOptionInput = (JCheckBox)TestUtils.getChildNamed(userborrow, "genreOptionInput");
        JCheckBox yearOptionInput = (JCheckBox)TestUtils.getChildNamed(userborrow, "yearOptionInput");
        JTable bookTable = (JTable)TestUtils.getChildNamed(userborrow, "bookTable");
        JButton borrowButton = (JButton)TestUtils.getChildNamed(userborrow, "borrowButton");
        
        titleOptionInput.setSelected(true);
        authorOptionInput.setSelected(true);
        genreOptionInput.setSelected(true);
        yearOptionInput.setSelected(true);
        
        titleSearchInput.setText(bookTitle);
        authorSearchInput.setText(bookAuthor);
        genreSearchInput.setSelectedItem("History");
        yearSearchInput.setSelectedItem("2012");
        try{
            sleep(2000);
        }catch(Exception e){
        }
        searchButton.doClick();
        try{
            sleep(2000);
        }catch(Exception e){
        }
        int count = bookTable.getModel().getRowCount();
        assertEquals(count, 1);
        
        userborrow.myName = "test";
        ResultSet BookRs = Select.getData("select *from books where title='"+bookTitle+"'");
        boolean updated = false;
        try{
            if(BookRs.next()){
                userborrow.bookId = BookRs.getInt(1);
            }
            System.out.println(userborrow.bookId);
            borrowButton.setEnabled(true);
            borrowButton.doClick();
            sleep(2000);
            BookRs = Select.getData("select *from books where title='"+bookTitle+"' and status='Pending'");
            ResultSet OrderRs = Select.getData("select *from orders where bookId='"+userborrow.bookId+"' and status='Borrow Unverified'");
            if(OrderRs.next() && BookRs.next()){
                updated = true;
            }
        }catch(Exception e){
        }
        assertEquals(updated, true);
        
        
    }
    
    @Test
    public void CtestBorrowDecline(){
        adminVerifyRequests adminverifyrequests = new adminVerifyRequests("Borrow");
        adminverifyrequests.setVisible(true);
        JButton declineRequestButton = (JButton)TestUtils.getChildNamed(adminverifyrequests, "declineRequestButton");
        ResultSet BookRs = Select.getData("select *from books where title='"+bookTitle+"'");
        
        try{
            if(BookRs.next()){
                adminverifyrequests.bookId = BookRs.getInt(1);
            }
            ResultSet OrderRs = Select.getData("select *from orders where bookId='"+adminverifyrequests.bookId+"'");
            if(OrderRs.next()){
                adminverifyrequests.orderId = OrderRs.getInt(1);
            }
        }catch(Exception e){
            
        }
        adminverifyrequests.userName = "test";
        adminverifyrequests.bookLocation = bookLocation;
        adminverifyrequests.bookTitle = bookTitle;
        declineRequestButton.setEnabled(true);
        declineRequestButton.doClick();
        boolean updated = false;
        try{
            sleep(2000);
            BookRs = Select.getData("select *from books where id='"+adminverifyrequests.bookId+"' and status='Available'");
            ResultSet OrderRs = Select.getData("select *from orders where id='"+adminverifyrequests.orderId+"' and status='Declined'");
            if(BookRs.next() && OrderRs.next()){
                updated = true;
            }
        }catch(Exception e){
        }
        assertEquals(updated, true);
        BtestSearchAndBorrow();
    }
    
    @Test
    public void DtestBorrowVerify(){
        adminVerifyRequests adminverifyrequests = new adminVerifyRequests("Borrow");
        adminverifyrequests.setVisible(true);
        JButton verifyRequestButton = (JButton)TestUtils.getChildNamed(adminverifyrequests, "verifyRequestButton");
        ResultSet BookRs = Select.getData("select *from books where title='"+bookTitle+"'");
        
        try{
            if(BookRs.next()){
                adminverifyrequests.bookId = BookRs.getInt(1);
            }
            ResultSet OrderRs = Select.getData("select *from orders where bookId='"+adminverifyrequests.bookId+"'");
            if(OrderRs.next()){
                adminverifyrequests.orderId = OrderRs.getInt(1);
            }
        }catch(Exception e){
            
        }
        adminverifyrequests.userName = "test";
        adminverifyrequests.bookLocation = bookLocation;
        adminverifyrequests.bookTitle = bookTitle;
        verifyRequestButton.setEnabled(true);
        verifyRequestButton.doClick();
        boolean updated = false;
        try{
            sleep(2000);
            BookRs = Select.getData("select *from books where id='"+adminverifyrequests.bookId+"' and status='Unavailable'");
            ResultSet OrderRs = Select.getData("select *from orders where id='"+adminverifyrequests.orderId+"' and status='Incomplete'");
            if(BookRs.next() && OrderRs.next()){
                updated = true;
            }
        }catch(Exception e){
        }
        assertEquals(updated, true);
        
    }
    
    @Test
    public void EtestReturn() {
        userReturn userreturn = new userReturn("test");
        userreturn.setVisible(true);
        JButton returnButton = (JButton)TestUtils.getChildNamed(userreturn, "returnButton");
        ResultSet BookRs = Select.getData("select *from books where title='"+bookTitle+"'");
        
        try{
            if(BookRs.next()){
                userreturn.bookId = BookRs.getInt(1);
            }
            ResultSet OrderRs = Select.getData("select *from orders where bookId='"+userreturn.bookId+"'");
            if(OrderRs.next()){
                userreturn.orderId = OrderRs.getInt(1);
            }
        }catch(Exception e){
            
        }
        boolean updated = false;
        returnButton.setEnabled(true);
        returnButton.doClick();
        try{
            sleep(2000);
            BookRs = Select.getData("select *from books where id='"+userreturn.bookId+"' and status='Pending'");
            ResultSet OrderRs = Select.getData("select *from orders where id='"+userreturn.orderId+"' and status='Return Unverified'");
            if(BookRs.next() && OrderRs.next()){
                updated = true;
            }
        }catch(Exception e){
            
        }
        assertEquals(updated, true);
    }
    
    @Test
    public void FtestReturnDecline() {
        adminVerifyRequests adminverifyrequests = new adminVerifyRequests("Return");
        adminverifyrequests.setVisible(true);
        JButton declineRequestButton = (JButton)TestUtils.getChildNamed(adminverifyrequests, "declineRequestButton");
        ResultSet BookRs = Select.getData("select *from books where title='"+bookTitle+"'");
        
        try{
            if(BookRs.next()){
                adminverifyrequests.bookId = BookRs.getInt(1);
            }
            ResultSet OrderRs = Select.getData("select *from orders where bookId='"+adminverifyrequests.bookId+"'");
            if(OrderRs.next()){
                adminverifyrequests.orderId = OrderRs.getInt(1);
            }
        }catch(Exception e){
            
        }
        adminverifyrequests.userName = "test";
        adminverifyrequests.bookLocation = bookLocation;
        adminverifyrequests.bookTitle = bookTitle;
        boolean updated = false;
        declineRequestButton.setEnabled(true);
        declineRequestButton.doClick();
        try{
            sleep(2000);
            BookRs = Select.getData("select *from books where id='"+adminverifyrequests.bookId+"' and status='Unavailable'");
            ResultSet OrderRs = Select.getData("select *from orders where id='"+adminverifyrequests.orderId+"' and status='Incomplete'");
            if(BookRs.next() && OrderRs.next()){
                updated = true;
            }
        }catch(Exception e){
            
        }
        assertEquals(updated, true);
        EtestReturn();
    }
    
    @Test
    public void GtestReturnVerify() {
        adminVerifyRequests adminverifyrequests = new adminVerifyRequests("Return");
        adminverifyrequests.setVisible(true);
        JButton verifyRequestButton = (JButton)TestUtils.getChildNamed(adminverifyrequests, "verifyRequestButton");
        ResultSet BookRs = Select.getData("select *from books where title='"+bookTitle+"'");
        
        try{
            if(BookRs.next()){
                adminverifyrequests.bookId = BookRs.getInt(1);
            }
            ResultSet OrderRs = Select.getData("select *from orders where bookId='"+adminverifyrequests.bookId+"'");
            if(OrderRs.next()){
                adminverifyrequests.orderId = OrderRs.getInt(1);
            }
        }catch(Exception e){
            
        }
        adminverifyrequests.userName = "test";
        adminverifyrequests.bookLocation = bookLocation;
        adminverifyrequests.bookTitle = bookTitle;
        boolean updated = false;
        verifyRequestButton.setEnabled(true);
        verifyRequestButton.doClick();
        try{
            sleep(2000);
            BookRs = Select.getData("select *from books where id='"+adminverifyrequests.bookId+"' and status='Available'");
            ResultSet OrderRs = Select.getData("select *from orders where id='"+adminverifyrequests.orderId+"' and status='Complete'");
            if(BookRs.next() && OrderRs.next()){
                updated = true;
            }
        }catch(Exception e){
            
        }
        assertEquals(updated, true);
    }
    
    
    
}
