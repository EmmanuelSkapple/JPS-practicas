package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Multiplicacion_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("          <h1>Tablas de multiplicar</h1>\n");
      out.write("            <form action=\"Multiplicacion.jsp\" method=\"post\">\n");
      out.write("            <label>De que numero quieres ver la tabla?  </label><br>\n");
      out.write("            <input type=\"text\" name=\"numero1\"  ><br>\n");
      out.write("            <label>Hasta que numero quieres ver ? </label><br>\n");
      out.write("            <input type=\"text\" name=\"numero2\" ><br>\n");
      out.write("            <input type=\"submit\" value=\"calcular\"><br>\n");
      out.write("        </form>\n");
      out.write("               ");

            String num1 = request.getParameter("numero1");
            String num2 = request.getParameter("numero2");
            if (num1 != null && num2 != null) {
                try {

                    int tabla = Integer.parseInt(num1);
                    int ext = Integer.parseInt(num2);
                    out.println("<table>");
                    for(int i=0; i<=ext;i++){
                    out.println("<tr><th>Resultado: " +tabla+" x "+i+" = "+"</th><th>"+tabla*i +"</th></tr>");

                    }
                    out.println("</table>");
                } catch (NumberFormatException e) {
                    out.println("Introduce datos validos");

                }
            }
        
      out.write("\n");
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
