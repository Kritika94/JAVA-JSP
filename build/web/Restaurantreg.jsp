<%-- 
    Document   : Restaurantreg
    Created on : 5 May, 2019, 8:00:24 PM
    Author     : Kritika
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
 
 <%@include file="Home.jsp"%>
 <style>
    
         div{
    margin-left:0%;
   position:absolute;
    width:99.1%;
    border:1px solid red;
  background-image:url("images/image1.jpg");
    margin-top:12%;
        height:75%;
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
p{ color :red;
   font-weight:bolder;
   font-family:cursive;
   font-size:14px; 
   
}   
     
 </style>
<script>
    function match(){
        
       
        var Rpass=document.getElementById(5).value;          
          var RCpass=document.getElementById(6).value;
      
           if(Rpass===RCpass){
              return true;
            }else {alert("password and confirmpassword does not match");
             return false; 
             
            
        }
    }
       
        
 </script>
 </head>
 <body>
 
  <div>
      <form action="Registerres" method="post" id="myForm" onsubmit="return match()" enctype="multipart/form-data" >
              <center> <table border="1" width=12% style="margin-top:4%" >
          <tr>
               <th> Name of Restaurant:</th><th><input type="text" id="1" name="Rname" class="input" required/></th>
                 </tr>
               <tr ><th>Contact Number:</th><th><input type="text" id="2" name="Rno" value="0" class="input" required/></th>
                 </tr>
               <tr>
                 <th>Email Id:</th><th><input type="text" name="Rmail" id="3" class="input" required/></th>
               </tr>
                <tr>
                 <th> Location:</th><th><input type="text" name="RLocation" id="4" class="input" required/></th>
               </tr>
               
               <tr>
                 <th> Password:</th><th><input type="password" name="Rpwd" id="5" class="input" required/></th>
               </tr>
               <tr>
                 <th>Confirm password:</th><th><input type="password" name="RCpwd" id="6" class="input" required/></th>
               </tr>
               <tr>
                 <th>Food License:</th><th><input type="file" name="Rlicense" id="7" class="input" required/></th>
               </tr>
               
       <tr>
                   <th colspan="2"><input type ="submit" value="submit"  class="input" style="width:25%"></th>
                   </tr>
                  </table>
                   </form>
       <h2 style="color:white">${message1}</h2>
                  <h2 style="color:white">${dberror}</h2>
      
  </div>
      
      