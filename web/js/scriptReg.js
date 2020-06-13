/*
 * 
 * EIF209
 * Programación 4
 * Proyecto #2
 * Junio 2020
 * Autores:
 *         - 207900913 Kevin Sandoval Madrigal
 *         - 000000000 Mariana Valverde Mora
 *         - 000000000 Miguel Rodriguez Rangel
*/
var resp;

function init() {

}
function guardarRegistro() {
    var refId = document.getElementById("id");
    var refU = document.getElementById("usuario");
    var refC = document.getElementById("clave");
    var refN = document.getElementById("nombre");
    var refA = document.getElementById("apellidos");
    var refD = document.getElementById("direccion");
    var refT = document.getElementById("tel");

    var datos = new FormData();

    if (refId && refU && refC && refN && refA && refD && refT) {
        datos.append('id', refId.value);
        datos.append('usuario', refU.value);
        datos.append('clave', refC.value);
        datos.append('nombre', refN.value);
        datos.append('apellidos', refA.value);
        datos.append('direccion', refD.value);
        datos.append('tel', refT.value);
        datos.append('rol', "1");
        getJSON('ServicioRegistro', datos, procesarRespuesta);
        datos = new FormData();
    }
    function procesarRespuesta(datos) {
        console.log("datos:"+datos);  
        resp = datos;
        var refM = document.getElementById("mensaje");
        
        refM.value = datos;
        return datos;
    }

}


