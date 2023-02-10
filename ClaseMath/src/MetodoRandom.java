public class MetodoRandom {
    public static void main(String[] args) {



        // Generar numero aleatorio
        for (int i = 0; i < 100; i++){
            System.out.println(Math.random() * 100);
        }
        System.out.println("-------------------");




        //con dos decimales
        System.out.println(Math.random());
        for (int i = 0; i < 100; i++){
            int n = (int)(Math.random() * 100);
            System.out.println("n = " + n);
            float f = n;
            System.out.println("f = " + f/100);
        }
        System.out.println("-------------------");





        // aleatorio del 0 al 100
        for (int i = 0; i < 100; i++){
            int n = (int)(Math.random() * 100 + 1);  //(int) ese casting no redondea, trunca el numero
            System.out.println("n = " + n);
        }
        System.out.println("-------------------");






        // Aleatorio del 1 al 90 (Bingo)
        for (int i = 0; i < 100; i++){
            int n = 1 + (int)(Math.random() * (90 + 1));  // 1 como numero minimo a obtener
            System.out.println("n = " + n);
        }
        System.out.println("-------------------");




        //juego del bingo






        //solucion 1
        int[] bingo = new int[91];
        int cont = 0;
        while(cont < 90){
            int n = 1 + (int)(Math.random() * 90);
            if (bingo[n] != n){
                System.out.println("n = " + n);
                bingo[n] = n;
                cont++;
            }
        }
        System.out.println("--------------------");




        //solucion 2
        int[] bingo1 = new int[90];
        cont = 0;
        while(cont < 90){
            int n = 1 + (int)(Math.random() * 90);
            if (bingo1[n - 1] != n){
                System.out.println("n = " + n);
                bingo[n - 1] = n;
                cont++;
            }
        }
        System.out.println("--------------------");



        //bingo. Numero a numero
        int[] bingo2 = new int[90];
        //controlado desde la consola. Cada vez que pulse una tecla se ejecuta
        boolean salir = false;
        while(!salir) {
            int n = 1 + (int) (Math.random() * 90);
            if (bingo2[n - 1] != n) {
                System.out.println("n = " + n);
                bingo2[n - 1] = n;
                salir = true;
            }
            //salir cuando ya esten todos los numeros
            //contador

        }


    }
}
