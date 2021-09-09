/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Zhengkai Xie
 */
public class TableCreation {
    //This method uses the code from https://www.youtube.com/watch?v=e7Izp5l6VCg, and therefore should be as a reference to this video.
    public static void main(String[] args){
        Connection con=null;
        Statement st=null;
        try{
            con=ConnectionProvider.getCon();
            st=con.createStatement();
            st.executeUpdate("create table users(userName varchar(200), email varchar(200), password varchar(50), securityQuestion varchar(500), answer varchar(200), status varchar(20))");
            st.executeUpdate("create table books(id int, title varchar(200), author varchar(200), genre varchar(200), year varchar(20), edition varchar(20), location varchar(200), description varchar(10000), status varchar(50))");
            st.executeUpdate("create table orders(id int, userName varchar(200), bookId int, borrowDate varchar(50), deadline varchar(50), returnDate varchar(50), status varchar(20))");
            JOptionPane.showMessageDialog(null, "Table Created Successfully");
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        } finally{
            try{
                con.close();
                st.close();
            }catch(Exception e){
                
            }
        }
    }
}
