<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="receitas.model.bean.Usuario"%>
<%@page import="receitas.model.bean.Receitas"%>
<%@page import="receitas.controller.ControllerReceitas"%>

<%
    String End = request.getParameter("END");
    Receitas recEntrada = new Receitas(End);
    ControllerReceitas contRec = new ControllerReceitas();
    List<Receitas> listarecSaida = contRec.listar(recEntrada);
    Usuario usuLogado = (Usuario) session.getAttribute("UsuarioLogado");
    String url = "PBUSCA=" + Ingredientes+"&ID=" ;
%>

<html>
    <%@include file="../../inc/materalizeWeb.inc" %>
    <title>LISTA PESSOAS</title>
    <body>
        <table class="striped responsive-table">
            <thead>
              <tr>
                  <th data-field="Id">Id</th>
                  <th data-field="ingredientes">Ingredientes</th>
                  <th data-field="modoPreparo">Modo de Preparo</th>
                  <th data-field="utensilios">Utensilios</th>
                  <th data-field="rendimento">Rendimento</th>
                  <th data-field="tempoPreparo">Tempo de Preparo</th>
                  <th data-field="Excluir">Excluir</th>
                  <th data-field="Alterar">Alterar</th>
              </tr>
            </thead>
            <% if (!(listalogSaida.isEmpty())) { %>    
                <tbody>
                    <% for (Logradouro listaLog : listalogSaida) { %>
                        <tr>
                            <td><%=listaRec.getId()%></td>
                            <td><%=listaRec.getIngredientes()%></td>
                            <td><%=listaRec.getModoPreparo()%></td>
                            <td><%=listaRec.getUtensilios()%></td>
                            <td><%=listaRec.getRendimento()%></td>
                            <td><%=listaRec.getTempoPreparo()%></td>
                            <% if (usuLogado.getTipo().equals("ADM")) { %>
                                <td><a href="excluirReceitas.jsp?<%=url + listaRec.getId()%>">Excluir</a></td>
                                <td><a href="alterarReceitas.jsp?<%=url + listaRec.getId()%>">Alterar</a></td>
                            <% } %>
                        </tr>
                    <% } %>
                </tbody>
            <% } %>
        </table>    
    </body>
</html>