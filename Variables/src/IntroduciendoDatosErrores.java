import java.util.Scanner;

public class IntroduciendoDatosErrores {
    public static void main(String[] args) {

        //leer dato por consola
        String dato;  //clase para leer datos de distintos tipos
        Scanner entrada = new Scanner(System.in);  //new scanner consola
        System.out.print("Introduce un entero: ");  //print no salta la linea, lo otro es printline
        dato = entrada.nextLine();  //lee el dato en la linea
        //System.out.println("dato = " + dato);

        //convertir dato a entero
        int numDecimal = 0;    //si no se inicializa dices que estas trabajando con cualquier trabajo

        //control de error en la conversion
        try{
            numDecimal = Integer.parseInt(dato);
        }catch (NumberFormatException e){
            System.out.println("e.getMessage() = " + e.getMessage());
            System.out.println("ERROR - Has de introducir un numero entero");
            main(args); //vuelve a inicializar la rutina, desde 0
            System.exit(0);
        }





        Integer.parseInt(dato);


        //Y representarlo en distintos sistemas
        System.out.println("numDecimal = " + numDecimal);
        System.out.println("Binario = 0b" + Integer.toBinaryString(numDecimal));
        System.out.println("Octal = 0" + Integer.toOctalString(numDecimal));
        System.out.println("Hexadecimal = 0x" + Integer.toHexString(numDecimal));
    }
}
