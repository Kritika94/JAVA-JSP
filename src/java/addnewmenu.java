
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
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
 * @author jain
 */@WebServlet(urlPatterns = {"/addnewmenu"})
public class addnewmenu extends HttpServlet  {
     protected void doPost(HttpServletRequest request,HttpServletResponse response)
                throws ServletException, IOException {
            response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String R_id=request.getParameter("R_id");
        int M_id=Integer.parseInt(request.getParameter("select"));
      // out.println(M_id);
         String a = request.getParameter("Item-name");
        //    out.println(a);
        int b = Integer.parseInt(request.getParameter("Price"));
     //   out.println(b);
    try
         {
             Class.forName("com.mysql.jdbc.Driver");
             // Initialize the database 
             Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/foodie","root","123456");
             // Create a SQL query to insert data into demo table 
            // demo table consists of two columns, so two '?' is used 
             PreparedStatement st = con.prepareStatement("insert into items values(?,?,?,?)");
              // For the first parameter, 
            // get the data using request object 
            // st.setStingsets the data to st pointer 
            st.setString(1,R_id);
            st.setInt(2,M_id);
             st.setString(3,a); 
  
            // Same for second parameter 
            st.setInt(4,b); 
            
             //Statement ps = con.createStatement();
            //Execute the insert command using executeUpdate() 
            // to make changes in database 
            st.executeUpdate(); 
  
            // Close all the connections 
            st.close(); 
            con.close(); 
//   out.println("hello restaurant");
  request.setAttribute("message","data updated successfully");
    //out.println("hello kritika1");
         getServletContext().getRequestDispatcher("/AddNewMenu.jsp?valu1="+R_id+"").include(request,response);        
        //RequestDispatcher rd=request.getRequestDispatcher("MIS_HOME.jsp");
        
            // Get a writer pointer  
            // to display the succesful result 
        
            
        } 
        catch (Exception e) 
        { 
            e.printStackTrace(); 
                      }
              }
     }
 