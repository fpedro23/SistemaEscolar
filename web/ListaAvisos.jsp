<%--
  Created by IntelliJ IDEA.
  User: mng687
  Date: 1/30/15
  Time: 2:34 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html; charset=UTF-8" language="java" import="com.google.gson.Gson" errorPage="" %>
<%@ page contentType="text/html; charset=UTF-8" language="java" import="sistemaescolar.model.Aviso" errorPage="" %>
<%@ page contentType="text/html; charset=UTF-8" language="java" errorPage="" %>
<%@ page contentType="text/html; charset=UTF-8" language="java" errorPage="" %>

<% Aviso[] listaAvisos = (Aviso[]) request.getAttribute("avisos");
    Gson gson = new Gson();
    String json = gson.toJson(listaAvisos);
%>

<%= json %>