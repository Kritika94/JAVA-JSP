package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;

public final class restaurant_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("                                              <b style=\"float:right;margin-right:2%; font-size:130%;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${message}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(' ');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</b>\n");
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
      out.write("               \n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    \n");
      out.write("    <head>\n");
      out.write("        \n");
      out.write("         <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"newcss.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("       <title>Cravers Delight</title>\n");
      out.write("        </head>\n");
      out.write("        \n");
      out.write("        <Style>\n");
      out.write("            \n");
      out.write("            div{\n");
      out.write("    margin-left:0%;\n");
      out.write("   position:absolute;\n");
      out.write("    width:99.1%;\n");
      out.write("    border:1px solid red;\n");
      out.write("  background-image:url(\"images/image1.jpg\");\n");
      out.write("    margin-top:14%;\n");
      out.write("        height:90%;\n");
      out.write("    text-align: center;\n");
      out.write(" }  \n");
      out.write("            \n");
      out.write("        </Style>\n");
      out.write("        <body>\n");
      out.write("        <div>\n");
      out.write("         <br>   <br>  <br> <br>  <br>           \n");
      out.write(" <center>\n");
      out.write("     <table border=\"0\"  style=\"margin-top:-4%; color:white\">\n");
      out.write("\n");
      out.write("            <tr>\n");
      out.write("             ");
  PreparedStatement pslogin;
        Connection conlogin ;
        ResultSet rs;
                try{Class.forName("com.mysql.jdbc.Driver");     
conlogin= DriverManager.getConnection("jdbc:mysql://localhost:3306/Foodie","root","123456");

              pslogin=conlogin.prepareStatement("select Rname,Rid from Restaurant order by Rname");
                rs=pslogin.executeQuery();
                
                while (rs.next()){  
                   String id= rs.getString(2);
                    String name=rs.getString(1);
                out.println("<th><a href='Menushow.jsp?valu1="+id+"'>"+name+"</a></th>");
              
                
             
                
                }
                
                
                
                
                }
                catch(Exception e ){}
               
                
      out.write("    \n");
      out.write("            \n");
      out.write("             ");
      out.write("\n");
      out.write("            </tr>  \n");
      out.write("             <tr>\n");
      out.write("            <th valign=\"top\"> <br>\n");
      out.write("               \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("  <img src=\"images/carnatic cafe.jpg\" width=\"200px\" height=\"135px\" ></img>\n");
      out.write("</th>\n");
      out.write("\n");
      out.write("<th valign=\"top\"><br><img src=\"images/haldiram.jpg\" width=\"200px\" height=\"135px\" ></img>\n");
      out.write("       </th>\n");
      out.write("<th valign=\"top\"><br><img src=\"images/punjabi-zaika.jpg\" width=\"200px\" height=\"135px\" >\n");
      out.write("        \n");
      out.write("<th valign=\"top\"><br><img src=\"images/sagar ratna logo.png\" width=\"200px\" height=\"135px\" >\n");
      out.write("      </th>\n");
      out.write("<th valign=\"top\"><br>  <img src=\"images/veggie-bites-219.png\" width=\"200px\" height=\"248px\" style=\"margin-top:-18%\" ></img></th>\n");
      out.write("       </th>\n");
      out.write("\n");
      out.write("            </tr>\n");
      out.write("        </table> \n");
      out.write("           \n");
      out.write("</center>\n");
      out.write("    <body>\n");
      out.write("      \n");
      out.write("      \n");
      out.write("       \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
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
