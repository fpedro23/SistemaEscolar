<%@ page import="sistemaescolar.Administrador" %>
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
        Administrador[] administradors = (Administrador[]) request.getAttribute("administradors");
        if(administradors != null) {
            for(Administrador administrador : administradors) {
    %>
    $('#edit<%= administrador.getIdAdministrador()%>').submit(
            function (event) {
                event.preventDefault();

                $('#edit<%=administrador.getIdAdministrador()%>').ajaxSubmit(
                        {
                            beforeSend: function () {
                                $('#title').empty().append('Cargando');
                                $('#gimmeContent').empty();
                            },
                            success: function () {
                                $('#title').empty().append('Editar Administrador');
                            },
                            target: '#gimmeContent'
                        }
                );
            }
    );

    $('#delete<%=administrador.getIdAdministrador()%>').submit(
            function (event) {
                event.preventDefault();

                $('#delete<%=administrador.getIdAdministrador()%>').ajaxSubmit(
                        {
                            beforeSend: function () {
                                $('#deleteButton<%=administrador.getIdAdministrador()%>').empty().append('Borrando');
                            },
                            success: function () {
                                var $tr = $('#tr<%= administrador.getIdAdministrador()%>')
                                $tr.fadeOut(500, function () {
                                    $tr.remove();
                                });
                            },
                            error: function () {
                                $('#deleteButton<%=administrador.getIdAdministrador()%>').empty().append('Borrar');
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
        if (administradors == null || administradors.length == 0) {
    %>
    <span><h1 class="error">No hay administradores registrados</h1></span>
    <button onclick="loadPage('Nuevo Administrador','nuevoRegistro.jsp?tipo=Administrador')">Crea uno nuevo</button>
    <%
    } else {
    %>

    <table cellspacing="30">
        <tr>
            <th>Nombre</th>
            <th colspan="2"></th>
        </tr>
        <%
            for (Administrador administrador : administradors) {
        %>
        <tr id="tr<%=administrador.getIdAdministrador()%>">
            <td>
                <%= administrador.getNombreAdministrador()    %>
            </td>
            <td>
                <form action="readAdministradorById.action" method="get" id="edit<%=administrador.getIdAdministrador()%>">
                    <input type="hidden" name="id" value="<%= administrador.getIdAdministrador() %>"/>
                    <input type="hidden" name="tipo" value="Aviso">
                    <button type="submit" name="edit">Editar</button>
                </form>
            </td>
            <td>
                <form action="deleteAdministrador.action" method="get" id="delete<%=administrador.getIdAdministrador()%>">
                    <input type="hidden" name="id" value="<%= administrador.getIdAdministrador() %>"/>
                    <input type="hidden" name="tipo" value="Aviso">
                    <button type="submit" name="delete" id="deleteButton<%=administrador.getIdAdministrador()%>">Borrar</button>
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
