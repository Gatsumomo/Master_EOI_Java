package abstraccionEjercicio;

import java.util.Objects;
import java.util.Scanner;

public class EjemploFiguraGeometrica {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduzca nombre: ");
        String nombre = entrada.nextLine();

        /*switch(nombre){
            case "circulo":
                System.out.print("Introduzca radio: ");
                int radio = entrada.nextInt();
                System.out.print("Introduzca diametro: ");
                int diametro = entrada.nextInt();


                System.out.println("-----------------");
                Circulo miCirculo = new Circulo(nombre,radio,diametro);
                miCirculo.superficie();
                miCirculo.perimetro();
                break;
            default:
                System.out.print("Introduzca la longitud del lado: ");
                int longitudLado = entrada.nextInt();

                Cuadrado miCuadrado = new Cuadrado(nombre,longitudLado);
                miCuadrado.perimetro();
                miCuadrado.superficie();
        }*/




        if(Objects.equals(nombre,"circulo")){
            System.out.print("Introduzca radio: ");   //try and catch
            int radio = entrada.nextInt();
            System.out.print("Introduzca diametro: ");
            int diametro = entrada.nextInt();


            System.out.println("-----------------");
            Circulo miCirculo = new Circulo(nombre,radio,diametro);
            miCirculo.superficie();
            miCirculo.perimetro();
        }else {
            System.out.print("Introduzca la longitud del lado: ");
            int longitudLado = entrada.nextInt();

            Cuadrado miCuadrado = new Cuadrado(nombre,longitudLado);
            miCuadrado.perimetro();
            miCuadrado.superficie();
        }
    }
}
