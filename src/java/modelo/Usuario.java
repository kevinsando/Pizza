package modelo;

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
public class Usuario {
    
    public Usuario(String id, String password, String nombre, String apellidos, String dirrecion, int rol, int telefono) {
        this.id = id;
        this.password = password;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dirrecion = dirrecion;
        this.rol = rol;
        this.telefono = telefono;
    }

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDirrecion() {
        return dirrecion;
    }

    public int getRol() {
        return rol;
    }

    public int getTelefono() {
        return telefono;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", password=" + password + ", nombre=" + nombre + ", apellidos=" + apellidos + ", dirrecion=" + dirrecion + ", rol=" + rol + ", telefono=" + telefono + '}';
    }
    

    private final String id;
    private final String password;
    private final String nombre;
    private final String apellidos;
    private final String dirrecion;
    private final int rol;
    private final int telefono;

    
    
    

}
