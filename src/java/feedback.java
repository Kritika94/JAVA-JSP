import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sahil
 */@WebServlet("/feedback")
public class feedback extends HttpServlet  {
     
     
    
         
     
     protected void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException {
         
          
           String a = request.getParameter("Email");
            String b = request.getParameter("Feedback");
             String c = request.getParameter("uid");   
             
         
        
         // response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
      //  out.println(a + b+ c);
      
            
     try
         {
           
           
             
             
             
             
             
             Class.forName("com.mysql.jdbc.Driver");
              
             Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/foodie","root","123456");
              
             PreparedStatement st = con.prepareStatement("insert into feedback(Email,Feedback,C_id) values(?,?,?)");
             
            st.setString(1,a); 
  
          
            st.setString(2,b); 
             
             st.setString(3,c); 
             
          
            st.executeUpdate(); 

            st.close(); 
            con.close(); 
  
            request.setAttribute("Msg", "Thanku For Your Valuable Feedback");
            RequestDispatcher rd=request.getRequestDispatcher("feedback.jsp");
                rd.forward(request, response);
          
        } 
        catch (Exception e) 
        { 
            out.println(e.getMessage());
                      }
     }

    
 }