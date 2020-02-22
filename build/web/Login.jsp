<%-- 
    Document   : logindummy.jsp
    Created on : Jun 7, 2018, 1:49:11 PM
    Author     : DLSOSYSTRAIN2
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
          <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <title>JSP Page</title>
      
        <SCRIPT type="text/javascript">     
          /*     window.history.forward();     
            function noBack() 
            { 
                  window.history.forward();
            }*/ 
        </SCRIPT>
<style type="text/css">/* Remove margins from the 'html' and 'body' tags, and ensure the page takes up full screen height */
html, body {height:100%; margin:0; padding:0;}/* Set the position and dimensions of the background image. */
#page-background {position:fixed; top:0; left:0; width:100%; height:100%;}/* Specify the position and layering for the content that needs to appear in front of the background image. Must have a higher z-index value than the background image. Also add some padding to compensate for removing the margin from the 'html' and 'body' tags. */
#content {position:relative; z-index:1; padding:10px;}

div{ margin-top:11%;

    width:50%;
height:450px;
 //border:2px solid magenta;
 background:cornflowerblue;
  background-position: center;
    background-repeat: no-repeat;
    background-size: cover;
    
}
b{
    color:darkblue;
    font-family:cursive;float:left;
    font-size:18px;
}
.bg {
    /* The image used */
 // background-color:;
      //linear-gradient(#7b4397//,#dc2430);
     background:linear-gradient(#66ccff,#eefefe);
    /* Full height */
    height:75%; 

    /* Center and scale the image nicely */
    background-position: center;
    background-repeat: no-repeat;
    background-size:cover;
    
    
}
.url {
    background-image: url('images/captcha.jpg');
    background-position: 3px 40%;
    background-repeat: no-repeat;
    padding-left: 21px !important;
    width:150px;
}
input
{
  -moz-border-radius: 15px;
 border-radius: 15px;
    border:solid 1px black;
    padding:5px;
  background-color:aliceblue;
    color:Black;
 width: 200px;font-family:initial; font-weight:bolder; font-size:100%;
}
::placeholder {
    color: BLACK;
    opacity: 1;   
} 

:-ms-input-placeholder {
   color:BLACK;
}
p{ color :black;
   font-weight:bolder;
   font-family:cursive;
   font-size:18px; 
}
i{
  color:darkblue;
    
}

</style>
<script type="text/javascript">
    function checkPage()
    {   
      
         var string1 = removeSpaces(document.getElementById('mainCaptcha').value);
         var string2 = removeSpaces(document.getElementById('txtInput').value);
        if(string2==="")
        {
         document.getElementById("err3").innerHTML="Please enter Captcha";
            document.getElementById("txtInput").focus();
            return false;
        }            
        if (string1 === string2){
                       
                      }
                      else{        
                        document.getElementById("err3").innerHTML=" **Invalid Captcha**";
                      // window.location.reload();
                        return false;
                      }     
    }
         function Captcha(){
                     var alpha = new Array
('A','1','B','C','D','E','F','3','G','H','I','J','K','L','M','N','9','O','P','Q','R','S','6','T','U','V','7','W','X','Y','Z','a','b','c','d','e','8','f','g','h','i','j','k','l','m','n','o','p','4','q','r','s','t','u','v','w','2','y','5');
                     var i;
                     for(i=0;i<6;i++){
                       var a = alpha[Math.floor(Math.random() *alpha.length)];
                       var b = alpha[Math.floor(Math.random() * alpha.length)];
                       var c = alpha[Math.floor(Math.random() * alpha.length)];
                       var d = alpha[Math.floor(Math.random() * alpha.length)];
                       var e = alpha[Math.floor(Math.random() * alpha.length)];
                       var f = alpha[Math.floor(Math.random() * alpha.length)];
                       var g = alpha[Math.floor(Math.random() * alpha.length)];
                    } 
                    var code = a + ' ' + b + ' ' + ' ' + c + ' ' + d + ' ' + e + ' '+ f + ' ' + g;
                    document.getElementById("mainCaptcha").value = code;
                  }
                
                  function removeSpaces(string){
                    return string.split(' ').join('');
                  }
</script>
    </head>
    <body onload="Captcha()" class="bg" >
        
    
   
      
       <b style=" margin-left:30%;color:whitesmoke;font-size:400%;font-style:oblique">CraversDelight</b><br>
              <br><br><br>  <b style="color:whitesmoke;margin-left:-10%; font-size:250%;font-style:italic">Happy Cravings....</b>
      
         <center> 
        <div  align="center" width=30%   >
          
            <form action="check" method="post" onsubmit="return checkPage()">
                 
                <table border="0" width="100%" style="margin-left:25%">
                    <tr>  
                <th colspan="2" width="30%"><h1 style="color:white;font-size:50px;  font-family:initial"><img src="images/Staff.png" width=25% height="24%">Login
                       </h1></th>
                        
                    </tr>
                    <tr>
                     <th colspan="2">     
                         <i class="fa fa-user" style="font-size:130%"></i> <input id="username" name="usertxb" placeholder="User Name" pattern="(R[A-z0-9]{6})|(|(A[A-z0-9]{6}))|(?=^.{8,}$)((?=.*\d)|(?=.*\W+))(?![.\n])(?=.*[A-Z])(?=.*[a-z]).*$" onclick="this.setCustomValidity('username does not match required format')" oninput="this.setCustomValidity('')" required="true">
                        <td width="40%">
                    <p id="err1"></p>
                        </td>
                        </tr>
                        <tr>
                      
                     <th colspan="2">     
                    <i class="fa fa-lock" style="font-size:130%"></i>&nbsp;<input id="passtxb" name="passt" class="img" placeholder="Password" type="password" required/>
                     
                        </th>
                        <td>
                    <p id="err2"></p>
                        </td>
                        </tr>
                      <tr>
                        
                        <th colspan="2"> 
             &nbsp;&nbsp; &nbsp;&nbsp;<input type="text" id="mainCaptcha" style="width: 185px;color: black;margin-left:9%;font-family:sans-serif; font-weight:bolder; font-size:120% ; -moz-border-radius: 0px;border-radius:0px;" class="url" readonly/>
                   <img src="images/refresh2.png" width="25px" height="25x" onclick="Captcha()"
                        </th>
                        <td></td>
                    
                    
                        </tr>
                        <tr>
                       
                     <th colspan="2">  
                        <i class="fa fa-key" style="font-size:130%"></i> <input type="text" id="txtInput" placeholder="Enter Captcha"  />
                            
                               
                        </th>
                        <td>
                    <p id="err3"></p>
                        </td>
                        </tr>
                        <tr>
                            <th >
                &nbsp;&nbsp;   &nbsp;&nbsp; <input type="submit" id="submit" value="Log in" style="width:100px;float:right; background:linear-gradient(#66ccff,#eefefe);color:black" ><br>
                            </th> 
                            <th>
                                  <input type="button" style="-moz-border-radius: 15px;
 border-radius: 15px;
 //margin-left:6%;
    border:solid 1px black;
 float:left;
     background:linear-gradient(#66ccff,#eefefe);
    color:Black;
 width: 100px;font-family:initial; font-weight:bolder; font-size:100%"  value= "Register"onclick=location.href="Registeruser.jsp"></h1>
            
                            </th>
                          
                        </tr>
                        
                </table>
                
                
                </form>
    
        
            
                    
            <h1 style="color:white">${error}</h1>
        </div></center>
        
        
    
        
        
        
        
    </body>
</html>
      