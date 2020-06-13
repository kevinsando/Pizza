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
        <script src="js/scriptLogin.js" type="text/javascript"></script>
        <title>Login </title>
    </head>
  
     <body onload="init();">
        <div id="wrapper">
            <header></header>
            <section>
                <div id="contents">
                    <form action="inicio.jsp" method="POST" onsubmit="return verificarFormulario();">
                        
                        <div class="contenedor_b">
                            <button type="button" onclick="cancelarIngreso();" class="btnCancelar">Cancelar</button>
                            <span class="clave">¿Olvidó su <a href="clave.jsp">clave</a>?</span><br/>
                            
                            <span class="clave">¿No tienes cuenta? Registrate <a href="Registro.jsp">aquí</a></span>
                        </div>
                    </form>
                </div>
            </section>
            <footer></footer>
        </div>
    </body>
</html>
