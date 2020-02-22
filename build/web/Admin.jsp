<%-- 
    Document   : Admin
    Created on : 22 Jun, 2019, 4:11:56 PM
    Author     : Kritika
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file="Home.jsp"%>
<%@ page import= "java.sql.*"%>
<style>
     div{
    margin-left:0%;
   position:absolute;
    width:99.1%;
    border:1px solid red;
  background-image:url("images/image1.jpg");
    margin-top:12%;
        height:73%;
    text-align: center;
 } 
    
    
    
    
</style>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div>
            <h1 style="color:white">License Pending For Approval</h1>
            <table border="1"   style="color:white; width:70% ; margin-left:15%; margin-top:5%" >
            <%  PreparedStatement pslogin=null;
        Connection con=null ;
        ResultSet rs=null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");     
             con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Foodie","root","123456");
              pslogin=con.prepareStatement("select filename, Lisence_url,RId from restaurant where status='pending' ");
                rs=pslogin.executeQuery();
                
                while (rs.next()){
                    String f_name=rs.getString(1);
                    String url=rs.getString(2);
                    String Rid=rs.getString(3);
                       
            
                  out.println("<tr>");
                  out.println("<th width='30%'><form method=Post action='Approval'><input type=Hidden value="+f_name+"><a href='upload/"+f_name+"' target='_blank'>"+f_name+"</a></th>");
                   out.println("<th width='20%'><input type='hidden' value="+Rid+"/>"+Rid+"</th>");
                   out.println("<th width='10%'><input type='checkbox' name='check' value='"+Rid+"' /></th>");
                   out.println("</tr>");
                  
                    
                }
         out.println("<tr><th colspan=3><button>Approve</button></th></tr></form>");
        
        }catch(Exception e){}
          
        finally{
            rs.close();
            pslogin.close();
        con.close();
        }
            %>
            </table><br>
            
        
        
        </div>
    </body>
</html>
