<%--
  Created by IntelliJ IDEA.
  User: mng687
  Date: 2/3/15
  Time: 1:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Nuevo registro</title>
    <script type="text/javascript">
        function validateForm() {
            var error     = false;
            var dateRegex = /^\d{1,2}\/\d{1,2}\/\d{4}$/;


            var titulo    = document.forms["registro"]["titulo"].value;
            var fecha     = document.forms["registro"]["fecha"].value;
            var remitente = document.forms["registro"]["remitente"].value;
            var contenido = document.forms["registro"]["contenido"].value;

            if(titulo == null || titulo == "")
                error = true;
            else if(fecha == null || fecha == "" || !fecha.match(dateRegex)) {
                document.getElementById("error").innerHTML = "Formate de Fecha Inv&aacute;lida";
                return false;
            }
            else if(remitente == null || remitente == "")
                error = true;
            else if(contenido == null || contenido == "")
                error = true;

            if(error)
                document.getElementById("error").innerHTML = "Debes llenar todos los campos";

            return !error;
        }
    </script>
</head>
<body>
    <%
        // tipo debe ser: Circular, Event o Aviso
        String tipo = request.getParameter("tipo");
    %>
    <form action="create<%= tipo %>" method="get" name="registro" onsubmit="return validateForm()">
        <table>
            <tr>
                <td>T&iacute;tulo</td>
                <td><input type="text" name="titulo"/></td>
            </tr>
            <tr>
                <td>Fecha</td>
                <td><input type="datetime" name="fecha"/></td>
            </tr>
            <tr>
                <td>Remitente</td>
                <td><input type="text" name="remitente"/></td>
            </tr>
            <tr>
                <td>Contenido</td>
                <td><input type="text" name="contenido"/></td>
            </tr>
        </table>
        <br>
        <input type="submit" value="Enviar"/>
        <h1 id="error"></h1>
    </form>
</body>
</html>
