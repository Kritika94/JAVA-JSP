/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Kritika
 */
@WebServlet(urlPatterns = {"/customerreg"})
public class customerreg extends HttpServlet {
String Cname;
    String CCno;
    String type;
    String Cmail;
    String Caddress;
    String CCpwd;
     String Cid; 
  @Override
      protected void doPost(HttpServletRequest request,HttpServletResponse response)
                throws ServletException, IOException {
            response.setContentType("text/html;charset=UTF-8");
        PrintWriter writer = response.getWriter();
        
        type=request.getParameter("type");
        
        Cname=request.getParameter("Cname");
     
    CCno=request.getParameter("CCno");
    
    Cmail=request.getParameter("Cmail");
     Caddress=request.getParameter("Caddress");
 
     CCpwd=request.getParameter("CCpwd");
     Cid=request.getParameter("cid");
     
     
     
      
                  try {
            Class.forName("com.mysql.jdbc.Driver");     
          Connection  conlogin= DriverManager.getConnection("jdbc:mysql://localhost:3306/Foodie","root","123456");  
      
  
     
        
   
/*Random r=new Random();
for(int i=0;i<3;i++){
int n=r.nextInt(10);
   }*/
     
     
                      PreparedStatement  pslogin = conlogin.prepareStatement("insert into Customer values(?,?,?,?,?,?)");
    pslogin.setString(1,Cname);
  
    pslogin.setString(2,CCno);
    pslogin.setString(3,Cmail);
   
    pslogin.setString(4,Caddress);
    pslogin.setString(5,CCpwd);
     pslogin.setString(6,Cid);
    pslogin.executeUpdate(); 
                   conlogin.close();
                    writer.println("hello kritika");
  request.setAttribute("message","Request generated successfully, go to Login please");
     writer.println("hello kritika1");
         getServletContext().getRequestDispatcher("/Customerreg.jsp").include(request,response);        
                  
                  
                  
                  } 

    
        
                
           catch (Exception ex) {
          request.setAttribute("dberror","Sorry!  Sir I am getting following errors. Please check uploading data. May be you can try to same data again upload.<br>"+ex);
            getServletContext().getRequestDispatcher("/Customerreg.jsp").forward(request,response);
            ex.printStackTrace();
        }  finally {            
                }
                
}   }