public class Basic {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println(12 + 5);

        String x = "Maria";
        String m = "Ola";

        int nombre = 19;
        nombre = 6;
        char letra = 'A', algo = 65;
        float Mynun = 12.6f;
        double Man = 12.5d;
        final int numero = 16;
        //numero = 2367;

        int o = 1, y = 9, f, g, h;
        g = f = h = 12;
        System.out.println(m + x + "Yep");


        if (x == m) {
        }


        int myInt = 6;
        double myDouble = myInt;
        System.out.println(myDouble);
        System.out.println(myInt);

        double myDouble1 = 32.9d;
        int myInt1 = (int) myDouble1;
        System.out.println(myInt1);

        int l = 12 + 3;
        int l1 = l + 12;
        int l5 = 6;
        l5 += 5; // l5 = l5 + 5

        //metodos string
        String txt = "HOLA MI AMOR";
        System.out.println(txt.indexOf("HOLA"));
        System.out.println(txt.toLowerCase());

        int randomNum = (int) (Math.random() * 101);

        int time = 12;
        String result = (time < 12) ? "Good day" : "Good night";
        System.out.println(result);

        int v = 0;
        while (v <= 5) {
            System.out.println(v);
            v++;
        }

        for (int i = 0; i <= 5; i = i + 2) {
            System.out.println(i);
            v = 0;
            while (v <= 5) {
                System.out.println(v);
                v++;
            }
        }
        System.out.println("----------");


        for (int c = 0; c < 10; c++) {
            if (c == 7) {
                break;
            }
            System.out.println(c);
        }
        System.out.println("----");

        for (int p = 0; p < 10; p++) {
            if (p == 6) {
                continue;
            }
            System.out.println(y);
        }
        System.out.println("----");

       /* int h = 0;
        while (h < 10){
            System.out.println(h);
            h++;
            if (h == 6){
                break;
            }
        }
        System.out.println("----"); */

        int mi = 0;
        while (mi < 10) {
            if (mi == 6) {
                mi++;
                continue;
            }
            System.out.println(mi);
            mi++;
        }
        System.out.println("----");


        //loop arrays
        String[] carros = {"aja", "aja", "aja"};
        for (int i = 0; i < carros.length; i++) {
            System.out.println(carros[i]);
        }

        for (String q : carros) {   //for each string called "" in cars, print ""
            System.out.println(q);
        }
        System.out.println("----");

        int[][] numbers1 = {{1, 2, 3}, {4, 5, 6}};
        for (int i = 0; i < numbers1.length; i++) {
            for (int w = 0; w < numbers1[i].length; w++) {
                System.out.println(numbers1[i][w]);
            }
        }

        myMethod("Karla");   //parametros
        myMethod("Josefa");

        System.out.println("----");

        myMethod("Ariana", 19);
        myMethod("Jose", 19);


        int numReal = numbersMethod(3,6);
        System.out.println(numReal);

        checkAge(18);

    }

    public static void myMethod(String madres) {  //argumentos
        System.out.println(madres + " y Maria");

    }

    public static void myMethod(String nombre, int age) {
        System.out.println(nombre + " tiene " + age);
    }

    public static int numbersMethod(int x, int y) {
        return x - y;
    }

    public static void checkAge(int age){
        if (age <= 18){
            System.out.println("You're allowed to get in");
        }else{
            System.out.println("You're not allowed to get in");
        }
    }


    //sobrecargar un metodo (pueden tener el mismo nombre y doferentes parametros)
    static int plusMeth(int x, int y){
        return x + y;
    }

    static double plusMeth(double x, double y){
        return x + y;
    }


}
