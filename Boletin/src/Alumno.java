public class Alumno {
    String nombre;
    String apellidos;
    String direccion;
    String contacto;
    String grupo;

    public Alumno(String nombre, String apellidos, String direccion, String contacto, String grupo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.contacto = contacto;
        this.grupo = grupo;
    }

    @Override
    public String toString() {
        return "Alumno: " + nombre + " " + apellidos + "\ndireccion: " + direccion + "\ncontacto: " + contacto + "\ngrupo: " + grupo;
    }
}
