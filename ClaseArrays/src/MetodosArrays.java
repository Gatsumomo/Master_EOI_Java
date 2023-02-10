import java.util.Arrays;

public class MetodosArrays {
    public static void main(String[] args) {

        String[] colores1 = {"rojo", "azul", "verde", "amarillo", "naranja"};
        int [] numeros = {1,2,3,4,5,6};
        int [] numeros1 = {2,8,3,5,4,9};

       /* //Buscar SOLO en arrays ordenados
        System.out.println("Arrays.binarySearch() = " + Arrays.binarySearch(numeros, 3));  //encuentra la primera coincidencia
        System.out.println("Arrays.binarySearch() = " + Arrays.binarySearch(numeros1, 2,5, 4)); //no incluye ni from ni to
        System.out.println("Arrays.binarySearch(colores1, \"rojo\") = " + Arrays.binarySearch(colores1, "rojo")); */

        //Ordenar
        Arrays.sort(numeros);
        for(int a:numeros){
            System.out.println("a = " + a);
        }

        Arrays.sort(colores1);
        for(String color:colores1){
            System.out.println("color = " + color);
        }

        //Comparar
        System.out.println("Arrays.equals(numeros, numeros1) = " + Arrays.equals(numeros, numeros1));
        System.out.println("Arrays.compare() = " + Arrays.compare(numeros, numeros1));
            // no sirve    System.out.println("Arrays.compare(nu) = " + Arrays.compare(numeros,1,5,numeros1,1));


        //copiar
        System.out.println("..---...--.");
        int[] copia = Arrays.copyOf(numeros,3);
        for (int a:copia){
            System.out.println("a = " + a);
        }

        int[] copiaRango = Arrays.copyOfRange(numeros, 2, numeros.length);
        System.out.println("..---...--.");

        //Rellenar
        int[] miMatriz = new int[8];
        for (int i:miMatriz){
            System.out.println("i = " + i);
        }

        Arrays.fill(miMatriz,1);
        for(int i:miMatriz){
            System.out.println("i = " + i);
        }

        //Matriz bidimensional
        int[][] bidi = new int[3][4];
        bidi[0][0] = 23;


        int[][] bidi1 = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};

        int[][] bidi2 = new int[4][];
        bidi[0] = new int[4];
        bidi[1] = new int[3];
        bidi[2] = new int[7];
        //bidi[3] = new int[2];

        int[][] bidi3 = {{1,2,3},{4,5,6},{7,8,9},{10,11}};
        for(int i = 0; i < bidi3.length; i++){
            for (int j = 0; j < bidi3[i].length; j++){
                System.out.println("bidi3[" + i + "][" + j + "] = " + bidi3[i][j]);
            }
        }
    }
}
