public class Reales {

    public static void main(String[] args) {


        //tipo float
        float numeroFloat = 3.2564e4f; //32564f
        System.out.println("numeroFloat = " + numeroFloat);
        System.out.println("En bytes son: " + Float.BYTES);
        System.out.println("En bits son: " + Float.SIZE);
        System.out.println("Maximo: " + Float.MAX_VALUE);
        System.out.println("Minimo: " + Float.MIN_VALUE);
        System.out.println("Maximo exponente: " + Float.MAX_EXPONENT);
        System.out.println("Minimo exponente: " + Float.MIN_EXPONENT);
        System.out.println("Infinito positivo: " + Float.POSITIVE_INFINITY);
        System.out.println("Infinito negativo: " + Float.NEGATIVE_INFINITY);
        System.out.println("------------------------");

        //type double
        double numeroDouble = 45.69788721d; //no es necesario d, pero es lo razonable
        System.out.println("numeroDouble = " + numeroDouble);
        System.out.println("En bytes son: " + Double.BYTES);
        System.out.println("En bits son: " + Double.SIZE);
        System.out.println("Maximo: " + Double.MAX_VALUE);
        System.out.println("Minimo: " + Double.MIN_VALUE);
        System.out.println("Maximo exponente: " + Double.MAX_EXPONENT);
        System.out.println("Minimo exponente: " + Double.MIN_EXPONENT);
        System.out.println("Infinito positivo: " + Double.POSITIVE_INFINITY);
        System.out.println("Infinito negativo: " + Double.NEGATIVE_INFINITY);
        System.out.println("------------------------");
    }
}
