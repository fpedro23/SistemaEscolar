
<%@ page import="sistemaescolar.Aviso" %>
<%--
  Created by IntelliJ IDEA.
  User: mng687
  Date: 2/3/15
  Time: 2:13 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Lista</title>
</head>
<body>
    <table>
        <tr>
            <th>Título</th>
            <th>Remitente</th>
            <th>Fecha</th>
            <th>Contenido</th>
        </tr>
        <%
            for(Aviso aviso: (Aviso[])request.getAttribute("avisos")) {
        %>
            <tr>
                <td> <%= aviso.getTitulo()    %> </td>
                <td> <%= aviso.getRemitente() %> </td>
                <td> <%= aviso.getFecha()     %> </td>
                <td> <%= aviso.getContenido() %> </td>
                <td>
                    <form action="readCircularById" method="get">
                        <input type="hidden" name="id" value="<%= aviso.getIdCircular() %>"/>
                        <input type="hidden" name="tipo" value="Circular">
                        <input type="submit" value="Editar" name="delete"/>
                    </form>
                </td>
                <td>
                    <form action="deleteCircular" method="get">
                        <input type="hidden" name="id" value="<%= aviso.getIdCircular() %>"/>
                        <input type="hidden" name="tipo" value="Circular">
                        <input type="submit" value="Borrar" name="delete"/>
                    </form>
                </td>
            </tr>
        <%
            }
        %>
    </table>
</body>
</html>
