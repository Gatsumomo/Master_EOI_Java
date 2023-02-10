import java.util.Random;

public class JavaUtilRandom {
    public static void main(String[] args) {
        Random objetoRnd = new Random();

        int numInt = objetoRnd.nextInt();
        System.out.println("numInt = " + numInt);

        long numLong = objetoRnd.nextLong();
        System.out.println("numLong = " + numLong);

        float numFloat = objetoRnd.nextFloat();
        System.out.println("numFloat = " + numFloat);

        double numDouble = objetoRnd.nextDouble();
        System.out.println("numDouble = " + numDouble);

        // Rangos 0....n
        for (int i = 0; i < 100; i++) {
            numInt = objetoRnd.nextInt(91);
            System.out.println("numInt = " + numInt);
        }
        System.out.println("------------");

        for (int i = 0; i < 100; i++) {
            numFloat = objetoRnd.nextFloat(5,58);
            System.out.println("numFloat = " + numFloat);
        }

        // Rango n....m
        numInt = objetoRnd.nextInt(1,91); //Bingo
        System.out.println("numInt = " + numInt);
        numLong = objetoRnd.nextLong(23900000, 2500001);
        System.out.println("numLong = " + numLong);
        numFloat = objetoRnd.nextFloat(58,65);
        System.out.println("numLong = " + numLong);

        // 48 ... 90
        numInt = 48 + objetoRnd.nextInt(90 - 48 + 1);

    }
}

