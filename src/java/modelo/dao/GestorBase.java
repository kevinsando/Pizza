package modelo.dao;

import datos.BaseDatos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import modelo.Usuario;

/**
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
public class GestorBase {

    public GestorBase() {
        this.bd = BaseDatos.obtenerInstancia();
    }

    public static GestorBase obtenerInstancia() {
        if (instancia == null) {
            instancia = new GestorBase();
        }
        return instancia;
    }

    public Usuario obtenerUsuario(String id, String password) {
        Usuario r = null;
        try {
            Connection cnx = bd.obtenerConexion();
            try (PreparedStatement stm = cnx.prepareStatement(IMEC_base.RECUPERAR_USUARIO.obtenerComando())) {
                stm.clearParameters();
                stm.setString(1, id);
                stm.setString(2, password);
                ResultSet rs = stm.executeQuery();
                if (rs.next()) {
                    r = new Usuario(
                            rs.getString("id"),
                            rs.getString("password"),
                            rs.getString("nombre"),
                            rs.getString("apellidos"),
                            rs.getString("direccion"),
                            rs.getInt("rol"),
                            rs.getInt("telefono")
                    );
                }
            }
        } catch (SQLException ex) {
            System.err.printf("Excepción: '%s'%n", ex.getMessage());
        } finally {
            bd.cerrarConexion();
        }
        return r;
    }

    public static void main(String[] args) {
        GestorBase g = GestorBase.obtenerInstancia();
        System.out.println();
    }

    private BaseDatos bd = null;
    private String usuarioSesion = null;
    private static GestorBase instancia = null;
}
