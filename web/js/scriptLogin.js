function init() {
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
    console.log(datos);
    return datos;
}
function cancelarIngreso() {
    window.location = "login.jsp";
}
