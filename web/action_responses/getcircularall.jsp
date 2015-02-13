<%@ page contentType="text/json" import="com.google.gson.Gson" %>
<%
    Gson gson = new Gson();
    String json = gson.toJson(request.getAttribute("circulars"));
    response.getWriter().print(json);
%>