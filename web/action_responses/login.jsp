<%@ page contentType="text/json" import="com.google.gson.Gson" %>
<%@ page import="sistemaescolar.Administrador" %>
<%@ page import="com.google.gson.GsonBuilder" %>
<%
    Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
    Administrador user = (Administrador) request.getAttribute("user");

    if(user != null)
        response.getWriter().print(gson.toJson(user));
    else
        response.getWriter().print("{\"succes\":\"false\"}");
%>