
<%-- 
    Document   : feedback.jsp
    Created on : 21 Apr, 2019, 1:01:18 PM
    Author     : Sahil Singh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file="Home.jsp"%>
<!DOCTYPE html>

<html>
    <head>
         <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="newcss.css" rel="stylesheet" type="text/css">
       
        <title>Cravers Delight</title>
        </head>
    <style>
       div{
                font-size:15px;
    
   position:absolute;
    width:99%;
    border:1px solid red;
  background-image:url("images/image1.jpg");
    margin-top:14%;
        height:88%;
    text-align:center;
color:white;
            }  
        </style>
    <body>
       <div style="text-align:center;">
     <center>
<div style="border:1px solid burlywood ;text-align:center; margin-left:14%; margin-top:5%; height:75%; width:70%">
           <h1> Feedback Form</h1>  <br>                
           <form action="feedback" method=post>
<table   style="margin-top:-4%">
<tr>
    <td>UserId:</td>
<td><input type="text" name="uid"></td></br>

</tr>
<tr>
<td>E-mail:</td>
<td><input type="email" name="Email"></td></br>
</tr>
<tr>
    <td>Feedback:</td>
 <td> <textarea rows="8" cols="20" placeholder="Enter feedback" name="Feedback" >

   </textarea>
                   </td>
               </tr>
<tr>
<td></td>
<td><a href="submit.html"><input type="submit" value="Submit"></a></td>
</tr>




</table>
              
           </form>
</center>
           
      <h1>  ${Msg} </h1>   
           
</div>
      

   </body>
   </div>
</html>

