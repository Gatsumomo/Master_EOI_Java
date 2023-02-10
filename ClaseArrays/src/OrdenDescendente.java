import java.util.Arrays;

public class OrdenDescendente {
    public static void main(String[] args) {
        int[] numeros = {2, 7, 9, 3, 1, 5};
        for (int i:numeros) {
            System.out.println("i = " + i);
        }

        String[] colores = {"azul","rojo","verde","amarillo","naranja"};
    }

    //ordenar un array numerico en orden descendente
    public static void ordenInverso(int[] numeros) {

        Arrays.sort(numeros);
        int[] aux = Arrays.copyOf(numeros, numeros.length);
        for (int i = 0; i < numeros.length; i++) {
            int indice = numeros.length - i - 1;
            numeros[i] = aux[indice];

        }
    }

    public static void ordenInverso(String[] colores){
        Arrays.sort(colores);
        String[] aux = Arrays.copyOf(colores, colores.length);
        for (int i = 0; i < colores.length; i++){
            colores[i] = aux[colores.length - i + i];
        }
    }
}
