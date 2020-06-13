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
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="js/scriptLogin.js" type="text/javascript"></script>
        <title>Pizza</title>
    </head>
    <body onload="init();">
        <div id="wrapper">
            <header></header>
            <div id="contents">
                <section style="float: left; padding-left: 24px; width: 45%;">
                    <h1>Parámetros de acceso</h1>
                    <p>
                        Nombre de usuario: <strong>'${param.usuario}'</strong><br />
                        Clave de acceso: <strong>'${param.clave}'</strong>
                    </p>

                    <p>
                        <a href="Login.jsp">Salir</a>
                    </p>
                </section>
            </div>
            <footer></footer>
        </div>
    </body>
</html>
