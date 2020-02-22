/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.mail.*;
import javax.mail.internet.*;
import java.util.*;
import javax.mail.Authenticator;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Kritika
 */
@WebServlet(urlPatterns = {"/Approval"})
public class Approval extends HttpServlet {
      String [] values;
 String d_email="kritikamanocha22@gmail.com",
            d_password ="Kritika@2294",//your email password
            d_host = "smtp.gmail.com",
            d_port = "465",
            m_to, // Target email address
            m_subject = "Confirmation",
            m_text =null;
    
     @Override
      protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {PrintWriter out = response.getWriter();
        response.setContentType("text/html;charset=UTF-8");
        try {
           Class.forName("com.mysql.jdbc.Driver");     
Connection conlogin= DriverManager.getConnection("jdbc:mysql://localhost:3306/Foodie","root","123456");  
          values=request.getParameterValues("check");
            for(int i=0;i<values.length;i++)
            {  //out.println(values[i]);
          PreparedStatement  pslogin = conlogin.prepareStatement("update restaurant set status='Approved' where RId='"+values[i]+"'");
 pslogin.executeUpdate();
   pslogin = conlogin.prepareStatement("select Rmail from restaurant where RId='"+values[i]+"'");
 ResultSet rs=pslogin.executeQuery();
 if (rs.next()){m_to=rs.getString(1);}
        Properties props = new Properties();
        props.put("mail.smtp.user", d_email);
        props.put("mail.smtp.host", d_host);
        props.put("mail.smtp.port", d_port);
   props.put("mail.smtp.starttls.enable", "true");
      props.put("mail.smtp.auth", "true");
        //props.put("mail.smtp.debug", "true");
       props.put("mail.smtp.socketFactory.port", d_port);
      props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
      // props.put("mail.smtp.socketFactory.fallback", "false");
        m_text="Congratulations !!! registered successfully ........your id is"+values[i]; 
            Authenticator auth = new SMTPAuthenticator();
            Session session = Session.getInstance(props,auth);     
            MimeMessage msg = new MimeMessage(session);
            msg.setText(m_text);
            msg.setSubject(m_subject);
System.out.println(1);
            msg.setFrom(new InternetAddress(d_email));
            
msg.addRecipient(Message.RecipientType.TO, new InternetAddress(m_to));
            
System.out.println(3);
	Transport.send(msg);
	out.println("<h1 style='color:green'>Message Sent succesfully ... Kindly go back and refresh to approve more</h1>"); 
 
            }
            
conlogin.close();
            
            
            
           
        }catch(Exception e){out.println(e);}
        
        
      
        
        
        
        
        
        
        
        
        
       
    }

      
        private class SMTPAuthenticator extends javax.mail.Authenticator {
        public PasswordAuthentication getPasswordAuthentication() {
            return new PasswordAuthentication(d_email, d_password);
        }
      
        }      
      
    
      
}  
      
      
      
      
      
      
      
      
      
      
      
      

