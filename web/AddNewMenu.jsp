<%-- 
    Document   : AddNewMenu
    Created on : 5 May, 2019, 12:15:15 PM
    Author     : jain
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link  type=text/css href="hh.css" rel="stylesheet">
        <title>JSP Page</title>
        
    </head>
    <body>
        
       
    <div style="margin-left:0%;
   position:absolute;
    width:99.5%;
    border:1px solid red;
 background-image: url('images/restaura5.jpg');
    margin-top:0%;
        height:99%;
    text-align: center;">
    <table align='center' style='background:linear-gradient(#7b4397,#dc2430);
           color:white; width:40%; height:50%; margin-left:30%; margin-top:7%;font-weight: bold;'>

    <h1 style='text-align: center;font-family: cursive;margin-left: 3%;'>  ADD  NEW  MENU</h1>
   <form method='post' action="addnewmenu" style="text-align: center;
   padding: 55px;
    color: white;">
    
        
      
             <%  String R_id=request.getParameter("valu1");
    try{
   Class.forName("com.mysql.jdbc.Driver").newInstance();
   Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/foodie","root","123456");

       Statement st = conn.createStatement() ;

       ResultSet rs =st.executeQuery("select M_type,M_id from menu") ;
%>
    <tr style="font-size:160%;font-weight: bold;">
        <td> Add Menu: <select name='select' style='font-size: 25px;margin-left: 30%;'>
        <%  while(rs.next())
        { %>
        <option  value="<%=rs.getString(2)%>"><%= rs.getString(1)%></option>
        <% } %>
            </select></td></tr>
       
    
    
    
    <tr style="font-size:160%;font-weight: bold;">
        <td>
           
            Item-name:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="Item-name" placeholder="enter item name" 
                      style="font-size: 20px;width: 190px; height:40px;" required/><br><br></td></tr>
    <tr style="font-size:160%;font-weight: bold;"><td>
    Price:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="Price" placeholder="enter item price"
                  style="font-size: 20px;width: 190px; height:40px;" required/><br><br></td></tr>
    <tr><td>
            
            <input type='hidden' value='<%=R_id%>' name="R_id"/>
    <button style="font-size: 20px;line-height: 40px; width: 110px;margin: 12px;
            margin-top:10px;text-transform: uppercase;color:white;margin-left: 30%;
            font-weight: bold; background-image: linear-gradient(to right,#f67d3c,purple);">Submit</button></td></tr>
            
   
       

   
</form>
<%
//**Should I input the codes here?**
        }
        catch(Exception e)
        {
             out.println("wrong entry"+e);
        }
%>
<h1 style="color:white">${message}</h1>
</table>
</div>
    </body>
</html>


