<%@ page import="sistemaescolar.Administrador" %>
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
                function () {
                    $('#editForm').validate(
                            {
                                rules: {
                                    nombre: 'required',
                                    oldPassword: 'required',
                                    password: 'required',
                                    confirmPassword: 'required'
                                },
                                messages: {
                                    nombre: 'Debes ingresar un Nombre',
                                    oldPassword: 'Debes ingresar tu contrase&ntilde;',
                                    password: 'Debes ingresar una nueva contrase&ntilde;',
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
<%
    // tipo debe ser: Circular, Event o Aviso
    String tipo = request.getParameter("tipo");
    Administrador administrador = (Administrador) request.getAttribute("administrador");
%>
<div align="center">
    <form action="updateAdministrador.action" method="get" name="registro" id="editForm">
        <table>
            <tr>
                <td>Nombre</td>
                <td><input type="text" name="nombre" value="<%= administrador.getNombreAdministrador() %>"/></td>
            </tr>
            <tr>
                <td>Contrase&ntilde;a anterior</td>
                <td><input type="password" name="oldPassword"/></td>
            </tr>
            <tr>
                <td>
                    Nueva contrase&ntilde;a
                </td>
                <td><input type="password" name="password" id="password"/></td>
            </tr>
                <td>Comfirmar Contrase&ntilde;a</td>
                <td><input type="password" name="confirmPassword"/></td>
            </tr>
        </table>
        <br>
        <input type="hidden" name="id" value="<%=administrador.getIdAdministrador()%>"/>
        <button type="submit">Editar</button>

        <div id="result"></div>
    </form>
</div>
</body>
</html>
