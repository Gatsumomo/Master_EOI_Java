public class EjemploCoche {
    public static void main(String[] args) {
        // Metodo static
        Coche.llamarEmergencias();
        System.out.println(Coche.eCall);
        System.out.println(Coche.distintivo);

        //"instanciar" un objeto (crear)
        Coche miCoche = new Coche();  //this is the replica
        Coche tuCoche = new Coche();

        miCoche.marca = "Ford";
        miCoche.modelo = "Mondeo";
        miCoche.color = "Negro";
        miCoche.combustible = "Diesel";
        miCoche.cilindrada = 2000;
        miCoche.deposito = 50;
        
        //miCoche.eCall = "991"; // no se puede cambiar pq es final 

        tuCoche.marca = "Toyota";

        System.out.println("miCoche = " + miCoche.eCall);
        System.out.println("miCoche.marca = " + miCoche.marca);
        System.out.println("miCoche.modelo = " + miCoche.modelo);
        System.out.println("miCoche.color = " + miCoche.color);
        System.out.println("tuCoche.eCall = " + tuCoche.eCall);

        System.out.println("----------------");

        //modificacion de atributos estaticos
        System.out.println("Coche.distintivo = " + Coche.distintivo);
        System.out.println("tuCoche = " + tuCoche.distintivo);
        System.out.println("Coche.distintivo = " + Coche.distintivo);
        //miCoche.distintivo = "F";
        Coche.distintivo = "G";
        System.out.println("Coche.distintivo = " + Coche.distintivo);
        System.out.println("miCoche.distintivo = " + miCoche.distintivo);
        System.out.println("Coche.distintivo = " + tuCoche.distintivo);
        System.out.println("----------------");

        System.out.println(miCoche.detallesCoche());
        System.out.println("----------------");

        System.out.println("consumo = " + miCoche.consumo(600));
        System.out.println("consumo = " + miCoche.consumo(600,40));
   //el objeto entiende que hay un metodo que puede utilizar de dos maneras distintas
   
    }
}
