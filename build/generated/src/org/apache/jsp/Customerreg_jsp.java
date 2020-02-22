package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Customerreg_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
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
                           session.invalidate();
              
                            
                 
                    
      out.write("\n");
      out.write("                  \n");
      out.write("                    </div>\n");
      out.write("        \n");
      out.write("        <div class=\"div2\">\n");
      out.write("             \n");
      out.write("            <picture>\n");
      out.write("            <img  src=\"images/image1.jpg\" id=\"img\" width=\"100%\"  height=495px;\">\n");
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
      out.write("<style>\n");
      out.write("\n");
      out.write("    div{\n");
      out.write("        margin-left:0%;\n");
      out.write("        position:absolute;\n");
      out.write("        width:99.1%;\n");
      out.write("        border:1px solid red;\n");
      out.write("        background-image:url(\"images/image1.jpg\");\n");
      out.write("        margin-top:10%;\n");
      out.write("        height:74.5%;\n");
      out.write("        text-align: center;\n");
      out.write("    }  \n");
      out.write("\n");
      out.write("    table{border:1;\n");
      out.write("          width:42%;}\n");
      out.write("    .input\n");
      out.write("    {width:45%;\n");
      out.write("     -moz-border-radius: 15px;\n");
      out.write("     border-radius: 18px;\n");
      out.write("     border:solid 1px darkblue;\n");
      out.write("     padding:5px;\n");
      out.write("     font-weight:bolder;\n");
      out.write("     color:darkorange;\n");
      out.write("    }\n");
      out.write("    p{ color :red;\n");
      out.write("       font-weight:bolder;\n");
      out.write("       font-family:cursive;\n");
      out.write("       font-size:14px; \n");
      out.write("\n");
      out.write("    }   \n");
      out.write("\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <script>\n");
      out.write("            function match() {\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                var pass = document.getElementById(12).value;\n");
      out.write("                var Cpass = document.getElementById(13).value;\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                if (pass === Cpass) {\n");
      out.write("                    return true;\n");
      out.write("                } else {\n");
      out.write("                    alert(\"password and confirmpassword does not match\");\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </script>>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div>\n");
      out.write("            <form action=\"customerreg\" method=\"post\" id=\"myForm\" onsubmit=\"return match()\" >\n");
      out.write("                <center> <table border=\"1\" width=12% style=\"margin-top:4%\" >\n");
      out.write("                        <tr>  <th> Name of Customer:</th><th><input type=\"text\" name=\"Cname\" id=\"8\" class=\"input\" required/></th>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>  <th> Customer Id:</th><th><input pattern=\"(?=^.{8,}$)((?=.*\\d)|(?=.*\\W+))(?![.\\n])(?=.*[A-Z])(?=.*[a-z]).*$\" type=\"text\" name=\"cid\" id=\"8\" class=\"input\" required onclick=\"this.setCustomValidity(' Username must be a combination of uppercase ,lowerCase and special symbols with min 9 characters')\" oninput=\"this.setCustomValidity('')\"/></th>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr><th> Contact Number:</th><th><input type=\"text\" name=\"CCno\" id=\"9\" value=\"0\" class=\"input\" required/></th>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <th>Email Id:</th><th><input type=\"text\"  name=\"Cmail\" class=\"input\" id=\"10\" required/></th>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <th> Address:</th><th><input type=\"text\" name=\"Caddress\" class=\"input\" id=\"11\" required/></th>\n");
      out.write("                        </tr>\n");
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <th>Password:</th><th><input type=\"password\" name=\"Cpwd\" class=\"input\" id=\"12\" required/></th>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <th>confirm password:</th><th><input type=\"password\" name=\"CCpwd\" class=\"input\" id=\"13\" required/></th>\n");
      out.write("                        </tr>\n");
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <th colspan=\"2\"><input type =\"submit\" value=\"submit\"  class=\"input\" style=\"width:25%\"></th>\n");
      out.write("                        </tr>\n");
      out.write("\n");
      out.write("                </center>\n");
      out.write("                </table>\n");
      out.write("\n");
      out.write("                <h2 style=\"color:white\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${message}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h2>\n");
      out.write("                <h2 style=\"color:white\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dberror}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h2>\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>  \n");
      out.write("    </body>\n");
      out.write("</html>");
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
