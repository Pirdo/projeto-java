<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%@include file="../../inc/materalizeWeb.inc" %>
    <title>CONSULTAR - Receitas</title>
    <body>
       <div class="container">
       <h1>CONSULTAR Receitas</h1>
       <form name="consultarReceitas" action="validaConsultarReceitas.jsp" method="post">
           Ingredientes: <input type="text" name ="ING" value=""> <br>
           <input type="submit" name ="Enviar" value="Enviar"> <br>
       </form>
       </div>
    </body>
</html>
