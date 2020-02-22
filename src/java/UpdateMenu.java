
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jain
 */
@WebServlet(urlPatterns = {"/UpdateMenu"})
public class UpdateMenu extends HttpServlet  {
    
  @Override
      protected void doPost(HttpServletRequest request,HttpServletResponse response)
                throws ServletException, IOException {
            response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String s=request.getParameter("s");
        String s2=request.getParameter("s2");
        String M_id=request.getParameter("valu1");
        String R_id=request.getParameter("valu");

        try
        {
        
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/foodie","root","123456");
        String sql="Update items set  price=?  where m_id='"+M_id+"' and R_id='"+R_id+"' and item_name='"+s+"'";
     PreparedStatement ps = con.prepareStatement(sql); 
    // ps.setString(1,s);
     ps.setString(1,s2);
     int i = ps.executeUpdate();
     //out.println("alert(\"" +msg+ "\")");
if(i > 0)
{
//    out.println("hello restaurant");
  request.setAttribute("message","data updated successfully");
    //out.println("hello kritika1");
         getServletContext().getRequestDispatcher("/UpdateMenu.jsp?valu1="+s2+"&valu="+s+"").include(request,response);        
        //RequestDispatcher rd=request.getRequestDispatcher("MIS_HOME.jsp");
         
                  }
   
else
{
   request.setAttribute("message","Error occur...Please try again");
    
         getServletContext().getRequestDispatcher("/UpdateMenu.jsp").include(request,response);        
      } 
                }
catch(Exception e)
        {
            request.setAttribute("error", e);
        out.println(e);
}

      }
}
    
    

