
package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Libreria {
    private List<Libro> listaLibros;

    // Constructor
    public Libreria() {
        this.listaLibros = new ArrayList<>();
    }

    // Método para cargar libros
    public void cargarLibros() {
        Scanner scanner = new Scanner(System.in);
        String continuar;
        
        do {
            System.out.println("\nIngrese los datos del libro:");
            System.out.println("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.println("Autor: ");
            String autor = scanner.nextLine();
            System.out.println("Fecha De Devolucion: ");
            int fechaDeDevolucion = scanner.nextInt();
            scanner.nextLine(); // Consumir salto de línea después de nextLong()
            // Crear objeto Libro y agregarlo a la lista
            listaLibros.add(new Libro(nombre, autor, fechaDeDevolucion));
            // Preguntar al usuario si desea agregar otro libro
            System.out.println("¿Desea agregar otro libro? (s/n): ");
            continuar = scanner.nextLine();

        } while (continuar.equals("s"));
    }

 
   // Método para mostrar los libros
    public void mostrarLibros() {
        System.out.println("\nLibros en la librería:");
        for (Libro libro : listaLibros) {
            System.out.println(libro);
        }
    }
}
