<%-- 
    Document   : Formulario
    Created on : 11-oct-2017, 9:59:15
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
          <form action="success.jsp" method="post">
            Nombre: <input type="text" style="margin-left: 154px" name="Nombre"></input><br/>
            Primer Apellido: <input type="text" style="margin-left: 104px" name="PApellido"></input><br/>
            Segundo Apellido: <input type="text" style="margin-left: 93px" name="SApellido"></input><br/>
            Password: <input type="password" style="margin-left: 146px" name="Password"></input><br/>
            Repita password: <input type="password"style="margin-left: 101px" name="SPassword"></input><br/><hr/>
            Correo electronico: <input type="email" style="margin-left: 87px" name="Email"></input><br/>
            Confirme Correo electronico: <input type="email" style="margin-left: 23px"name="SEmail"></input><br/><hr/>
        Sexo:<br/>
            <input type="radio" name="Sexo" value="Hombre">Hombre</input><br/>
            <input type="radio" name="Sexo" value="Mujer">Mujer</input><br/>
          Aficiones:<br/>
            <input type="radio" name="Aficiones" value="Leer">Leer</input><br/>
            <input type="radio" name="Aficiones" value="Ir al cine">Ir al cine</input><br/><hr/>
          Areas de interes:<br/>
           <select name="Intereses">
                 <option name="Interes" value="Informatica" >Informatica</option>
                 <option name="Interes" value="Derecho" >Derecho</option>
                 <option name="Interes" value="Matematicas" >Matematicas</option>
                  <option name="Interes" value="Fisica" >Fisica</option>
              </select><br/>
             Comentarios:<br/>
            <TextArea name="Comentarios" ></textarea>
            <button type="submit"name="BtnEnviar" >Enviar<button>
       </form>
    </body>
</html>
