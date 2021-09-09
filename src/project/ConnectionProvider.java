/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author Zhengkai Xie
 */
import java.sql.Connection;
import java.sql.DriverManager;
public class ConnectionProvider {
    //This method uses the code from https://www.youtube.com/watch?v=e7Izp5l6VCg, and therefore should be as a reference to this video.
    public static Connection getCon(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            //url, folder, password
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "your mysql server password");
            return con;
        } catch(Exception e){
            return null;
        }
    }
}
