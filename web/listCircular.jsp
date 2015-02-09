<%@ page import="sistemaescolar.model.Circular" %>
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
        <title>Lista de Circulares</title>
        <script type="text/javascript">
            <%
                Circular[] circulars = (Circular[]) request.getAttribute("circulars");
                if(circulars != null) {
                    for(Circular circular : circulars) {
            %>
                        $('#editCircular<%=circular.getIdCircular()%>').submit(
                                function(event) {
                                    event.preventDefault();

                                    $('#editCircular<%=circular.getIdCircular()%>').ajaxSubmit(
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

                        $('#deleteCircular<%=circular.getIdCircular()%>').submit(
                                function(event) {
                                    event.preventDefault();

                                    $('#deleteCircular<%=circular.getIdCircular()%>').ajaxSubmit(
                                            {
                                                beforeSend: function() {
                                                    $('#deleteButton<%=circular.getIdCircular()%>').empty().append('Borrando');
                                                },
                                                success: function() {
                                                    var $tr = $('#tr<%= circular.getIdCircular()%>')
                                                    $tr.fadeOut(1000, function() {
                                                        $tr.remove();
                                                    });
                                                },
                                                error: function() {
                                                    $('#deleteButton<%=circular.getIdCircular()%>').empty().append('Borrar');
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
                if(circulars == null || circulars.length == 0) {
            %>
                    <span><h1 class="error">No hay Circulares registradas</h1></span>
                    <button onclick="loadPage('Nueva Circular', 'nuevoRegistro.jsp?tipo=Circular')">Crea una nueva</button>
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
                            for (Circular circular : (Circular[]) request.getAttribute("circulars")) {
                        %>
                        <tr id="tr<%=circular.getIdCircular()%>">
                            <td>
                                <%= circular.getTitulo()    %>
                            </td>
                            <td>
                                <%= circular.getRemitente() %>
                            </td>
                            <td>
                                <%= circular.getFecha()     %>
                            </td>
                            <td>
                                <%= circular.getContenido() %>
                            </td>
                            <td>
                                <form action="editCircular.action" method="get" id="editCircular<%=circular.getIdCircular()%>">
                                    <input type="hidden" name="id" value="<%= circular.getIdCircular() %>"/>
                                    <input type="hidden" name="tipo" value="Circular">
                                    <button type="submit" name="edit">Editar</button>
                                </form>
                            </td>
                            <td>
                                <form action="deleteCircular.action" method="get" id="deleteCircular<%=circular.getIdCircular()%>">
                                    <input type="hidden" name="id" value="<%= circular.getIdCircular() %>"/>
                                    <input type="hidden" name="tipo" value="Circular">
                                    <button type="submit"name="delete" id="deleteButton<%=circular.getIdCircular()%>">Borrar</button>
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
