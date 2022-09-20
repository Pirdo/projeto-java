<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <%@include file="../../inc/materalizeWeb.inc" %>
    <title>INSERIR - Receitas</title>
    <body>
       <div class="container">
        <h1>INSERIR Receitas</h1>
        <form name="inserirLogradouro" action="validaInserirReceitas.jsp" method="post">
            Ingredientes: <input type="text" name="ingredientes" value=""> <br>
            Modo de Preparo: <input type="text" name="modoPreparo" value=""> <br>
            Utensilios: <input type="text" name="utensilios" value=""> <br>
            Rendimento: <input type="text" name="rendimento" value=""> <br>
            Tempo de Preparo: <input type="text" name="tempoPreparo" value=""> <br>
            <input type="submit" name="Enviar" value="OK">
        </form>
        </div>
    </body>
</html>
