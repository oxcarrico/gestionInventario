package GestionInventario;
import java.util.ArrayList;

public class Inventario {
    ArrayList<Producto> productos;

    public Inventario() {
        this.productos = new ArrayList<>();

    }

    public void agregarProductos(Producto producto) {
        productos.add(producto);
        System.out.println("El producto se agrego correctamente ");

    }

    public void eliminarProducto(String nombre) {
        Producto producto = buscarProductoPorNombre(nombre);
        if (producto != null) {
            productos.remove(producto);
            System.out.println("El producto ha sido eliminado correctamente ");
        } else {
            System.out.println("Ese producto no existe");
        }

    }

    public Producto buscarProductoPorCodigo(String codigo) {
        for (Producto producto : productos) {
            if (producto.getNombre().equalsIgnoreCase(codigo)) {
                return producto;
            }   

        } 
        return null;

    }


    public Producto buscarProductoPorNombre(String nombre) {
        for (Producto producto : productos) {
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                return producto;
            }
        }
        return null;

    }

    public void mostrarInventario() {
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }

    public void actualizarCantidad(String codigo, int cantidad) {
       Producto producto = buscarProductoPorCodigo(codigo);
       if (producto != null) {
         producto.setCantidad(cantidad);
         System.out.println("Cantidad actualizada ");
       } else {
        System.out.println("El producto no se ha encontrado");
        
       }


    }


}
