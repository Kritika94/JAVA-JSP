<%-- 
    Document   : Restaurant
    Created on : 21 April, 2019, 6:09:11 PM
    Author     : Sahil Singh
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file="Home.jsp"%>
               
<!DOCTYPE html>
<html>
    
    <head>
        
         <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="newcss.css" rel="stylesheet" type="text/css">
       <title>Cravers Delight</title>
        </head>
        
        <Style>
            
            div{
    margin-left:0%;
   position:absolute;
    width:99.1%;
    border:1px solid red;
  background-image:url("images/image1.jpg");
    margin-top:14%;
        height:90%;
    text-align: center;
 }  
            
        </Style>
        <body>
        <div>
         <br>   <br>  <br> <br>  <br>           
 <center>
     <table border="0"  style="margin-top:-4%; color:white">

            <tr>
             <%  PreparedStatement pslogin;
        Connection conlogin ;
        ResultSet rs;
                try{Class.forName("com.mysql.jdbc.Driver");     
conlogin= DriverManager.getConnection("jdbc:mysql://localhost:3306/Foodie","root","123456");

              pslogin=conlogin.prepareStatement("select Rname,Rid from Restaurant order by Rname");
                rs=pslogin.executeQuery();
                
                while (rs.next()){  
                   String id= rs.getString(2);
                    String name=rs.getString(1);
                out.println("<th><a href='Menushow.jsp?valu1="+id+"'>"+name+"</a></th>");
              
                
             
                
                }
                
                
                
                
                }
                catch(Exception e ){}
               
                %>    
            
             <%--th><a href="#">Cart</a></th--%>
            </tr>  
             <tr>
            <th valign="top"> <br>
               
                
                
                
  <img src="images/carnatic cafe.jpg" width="200px" height="135px" ></img>
</th>

<th valign="top"><br><img src="images/haldiram.jpg" width="200px" height="135px" ></img>
       </th>
<th valign="top"><br><img src="images/punjabi-zaika.jpg" width="200px" height="135px" >
        
<th valign="top"><br><img src="images/sagar ratna logo.png" width="200px" height="135px" >
      </th>
<th valign="top"><br>  <img src="images/veggie-bites-219.png" width="200px" height="248px" style="margin-top:-18%" ></img></th>
       </th>

            </tr>
        </table> 
           
</center>
    <body>
      
      
       
        
        
        
    </body>
</html>
