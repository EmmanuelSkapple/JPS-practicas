<%-- 
    Document   : Multiplicacion
    Created on : 08-oct-2017, 18:56:46
    Author     : emmanuelgarcia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
          <h1>Tablas de multiplicar</h1>
            <form action="Multiplicacion.jsp" method="post">
            <label>De que numero quieres ver la tabla?  </label><br>
            <input type="text" name="numero1"  ><br>
            <label>Hasta que numero quieres ver ? </label><br>
            <input type="text" name="numero2" ><br>
            <input type="submit" value="calcular"><br>
        </form>
               <%
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
        %>
    </body>
</html>
