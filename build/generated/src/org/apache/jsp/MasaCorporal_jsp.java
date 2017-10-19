package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class MasaCorporal_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <h1>Este es un medido de masa corporal</h1>\n");
      out.write("            <form action=\"MasaCorporal.jsp\" method=\"post\">\n");
      out.write("            <label>Ingresa tu peso : </label><br>\n");
      out.write("            <input type=\"text\" name=\"peso\" placeholder=\"kilogramos\" ><br>\n");
      out.write("            <label>Ingresa tu estatura : </label><br>\n");
      out.write("            <input type=\"text\" name=\"altura\"placeholder=\"centimetros \"  ><br>\n");
      out.write("            <input type=\"submit\" value=\"calcular\"><br>\n");
      out.write("        </form>\n");
      out.write("               ");

            String peso = request.getParameter("peso");
            String altura = request.getParameter("altura");
            if (peso != null && peso != null) {
                try {

                    double peso1 = Double.parseDouble(peso);
                    double altura1 = Integer.parseInt(altura);
                    double altura2 = Math.pow(altura1,2);
                    double indice = peso1 /altura2;
                    
                    out.println("<p>Resultado: " + indice+"</p>");
                    out.println("<br>");
                    out.println("<br>");
                    if(indice<18){
                     out.println("<h3>Peso bajo!!. Necesario valorar signos de desnutrición</h3>");
                    }
                    else if(indice>18 && indice<24.9){
                     out.println("<h4>tu IMC es Normal</h4>");
                    }
                    else if(indice>25 && indice<26.9){
                     out.println(" <h3>Sobrepeso!</h3>");
                    }
                    else if(indice>27 && indice<29.9){
                     out.println("<h2>Obesidad grado I.</h2><h4> Riesgo relativo alto para desarrollar enfermedades cardiovasculares<h4>");
                    }
                    else if(indice>30 && indice<39.9){
                     out.println("<h2>Obesidad grado II.</h2> <h4>Riesgo relativo muy alto para el desarrollo de enfermedades cardiovasculares</h4>");
                    }
                     else if(indice>30 ){
                     out.println("<h2> Obesidad grado III Extrema o Mórbida.</h2> <h4>Riesgo relativo extremadamente alto para el desarrollo de enfermedades cardiovasculares</h4>");
                    }

                } catch (NumberFormatException e) {
                    out.println("Introduce datos validos");

                }
            }
        
      out.write("\n");
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
