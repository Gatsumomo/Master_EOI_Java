
import javax.swing.*;

public class IntroduciendoDatos {
    public static void main(String[] args) {

        //convertir dato a entero y representarlo en distintos sistemas

        //leer dato (String), el ordenador interpretara  como texto

        String dato;
        dato = JOptionPane.showInputDialog(null,"Introduce un numero entero:"); //No pertenece a la biblioteca de Java, se importa, es una ventana

        //convertir dato a entero y representarlo en distintos sistemas

        int numDecimal = Integer.parseInt(dato); //el metodo de la clase Integer parseInt convierte el string en numero en entero
        System.out.println("numDecimal = " + numDecimal);
        System.out.println("Binario = 0b" + Integer.toBinaryString(numDecimal));
        System.out.println("Octal = 0" + Integer.toOctalString(numDecimal));
        System.out.println("Hexadecimal = 0x" + Integer.toHexString(numDecimal));

    }
}
