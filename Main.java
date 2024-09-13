package GestionInventario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Inventario inventario = new Inventario();

        while (true) {
            System.out.println("Bienveniido que quieres hacer.");
            System.out.println("1. Agregar producto");
            System.out.println("2. Elimar producto");
            System.out.println("3. Buscar producto por codigo");
            System.out.println("4. Buscar producto por nombre");
            System.out.println("5. Mostrar inventario");
            System.out.println("6. Actualizar cantidad");
            System.out.println("7. Salir");
            int opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                        System.out.println("Indica el nombre del producto que quieres agregar: ");
                        System.out.println("Codigo: ");
                        String codigo = scanner.nextLine();
                        System.out.println("Nombre: ");
                        String nombre = scanner.nextLine();
                        System.out.println("Precio: ");
                        double precio = scanner.nextDouble();
                        System.out.println("Cantidad ");
                        int cantidad = scanner.nextInt();
                        inventario.agregarProductos(new Producto(codigo, nombre, precio, cantidad));

                    break;
                case 2: 
                        System.out.println("Escribe el nombre del producto que quieras elminar ");
                        String nombreEliminar = scanner.nextLine();
                        inventario.eliminarProducto(nombreEliminar);
                    
                    break;
                case 3:
                        System.out.println("Escribe el codigo del producto");
                        String codigoBuscar = scanner.nextLine();
                        inventario.buscarProductoPorCodigo(codigoBuscar);
                
                    break;
                case 4:
                        System.out.println("Escribe el nombre del producto");
                        String nombreProd = scanner.nextLine();
                        inventario.buscarProductoPorNombre(nombreProd);

                    break;
                    
                case 5: 
                        inventario.mostrarInventario();
                    
                    break;

                case 6:
                        System.out.println("Indica el codigo del producto que quieras actualizar");
                        String codigoActualizar = scanner.nextLine();
                        System.out.println("Indica la cantidad nueva");
                        int cantidadNueva = scanner.nextInt();
                        inventario.actualizarCantidad(codigoActualizar, cantidadNueva);

                case 7:
                        System.out.println("Hasta pronto...");
                        scanner.close();
                        return;


                default:
                        System.out.println("Opcion no valida");
                    break;
            }


        }
    

    }

     
}

    
