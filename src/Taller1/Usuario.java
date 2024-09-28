package Taller1;

public class Usuario extends Persona {
    private String idUsuario;

    public Usuario(String nombre, String apellido, String idUsuario) {
        super(nombre, apellido);
        this.idUsuario = idUsuario;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre + " " + apellido + ", ID Usuario: " + idUsuario);
    }
}