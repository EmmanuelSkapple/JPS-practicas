<%-- 
    Document   : Calculadora
    Created on : 09-oct-2017, 23:12:37
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
        <h1>Calculadora</h1>
        <form action="Calculadora.jsp" method="post">
            
            <table>

                        <tr><th> <input type="number" name="num1"></input> <input type="number" name="num2">
                    
                   <%
            String entrada1 = request.getParameter("num1");
            String entrada2 = request.getParameter("num2");
            String btn1 = request.getParameter("Btn");
            if (entrada1 != null && entrada2 != null) {
                try {

                     num1 = Integer.parseInt(entrada1);
                     num2 = Integer.parseInt(entrada2);
                    switch(btn1){
                        case "+":
                            out.println("<p>"+sumar(num1,num2)+"</p>"); 
                            break;
                         case "-":
                           out.println("<p>"+restar(num1,num2)+"</p>");                            
                            break;
                         case "/":
                           out.println("<p>"+div(num1,num2)+"</p>");                            
                            break;
                         case "*":
                           out.println("<p>"+multi(num1,num2)+"</p>");                            
                            break;    
                    }
                          
                } catch (NumberFormatException e) {
                    out.println("Introduce datos validos");
                }
            }
        %>
        <%!
            public int sumar(int a, int b) {
                int c;
                c = a + b;
                    return c;
            }
        %>
        <%!
            public int restar(int a, int b) {
                int c;
                c = a - b;
                   return c;
            }
        %>
        <%!
            public int multi(int a, int b) {
                int c;
                c = a * b;
                   return c;
            }
        %>
        <%!
            public int div(int a, int b) {
                int c;
                c = a / b;
                return c;
            }
        %></input> </th></tr>
                <tr><th> <button type="submit" name = "Btn" value="+">+</button><button type="submit" name = "Btn" value="-">-</button></th></tr>
                <tr><th> <button type="submit" name = "Btn" value="*">*</button><button type="submit" name = "Btn" value="/">/</button></th></tr>
                <tr><th> <button type="submit" name = "Btn">=</button></th></tr>

        </form>
       
    </body>
</html>
