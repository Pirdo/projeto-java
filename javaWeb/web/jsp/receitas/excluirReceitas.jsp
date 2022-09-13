<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="receitas.model.bean.Receitas"%>
<%@page import="receitas.controller.ControllerReceitaso"%>

<%
    String cod = request.getParameter("ID");
    int id = Integer.parseInt(cod);
    Receitas rec = new Receitas(id);
    ControllerReceitas pesCont = new ControllerReceitas();
    rec = pesCont.excluir(rec);
    String pbusca = request.getParameter("PBUSCA");
    
    // REDIRECIONA PARA A PAG LOGIN.JSP
    String url = "validaConsultarReceitas.jsp?END=" + pbusca;
    response.sendRedirect(url);
%>