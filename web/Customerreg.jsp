<%-- 
    Document   : Customerreg
    Created on : 5 May, 2019, 8:25:43 PM
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
        margin-top:10%;
        height:74.5%;
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



<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script>
            function match() {



                var pass = document.getElementById(12).value;
                var Cpass = document.getElementById(13).value;





                if (pass === Cpass) {
                    return true;
                } else {
                    alert("password and confirmpassword does not match");
                    return false;
                }

            }






        </script>>


    </head>
    <body>

        <div>
            <form action="customerreg" method="post" id="myForm" onsubmit="return match()" >
                <center> <table border="1" width=12% style="margin-top:4%" >
                        <tr>  <th> Name of Customer:</th><th><input type="text" name="Cname" id="8" class="input" required/></th>
                        </tr>
                        <tr>  <th> Customer Id:</th><th><input pattern="(?=^.{8,}$)((?=.*\d)|(?=.*\W+))(?![.\n])(?=.*[A-Z])(?=.*[a-z]).*$" type="text" name="cid" id="8" class="input" required onclick="this.setCustomValidity(' Username must be a combination of uppercase ,lowerCase and special symbols with min 9 characters')" oninput="this.setCustomValidity('')"/></th>
                        </tr>
                        <tr><th> Contact Number:</th><th><input type="text" name="CCno" id="9" value="0" class="input" required/></th>
                        </tr>
                        <tr>
                            <th>Email Id:</th><th><input type="text"  name="Cmail" class="input" id="10" required/></th>
                        </tr>
                        <tr>
                            <th> Address:</th><th><input type="text" name="Caddress" class="input" id="11" required/></th>
                        </tr>

                        <tr>
                            <th>Password:</th><th><input type="password" name="Cpwd" class="input" id="12" required/></th>
                        </tr>
                        <tr>
                            <th>confirm password:</th><th><input type="password" name="CCpwd" class="input" id="13" required/></th>
                        </tr>

                        <tr>
                            <th colspan="2"><input type ="submit" value="submit"  class="input" style="width:25%"></th>
                        </tr>

                </center>
                </table>

                <h2 style="color:white">${message}</h2>
                <h2 style="color:white">${dberror}</h2>
            </form>




        </div>  
    </body>
</html>