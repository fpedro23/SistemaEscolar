<!DOCTYPE html>
<html lang="en" class="no-js">
<head>
    <meta charset="UTF-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Perspective Page View Navigation</title>
    <meta name="description" content="Perspective Page View Navigation: Transforms the page in 3D to reveal a menu"/>
    <meta name="keywords"
          content="3d page, menu, navigation, mobile, perspective, css transform, web development, web design"/>
    <meta name="author" content="Codrops"/>
    <link rel="shortcut icon" href="../favicon.ico">
    <link rel="stylesheet" type="text/css" href="css/normalize.css"/>
    <link rel="stylesheet" type="text/css" href="css/demo.css"/>
    <link rel="stylesheet" type="text/css" href="css/component.css"/>
    <!-- csstransforms3d-shiv-cssclasses-prefixed-teststyles-testprop-testallprops-prefixes-domprefixes-load -->
    <script src="js/modernizr.custom.25376.js"></script>
    <link rel='stylesheet' href='fonts/typicons/typicons.min.css'/>


</head>
<body>
<div id="perspective" class="perspective effect-rotateleft">
    <div class="container">
        <div class="wrapper"><!-- wrapper needed for scroll -->
            <!-- Top Navigation -->
            <div class="codrops-top clearfix">
                <a class="codrops-icon codrops-icon-prev"
                   href="http://tympanus.net/Development/ProgressButtonStyles/"><span>Previous Demo</span></a>
                <span class="right"><a class="codrops-icon codrops-icon-drop"
                                       href="http://tympanus.net/codrops/?p=17915"><span>Back to the Codrops Article</span></a></span>
            </div>
            <header class="codrops-header">
                <h1>Perspective Page View Navigation <span>Transforms the page in 3D to reveal a menu</span></h1>
            </header>
            <div class="main clearfix">
                <div class="column">
                    <p>
                        <button id="showMenu">Show Menu</button>
                    </p>
                    <p>Click on this button to see the content being pushed away in 3D to reveal a navigation or other
                        items.</p>
                </div>
                <div class="column">
                    <nav class="codrops-demos">
                        <a href="index.jsp" class="current-demo">Rotate Left</a>
                    </nav>
                </div>
                <div class="related">
                    <p>If you enjoyed this demo you might also like:</p>

                    <p><a href="http://tympanus.net/Tutorials/AnimatedBorderMenus/">Animated Border Menus</a></p>

                    <p><a href="http://tympanus.net/Development/SidebarTransitions/">Transitions for Off-Canvas
                        Navigations</a></p>
                </div>
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
                    <a href="#" class="typcn-plus-outline">Crear Nueva Circular</a>
                </li>
                <li>
                    <a href="#" class="typcn-folder-open">Administrar Circulares</a>
                </li>
            </ul>

            <a href="#" class="typcn-warning">Avisos</a>

            <ul style="list-style-type: none">
                <li>
                    <a href="#" class="typcn-plus-outline">Crear Nuevo Aviso</a>
                </li>
                <li>
                    <a href="#" class="typcn-folder-open">Administrar Avisos</a>
                </li>
            </ul>

            <a href="#" class="typcn-calendar">Eventos</a>


            <ul style="list-style-type: none">
                <li>
                    <a href="#" class="typcn-plus-outline">Crear Nuevo Evento</a>
                </li>
                <li>
                    <a href="#" class="typcn-folder-open">Administrar Eventos</a>
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