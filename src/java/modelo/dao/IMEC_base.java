package modelo.dao;

/**
 *
 * @author Kevin
 */
public enum IMEC_base {
    RECUPERAR_USUARIO("SELECT id,usuario,password,nombre,apellidos,direccion,rol,telefono FROM usuario WHERE id=? and password=?;"),
    GUARDAR_USUARIO("INSERT INTO `eif209_2001_p02`.`usuario`(`id`,`usuario`,`password`,`nombre`,`apellidos`,`direccion`,"
            + "`rol`,`telefono`) VALUES (?,?,?,?,?,?,?,?);");

    IMEC_base(String comando) {
        this.comando = comando;
    }

    public String obtenerComando() {
        return comando;
    }

    private final String comando;
}
