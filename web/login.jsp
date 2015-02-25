<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <link rel="stylesheet" type="text/css" href="css/demo.css" media="all">
        <script type="text/javascript" src="view.js"></script>

        <script type="text/javascript">
            function validateForm() {
                var user = document.forms['form_972819']['nombre'].value;
                var password = document.forms['form_972819']['password'].value;

                if(user == null || user == '') {
                    document.getElementById('error').innerHTML = 'Debes introducir un usuario';
                    return false;
                }
                else if(password == null || password == '') {
                    document.getElementById('error').innerHTML = 'Debes introducir una contrase&ntilde;a';
                    return false;
                }

                return true;
            }
        </script>
    </head>

    <body id="main_body" >
        <div id="form_container" align="center">

            <h1><a>Login</a></h1>
            <form id="form_972819" method="post" action="doLogin.action">
                <div class="form_description">
                    <p>Introduzca los datos de un administrador para iniciar sesi&oacute;n.</p>
                </div>

                <table>
                    <tr>
                        <td>
                            Nombre de Usuario
                        </td>
                        <td>
                            <input id="element_1" name="nombre" class="element text medium" type="text" maxlength="255" value=""/>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            Contrase&ntilde;a
                        </td>
                        <td>
                            <input id="element_2" name="password" class="element text medium" type="password" maxlength="255" value=""/>
                        </td>
                    </tr>
                </table>

                <br/>
                <input type="hidden" name="form_id" value="972819" />
                <button type="submit" name="submit" value="submit" onclick="return validateForm()">Iniciar sesi&oacute;n</button>
            </form>
            <br/>
            <h1 id="error" class="error">
                <%
                    Boolean success = (Boolean) request.getAttribute("success");
                %>
                <%=
                    (success != null && !success) ? "Usuario o contrase&ntilde;a incorrecto" : ""
                %>
            </h1>
        </div>

    </body>
</html>