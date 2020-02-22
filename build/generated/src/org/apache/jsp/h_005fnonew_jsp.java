package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.sql.*;

public final class h_005fnonew_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("        <title>JSP Page</title>\n");
      out.write("     <style>\n");
      out.write("        div {\n");
      out.write("    width: 75%;\n");
      out.write("    height:500px;\n");
      out.write("    \n");
      out.write("        }\n");
      out.write("  .animate-left{\n");
      out.write("    position:relative;animation:animateleft 1.5s}\n");
      out.write("@keyframes animateleft{from{left:-300px;opacity:0} to{left:0px;opacity:1}}\n");
      out.write(".animate-right{\n");
      out.write("    position:relative;animation:animateright 1.5s}\n");
      out.write("@keyframes animateright{from{right:-300px;opacity:0} to{right:0px;opacity:1}}\n");
      out.write("  \n");
      out.write("     p{\n");
      out.write("    color:darkblue; font-family:calibri;font-size:150%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("a{\n");
      out.write("    color:darkblue; font-weight:Bold; text-decoration:none\n");
      out.write("}\n");
      out.write("img{\n");
      out.write("    \n");
      out.write("    height:10%;\n");
      out.write("    width:5%;\n");
      out.write("}\n");
      out.write("     \n");
      out.write("     \n");
      out.write("     \n");
      out.write("     </style>\n");
      out.write("    \n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-color:wheat\">\n");
      out.write("        <a href=\"h_home.jsp\">&nbsp; होम</a>\n");
      out.write("     <center> \n");
      out.write("                <div style=\"border:2px orange solid\"><br>\n");
      out.write("                    <img src=\"image\\announce.png\" class=animate-right style= \"width:10%; height:10%\">\n");
      out.write("                    <b class=\"animate-left \"style=\"color:darkblue; font-family:calibri;font-size:200%;\">नई उद्घोषणा</b><br><br>\n");
      out.write("                    \n");
      out.write("                <div style=\"text-align:left\">\n");
      out.write("                    <p>\n");
      out.write("                     \n");
      out.write("\n");
      out.write("    \n");
      out.write("             \n");
      out.write("               \n");
      out.write("                        <img src=\"image\\finger.gif\"> <b> hello world</b> </a>\n");
      out.write("                    </p>\n");
      out.write("                  \n");
      out.write("                   \n");
      out.write("          \n");
      out.write("                     \n");
      out.write("                   </div>\n");
      out.write("                 \n");
      out.write("                     </div> \n");
      out.write("            </center>\n");
      out.write("      \n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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
