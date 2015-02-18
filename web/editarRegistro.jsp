<%@ page import="sistemaescolar.Evento" %>
<%@ page import="sistemaescolar.Circular" %>
<%@ page import="sistemaescolar.Aviso" %>
<%@ page import="sistemaescolar.Administrador" %>
<%@ page import="sistemaescolar.dbmanagement.AdministratorDBManager" %>
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
                                    titulo: 'required',
                                    fecha: 'date',
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
    String tipo = request.getParameter("tipo");
    Circular circular = (Circular) request.getAttribute("circular");
    Evento evento = (Evento) request.getAttribute("evento");
    Aviso aviso = (Aviso) request.getAttribute("aviso");
%>
<div align="center">
    <form action="update<%= tipo %>" method="get" name="registro" id="editForm">
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
            <tr>
                <td>Remitente</td>
                <td>
                    <%--<input type="text" name="remitente" value="<%--%>
                            <%--Administrador remitente = circular != null ? circular.getAdministradoridAdministrador() :--%>
                                                      <%--evento   != null ? evento.getAdministradoridAdministrador()   :--%>
                                                                         <%--aviso.getAdministradoridAdministrador();--%>
                            <%--response.getWriter().print(remitente.getIdAdministrador());--%>
                        <%--%>"/>--%>
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
                    <textarea name="contenido" id="contenido"><%=
                circular != null ? circular.getContenido() :
                        evento != null ? evento.getContenido() :
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
        <button type="submit">Editar</button>

        <div id="result"></div>
    </form>
</div>
</body>
</html>
