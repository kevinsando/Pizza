<%-- 
 * 
 * EIF209
 * Programación 4
 * Proyecto #2
 * Junio 2020
 * Autores:
 *         - 207900913 Kevin Sandoval Madrigal
 *         - 000000000 Mariana Valverde Mora
 *         - 000000000 Miguel Rodriguez Rangel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="shortcut icon" href="pizza.png">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/defaultP.css" rel="stylesheet" type="text/css"/>
        <script src="js/scriptsLogin.js" type="text/javascript"></script>
        <title>Pizza</title>
    </head>
    <body id="menu" onload="init();">
        <div id="wrapper">
            <header></header>
            <div id="titulo">
                <img src="media/logo.jpg" alt=""/>
                <h1>En construcción :D</h1>
                <p>
                    <%

                        HttpSession sesionActual;
                        sesionActual = request.getSession(true);
                        sesionActual.invalidate();

                    %>
                </p>
            </div>
            <div id="contents">
                <section style="float: left; padding-left: 24px; width: 45%;">

                    <table class="credenciales">
                        <thead>
                            <tr>
                                <th colspan="2"><h3>Menú</h3></th>
                            </tr>
                        </thead> 
                        <tr>

                        </tr>
                        <tr>

                        </tr>
                    </table>

                    <p>
                        <a href="Login.jsp">Salir</a>
                    </p>
                </section>
            </div>
            <footer></footer>
        </div>
    </body>
</html>
