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
        <link href="css/defaultP.css" rel="stylesheet" type="text/css"/>
        <script src="js/getJSON.js" type="text/javascript"></script>
        <script src="js/scriptsLogin.js" type="text/javascript"></script>
        <title>Planet Pizza- Login </title>
    </head>

    <body id ="logg" onload="init();">
        <div id="wrapper">
            <header class="cabeza">

            </header>
            <p class="menu"> 

            </p> 
            <div id="titulo">
                <h1></h1>
                <p>
                    <%

                        HttpSession sesionActual;
                        sesionActual = request.getSession(true);
                        sesionActual.invalidate();

                    %>
                </p>
            </div>
            <div class="logImag">
                <img src="css/media/logo.png" alt=""/>
            </div>
            <section>
                <div id="formulario">
                    <form id="formLogin" action="ServicioLogin" method="POST" onsubmit="return verificarFormulario();">
                        <table class="logins">
                            <thead>
                                <tr>
                                    <th colspan="2"><h3>Login</h3></th>
                                </tr>
                            </thead> 
                            <tr>
                                <td class="etiqueta">
                                    <label for="usuario">Usuario:&nbsp;</label>
                                </td>
                                <td class="campo">
                                    <input type="text" placeholder="Digite el nombre de usuario"
                                           autocomplete="off"
                                           id="usuario" name="usuario" required />
                                </td>
                            </tr>
                            <tr>
                                <td class="etiqueta">
                                    <label for="clave"><b>Clave:&nbsp;</b></label>
                                </td>
                                <td class="password">
                                    <input type="password" placeholder="Digite la clave"
                                           id="clave" name="clave" required />
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <label for="recordar"><b>Recordarme:&nbsp;</b></label>
                                </td>
                                <td>
                                    <input type="checkbox" id="recordar" name="recordar"/>
                                </td>
                            </tr>
                            <tr>
                                <td class="controles" colspan="2">
                                    <input type="submit" value="Ingresar" />
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <span class="clave">¿Olvidó su <a href="clave.jsp">clave</a>?</span>
                                </td>
                                <td>
                                    <span class="clave">¿No tienes cuenta? Registrate <a href="Registro.jsp">aquí</a></span>
                                </td>
                            </tr>
                        </table>

                    </form>
                </div>
            </section>
            <footer></footer>
        </div>
        <footer class="pie">
            <p>Derechos reservados Coronavirus 2020</p>
        </footer>
    </body>
</html>
