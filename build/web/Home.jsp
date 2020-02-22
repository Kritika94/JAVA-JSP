<%-- 
    Document   : Home
    Created on : 29 Dec, 2018, 6:09:11 PM
    Author     : Kritika
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      <link href="newcss.css" rel="stylesheet" type="text/css">
        <title>JSP Page</title>
<style>
   
table{
    font-size:160%;
        width:100%;
        margin-top:10%;
        font-style:oblique;
}
 
 a{color:white;
   text-decoration:none;
     
 }
</style>

     <script>
            function displayNextImage() {
                x = (x === images.length - 1) ? 0 : x + 1;
        document.getElementById("img").src = images[x];
    
  
            }
       

        
 setInterval("displayNextImage()", 10000);
             var images = [], x = -1;
          images[0] = "images/image1.jpg";
          images[1] = "images/image2.jpg";
          images[2] = "images/image3.jpg";
          images[3] = "images/image4.jpg";

          
        
      
      
      
      
      
           
                
            </script>
    
    </head>
    <body>
      
      
       
        <div class="div1">
        
            <b style="float:left; font-size:240%;font-style:oblique"><img src="images/FoodieLogo.png" height="200px" style="margin-top:-20%"/></b><br><br><br><br><br>
            <b style="float:left;margin-left:0%; font-size:150%;font-style:italic">Happy Cravings....</b>
                   
                                              <b style="float:right;margin-right:2%; font-size:130%;">${message} ${user}</b>
                                
                           
                                 
        <table  style="width:70%;;margin-top:7%">
            <tr>
                
             <th> <a href="Home.jsp">Home</a></th>
                <th> <a href="Aboutus.jsp">About us</a></th>
             <th><a href="restaurant.jsp">Restaurants</a></th>
             <th><a href="Contactus.jsp">Contact us </a></th>
               <th><a href="offers.jsp">Offers</th>
               <th><a href="feedback.jsp">Feedback</th>
             <%--th><a href="#">Cart</a></th--%>
            </tr>  
        </table>    
                                  <%
                                             Object m=(String)session.getAttribute("message");
                                             Object u=(String)session.getAttribute("user");
                          session.invalidate();
              
                            
                 
                    %>
                  
                    </div>
        
        <div class="div2">
             
            <picture>
            <img  src="images/image1.jpg" id="img" width="100%"  height=495px;">
            </picture>
        </div>
                                           
                    

        
        
    </body>
</html>
