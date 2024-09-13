# Gestión de Inventario

Este proyecto es una aplicación en Java para gestionar un inventario de productos. Permite agregar, eliminar, buscar y mostrar productos, así como actualizar la cantidad de los mismos, a través de una interfaz de línea de comandos.

## Características

- **Agregar productos**: Añade un nuevo producto con código, nombre, precio y cantidad.
- **Eliminar productos**: Elimina un producto existente por nombre.
- **Buscar productos**: Busca un producto por código o nombre.
- **Mostrar inventario**: Muestra todos los productos en el inventario.
- **Actualizar cantidad**: Actualiza la cantidad de un producto específico por código.

## Estructura del Proyecto

El proyecto está compuesto por los siguientes archivos:

1. **`Producto.java`**: Define la clase `Producto` que representa un producto con código, nombre, precio y cantidad.
2. **`Inventario.java`**: Implementa la lógica para agregar, eliminar, buscar, mostrar y actualizar productos en el inventario.
3. **`Main.java`**: Contiene la clase principal con una interfaz de línea de comandos para interactuar con el sistema de gestión de inventario.

## Requisitos

- JDK 8 o superior

## Instalación

1. Clona este repositorio o descarga el código:
   ```bash
   git clone https://github.com/tuusuario/gestion-inventario.git
2. Compila el código:
   ```bash
   javac GestionInventario/*.java
3. Ejecuta el archivo Main.class para iniciar el sistema de gestión de inventario:
   ```bash
   java GestionInventario.Main
