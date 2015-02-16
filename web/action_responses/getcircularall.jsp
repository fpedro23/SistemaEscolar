<%@ page contentType="text/json" import="com.google.gson.Gson" %>
<%@ page import="sistemaescolar.Circular" %>
<%@ page import="com.google.gson.GsonBuilder" %>
<%
    Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
    Circular[] circulars = (Circular[]) request.getAttribute("circulars");

    String json = gson.toJson(circulars);

    response.getWriter().print(json);
%>