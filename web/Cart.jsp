<%-- 
    Document   : Cart
    Created on : 17 Jun, 2019, 11:14:02 PM
    Author     : Kritika
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file="Home.jsp"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        <script>
  function remove(){
    var aObj=document.getElementsByTagName('tr');
    var i=aObj.length; 
    var unchecked = [];
 
while(i--) {
    var box =aObj[i].getElementsByTagName('input')[0]; 
    //alert(i);
   // document.write(box);
    if(box.checked) {
        aObj[i].parentNode.removeChild(aObj[i]);
        }
    else {
         
        unchecked.push(box.value);
     
        }
   }
            }
        </script>
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
 }     table{border:1;
         width:22%;
         color:white;
         margin-top:3%; 
         border-color:darkorchid;
 }
            
            
        </style>
    </head>
    <body>
        
        
          <div >
              <h1 style="color:white">Welcome To Cart.....!! Order Your Choice</h1>
        <table border="1"  align="center">
            
            <tr><th style="color:violet">Price & item</th>
               </tr>
               <tbody>
        <%
 String [] values=request.getParameterValues("check");
 ArrayList<String> obj=new ArrayList<String>();
 int j=0;
 for(int i=0;i<values.length;i++)
     
     
 {%>
               
     <tr>
  <th>

 <% obj.add(values[i]);

 out.println(obj.get(i));
%>

 
 </th>
 <th><input type='checkbox'></a></th>
  </tr>
 
 <%j++;}%> 
 
  
        
       
               </tbody>
        </table><br>
        <input type="button" value="Place Order" style="background:linear-gradient(#7b4397,#dc2430); color : white"/>
        <input type="button" value="remove" onclick="remove()" style="background:linear-gradient(#7b4397,#dc2430); color : white"/>
        
          </div>
    </body>
</html>
