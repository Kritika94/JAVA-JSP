<%-- 
    Document   : Menushow
    Created on : 15 Jun, 2019, 1:02:07 PM
    Author     : Kritika
--%>

<%@page import="java.lang.Integer"%>
<%@page import="java.sql.Array"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.util.*"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file="Home.jsp"%>



<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
         
              .div2{
    margin-left:0%;
   position:absolute;
    width:99.1%;
    border:1px solid red;
  background-image:url("images/image1.jpg");
    margin-top:14%;
        height:68%;
    text-align: center;
 }  
            
            
        </style>


    </head>
    <body>
        <div class="div1">
             <b style="float:left; font-size:340%;font-style:oblique">CraversDelight</b><br>
               <br>    <br><b style="float:left;margin-left:-10%; font-size:190%;font-style:italic">Happy Cravings....</b>
                   
                                             
                                
                               
                                <br><br>  
        <table  style="width:70%;;margin-top:7%">
            <tr>
                <% String str=null;
                String str1=null;
                   PreparedStatement pslogin=null;
        Connection conlogin=null ;
        ResultSet rs=null;
                try{ str1=request.getParameter("valu1");
             
        
                Class.forName("com.mysql.jdbc.Driver");     
conlogin= DriverManager.getConnection("jdbc:mysql://localhost:3306/Foodie","root","123456");

              pslogin=conlogin.prepareStatement("select M_type,M_id from Menu");
                rs=pslogin.executeQuery();
                while (rs.next()){
                    
                
                    String name=rs.getString(1);
                    int id=rs.getInt(2);
                out.println("<th><a href='Menushow.jsp?valu1="+str1+"&valu="+id+"'>"+name+"</a></th>");
                 }
                 str=request.getParameter("valu");
               
                              
                
              
                //out.println(str);
               
                
                
                
                %>
               
                
                
                
                    
                
                
                
                
                
                
                
                
                
             
            </tr>  
        </table>    
                     
        </div>
                
                
                <div class="div2">
  
               <%                
                 String item_name=null;
                int price=0;
                 if(str==null){ out.print("<img  src='images/image1.jpg' id='img' width='100%'  height='495px;'>");}
               else{ out.println("<table border=1 align='center' style='color:white; width:40%; height:50%; border:2px  solid burlywood'>");
               out.println("<tr style='color:Pink'><th>Items</th><th>Price (Rupees)</th><th>Select</th></tr>");
                pslogin=conlogin.prepareStatement("select item_name,price from items where R_id=? and M_id=?");
                pslogin.setString(1,str1);
                pslogin.setInt(2,Integer.parseInt(str));
                rs=pslogin.executeQuery();
                
              
                while(rs.next()){
                  item_name= rs.getString(1);
                    price=rs.getInt(2);
                  
                out.println("<tr>");
                 out.println("<th width='35%'><form method=Post action=Cart.jsp><input type=hidden value="+item_name+"/>"+item_name+"</th>");
                 out.println("<th><input type=hidden value="+price+"/>"+price+"</th>");
            
                out.println("<th><input type='checkbox' name='check'  value='"+price+"            "+item_name+"'/></th>");
                
                 out.println("</tr>");
               
               }
               
                out.println("<tr><th colspan=3><button>Add to Cart</button></th></tr></form>");
               }
                
                }
                catch(Exception e){}
               finally{rs.close();
                    pslogin.close();
               
                conlogin.close();
                
                } 
                
                
                %>
                
                </table>
                
                
                
                
                
                
                
                
               
                
                
                </div>
                
                
    </body>
</html>
