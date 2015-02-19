<%@ page import="sistemaescolar.dbmanagement.AdministratorDBManager" %>
<%@ page import="sistemaescolar.Administrador" %>
<%@ page import="sistemaescolar.Evento" %>
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
    <!-- Styling -->
    <link rel="stylesheet" type="text/css" href="css/normalize.css"/>
    <link rel="stylesheet" type="text/css" href="css/demo.css"/>
    <link rel="stylesheet" type="text/css" href="css/component.css"/>

    <title>Nuevo registro</title>

    <script type="text/javascript" src="js/helper.js"></script>
    <script type="text/javascript">
        $('#fecha').val(getToday());
        $('#allDayEvent').change(
                function() {
                    var horaInicio = $('#horaInicio');
                    var horaFin    = $('#horaFinal');

                    if(this.checked) {
                        horaInicio.prop('disabled', true);
                        horaFin.prop('disabled', true);

                        horaInicio.val(null);
                        horaFin.val(null);
                    }
                    else {
                        horaInicio.prop('disabled', false);
                        horaFin.prop('disabled', false);
                    }
                }
        );
        $('#horaInicio').change(
                function() {
                    if(!$('#allDayEvent').checked) {
                        var horaFinal = $('#horaFinal').val();
                        if(horaFinal && timeParse(this.value) > timeParse(horaFinal)) {
                            alert('La hora de inicio debe ser menor a la hora de fin');
                            $('#submitForm').prop('disabled', true);
                        }
                        else
                            $('#submitForm').prop('disabled', false);
                    }
                }
        );

        $('#horaFinal').change(
                function() {
                    if(!$('#allDayEvent').checked) {
                        var horaInicio = $('#horaInicio').val();
                        if(horaInicio && timeParse(this.value) < timeParse(horaInicio)) {
                            alert('La hora de inicio debe ser menor a la hora de fin');
                            $('#submitForm').prop('disabled', true);
                        }
                        else
                            $('#submitForm').prop('disabled', false);
                    }
                }
        );


        // Setup form validation and ajax execution instead of loading new page
        $(document).ready(
                function () {
                    $('#registro').validate(
                            {
                                rules: {
                                    titulo: 'required',
                                    fecha: 'required',
                                    remitente: 'required',
                                    contenido: 'required'
                                },
                                messages: {
                                    titulo: 'Debes ingresar un t&iacute;tulo',
                                    fecha: 'Debes ingresar una fecha',
                                    remitente: 'Debes ingresar un remitente',
                                    contenido: 'Debes ingresar un contenido'
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
    String tipo = (String)request.getAttribute("tipo");
%>
<form action="create<%= tipo %>" method="post" name="registro" id="registro" accept-charset="utf-8">
    <div align="center">
        <table cellspacing="30">
            <tr>
                <td>T&iacute;tulo</td>
                <td><input type="text" name="titulo" id="titulo"/></td>
            </tr>
            <tr>
                <td>Fecha</td>
                <td><input type="date" name="fecha" id="fecha"/></td>
            </tr>
            <%
                if(tipo != null && tipo.equals("Event")) {
            %>
                <tr>
                    <td>Evento de todo el día</td>
                   <td>
                       <input id="allDayEvent" type="checkbox"/>
                   </td>
                </tr>
                <tr>
                    <td>Hora de inicio</td>
                    <td><input name="horaInicio" id="horaInicio" type="time"/></td>
                </tr>
                <tr>
                    <td>Hora fin</td>
                    <td><input name="horaFinal" id="horaFinal" type="time"/></td>
                </tr>
            <%
                }
            %>
            <tr>
                <td>Remitente</td>
                <td>
                    <select name="idRemitente" id="idRemitente" style="padding: 10px;">
                        <%
                            Administrador[] administradors = AdministratorDBManager.listAdministrators();
                            for(Administrador administrador : administradors) {
                        %>
                                <option value="<%= administrador.getIdAdministrador() %>"><%= administrador.getNombreAdministrador() %></option>
                        <%
                            }
                        %>
                    </select>
                </td>
                <%--<td><input type="text" name="idRemitente" id="remitente"/></td>--%>
            </tr>
            <tr>
                <td>Contenido</td>
                <td><textarea name="contenido" id="contenido"> </textarea></td>
            </tr>
        </table>
        <br>
        <button id="submitForm" type="submit" value="Enviar">Enviar</button>
        <div id="result"></div>
    </div>
</form>
</body>
</html>
