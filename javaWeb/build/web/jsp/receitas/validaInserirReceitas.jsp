<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="receitas.model.bean.Receitas"%>
<%@page import="receitas.controller.ControllerReceitas"%>

<%
    String ingredientes = request.getParameter("ingredientes");
    String modoPreparo = request.getParameter("modoPreparo");
    String utensilios = request.getParameter("utensilios");
    String rendimento = request.getParameter("rendimento");
    String tempoPreparo = request.getParameter("tempoPreparo");
    Logradouro logEntrada = new Logradouro(ingredientes,modoPreparo, utensilios, rendimento, tempoPreparo);
    ControllerReceitas contRec = new ControllerReceitas();
    Receitas recSaida = contRec.inserir(recEntrada);
    
    // REDIRECIONA PARA A PAG LOGIN.JSP
    String url = "inserirReceitas.jsp";
    response.sendRedirect(url);
%>

