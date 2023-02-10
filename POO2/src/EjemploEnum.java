public class EjemploEnum {
    public static void main(String[] args) {
        Color miColor = Color.VERDE;
        System.out.println("miColor = " + miColor);
        System.out.println("---------------");

        //convertir el conjunto de valores en una matriz
        System.out.println(Color.values()[3]);

        //recorrer enumeradores
        for(Color tuColor:Color.values()){   //tipo Color
            System.out.println("tuColor = " + tuColor);
        }

        //toma de decisiones -Control de flujo-

        miColor = Color.NEGRO;
        //if
        if(miColor == Color.NEGRO){
            System.out.println("El color es negro");
        }else{
            System.out.println("El color no es negro");
        }

        //switch
        switch(miColor){
            case ROJO:
                System.out.println("El color es rojo");
                break;
            case AZUL:
                System.out.println("El color es azul");
                break;
            case NEGRO:
                System.out.println("El color es negro");
                break;
            case VERDE:
                System.out.println("El color es verde");
                break;
            default:
                System.out.println("es la nada misma");
        }

        //switch notacion 2
        switch(miColor){
            case VERDE -> {
                System.out.println("El color es verde");
            }
            case NEGRO -> {
                System.out.println("El color es negro");
            }
            case AZUL -> {
                System.out.println("El color es azul");
            }
            case ROJO -> {
                System.out.println("El color es rojo");
            }
        }

    }
}
