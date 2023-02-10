public class Super {
    public static void main(String[] args) {
        Persona miPersona = new Persona("Ariana","Rodcar");
        System.out.println(miPersona.toString());
        System.out.println("-------------");

        Alumno miAlumno = new Alumno("Jose","Perez","bachiller","Las Lajas Blancas");
        System.out.println(miAlumno.toString());
        System.out.println("-------------");

        miAlumno.metodoPersona();
        System.out.println("-------------");

        miAlumno.metodoAlumno();
        System.out.println("-------------");

        System.out.println(miAlumno.otroMetodoPersona());
    }
}

class Persona{
 String nombre;
 String apellido;
    public void metodoPersona(){
     System.out.println("Yo soy tu padre");
     int resultado = 45;  //solo este ambito
    }

    public int otroMetodoPersona(){
        int res = 45;
        return res;
    }
    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Persona:" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'';
    }
} //superclase

class Alumno extends Persona{
    String curso;
    String centro;

    @Override
    public void metodoPersona() {   //reescribir
        System.out.println("Luke");
        super.metodoPersona();
        System.out.println(" .. y tu lo sabes");
        //System.out.println("resultado = " + resultado);  //solo existe en este ambito {}
    }

    public int otroMetodoPersona(){
        int resOtro = super.otroMetodoPersona();
        int a = 2 * resOtro;
        return a;
    }
    public void metodoAlumno(){
        System.out.println("Hola");
        metodoPersona();   //no hace falta super. --> ya lo ha heredado
    }

    public Alumno(String nombre, String apellido, String curso, String centro) {
        super(nombre, apellido);  //llamada a super clase de alumno--> persona
        this.curso = curso;
        this.centro = centro;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "curso='" + curso + '\'' +
                ", centro='" + centro + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }
} //subclase