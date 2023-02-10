public class Cliente {

    //Atributos
    String nombre;
    String apellidos;
    String dni;
    String direccion;
    String email;

    //constructor

    public Cliente(String nombre, String apellidos, String dni, String direccion, String email) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.direccion = direccion;
        this.email = email;
    }


    //metodo


    @Override
    public String toString() {
        return "Cliente: \t" +
                "nombre:" + nombre + '\n' +
                "\t\t\tapellidos:" + apellidos + '\n' +
                "\t\t\tdni: " + dni + '\n' +
                "\t\t\tdireccion: " + direccion + '\n' +
                "\t\t\temail: " + email + '\n';

   //nombre apellidos dni direccion email --> todo en una linea
    }
}
