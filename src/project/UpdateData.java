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
public class UpdateData {
    //This method uses the code from https://www.youtube.com/watch?v=e7Izp5l6VCg, and therefore should be as a reference to this video.
    public static void setData(String Query, String msg){
        Connection con=null;
        Statement st=null;
        try{
            con=ConnectionProvider.getCon();
            st=con.createStatement();
            st.executeUpdate(Query);
            if(!msg.equals("")){
                JOptionPane.showMessageDialog(null,msg);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }finally{
            try{
                
            }catch(Exception e){
                
            }
        }
    }
    
    public static String dealSpcialSymbols(StringBuilder text){
        for(int i=0; i<text.length(); i++){
            if(text.charAt(i)=='\'' || text.charAt(i)=='\"' || text.charAt(i)=='\\'){
                text.insert(i, '\\');
                i += 1;
            }
        }
        return text.toString();
    }
}
