package Punto2;

public class Main {
    public static void main(String[] args) {
        // Crear un libro
        Libro libro = new Libro("Cien Años de Soledad", "Gabriel García Márquez", "978-3-16-148410-0", true);

        // Mostrar los detalles del libro
        libro.mostrarDetalles();

        // Intentar prestar el libro
        libro.prestar();   // El libro se prestará

        // Intentar prestarlo nuevamente
        libro.prestar();   // Debería mostrar que no está disponible

        // Mostrar los detalles actualizados
        libro.mostrarDetalles();

        // Devolver el libro
        libro.devolver();  // El libro será devuelto

        // Intentar devolverlo nuevamente
        libro.devolver();  // Debería mostrar que ya está disponible

        // Mostrar los detalles finalizados
        libro.mostrarDetalles();
}
}