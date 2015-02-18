<%@ page import="com.google.gson.Gson" %>
<%@ page import="sistemaescolar.Administrador" %>
<%
    Gson gson = new Gson();
    Administrador user = (Administrador) request.getAttribute("user");

    if(user != null)
        response.getWriter().print(gson.toJson(user));
    else
        response.getWriter().print("{\"succes\":\"false\"}");
%>