<%--
  Created by IntelliJ IDEA.
  User: mng687
  Date: 2/18/15
  Time: 1:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Nuevo registro</title>
    <script type="text/javascript">
        // Setup form validation and ajax execution instead of loading new page
        $(document).ready(
                function () {
                    $('#editForm').validate(
                            {
                                rules: {
                                    nombre: 'required',
                                    password: 'required',
                                    confirmPassword: {
                                        equalto: "#password"
                                    }
                                },
                                messages: {
                                    nombre: 'Debes ingresar un Nombre',
                                    password: 'Debes ingresar una contrase&ntilde;',
                                    confirmPassword: 'Las contrase&ntilde;as no coinciden'
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
<div align="center">
    <form action="createAdministrador.action" method="get" name="registro" id="editForm">
        <table>
            <tr>
                <td>Nombre</td>
                <td><input type="text" name="nombre"/></td>
            </tr>
            <tr>
                <td>
                    Contrase&ntilde;a
                </td>
                <td><input type="password" name="password" id="password"/>
            </tr>
        </table>
        <br>
        <input type="hidden" name="id"/>
        <button type="submit">Enviar</button>

        <div id="result"></div>
    </form>
</div>
</body>
</html>
