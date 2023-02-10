package abstraccion;

public class HijaDePersona extends Persona{
    //atributos
    public String domicilio;

    //metodos normales
    public void visitarAPapa(){
        System.out.println("visito a mi padre");
    }


    //reescribir los abstract methods--> IMPLEMENTACION
    @Override
    public void registro() {
        System.out.println("Registrar usuario");
    }

    @Override
    public void editar() {
        System.out.println("Editar usuario");
    }

    @Override
    public void borrar() {
        System.out.println("Borrar usuario");
    }

    //constructor
    public HijaDePersona(String nombre, String apellidos, String email, String domicilio) {
        super(nombre, apellidos, email);
        this.domicilio = domicilio;
    }
}
