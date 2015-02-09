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
    <script type="text/javascript">
        // Setup form validation and ajax execution instead of loading new page
        $(document).ready(
                function() {
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
    %>
    <form action="create<%= tipo %>" method="get" name="registro"  id="registro">
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
                <tr>
                    <td>Remitente</td>
                    <td><input type="text" name="remitente" id="remitente"/></td>
                </tr>
                <tr>
                    <td>Contenido</td>
                    <td><input type="text" name="contenido" id="contenido"/></td>
                </tr>
            </table>
            <br>
            <button type="submit" value="Enviar">Enviar</button>
            <div id="result"></div>
        </div>
    </form>
</body>
</html>
