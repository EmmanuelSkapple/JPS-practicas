<%-- 
    Document   : MasaCorporal
    Created on : 06-oct-2017, 12:26:50
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
        <h1>Este es un medido de masa corporal</h1>
            <form action="MasaCorporal.jsp" method="post">
            <label>Ingresa tu peso : </label><br>
            <input type="text" name="peso" placeholder="kilogramos" ><br>
            <label>Ingresa tu estatura : </label><br>
            <input type="text" name="altura"placeholder="centimetros "  ><br>
            <input type="submit" value="calcular"><br>
        </form>
               <%
            String peso = request.getParameter("peso");
            String altura = request.getParameter("altura");
            if (peso != null && peso != null) {
                try {

                    double peso1 = Double.parseDouble(peso);
                    double altura1 = Double.parseDouble(altura);
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
        %>
        
        
    </body>
</html>
