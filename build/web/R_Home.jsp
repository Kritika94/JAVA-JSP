
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link  type=text/css href="hh.css" rel="stylesheet">
        <title>Welcome in Restaurant</title>
    </head>
    <style>
        
             .div2{
    margin-left:0%;
   //position:absolute;
    width:99.1%;
    border:1px solid red;
background:url("images/restaura5.jpg");
    margin-top:0%;
        height:90%;
    text-align: center;
  position:relative;
  z-index:0;
 }  
 
 
 .input{background-color: transparent;
border:none;
font-weight:bolder;

color:white;
text-align:left;}
            
    </style>
    
    
    <body>
        <div id="header">
		
            <b class="header1"><img src="images/FoodieLogo.png" height="200px" style="margin-top:-20%"/></b><br>
            <br>
            <br>
             <br>
              <br>
            <b style="float:left;margin-left:0%; font-size:150%;font-style:italic "class="header2">Happy Cravings....</b>
            <b class="header3">Welcome in Restaurant HomePage</b><br>
            <br>
            <br>
            <br>
            
          <ul>
             <li><a href="#">Menu</a>
	 <ul> <% 
                         String str=null;
                        String str1=null;
                             try{
                                 str1=request.getParameter("valu1");
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/foodie","root","123456");
                
                PreparedStatement st=con.prepareStatement("select M_id,M_type from menu");
                ResultSet rs=st.executeQuery();
                out.println("<div style='z-index:1;position:absolute'>");
                while(rs.next()){
                String res=rs.getString(2);
                int id=rs.getInt(1); 
                out.println("<li><a href='R_Home.jsp?valu="+id+"&valu1="+str1+"'>"+res+"</a></li>");
                }
                         }
                catch(Exception e){}
                             
                             str=request.getParameter("valu");%>
         </div>             
         </ul>
			 </li>
                
			
                        <li><a href="AddNewMenu.jsp?valu1=<%=str1%>">Add New Menu</a></li>
                
                
             
            </ul>
        
                </div>             
    
        <div class="div2" >
           
        
            <%
                   if(str==null)
                   {
                   }
                         
                         else{ 
                       HttpSession sess= request.getSession(true);
                       sess.setAttribute("str1",str1);
                       sess.setAttribute("str",str);
                         
                         
                      //   out.println(str);
                        // out.println(str1);
                       out.println(" <div style='position:relative'><table align='center' style='background:linear-gradient(#7b4397,#dc2430);color:white; width:40%; height:50%; border:2px  solid burlywood; margin-left:35%; margin-top:7%'>");
                
                         try{ 
                          Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/foodie","root","123456");
                
                PreparedStatement st=con.prepareStatement("select item_name,price from items where R_id=? and m_id=?");
                st.setString(1,str1);
                st.setInt(2,Integer.parseInt(str));
               
                ResultSet rs=st.executeQuery();
              
           
                  while(rs.next()){
                  String item_name= rs.getString(1);
                   String price=rs.getString(2);
                   
                out.println("<tr>");
                 out.println("<th width='35%'><input type='text' class='input' readonly value='"+item_name+"'></input></th>");
                 out.println("<th><input type='text' class='input' value="+price+"></th>");
                out.println("<th><a href='UpdateMenu.jsp?valu="+item_name+"&valu1="+price+"' style='color:white'>Update</a></th>");
                 out.println("</tr>");
                     
                  }
                   out.println("</table>");

               }
               catch(Exception e){}
                         finally{}
                         
                         
                         
                         }
                
                
                %>	    
                </div>
        </div>    
    </body>
</html>