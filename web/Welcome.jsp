<%-- 
    Document   : welcome
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
 .div{
    margin-left:0%;
   position:absolute;
    width:99.1%;
    border:1px solid red;
  background-image:url("images/image1.jpg");
    margin-top:14%;
        height:73%;
    text-align: center;
 }   
 .alert {
  padding: 20px;
  background-color: #f44336;
  color: white;
}


        
</style>

     <script>
          
            
      
      
      
      
      
           
                
            </script>
    
    </head>
    <body>
      
      
       
        <div class="div1">
        
            <b style="float:left; font-size:240%;font-style:oblique"><img src="images/FoodieLogo.png" height="200px" style="margin-top:-20%"/></b><br><br><br><br><br>
            <b style="float:left;margin-left:0%; font-size:150%;font-style:italic">Happy Cravings....</b>
                   
                                              
                                 
        <table  style="width:70%;;margin-top:7%">
            <tr>
                
                <th> <a href="#" >Home</a></th>
                <th> <a href="#" onclick="alert('Kindly Login or Register')" >About us</a></th>
             <th><a href="#" onclick="alert('Kindly Login or Register')">Restaurants</a></th>
             <th><a href="#" onclick="alert('Kindly Login or Register')">Contact us </a></th>
               <th><a href="#"onclick="alert('Kindly Login or Register')" >Offers</th>
               <th><a href="#" onclick="alert('Kindly Login or Register')">Feedback</th>
             <%--th><a href="#">Cart</a></th--%>
            </tr>  
        </table>    
                  
                    </div>
        
        <div class="div" >
             <div style="border:1px solid burlywood ;color: white; text-align:center; margin-left:14%; margin-top:5%; height:75%; width:70%">
     
       
              
          
          
                   
                             
<center><h1> Craver's Delight Welcomes You !!!</h1>
    <h2><p>Our site offers food from varied cousins. Order and Give us a chance to satisfy your craving. 
	<p>We provide opportunity to restaurants to register themselves with us and grow.
            </p>
            Kindly <a href='Registeruser.jsp' style="color:darkblue ;text-decoration-line:underline;">register</a> Your self to know more. 
           <a href='Login.jsp' style="color:darkblue ;text-decoration-line:underline;"> Login if already Registered.</a>
        </h2>


</div>
            
            
        </div>
                                           
                    

        
        
    </body>
</html>
