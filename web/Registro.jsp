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
        <script src="js/scriptReg.js" type="text/javascript"></script>
        <title>Planet Pizza- Registro</title>
    </head>
    <body  id ="reg" onload="init();">
        <div id="wrapper">
            <header></header>
            <section>
                <div id="contents">
                    <form action="Login.jsp" method="POST" onsubmit="return guardarRegistro();">
                        <table class="logins">
                            <thead>
                                <tr>
                                    <th colspan="2"><h3>Registro</h3></th>
                                </tr>
                            </thead> 
                            <tr>
                                <td>
                                    <label for="id"><b>ID:&nbsp;</b></label>
                                </td>
                                <td>
                                    <input type="text" 
                                           autocomplete="off"
                                           id="id" name="id" required />
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <label for="usuario"><b>Usuario:&nbsp;</b></label>
                                </td>
                                <td>
                                    <input type="text" 
                                           autocomplete="off"
                                           id="usuario" name="usuario" required />
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <label for="clave"><b>Clave:&nbsp;</b></label>
                                </td>
                                <td>
                                    <input type="password"
                                           id="clave" name="clave" required />
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <label for="nombre"><b>Nombre:&nbsp;</b></label>
                                </td>
                                <td>
                                    <input type="text" 
                                           id="nombre" name="nombre" required />
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <label for="apellidos"><b>Apellidos:&nbsp;</b></label>
                                </td>
                                <td>
                                    <input type="text" 
                                           id="apellidos" name="apellidos" required />
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <label for="direccion"><b>Dirección:&nbsp;</b></label>
                                </td>
                                <td>
                                    <input type="text" 
                                           id="direccion" name="direccion" required />
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <label for="tel"><b>Telefono:&nbsp;</b></label>
                                </td>
                                <td>
                                    <input type="number" 
                                           id="tel" name="tel" required /><br/>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <h1 id="mensaje"></h1>
                                    <button type="submit">Registrarse</button>
                                </td>
                                <td>
                                    <h1 id="mensaje"></h1>
                                    <a href="Login.jsp">Volver</a>
                                </td>
                            </tr>
                        </table>

                    </form>

                </div>
            </section>
            <footer></footer>
        </div>
    </body>
</html>
