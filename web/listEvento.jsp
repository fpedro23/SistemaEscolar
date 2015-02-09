<%@ page import="sistemaescolar.model.Evento" %>
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
        <script type="text/javascript">
            <%
                Evento[] eventos = (Evento[]) request.getAttribute("eventos");
                if(eventos != null) {
                    for(Evento evento : eventos) {
            %>
            $('#editEvento<%=evento.getIdCircular()%>').submit(
                    function(event) {
                        event.preventDefault();

                        $('#editEvento<%=evento.getIdCircular()%>').ajaxSubmit(
                                {
                                    beforeSend: function() {
                                        $('#title').empty().append('Cargando');
                                        $('#gimmeContent').empty();
                                    },
                                    success: function() {
                                        $('#title').empty().append('Editar Circular');
                                    },
                                    target: '#gimmeContent'
                                }
                        );
                    }

            );

            $('#deleteEvento<%=evento.getIdCircular()%>').submit(
                    function(event) {
                        event.preventDefault();

                        $('#deleteEvento<%=evento.getIdCircular()%>').ajaxSubmit(
                                {
                                    beforeSend: function() {
                                        $('#deleteButton<%=evento.getIdCircular()%>').empty().append('Borrando');
                                    },
                                    success: function() {
                                        var $tr = $('#tr<%= evento.getIdCircular()%>')
                                        $tr.fadeOut(1000, function() {
                                            $tr.remove();
                                        });
                                    },
                                    error: function() {
                                        $('#deleteButton<%=evento.getIdCircular()%>').empty().append('Borrar');
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
    </head>
    <body>
        <div align="center">
            <%
                if(eventos == null || eventos.length == 0) {
            %>
                    <span><h1 class="error">No hay Eventos registrados</h1></span>
                    <button onclick="loadPage('Nuevo Evento', 'nuevoRegistro.jsp?tipo=Event')">Crear uno nuevo</button>
            <%
                }
                else {
            %>
                    <table cellspacing="30">
                        <tr>
                            <th>Título</th>
                            <th>Remitente</th>
                            <th>Fecha</th>
                            <th>Contenido</th>
                        </tr>
                        <%
                            for (Evento evento : (Evento[]) request.getAttribute("eventos")) {
                        %>
                        <tr id="tr<%=evento.getIdCircular()%>">
                            <td><%= evento.getTitulo()    %>
                            </td>
                            <td><%= evento.getRemitente() %>
                            </td>
                            <td><%= evento.getFecha()     %>
                            </td>
                            <td><%= evento.getContenido() %>
                            </td>
                            <td>
                                <form action="readEventById.action" method="get" id="editEvento<%=evento.getIdCircular()%>">
                                    <input type="hidden" name="id" value="<%= evento.getIdCircular() %>"/>
                                    <input type="hidden" name="tipo" value="Event">
                                    <button type="submit" name="edit">Editar</button>
                                </form>
                            </td>
                            <td>
                                <form action="deleteEvent.action" method="get" id="deleteEvento<%=evento.getIdCircular()%>">
                                    <input type="hidden" name="id" value="<%= evento.getIdCircular() %>"/>
                                    <input type="hidden" name="tipo" value="Circular">
                                    <button type="submit" name="delete" id="deleteButton<%=evento.getIdCircular()%>">Borrar</button>
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
