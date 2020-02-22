<%-- 
    Document   : Registeruser
    Created on : 5 May, 2019, 7:35:56 PM
    Author     : Kritika
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
 
 <%@include file="Home.jsp"%>
 <style>
    
         .div{
    margin-left:0%;
   position:absolute;
    width:99.1%;
    border:1px solid red;
  background-image:url("images/image1.jpg");
    margin-top:12%;
        height:73%;
    text-align: center;
 }  
         
         table{border:1;
         width:42%;}
     .input
{width:45%;
 -moz-border-radius: 15px;
 border-radius: 18px;
 border:solid 1px darkblue;
 padding:5px;
 font-weight:bolder;
 color:darkorange;
}

  .dropbtn {
  background-color:purple;
  color: white;
  padding: 16px;
  font-size: 16px;
  border: none;
}

.dropdown {
  position: relative;
  display: inline-block;
  
}

.dropdown-content {
  display: none;
  position: absolute;
  background-color: #f1f1f1;
  min-width: 195px;
  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
  z-index: 1;
}

.dropdown-content a {
  color: Black;
  font-weight:bolder;
  padding: 12px 16px;
  text-decoration: none;
  display: block;
}

.dropdown-content a:hover {background-color: #ddd;}

.dropdown:hover .dropdown-content {display: block;}

.dropdown:hover .dropbtn {background-color: #3e8e41;}
 </style>
 
 
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
     <body>
         
       <div class="div">
         
<div class="dropdown"><br><br><br><br><br><br>
  <button class="dropbtn">Select User Type Here</button>
  <div class="dropdown-content">
    <a href="Restaurantreg.jsp">Restaurant</a>
    <a href="Customerreg.jsp">Customer</a>
   
  </div>
</div>

       </div>
                   
                 