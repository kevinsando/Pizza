function init() {
    console.log("Iniciando...");
    var refU = document.getElementById("usuario");
    if (refU) {
        refU.value = "";

        var valR = localStorage.getItem("recordar");
        if (valR) {
            var valU = localStorage.getItem("usuario");
            refU.value = (valU) ? valU : "";
            document.getElementById("recordar").checked = true;

            document.getElementById("clave").focus();

        } else {
            refU.focus();
        }
    }
}
function verificarFormulario() {
    console.log("Verificando formulario...");
    var refR = document.getElementById("recordar");
    if (refR) {
        if (refR.checked) {
            var refN = document.getElementById("usuario");
            localStorage.setItem("usuario", refN.value);
            localStorage.setItem("recordar", true);
        } else {
            localStorage.removeItem("usuario");
            localStorage.removeItem("recordar");
        }
    }

    return true;
}
function verificaUsuario() {
    console.log("usuario...");
    var refU = document.getElementById("usuario");
    var refC = document.getElementById("clave");
    var datos = new FormData();
    if (refU && refC) {
        datos.append('usuario', refU.value);
        datos.append('clave', refC.value);
        getJSON('ServicioLogin', datos, procesarRespuesta);
        datos = new FormData();
    }
}
function procesarRespuesta(datos) {//con datos verifico si el usuario existe en la base en jsp antes de redirigir la página
    console.log(datos.toString());
    if(datos === "OK"){
        window.location = "inicio.jsp";
    }else{
        window.location = "Registro.jsp";
    }
    return datos;
}


function credenciales(){
    console.log("Cargando credenciales...");
    console.log(localStorage.getItem("usuario"));
    var usuario = document.getElementById("usuarioI");
    var clave = document.getElementById("claveI");
    
    usuario.value = localStorage.getItem("usuario");
}