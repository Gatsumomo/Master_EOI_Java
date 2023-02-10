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
            //Detectar sistema numerico/de numeracion (si es tal o tal o tal).    14dec,0oct,0b1110bin,0x0ehexadec

            if (dato.charAt(0)!=0) {                                                      //se comparan caracteres
                //decimal 14
                numDecimal = Integer.parseInt(dato);
            }else if (dato.charAt(1)=='b') {
                //binario 0b1110
                dato = dato.substring(2); //eliminar los dos primeros
                numDecimal = Integer.parseInt(dato,2);
            }else if (dato.charAt(1)=='x') {
                //hexadecimal 0x0E
                dato = dato.substring(2);
                numDecimal = Integer.parseInt(dato,16);
            }else {
                //octal 016
                numDecimal = Integer.parseInt(dato,8);
            }


        }catch (NumberFormatException e){
            System.out.println("e.getMessage() = " + e.getMessage());
            System.out.println("ERROR - Has de introducir un numero entero");
            main(args); //vuelve a inicializar la rutina, desde 0
            System.exit(0);
        }

        //Y representarlo en distintos sistemas
        System.out.println("numDecimal = " + numDecimal);
        System.out.println("Binario = 0b" + Integer.toBinaryString(numDecimal));
        System.out.println("Octal = 0" + Integer.toOctalString(numDecimal));
        System.out.println("Hexadecimal = 0x" + Integer.toHexString(numDecimal));
    }
}
