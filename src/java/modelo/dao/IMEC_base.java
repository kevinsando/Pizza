package modelo.dao;

/**
 *
 * @author Kevin
 */
public enum IMEC_base {
    RECUPERAR_USUARIO ("SELECT id,password,nombre,apellidos,direccion,rol,telefono FROM usuario WHERE id=? and password=?;");
    
    IMEC_base(String comando) {
        this.comando = comando;
    }

    public String obtenerComando() {
        return comando;
    }

    private final String comando;
}
