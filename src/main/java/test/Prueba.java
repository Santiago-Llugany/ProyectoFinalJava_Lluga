
package test;

import domain.Libreria;

public class Prueba {
    public static void main(String[] args) {
        Libreria libreria = new Libreria();
        
        // Cargar libros en la librería
        libreria.cargarLibros();

        // Mostrar los libros cargados
        libreria.mostrarLibros();
    }
}
