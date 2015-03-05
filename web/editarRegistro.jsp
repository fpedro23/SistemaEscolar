<%@ page import="sistemaescolar.Administrador" %>
<%@ page import="sistemaescolar.Aviso" %>
<%@ page import="sistemaescolar.Circular" %>
<%@ page import="sistemaescolar.Evento" %>
<%@ page import="sistemaescolar.dbmanagement.AdministratorDBManager" %>
<%--
  Created by IntelliJ IDEA.
  User: mng687
  Date: 2/3/15
  Time: 1:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page pageEncoding="utf-8" contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Nuevo registro</title>
    <script type="text/javascript">
        $('#allDayEvent').change(
                function() {
                    var horaInicio = $('#horaInicio')[0];
                    var horaFin    = $('#horaFinal')[0];

                    if(this.checked) {
                        horaInicio.disabled = true;
                        horaFin.disabled = true;

                        horaInicio.value = null;
                        horaFin.value    = null;
                    }
                    else {
                        horaInicio.disabled = false;
                        horaFin.disabled = false;
                    }
                }
        );

        // Setup form validation and ajax execution instead of loading new page
        $(document).ready(
                function () {
                    $('#editForm').validate(
                            {
                                rules: {
                                    titulo: 'required',
                                    fecha: 'date',
                                    remitente: 'required',
                                },
                                messages: {
                                    titulo: 'Debes ingresar un t&iacute;tulo',
                                    fecha: 'Debes ingresar una fecha',
                                    remitente: 'Debes ingresar un remitente',
                                },
                                submitHandler: function (form) {
                                    $(form).ajaxSubmit(
                                            {
                                                beforeSend: function () {
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
    Circular circular = (Circular) request.getAttribute("circular");
    Evento evento = (Evento) request.getAttribute("evento");
    Aviso aviso = (Aviso) request.getAttribute("aviso");
%>
<div align="center">
    <form action="update<%= tipo %>" method="post" name="registro" id="editForm" accept-charset="UTF-8">
        <table>
            <tr>
                <td>T&iacute;tulo</td>
                <td>
                    <input type="text" name="titulo" value="<%=
                            circular != null ? circular.getTitulo() :
                            evento   != null ? evento.getTitulo()   :
                                               aviso.getTitulo()
                        %>"/>
                </td>
            </tr>
            <tr>
                <td>Fecha</td>
                <td>
                    <input type="date" name="fecha" value="<%=
                            circular != null ? circular.getFecha() :
                            evento   != null ? evento.getFecha()   :
                                               aviso.getFecha()
                        %>"/>
                </td>
            </tr>
            <%
                if(evento != null) {
            %>
                    <tr>
                        <td>Evento de todo el d&iacute;a</td>
                        <td><input type="checkbox" id="allDayEvent"/></td>
                    </tr>
                    <tr>
                        <td>Hora Inicio</td>
                        <td><input name="horaInicio" id="horaInicio" type="time" value="<%= evento.getHoraInicio() != null ? evento.getHoraInicio() : null %>"></td>
                    </tr>
                    <tr>
                        <td>Hora Fin</td>
                        <td><input name="horaFinal" id="horaFinal" type="time" value="<%= evento.getHoraFinal() != null ? evento.getHoraFinal() : null %>"/> </td>
                    </tr>
            <%
                }
            %>
            <tr>
                <td>Remitente</td>
                <td>
                    <select name="idRemitente">
                        <%
                            Administrador remitente = circular != null ? circular.getAdministradoridAdministrador() :
                                                      evento   != null ? evento.getAdministradoridAdministrador()   :
                                                                         aviso.getAdministradoridAdministrador();
                            Administrador[] administradors = AdministratorDBManager.listAdministrators();
                            for(Administrador administrador : administradors) {
                        %>
                            <option value="<%= administrador.getIdAdministrador() %>"
                                    <%
                                        if(administrador.getIdAdministrador() == remitente.getIdAdministrador()) {
                                    %>
                                            selected="selected"
                                    <%
                                        }
                                    %>
                            >
                                <%= administrador.getNombreAdministrador() %>
                            </option>
                        <%
                            }
                        %>
                    </select>
                </td>
            </tr>
            <tr>
                <td>Contenido</td>
                <td>
                    <textarea name="contenido" id="contenido">
                        <%=
                            circular != null ? circular.getContenido() :
                            evento   != null ? evento.getContenido() :
                                               aviso.getContenido()
                        %>
                    </textarea>
                </td>
            </tr>
        </table>
        <br>
        <input type="hidden" name="id" value="<%=
                            circular != null ? circular.getIdCircular() :
                            evento   != null ? evento.getIdCircular()   :
                                               aviso.getIdCircular()
                        %>"/>
        Notificar usuarios <input type="checkbox" name="notifyUsers" checked="checked">
        <br>
        <button type="submit">Editar</button>
        <div id="result"></div>
    </form>
</div>
</body>
</html>
