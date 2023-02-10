package abstraccion;

public class EjemploAbstraccion {
    public static void main(String[] args) {
        //Persona miPersona = new Persona() {
        //no tiene sentido porque el objeto hereda metodos vacios, no puede ser instanciado

        HijaDePersona miPersona = new HijaDePersona("Ariana","Rodriguez Carmona","arirodcar@gmail.com","Calle Turin, 1D");

        miPersona.visitarAPapa();
        System.out.println("------------------------------");
        System.out.println(miPersona.nombreCompleto());
        System.out.println("------------------------------");
        miPersona.borrar();
        System.out.println("------------------------------");
        miPersona.editar();
        System.out.println("------------------------------");
        miPersona.registro();
    }
}
