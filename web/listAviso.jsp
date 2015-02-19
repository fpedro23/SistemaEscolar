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
<script type="text/javascript">
    <%
        Aviso[] avisos = (Aviso[]) request.getAttribute("avisos");
        if(avisos != null) {
            for(Aviso aviso : avisos) {
    %>
    $('#editAviso<%=aviso.getIdCircular()%>').submit(
            function (event) {
                event.preventDefault();

                $('#editAviso<%=aviso.getIdCircular()%>').ajaxSubmit(
                        {
                            beforeSend: function () {
                                $('#title').empty().append('Cargando');
                                $('#gimmeContent').empty();
                            },
                            success: function () {
                                $('#title').empty().append('Editar Circular');
                            },
                            target: '#gimmeContent'
                        }
                );
            }
    );

    $('#deleteAviso<%=aviso.getIdCircular()%>').submit(
            function (event) {
                event.preventDefault();

                $('#deleteAviso<%=aviso.getIdCircular()%>').ajaxSubmit(
                        {
                            beforeSend: function () {
                                $('#deleteButton<%=aviso.getIdCircular()%>').empty().append('Borrando');
                            },
                            success: function () {
                                var $tr = $('#tr<%= aviso.getIdCircular()%>')
                                $tr.fadeOut(1000, function () {
                                    $tr.remove();
                                });
                            },
                            error: function () {
                                $('#deleteButton<%=aviso.getIdCircular()%>').empty().append('Borrar');
                                alert("Hubo un error al borrar");
                            }

                        }
                );
            }
    );
    <%
            }
        }
    %>
</script>
<body>
<div align="center">
    <%
        if (avisos == null || avisos.length == 0) {
    %>
    <span><h1 class="error">No hay avisos registrados</h1></span>
    <button onclick="loadPage('Nuevo Aviso','nuevoRegistroAviso.action')">Crea uno nuevo</button>
    <%
    } else {
    %>

    <table cellspacing="30">
        <tr>
            <th>Título</th>
            <th>Remitente</th>
            <th>Fecha</th>
            <th>Contenido</th>
        </tr>
        <%
            for (Aviso aviso : avisos) {
        %>
        <tr id="tr<%=aviso.getIdCircular()%>">
            <td><%= aviso.getTitulo()    %>
            </td>
            <td><%= aviso.getAdministradoridAdministrador().getNombreAdministrador() %>
            </td>
            <td><%= aviso.getFecha()     %>
            </td>
            <td>
                <div class="circular_content"> <%= aviso.getContenido() %> </div>
            </td>
            <td>
                <form action="readAvisoById.action" method="get" id="editAviso<%=aviso.getIdCircular()%>">
                    <input type="hidden" name="id" value="<%= aviso.getIdCircular() %>"/>
                    <input type="hidden" name="tipo" value="Aviso">
                    <button type="submit" name="edit">Editar</button>
                </form>
            </td>
            <td>
                <form action="deleteAviso.action" method="get" id="deleteAviso<%=aviso.getIdCircular()%>">
                    <input type="hidden" name="id" value="<%= aviso.getIdCircular() %>"/>
                    <input type="hidden" name="tipo" value="Aviso">
                    <button type="submit" name="delete" id="deleteButton<%=aviso.getIdCircular()%>">Borrar</button>
                </form>
            </td>
        </tr>
        <%
            }
        %>
    </table>
    <%
        }
    %>
</div>
</body>
</html>
