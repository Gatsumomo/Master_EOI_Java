public class Ejercicio {
    public static void main(String[] args) {

        int nota = 4;
        String resolucion = "";

        switch (nota){     //no acepta float, ni operaciones logicas, solo casos concretos
            case 5:
                resolucion = "Aprobado";
                break;
            case 6:
                resolucion = "Aprobado";
                break;
            case 7:
                resolucion = "Aprobado";
                break;
            case 8:
                resolucion = "Notable";
                break;
            case 9:
                resolucion = "Sobresaliente";
                break;
            case 10:
                resolucion = "Sobresaliente";
                break;
            default:
                resolucion = "Reprobado";  //no se pone el break porque es el ultimo
        }

        System.out.println("resolucion = " + resolucion);

        //con decimales (hacer)

        //con String

        String camiseta = "verde";
        String serigrafia = "";

        switch (camiseta){
            case "roja":
                serigrafia = "blanco";
                break;
            case "verde":
                serigrafia = "amarillo";
                break;
            default:
                serigrafia = "no tiene color";
        }

        System.out.println("serigrafia = " + serigrafia);

    }
}
