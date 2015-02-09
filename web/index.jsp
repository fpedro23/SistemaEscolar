<!DOCTYPE html>
<html lang="en" class="no-js">
    <head>
        <meta charset="UTF-8"/>
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Sistema Escolar</title>
        <meta name="description" content="Panel de administrador para Sistema Escolar"/>
        <%--<meta name="author" content="Codrops"/>--%>
        <link rel="shortcut icon" href="../favicon.ico">
        <!-- Fancy 3d menu -->
        <link rel="stylesheet" type="text/css" href="css/normalize.css"/>
        <link rel="stylesheet" type="text/css" href="css/demo.css"/>
        <link rel="stylesheet" type="text/css" href="css/component.css"/>

        <!-- csstransforms3d-shiv-cssclasses-prefixed-teststyles-testprop-testallprops-prefixes-domprefixes-load -->
        <script src="js/modernizr.custom.25376.js"></script>
        <script src="js/jquery.min.js"></script>
        <!-- Form validation -->
        <script type="text/javascript" src="js/form-validator/jquery.validate.js"></script>
        <script type="text/javascript" src="js/form-validator/jquery.form.js"></script>

        <link rel='stylesheet' href='fonts/typicons/typicons.min.css'/>

        <script type="text/javascript">
            function loadPage(newHeader, fileName) {
                $('#title').empty().append("Cargando...");
                $('#gimmeContent').empty();

                $("#gimmeContent").load(fileName, function(responseText, textStatus, req) {
                    if(textStatus == 'error') {
                        $('#title').empty().append("Error");
                        $('#gimmeContent').empty().append('<h1 class="error">Hubo un error al cargar la p&aacute;gina</h1>');
                    }
                    else {
                        $('#title').empty().append(newHeader);
                    }
                });
            }

            function init() {
                loadPage("Nueva Circular", "nuevoRegistro.jsp?tipo=Circular");
            }

            $(document).ready(function() {
                init();
            });
        </script>
    </head>
    <body>
        <div id="perspective" class="perspective effect-rotateleft">
            <div class="container">
                <div class="wrapper"><!-- wrapper needed for scroll -->

                    <!-- Top Navigation -->
                    <div class="codrops-top clearfix">
                        <p>
                            <span class="right">
                                <button id="showMenu" style="font-size: large">Men&uacute;</button>
                            </span>
                        </p>
                    </div>

                    <header class="codrops-header">
                        <h1 id="title"></h1>
                    </header>

                    <!-- This is where all our will go krnl -->
                    <div id="gimmeContent" class="main clearfix" style="overflow: hidden">
                    </div>
                    <!-- /main -->
                </div>
                <!-- wrapper -->
            </div>
            <!-- /container -->
            <nav class="outer-nav right vertical">
                <ul>

                    <a class="typcn-news"> Circulares </a>

                    <ul style="list-style-type: none">
                        <li>
                            <a href="#" class="typcn-plus-outline" onclick="loadPage('Nueva Circular', 'nuevoRegistro.jsp?tipo=Circular')">Crear Nueva Circular</a>
                        </li>
                        <li>
                            <a href="#" onclick="loadPage('Administrar Circulares', 'readCircular')" class="typcn-folder-open">Administrar Circulares</a>
                        </li>
                    </ul>

                    <a class="typcn-warning" style="opacity: 1">Avisos</a>

                    <ul style="list-style-type: none">
                        <li>
                            <a href="#" onclick="loadPage('Nuevo Aviso', 'nuevoRegistro.jsp?tipo=Aviso')" class="typcn-plus-outline">Crear Nuevo Aviso</a>
                        </li>
                        <li>
                            <a href="#" onclick="loadPage('Administrar Avisos', 'readAvisos')" class="typcn-folder-open">Administrar Avisos</a>
                        </li>
                    </ul>

                    <a class="typcn-calendar">Eventos</a>


                    <ul style="list-style-type: none">
                        <li>
                            <a href="#" onclick="loadPage('Nuevo Evento', 'nuevoRegistro.jsp?tipo=Event')" class="typcn-plus-outline">Crear Nuevo Evento</a>
                        </li>
                        <li>
                            <a href="#" onclick="loadPage('Administrar Eventos', 'readEvent')" class="typcn-folder-open">Administrar Eventos</a>
                        </li>
                    </ul>

                </ul>

            </nav>
        </div>
        <!-- /perspective -->
        <script src="js/classie.js"></script>
        <script src="js/menu.js"></script>
    </body>
</html>