package Taller1;

public class Bibliotecario extends Persona {
    private String idEmpleado;

    public Bibliotecario(String nombre, String apellido, String idEmpleado) {
        super(nombre, apellido);
        this.idEmpleado = idEmpleado;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre + " " + apellido + ", ID Empleado: " + idEmpleado);
}
}
