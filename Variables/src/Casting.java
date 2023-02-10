public class Casting {
    public static void main(String[] args) {

        //widening casting
        byte miByte = 68; //1 byte
        System.out.println("miByte = " + miByte);

        short miShort = miByte; //de 1 a 2 byte
        System.out.println("miShort = " + miShort);

        int miInt = miShort; //de 2 a 4 byte
        System.out.println("miInt = " + miInt);

        long miLong = miInt; // de 4 a 8 byte
        System.out.println("miLong = " + miLong);

        float miFloat = miLong; // de 8 bytes enterosa a 4 bytes real
        System.out.println("miFloat = " + miFloat);

        double miDouble = miFloat; //de 4 bytes real a 8 bytes real
        System.out.println("miDouble = " + miDouble);
        System.out.println("----------------------------------");

        //Narrowing casting, es manual. Hacia abajo se pierde info
        miDouble = 456468.56e38d;
        System.out.println("miDouble = " + miDouble);

        miFloat = (float)miDouble; //(float) convierte la variable en float
        System.out.println("miFloat = " + miFloat);

        miLong = (long)miDouble;
        System.out.println("miLong = " + miLong);

        miInt = (int)miLong;
        System.out.println("miInt = " + miInt);

        miShort = (short)miDouble;

        miByte = (byte)miDouble;

        System.out.println("-----------");

        miFloat = 1455.12246f;
        System.out.println("valor entero = " + (int)miFloat);
        System.out.println("decimales = " + (miFloat - (int)miFloat));  //restamos la parte entera y quedan los decimales


    }
}
