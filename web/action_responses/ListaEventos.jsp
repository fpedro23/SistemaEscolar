<%@ page contentType="text/json" import="com.google.gson.Gson" %>
<%@ page import="com.google.gson.GsonBuilder" %>
<%
    Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
    String json = gson.toJson(request.getAttribute("eventos"));
    response.getWriter().print(json);
%>

