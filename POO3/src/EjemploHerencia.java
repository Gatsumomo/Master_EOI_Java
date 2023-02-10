
public class EjemploHerencia {
    public static void main(String[] args) {
        //Vehiculo miVehiculo = new Vehiculo();

        Automovil miCoche = new Automovil();
        //definidos en Automovil. EL PADRE
        miCoche.ruedas = 4;
        miCoche.combustible = "Hibrido";
        miCoche.abrirMaletero();
        System.out.println("-------------------");

        //definidos en Vehiculo. EL HIJO de automovil
        miCoche.marca = "Ford";
        miCoche.modelo = "Fiesta";
        miCoche.claxon();
        miCoche.avanzar();
        miCoche.abrirMaletero();
        miCoche.disenador = "da";
        System.out.println(miCoche.getDisenador());
        System.out.println(miCoche.toString());
        System.out.println("-------------------");

        //definidos en motocicleta. EL HIJO el hijo de automovil
        Motocicleta miMoto = new Motocicleta();
        System.out.println("miMoto = " + miMoto.ruedas);
        miMoto.transimision = "Cadena";
        miMoto.marca = "Suzuki";
        miMoto.modelo = "Intrudes VL800";
        miMoto.potencia = 75;   //caballos
        miMoto.acelerarPuno8();
        miMoto.claxon();
        miMoto.avanzar();
        System.out.println("-------------------");

        //definidos en TodoTerreno. EL HIJO de automovil y vehiculo
        TodoTerreno miTodoTerreno = new TodoTerreno();
        miTodoTerreno.reductora = "10:1";
        miTodoTerreno.cabrestante = "Winch";
        miTodoTerreno.vadearRio();
              //de automovil
        miTodoTerreno.ruedas = 4;
        miTodoTerreno.combustible = "Hibrido";
        miTodoTerreno.abrirMaletero();
              //de vehiculo
        miTodoTerreno.marca = "";
        miTodoTerreno.modelo = "";
        miTodoTerreno.potencia = 36;
        miTodoTerreno.claxon();
        miTodoTerreno.avanzar();
    }
}
