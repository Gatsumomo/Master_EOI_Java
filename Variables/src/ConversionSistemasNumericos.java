public class ConversionSistemasNumericos {
    public static void main(String[] args) {

        /*convertir mediante metodos de la clase integer
        variables a distintos sistemas*/

        int numDecimal = 0b1110;
        System.out.println("numDecimal = " + numDecimal);

        //convertir la variable (decimal) a string binario

        System.out.println("Binario = 0b" + Integer.toBinaryString(numDecimal));

        //convertir la variable (decimal) a string octal

        System.out.println("Octal = 0" + Integer.toOctalString(numDecimal));

        //convertir la variable (decimal) a string hexadecimal

        System.out.println("Hexadecimal = 0x" + Integer.toHexString(numDecimal));
    }
}
