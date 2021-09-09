/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.sql.ResultSet;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

/**
 *
 * @author Zhengkai Xie
 */
public class Email {
    
    //This method uses the code from https://www.youtube.com/watch?v=BSIPHFvMjGE&t=863s, and therefore should be as a reference to this video.
    public static void sendEmail(String email, String emailContent, String emailTitle, int verifyEmail){
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", 465);
        //Need to make put the email address here
        props.put("mail.smtp.user", "Your Email Address");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.debug", "true");
        props.put("mail.smtp.socketFactory.port", 465);
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.socketFactory.fallback", "false"); 
        try{
            Session session = Session.getDefaultInstance(props, null);
            session.setDebug(true);
            MimeMessage message = new MimeMessage(session);
            message.setText(emailContent);
            message.setSubject(emailTitle);
            //Need to make put the email address here
            message.setFrom(new InternetAddress("Your Email Address"));
            ResultSet rs=Select.getData("select *from users where email='"+email+"'");
            if(verifyEmail == 0 && rs.next()){
                JOptionPane.showMessageDialog(null, "Email is invalid or is already registered!");
                return;
            }else if(verifyEmail == 1 && !rs.next()){
                JOptionPane.showMessageDialog(null, "Email is invalid or is not registered!");
                return;
            }
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(email));
            message.saveChanges();
            Transport transport = session.getTransport("smtp");
            //Need to make put the email id and password here
            transport.connect("smtp.gmail.com", "Your Email ID", "Your Email Password");
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();
            JOptionPane.showMessageDialog(null, "Email is sent!");
            
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);   
        }
    }
    
    //This method uses the code from https://www.youtube.com/watch?v=OOdO785p3Qo&t=194s, and therefore should be as a reference to this video. 
    public static boolean verifyEmailFormat(String email){
        String correctFormat = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
        Pattern emailPattern = Pattern.compile(correctFormat, Pattern.CASE_INSENSITIVE);
        Matcher matcher = emailPattern.matcher(email);
        return matcher.find();
    }
}
