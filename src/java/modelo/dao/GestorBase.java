package modelo.dao;

import datos.BaseDatos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import modelo.Pizza;
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
                            rs.getString("usuario"),
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
    public boolean verificarUsuario(String usuario, String clave) {
        boolean encontrado = false;
        Usuario r = null;
        String nomb = null;
        String ape = null;
        try {
            Connection cnx = bd.obtenerConexion();
            try (PreparedStatement stm = cnx.prepareStatement(IMEC_base.RECUPERAR_USUARIO.obtenerComando())) {
                stm.clearParameters();
                stm.setString(1, usuario);
                stm.setString(2, clave);
                ResultSet rs = stm.executeQuery();
                encontrado = rs.next();
                if (encontrado) {
                    ape = rs.getString("apellidos");
                    nomb = rs.getString("nombre");
                }
            }

        } catch (SQLException ex) {
            System.err.printf("Excepción: '%s'%n", ex.getMessage());
        } finally {
            bd.cerrarConexion();
        }
        return encontrado;
    }
    public void guardarUsuario(Usuario elUsuario) throws SQLException {
        try {
            Connection cnx = bd.obtenerConexion();

            try (PreparedStatement stm = cnx.prepareStatement(IMEC_base.GUARDAR_USUARIO.obtenerComando())) {
                stm.clearParameters();

                stm.setString(1, elUsuario.getId());
                stm.setString(2, elUsuario.getUsuario());
                stm.setString(3, elUsuario.getPassword());
                stm.setString(4, elUsuario.getNombre());
                stm.setString(5, elUsuario.getApellidos());
                stm.setString(6, elUsuario.getDirrecion());
                stm.setInt(7, elUsuario.getRol());
                stm.setInt(8, elUsuario.getTelefono());

                if (stm.executeUpdate() != 1) {
                    throw new SQLException(String.format(
                            "No se puede agregar el registro: '%s'", elUsuario.toString()));
                }

            }
        } finally {
            bd.cerrarConexion();
        }
    }
    public void guardarPizza(Pizza laPizza) throws SQLException{
        try {
            Connection cnx = bd.obtenerConexion();

            try (PreparedStatement stm = cnx.prepareStatement(IMEC_base.GUARDAR_PIZZA.obtenerComando())) {
                stm.clearParameters();

                stm.setInt(1, laPizza.getId());
                stm.setString(2, laPizza.getNombre());
                stm.setInt(3, laPizza.getTipo());
                stm.setDouble(4, laPizza.getPrecio_peq());
                stm.setDouble(5, laPizza.getPrecio_med());
                stm.setDouble(6, laPizza.getPrecio_gran());


                if (stm.executeUpdate() != 1) {
                    throw new SQLException(String.format(
                            "No se puede agregar el registro: '%s'", laPizza.toString()));
                }

            }
        } finally {
            bd.cerrarConexion();
        }
    }

    public static void main(String[] args) {
        GestorBase g = GestorBase.obtenerInstancia();
        System.out.println();
    }

    private BaseDatos bd = null;
    private String usuarioSesion = null;
    private static GestorBase instancia = null;
}
