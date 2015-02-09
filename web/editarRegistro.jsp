<%@ page import="sistemaescolar.model.Evento" %>
<%@ page import="sistemaescolar.model.Circular" %>
<%@ page import="sistemaescolar.model.Aviso" %>
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
        // Setup form validation and ajax execution instead of loading new page
        $(document).ready(
                function() {
                    $('#editForm').validate(
                            {
                                rules: {
                                    titulo: 'required',
                                    fecha: 'required',
                                    remitente: 'required',
                                    contenido: 'required'
                                },
                                messages: {
                                    titulo: 'Debes ingresar un t&iacute;tulo',
                                    fecha:  'Debes ingresar una fecha',
                                    remitente: 'Debes ingresar un remitente',
                                    contenido: 'Debes ingresar un contenido'
                                },
                                submitHandler: function(form) {
                                    $(form).ajaxSubmit(
                                            {
                                                beforeSend: function() {
                                                    $('#result').empty().append('Cargando');
                                                },
                                                target: "#result"
                                            }
                                    );
                                }
                            }
                    );
                }
        );
    </script>
</head>
<body>
<%
    // tipo debe ser: Circular, Event o Aviso
    String tipo = request.getParameter("tipo");
    sistemaescolar.model.Circular circular = (sistemaescolar.model.Circular) request.getAttribute("circular");
    sistemaescolar.model.Evento evento = (sistemaescolar.model.Evento) request.getAttribute("evento");
    sistemaescolar.model.Aviso aviso = (sistemaescolar.model.Aviso) request.getAttribute("aviso");
%>
    <div align="center">
        <form action="update<%= tipo %>" method="get" name="registro" id="editForm">
            <table>
                <tr>
                    <td>T&iacute;tulo</td>
                    <td><input type="text" name="titulo" value="<%=
                            circular != null ? circular.getTitulo() :
                            evento   != null ? evento.getTitulo()   :
                                               aviso.getTitulo()
                        %>"/></td>
                </tr>
                <tr>
                    <td>Fecha</td>
                    <td><input type="date" name="fecha" value="<%=
                            circular != null ? circular.getFecha() :
                            evento   != null ? evento.getFecha()   :
                                               aviso.getFecha()
                        %>"/></td>
                </tr>
                <tr>
                    <td>Remitente</td>
                    <td><input type="text" name="remitente" value="<%=
                            circular != null ? circular.getRemitente() :
                            evento   != null ? evento.getRemitente()   :
                                               aviso.getRemitente()
                        %>"/></td>
                </tr>
                <tr>
                    <td>Contenido</td>
                    <td><input type="text" name="contenido" value="<%=
                            circular != null ? circular.getContenido() :
                            evento   != null ? evento.getContenido()   :
                                               aviso.getContenido()
                        %>"/>
                    </td>
                </tr>
            </table>
            <br>
            <input type="hidden" name="id" value="<%=
                            circular != null ? circular.getIdCircular() :
                            evento   != null ? evento.getIdCircular()   :
                                               aviso.getIdCircular()
                        %>"/>
            <button type="submit">Editar</button>

            <div id="result"></div>
        </form>
    </div>
</body>
</html>
