package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Calculadora_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 int num1, num2; 

            public void sumar(int a, int b) {
                int c;
                c = a + b;
            }
        

            public void restar(int a, int b) {
                int c;
                c = a - b;
            }
        

            public void multi(int a, int b) {
                int c;
                c = a * b;
            }
        

            public void div(int a, int b) {
                int c;
                c = a / b;
            }
        
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
      out.write("        ");
      out.write("\n");
      out.write("        <h1>Calculadora</h1>\n");
      out.write("        <form action=\"Calculadora.jsp\" method=\"post\">\n");
      out.write("            \n");
      out.write("            <table>\n");
      out.write("\n");
      out.write("                        <tr><th> <input type=\"number\" name=\"num1\"></input> <input type=\"number\" name=\"num2\">\n");
      out.write("                    \n");
      out.write("                        </input> <input type=\"number\" name=\"Resultado\"> ");
 sumar(num1, num2); 
      out.write("</input> </th></tr>\n");
      out.write("                <tr><th> <button type=\"submit\" name = \"BtnMas\" value=\"+\">+</button><button type=\"submit\" name = \"BtnRes\" value=\"-\">-</button></th></tr>\n");
      out.write("                <tr><th> <button type=\"submit\" name = \"BtnMul\" value=\"*\">*</button><button type=\"submit\" name = \"BtnDiv\" value=\"/\">/</button></th></tr>\n");
      out.write("                <tr><th> <button type=\"submit\" name = \"BtnIgual\">=</button></th></tr>\n");
      out.write("\n");
      out.write("        </form>\n");
      out.write("        ");

            String entrada1 = request.getParameter("num1");
            String entrada2 = request.getParameter("num2");
            String btn1 = request.getParameter("BtnMas");
                                out.println(btn1);
            if (entrada1 != null && entrada2 != null) {
                try {

                     num1 = Integer.parseInt(entrada1);
                     num2 = Integer.parseInt(entrada2);
                    
                          
                } catch (NumberFormatException e) {
                    out.println("Introduce datos validos");
                }
            }
        
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("        ");
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
