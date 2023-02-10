import java.util.Arrays;

public class CharYBool {
    public static void main(String[] args) {

        //type char
        char caracter = '@';
        System.out.println("caracter = " + caracter);

        char caracter1 = '\u0021';
        System.out.println("caracter1 = " + caracter1);

        char caracter2 = 66;
        System.out.println("caracter2 = " + caracter2);

        char caracter3 = 'A';
        System.out.println("caracter3 = " + caracter3);

        System.out.println("----------");

        //type booleano
        boolean dato = true; //false
        System.out.println("dato = " + dato);

        int a,b;  //variable declarada sin asignar valor
        a = 4;
        b = 7;
        dato = a > b;  //sabe de antemano cual es el resultado
        System.out.println("dato = " + dato);
        dato = a < b;
        System.out.println("dato = " + dato);
        dato = (b - a) == 3;
        System.out.println("dato = " + dato);

        System.out.println("dato = " + dato);




    }
}
