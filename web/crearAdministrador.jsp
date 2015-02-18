<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Nuevo Administrador</title>
    <link rel="stylesheet" type="text/css" href="view.css" media="all">
    <script type="text/javascript" src="view.js"></script>

</head>
<body id="main_body">

<img id="top" src="top.png" alt="">

<div id="form_container">

    <h1><a>Nuevo Administrador</a></h1>

    <form id="form_972463" class="appnitro" method="post" action="createAdministrador.action">
        <div class="form_description">
            <h2>Nuevo Administrador</h2>

            <p>Introduzca los datos del nuevo administrador, el administrador podrá editar y crear registros de
                circulares, avisos y eventos.</p>
        </div>
        <ul>

            <li id="li_1">
                <label class="description" for="nombre">Nombre Administrador </label>

                <div>
                    <input id="nombre" name="nombre" class="element text medium" type="text" maxlength="255" value=""/>
                </div>
            </li>
            <li id="li_2">
                <label class="description" for="password">Contraseña </label>

                <div>
                    <input id="password" name="password" class="element text medium" type="text" maxlength="255"
                           value=""/>
                </div>
            </li>
            <li id="li_3">
                <label class="description" for="passwordRepeat">Repetir Contraseña </label>

                <div>
                    <input id="passwordRepeat" name="passwordRepeat" class="element text medium" type="text"
                           maxlength="255" value=""/>
                </div>
            </li>

            <li class="buttons">
                <input type="hidden" name="form_id" value="972463"/>

                <input id="saveForm" class="button_text" type="submit" name="submit" value="Submit"/>
            </li>
        </ul>
    </form>
    <div id="footer">
        Generated by <a href="http://www.phpform.org">pForm</a>
    </div>
</div>
<img id="bottom" src="bottom.png" alt="">
</body>
</html>