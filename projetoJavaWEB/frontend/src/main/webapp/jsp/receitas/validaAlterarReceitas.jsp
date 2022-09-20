<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="receitas.model.bean.Receitas"%>
<%@page import="receitas.controller.ControllerReceitas"%>

<%
    String cod = request.getParameter("ID");
    int id = Integer.parseInt(cod);
    String ingredientes = request.getParameter("ingredientes");
    String modoPreparo = request.getParameter("modoPreparo");
    String utensilios = request.getParameter("utensilios");
    String rendimento = request.getParameter("rendimento");
    String tempoPreparo = request.getParameter("tempoPreparo");
    String pbusca = request.getParameter("PBUSCA");
    Receitas recEntrada = new Receitas(id,ingredientes,modoPreparo,utensilios, rendimento, tempoPreparo);
    ControllerReceitas contRec = new ControllerReceitas();
    Receitas recSaida = contRec.alterar(recEntrada);
    // REDIRECIONA PARA A PAG LOGIN.JSP
    String url = "validaConsultarReceitas.jsp?ingredientes=" + pbusca;
    response.sendRedirect(url);
%>