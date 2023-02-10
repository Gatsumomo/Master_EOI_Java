package abstraccion;

abstract class Persona {  //siempre una superclase
    //atributos
    protected String nombre;
    protected String apellidos;
    protected String email;

    //metodos abstractos
    abstract public void registro();
    abstract public void editar();
    abstract public void borrar();

    //metodos "normales"
    public String nombreCompleto(){
        return this.nombre + " " + this.apellidos;
    }

    //constructor
    public Persona(String nombre, String apellidos, String email) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
    }
}
