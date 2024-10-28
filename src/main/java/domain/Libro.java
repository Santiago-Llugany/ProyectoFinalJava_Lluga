
package domain;

public class Libro {    
    // Atributos
    private long idLibro;
    private static long contadorLibros;
    private String nombre;
    private String autor;
    private boolean disponibilidad;
    private int fechaDeDevolucion;
    private String usuarioPrestado; //esta parte hay que hacerla en base a lo que necesite gabi, para mi deberia darle el valor del usuario que esta en ese momento llevandose el libro pero ni idea de como hacer y no se quien tiene la parte de usuario

    // Constructor
    public Libro(String nombre, String autor, int fechaDeDevolucion) {
        this.nombre = nombre;
        this.autor = autor;
        this.disponibilidad = true; // Disponibilidad por defecto a true
        this.fechaDeDevolucion = fechaDeDevolucion;
        Libro.contadorLibros++;
        this.idLibro = Libro.contadorLibros;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return this.autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isDisponibilidad() {
        return this.disponibilidad;
    }
    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
    
    public int getFechaDeDevolucion() {
        return this.fechaDeDevolucion;
    }
    public void setFechaDeDevolucion(int fechaDeDevolucion) {
        this.fechaDeDevolucion = fechaDeDevolucion;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Libro{idLibro=").append(idLibro);
        sb.append(", nombre=").append(nombre);
        sb.append(", autor=").append(autor);
        sb.append(", disponibilidad=").append(disponibilidad);
        sb.append(", fechaDeDevolucion=").append(fechaDeDevolucion);
        sb.append(", usuarioPrestado=").append(usuarioPrestado);
        sb.append('}');
        return sb.toString();
    }

    

    

}
