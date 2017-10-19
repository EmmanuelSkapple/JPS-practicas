<%-- 
    Document   : FtoC
    Created on : 19-oct-2017, 10:50:46
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
        <%! int num1, num2; %>
                <form action="FtoC.jsp" method="post">

                 <tr><th> <input type="number" name="num1"></input> 
                 <button type="submit" name = "Btn" value="F">Fa->Cel</button>  <button type="submit" name = "Btn" value="C">Cel->Fa</button>
                   <%
            String entrada1 = request.getParameter("num1");
            String btn1 = request.getParameter("Btn");
            if (entrada1 != null) {
                try {

                     num1 = Integer.parseInt(entrada1);
                    switch(btn1){
                        case "F":
                            out.println("<p>"+FtoCel(num1)+"</p>"); 
                            break;
                         case "C":
                           out.println("<p>"+CeltoF(num1)+"</p>");                            
                            break;
                      
                    }
                          
                } catch (NumberFormatException e) {
                    out.println("Introduce datos validos");
                }
            }
        %>
        <%!
            public double FtoCel(int a) {
                double c;
                c = (a-32)/1.8000;
                    return c;
            }
        %>
        <%!
            public double CeltoF(int a) {
                double c;
                c = (a*1.8000)+32;
                    return c;
            }
        %>
        </form>
    </body>
</html>
