import java.util.Scanner;

public class IntroduciendoDatosConsola {
    public static void main(String[] args) {

        //leer dato por consola
        String dato;  //clase para leer datos de distintos tipos
        Scanner entrada = new Scanner(System.in);  //new scanner consola
        System.out.print("Introduce un entero: ");  //print no salta la linea, lo otro es printline
        dato = entrada.nextLine();  //lee el dato en la linea
        //System.out.println("dato = " + dato);

        //convertir dato a entero y representarlo en distintos sitemas
        int numDecimal = Integer.parseInt(dato); //el metodo de la clase Integer parseInt convierte el string en numero en entero
        System.out.println("numDecimal = " + numDecimal);
        System.out.println("Binario = 0b" + Integer.toBinaryString(numDecimal));
        System.out.println("Octal = 0" + Integer.toOctalString(numDecimal));
        System.out.println("Hexadecimal = 0x" + Integer.toHexString(numDecimal));
    }
}
