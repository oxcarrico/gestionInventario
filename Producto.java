package GestionInventario;

public class Producto {
    String codigo;
    String nombre;
    double precio;
    int cantidad;

    public Producto(String codigo, String nombre, double precio, int cantidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;

    }

    public String getCodigo() { 
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) { 
        this.cantidad = cantidad;
    }
        
    public String toString() { 
        return codigo + "codigo" + nombre + "nombre" + precio + "precio" + cantidad + "cantidad";
    }



}
