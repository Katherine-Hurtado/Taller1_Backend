package Taller1;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("katherine", "Hurtado", "I103");
        Bibliotecario bibliotecario = new Bibliotecario("Cristian", "Escobar", "I257");

        usuario.mostrarDatos();         // Mostrará: Nombre: Katherine Hurtado, ID Usuario: I103
        bibliotecario.mostrarDatos();   // Mostrará: Nombre: Cristian Escobar, ID Empleado:I257
}
}