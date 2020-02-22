import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = {"/check"})
public class check extends HttpServlet {
PreparedStatement pslogin;
        Connection conlogin ;
        ResultSet rs;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        response.setContentType("text/html;charset=UTF-8");}
 
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        response.setContentType("text/html;charset=UTF-8"); 
        PrintWriter out = response.getWriter();
        String uservalue=request.getParameter("usertxb");
        String passvalue=request.getParameter("passt");
        Character user=uservalue.charAt(0);
        //tring deptvalue="pp";
        String url=request.getHeader("referer");
        
       // String val="Post";
        
        try {
            Class.forName("com.mysql.jdbc.Driver");     
conlogin= DriverManager.getConnection("jdbc:mysql://localhost:3306/Foodie","root","123456");  
        
if(user.equals('R')){
pslogin = conlogin.prepareStatement("select RID,RCpwd from Restaurant where RID=? and RCpwd=?");
out.println("hello");
            pslogin.setString(1,uservalue);
            pslogin.setString(2,passvalue);
          
             rs=pslogin.executeQuery();
           out.println("hello");  
if(rs.next())
            {  out.println("hello");   
              
               // HttpSession session=request.getSession(false);
                
                
             //   request.setAttribute("url",url);
                //RequestDispatcher rd=request.getRequestDispatcher("MIS_HOME.jsp");
               
                // session.setAttribute("message","welcome!");
                 //session.setAttribute("user",uservalue);
                RequestDispatcher rd=request.getRequestDispatcher("R_Home.jsp?valu1="+uservalue+"");
                rd.forward(request, response);}

            else
            {
                 String error;
                 error="Please enter the correct username and password ! This is not valid username and password.";
                 request.setAttribute("error", error);
                
                 RequestDispatcher rd=request.getRequestDispatcher("Login.jsp");
                 rd.forward(request, response);
            }


}
else if(!user.equals('R')&& !uservalue.equals("Admin11")){
            pslogin = conlogin.prepareStatement("select * from Customer where CID=? and CCpwd=?");

            pslogin.setString(1,uservalue);
            pslogin.setString(2,passvalue);
          
             rs=pslogin.executeQuery();
          if(rs.next())
            {   
              
                HttpSession session=request.getSession(true);
                
                
              //  request.setAttribute("url",url);
                //RequestDispatcher rd=request.getRequestDispatcher("MIS_HOME.jsp");
               
                 session.setAttribute("message","welcome!");
                 session.setAttribute("user",rs.getString(1));
                RequestDispatcher rd=request.getRequestDispatcher("Home.jsp");
                rd.forward(request, response);}



            else
            {
                 String error;
                 error="Please enter the correct username and password ! This is not valid username and password.";
                 request.setAttribute("error", error);
                
                 RequestDispatcher rd=request.getRequestDispatcher("Login.jsp");
                 rd.forward(request, response);
            }
}
else if (uservalue.equals("Admin11")&&(passvalue.equals("admin"))){
 HttpSession session=request.getSession(false);
                
                
                request.setAttribute("url",url);
                //RequestDispatcher rd=request.getRequestDispatcher("MIS_HOME.jsp");
               
             //   session.setAttribute("message","welcome!");
              //  session.setAttribute("user",uservalue);
                RequestDispatcher rd=request.getRequestDispatcher("Admin.jsp");
                rd.forward(request, response);}
else {
                 String error;
                 error="Please enter the correct username and password ! This is not valid username and password.";
                 request.setAttribute("error", error);
                
                 RequestDispatcher rd=request.getRequestDispatcher("Login.jsp");
                 rd.forward(request, response);
            }

conlogin.close();
                    
        } catch (Exception ex) {
            out.print(ex);
        }  finally {            
            out.close();
        }
    }

    
}
