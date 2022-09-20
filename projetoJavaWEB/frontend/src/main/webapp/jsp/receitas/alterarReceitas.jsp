<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="receitas.model.bean.Receitas"%>
<%@page import="receitas.controller.ControllerReceitas"%>

<%
    String cod = request.getParameter("ID");
    int id = Integer.parseInt(cod);
    Receitas rec = new Receitas(id);
    ControllerReceitas pesCont = new ControllerReceitas();
    rec = pesCont.buscar(rec);
    String pbusca = request.getParameter("PBUSCA");
%>

<html>
    <%@include file="../../inc/materalizeWeb.inc" %>
    <title>ALTERAR - Receitas</title>
    <body>
       <div class="container">
       <h1>ALTERAR Receitas</h1>
        <form name="alterarLogradouro" action="validaAlterarReceitas.jsp" method="post">
            Ingredientes: <input type="text" name="ingredientes" value="<%=rec.getIngredientes()%>"> <br>
            Modo de Preparo: <input type="text" name="modoPreparo" value="<%=rec.getModoPreparo()%>"> <br>
            Utensilios: <input type="text" name="utensilios" value="<%=rec.getUtensilios()%>"> <br>
            Rendimento: <input type="text" name="rendimento" value="<%=rec.getRendimento()%>"> <br>
            Tempo de Preparo: <input type="text" name="tempoPreparo" value="<%=rec.getTempoPreparo()%>"> <br>

            <input type="HIDDEN" name="ID" value="<%=rec.getId()%>"> <br>
            <input type="HIDDEN" name="PBUSCA" value="<%=pbusca%>"> <br>
            <input type="submit" name="Enviar" value="OK">
        </form>
        </div>
    </body>
</html>