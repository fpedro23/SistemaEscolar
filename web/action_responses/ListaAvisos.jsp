<%@ page contentType="text/json" import="com.google.gson.Gson" %>
<%
    Gson gson = new Gson();
    String json = gson.toJson(request.getAttribute("avisos"));
    response.getWriter().print(json);
%>

