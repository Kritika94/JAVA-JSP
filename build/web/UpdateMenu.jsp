<%-- 
    Document   : UpdateMenu
    Created on : 5 May, 2019, 2:55:50 PM
    Author     : jain
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link  type=text/css href="hh.css" rel="stylesheet">
        <title>JSP Page</title>
    </head>
    <body>
       
           

   
        
        <%String M_id=session.getAttribute("str").toString();
        String R_id=(String)session.getAttribute("str1");
        String s=request.getParameter("valu").toString();
        String s2=request.getParameter("valu1").toString();
        //out.println(M_id);
        //out.println(R_id);
       
        %>
        <div  class="update"> 
            <center><h1 style="margin-top:5%;font-size: 50px;font-weight: bold;
  text-transform: uppercase;font-family:cursive ">Update Menu</h1> 
                <table style="margin-top: 3%; font-size: 30px; color:purple;">
                         
                    
                  <form action="UpdateMenu?valu1=<%=M_id%>&valu=<%=R_id%>" method="Post">
        <tr>
        
            <td font-size="55px">
                Item-name  : <input type="text" name="s" value="<%=s%>" style="font-size:25px;width:55%;text-align: center;"><br><br>
            </td></tr>
        <tr>
            <td font-size="55px">
                Price &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: <input type="text" name ="s2"
                                            value="<%=s2%>" style="font-size: 25px;width:50%;text-align: center;"><br><br>
            </td></tr>
        <tr>
            <td font-size="50px">
                <input type="submit" value="update" style="background-image: linear-gradient(to right,#f67d3c,purple);
   border:none;  width: 120px;margin-top: 5px;font-size: 35px;font-weight: bold;margin-left: 130px">
            </td></tr>
            </form>
         
                          <h1 style="color:white">              ${message}<h1>
                                           
        </table>
       
        

         </div>
    </body>
</html>
