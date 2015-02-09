<%@ page contentType="text/html; ISO-8859-1" language="java" import="com.google.gson.Gson" %>
<%
    Gson gson = new Gson();
    String json = gson.toJson(request.getAttribute("circular"));
    response.getWriter().print(json);
%>