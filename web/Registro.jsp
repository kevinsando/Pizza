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
        <script src="js/getJSON.js" type="text/javascript"></script>
        <script src="js/scriptReg.js" type="text/javascript"></script>
        <title>JSP Page</title>
    </head>
    <body onload="init();">
        <div id="wrapper">
            <header></header>
            <section>
                <div id="contents">
                    <form action="Login.jsp" method="POST" onsubmit="return guardarRegistro();">
                        <div class="contenedor_b">
                            <p class="caption">Formulario de ingreso</p>
                        </div>
                        <div class="contenedor_a">
                            
                            <label for="id"><b>ID:&nbsp;</b></label>
                            <input type="text" 
                                   autocomplete="off"
                                   id="id" name="id" required /><br/>
                            <br/>
                            <label for="usuario"><b>Usuario:&nbsp;</b></label>
                            <input type="text" 
                                   autocomplete="off"
                                   id="usuario" name="usuario" required /><br/>
                            <br/>
                            <label for="clave"><b>Clave:&nbsp;</b></label>
                            <input type="password"
                                   id="clave" name="clave" required /><br/>
                            <br/>       
                            <label for="nombre"><b>Nombre:&nbsp;</b></label>
                            <input type="text" 
                                   id="nombre" name="nombre" required /><br/>
                            <br/>
                            <label for="apellidos"><b>Apellidos:&nbsp;</b></label>
                            <input type="text" 
                                   id="apellidos" name="apellidos" required /><br/>
                            <br/>
                            <label for="direccion"><b>Dirección:&nbsp;</b></label>
                            <input type="text" 
                                   id="direccion" name="direccion" required /><br/>
                            <br/>
                            <label for="tel"><b>Telefono:&nbsp;</b></label>
                            <input type="number" 
                                   id="tel" name="tel" required /><br/>
                            <br/>
                            <button type="submit">Registrarse</button>
                     
                        </div>
                    </form>
                </div>
            </section>
            <footer></footer>
        </div>
    </body>
</html>
