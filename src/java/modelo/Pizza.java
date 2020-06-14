package modelo;

public class Pizza {

    public Pizza(int id, String nombre, int tipo, double precio_peq, double precio_med, double precio_gran) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio_peq = precio_peq;
        this.precio_med = precio_med;
        this.precio_gran = precio_gran;
    }

    

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTipo() {
        return tipo;
    }

    public double getPrecio_peq() {
        return precio_peq;
    }

    public double getPrecio_med() {
        return precio_med;
    }

    public double getPrecio_gran() {
        return precio_gran;
    }

    @Override
    public String toString() {
        return "Pizza{" + "id=" + id + ", nombre=" + nombre + ", tipo=" + tipo + ", precio_peq=" + precio_peq + ", precio_med=" + precio_med + ", precio_gran=" + precio_gran + '}';
    }

    

    
    
    
    
    private final int id;
    private final String nombre;
    private final int tipo;
    private final double precio_peq;
    private final double precio_med;
    private final double precio_gran;
    
}
