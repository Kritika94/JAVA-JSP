package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/Home.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(" \n");
      out.write(" ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("      <link href=\"newcss.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("<style>\n");
      out.write("   \n");
      out.write("table{\n");
      out.write("    font-size:160%;\n");
      out.write("        width:100%;\n");
      out.write("        margin-top:10%;\n");
      out.write("        font-style:oblique;\n");
      out.write("}\n");
      out.write(" \n");
      out.write(" a{color:white;\n");
      out.write("   text-decoration:none;\n");
      out.write("     \n");
      out.write(" }\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("     <script>\n");
      out.write("            function displayNextImage() {\n");
      out.write("                x = (x === images.length - 1) ? 0 : x + 1;\n");
      out.write("        document.getElementById(\"img\").src = images[x];\n");
      out.write("    \n");
      out.write("  \n");
      out.write("            }\n");
      out.write("       \n");
      out.write("\n");
      out.write("        \n");
      out.write(" setInterval(\"displayNextImage()\", 10000);\n");
      out.write("             var images = [], x = -1;\n");
      out.write("          images[0] = \"images/image1.jpg\";\n");
      out.write("          images[1] = \"images/image2.jpg\";\n");
      out.write("          images[2] = \"images/image3.jpg\";\n");
      out.write("          images[3] = \"images/image4.jpg\";\n");
      out.write("\n");
      out.write("          \n");
      out.write("        \n");
      out.write("      \n");
      out.write("      \n");
      out.write("      \n");
      out.write("      \n");
      out.write("      \n");
      out.write("           \n");
      out.write("                \n");
      out.write("            </script>\n");
      out.write("    \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("      \n");
      out.write("      \n");
      out.write("       \n");
      out.write("        <div class=\"div1\">\n");
      out.write("        \n");
      out.write("          <b style=\"float:left; font-size:340%;font-style:oblique\">CraversDelight</b><br>\n");
      out.write("               <br>    <br><b style=\"float:left;margin-left:-10%; font-size:190%;font-style:italic\">Happy Cravings....</b>\n");
      out.write("                   \n");
      out.write("                                              ");
      out.write("\n");
      out.write("                                \n");
      out.write("                               \n");
      out.write("                                <br><br>  \n");
      out.write("        <table  style=\"width:70%;;margin-top:7%\">\n");
      out.write("            <tr>\n");
      out.write("                \n");
      out.write("             <th> <a href=\"Home.jsp\">Home</a></th>\n");
      out.write("                <th> <a href=\"Aboutus.jsp\">About us</a></th>\n");
      out.write("             <th><a href=\"restaurant.jsp\">Restaurants</a></th>\n");
      out.write("             <th><a href=\"Contactus.jsp\">Contact us </a></th>\n");
      out.write("               <th><a href=\"offers.jsp\">Offers</th>\n");
      out.write("               <th><a href=\"feedback.jsp\">Feedback</th>\n");
      out.write("             ");
      out.write("\n");
      out.write("            </tr>  \n");
      out.write("        </table>    \n");
      out.write("                                  ");

                                             Object m=(String)session.getAttribute("message");
                                             Object u=(String)session.getAttribute("user");
                           
              
                            
                 
                    
      out.write("\n");
      out.write("                  \n");
      out.write("                    </div>\n");
      out.write("        \n");
      out.write("        <div class=\"div2\">\n");
      out.write("             \n");
      out.write("            <picture>\n");
      out.write("            <img  src=\"images/image1.jpg\" id=\"img\" width=\"100%\"  height=520px;\">\n");
      out.write("            </picture>\n");
      out.write("        </div>\n");
      out.write("                                           \n");
      out.write("                    \n");
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write(" <style>\n");
      out.write("    \n");
      out.write("         div{\n");
      out.write("    margin-left:0%;\n");
      out.write("   position:absolute;\n");
      out.write("    width:99.1%;\n");
      out.write("    border:1px solid red;\n");
      out.write("  background-image:url(\"images/image1.jpg\");\n");
      out.write("    margin-top:12%;\n");
      out.write("        height:75%;\n");
      out.write("    text-align: center;\n");
      out.write(" }  \n");
      out.write("         \n");
      out.write("         table{border:1;\n");
      out.write("         width:42%;}\n");
      out.write("     .input\n");
      out.write("{width:45%;\n");
      out.write(" -moz-border-radius: 15px;\n");
      out.write(" border-radius: 18px;\n");
      out.write(" border:solid 1px darkblue;\n");
      out.write(" padding:5px;\n");
      out.write(" font-weight:bolder;\n");
      out.write(" color:darkorange;\n");
      out.write("}\n");
      out.write("p{ color :red;\n");
      out.write("   font-weight:bolder;\n");
      out.write("   font-family:cursive;\n");
      out.write("   font-size:14px; \n");
      out.write("   \n");
      out.write("}   \n");
      out.write("     \n");
      out.write(" </style>\n");
      out.write(" \n");
      out.write(" \n");
      out.write(" \n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <script>\n");
      out.write("         function check(){\n");
      out.write(" var i =document.getElementById(\"sel\").value;\n");
      out.write("\n");
      out.write("     if(i==1){\n");
      out.write("         document.getElementById(\"myForm\").enctype = \"multipart/form-data\";\n");
      out.write("     //  \n");
      out.write("          //document.getElementsByTagName(\"TR\")[1].removeAttribute(\"hidden\"); \n");
      out.write("         document.getElementsByTagName(\"TR\")[2].removeAttribute(\"hidden\"); \n");
      out.write("         document.getElementsByTagName(\"TR\")[3].removeAttribute(\"hidden\"); \n");
      out.write("         document.getElementsByTagName(\"TR\")[4].removeAttribute(\"hidden\"); \n");
      out.write("         document.getElementsByTagName(\"TR\")[5].removeAttribute(\"hidden\"); \n");
      out.write("      \n");
      out.write("        document.getElementsByTagName(\"TR\")[6].removeAttribute(\"hidden\"); \n");
      out.write("        document.getElementsByTagName(\"TR\")[7].removeAttribute(\"hidden\"); \n");
      out.write("         document.getElementsByTagName(\"TR\")[8].removeAttribute(\"hidden\"); \n");
      out.write("         document.getElementById(1).setAttribute(\"Required\",true);\n");
      out.write("         document.getElementById(2).setAttribute(\"Required\",true);\n");
      out.write("        document.getElementById(3).setAttribute(\"Required\",true);\n");
      out.write("         document.getElementById(4).setAttribute(\"Required\",true);\n");
      out.write("          document.getElementById(5).setAttribute(\"Required\",true);\n");
      out.write("                   document.getElementById(6).setAttribute(\"Required\",true);\n");
      out.write("                    document.getElementById(7).setAttribute(\"Required\",true);\n");
      out.write("\n");
      out.write("           document.getElementById(8).removeAttribute(\"Required\");\n");
      out.write("         document.getElementById(9).removeAttribute(\"Required\");\n");
      out.write("        document.getElementById(10).removeAttribute(\"Required\");\n");
      out.write("         document.getElementById(11).removeAttribute(\"Required\");\n");
      out.write("          document.getElementById(12).removeAttribute(\"Required\");\n");
      out.write("                   document.getElementById(13).removeAttribute(\"Required\");\n");
      out.write("\n");
      out.write("         \n");
      out.write("         \n");
      out.write("          document.getElementsByTagName(\"TR\")[9].setAttribute(\"hidden\",true); \n");
      out.write("         document.getElementsByTagName(\"TR\")[10].setAttribute(\"hidden\",true); \n");
      out.write("         document.getElementsByTagName(\"TR\")[11].setAttribute(\"hidden\",true); \n");
      out.write("     \n");
      out.write("        document.getElementsByTagName(\"TR\")[12].setAttribute(\"hidden\",true); \n");
      out.write("         document.getElementsByTagName(\"TR\")[13].setAttribute(\"hidden\",true); \n");
      out.write("        document.getElementsByTagName(\"TR\")[14].setAttribute(\"hidden\",true); \n");
      out.write("          \n");
      out.write("         \n");
      out.write("         \n");
      out.write("    }\n");
      out.write("          if(i==2){\n");
      out.write("       //document.getElementById(\"myForm\").enctype=\"application/x-www-form-urlencoded\";\n");
      out.write("         document.getElementsByTagName(\"TR\")[9].removeAttribute(\"hidden\"); \n");
      out.write("         document.getElementsByTagName(\"TR\")[10].removeAttribute(\"hidden\"); \n");
      out.write("         document.getElementsByTagName(\"TR\")[11].removeAttribute(\"hidden\"); \n");
      out.write("     \n");
      out.write("        document.getElementsByTagName(\"TR\")[12].removeAttribute(\"hidden\"); \n");
      out.write("         document.getElementsByTagName(\"TR\")[13].removeAttribute(\"hidden\"); \n");
      out.write("                document.getElementsByTagName(\"TR\")[14].removeAttribute(\"hidden\"); \n");
      out.write("             \n");
      out.write("         document.getElementsByTagName(\"TR\")[2].setAttribute(\"hidden\",true); \n");
      out.write("         document.getElementsByTagName(\"TR\")[3].setAttribute(\"hidden\", true); \n");
      out.write("         document.getElementsByTagName(\"TR\")[4].setAttribute(\"hidden\",true); \n");
      out.write("         document.getElementsByTagName(\"TR\")[5].setAttribute(\"hidden\",true); \n");
      out.write("     \n");
      out.write("        document.getElementsByTagName(\"TR\")[6].setAttribute(\"hidden\",true); \n");
      out.write("        document.getElementsByTagName(\"TR\")[7].setAttribute(\"hidden\",true); \n");
      out.write("         document.getElementsByTagName(\"TR\")[8].setAttribute(\"hidden\",true); \n");
      out.write("          \n");
      out.write("           document.getElementById(8).setAttribute(\"Required\",true);\n");
      out.write("         document.getElementById(9).setAttribute(\"Required\",true);\n");
      out.write("        document.getElementById(10).setAttribute(\"Required\",true);\n");
      out.write("         document.getElementById(11).setAttribute(\"Required\",true);\n");
      out.write("          document.getElementById(12).setAttribute(\"Required\",true);\n");
      out.write("                   document.getElementById(13).setAttribute(\"Required\",true);\n");
      out.write("                 \n");
      out.write("\n");
      out.write("           document.getElementById(1).removeAttribute(\"Required\");\n");
      out.write("         document.getElementById(2).removeAttribute(\"Required\");\n");
      out.write("        document.getElementById(3).removeAttribute(\"Required\");\n");
      out.write("         document.getElementById(4).removeAttribute(\"Required\");\n");
      out.write("          document.getElementById(5).removeAttribute(\"Required\");\n");
      out.write("                   document.getElementById(6).removeAttribute(\"Required\",true);\n");
      out.write("document.getElementById(7).removeAttribute(\"Required\",true);\n");
      out.write("           \n");
      out.write("          \n");
      out.write("          \n");
      out.write("         \n");
      out.write("          \n");
      out.write("    }\n");
      out.write("        \n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    function match(){\n");
      out.write("        \n");
      out.write("        var i=document.getElementById(\"sel\").value;\n");
      out.write("        var Rpass=document.getElementById(5).value;          \n");
      out.write("          var RCpass=document.getElementById(6).value;\n");
      out.write("        var pass=document.getElementById(12).value;          \n");
      out.write("          var Cpass=document.getElementById(13).value;\n");
      out.write("        if(i==1){   if(Rpass===RCpass){\n");
      out.write("              return true;\n");
      out.write("            }else {alert(\"password and confirmpassword does not match\");\n");
      out.write("             return false; \n");
      out.write("             \n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("       \n");
      out.write("        if(i==2){\n");
      out.write("            \n");
      out.write("             if(pass===Cpass){\n");
      out.write("              return true;\n");
      out.write("            }else {alert(\"password and confirmpassword does not match\");\n");
      out.write("             return false; \n");
      out.write("            }\n");
      out.write("            \n");
      out.write("        \n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("   \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </script>\n");
      out.write("    <body>\n");
      out.write("         \n");
      out.write("       <div>\n");
      out.write("           <form action=\"register1\" method=\"post\" id=\"myForm\" onsubmit=\"return match()\" >\n");
      out.write("              <center> <table border=\"1\" width=12% style=\"margin-top:4%\" >\n");
      out.write("          <tr>\n");
      out.write("                 <th>\n");
      out.write("                 User Category:</th>\n");
      out.write("                 <th> \n");
      out.write("                     <select name=\"type\" class=\"input\" id=\"sel\" onchange=\"check()\">\n");
      out.write("                 <option>select</option>\n");
      out.write("                  <option value=\"1\">Restaurant</option>\n");
      out.write("                  <option value=\"2\">Customer</option>  \n");
      out.write("                 \n");
      out.write("                  </select>\n");
      out.write("                  </th>\n");
      out.write("                 </tr>\n");
      out.write("                 \n");
      out.write("                      <tr hidden >\n");
      out.write("                 <th> Name of Restaurant:</th><th><input type=\"text\" id=\"1\" name=\"Rname\" class=\"input\"/></th>\n");
      out.write("                 </tr>\n");
      out.write("               <tr hidden><th> Contact Number:</th><th><input type=\"text\" id=\"2\" name=\"Rno\" value=\"0\" class=\"input\"/></th>\n");
      out.write("                 </tr>\n");
      out.write("               <tr hidden>\n");
      out.write("                 <th>Email Id:</th><th><input type=\"text\" name=\"Rmail\" id=\"3\" class=\"input\"/></th>\n");
      out.write("               </tr>\n");
      out.write("                <tr hidden>\n");
      out.write("                 <th> Location:</th><th><input type=\"text\" name=\"RLocation\" id=\"4\" class=\"input\"/></th>\n");
      out.write("               </tr>\n");
      out.write("               \n");
      out.write("               <tr hidden>\n");
      out.write("                 <th> password:</th><th><input type=\"password\" name=\"Rpwd\" id=\"5\" class=\"input\"/></th>\n");
      out.write("               </tr>\n");
      out.write("               <tr hidden>\n");
      out.write("                 <th>confirm password:</th><th><input type=\"password\" name=\"RCpwd\" id=\"6\" class=\"input\"/></th>\n");
      out.write("               </tr>\n");
      out.write("               <tr hidden>\n");
      out.write("                 <th>Food License:</th><th><input type=\"file\" name=\"Rlicense\" id=\"7\" class=\"input\"/></th>\n");
      out.write("               </tr>\n");
      out.write("               \n");
      out.write("               \n");
      out.write("             \n");
      out.write("               \n");
      out.write("                <tr hidden>\n");
      out.write("                 <th> Name of Customer:</th><th><input type=\"text\" name=\"Cname\" id=\"8\" class=\"input\"/></th>\n");
      out.write("                 </tr>\n");
      out.write("               <tr hidden><th> Contact Number:</th><th><input type=\"text\" name=\"CCno\" id=\"9\" value=\"0\" class=\"input\"/></th>\n");
      out.write("                 </tr>\n");
      out.write("               <tr hidden>\n");
      out.write("                 <th>Email Id:</th><th><input type=\"text\"  name=\"Cmail\" class=\"input\" id=\"10\"/></th>\n");
      out.write("               </tr>\n");
      out.write("                <tr hidden>\n");
      out.write("                 <th> Address:</th><th><input type=\"text\" name=\"Caddress\" class=\"input\" id=\"11\"/></th>\n");
      out.write("               </tr>\n");
      out.write("               \n");
      out.write("               <tr hidden>\n");
      out.write("                 <th>Password:</th><th><input type=\"password\" name=\"Cpwd\" class=\"input\" id=\"12\"/></th>\n");
      out.write("               </tr>\n");
      out.write("               <tr hidden>\n");
      out.write("                 <th>confirm password:</th><th><input type=\"password\" name=\"CCpwd\" class=\"input\" id=\"13\"/></th>\n");
      out.write("               </tr>\n");
      out.write("               \n");
      out.write("               <tr>\n");
      out.write("                   <th colspan=\"2\"><input type =\"submit\" value=\"submit\"  class=\"input\" style=\"width:25%\"></th>\n");
      out.write("                   </tr>\n");
      out.write("               \n");
      out.write("                 </center>\n");
      out.write("                  </table>\n");
      out.write("              \n");
      out.write("                 <h2 style=\"color:white\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${message}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h2>\n");
      out.write("                  <h2 style=\"color:white\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dberror}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h2>\n");
      out.write("           </form>\n");
      out.write("           \n");
      out.write("          \n");
      out.write("           \n");
      out.write("           \n");
      out.write("       </div>  \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
