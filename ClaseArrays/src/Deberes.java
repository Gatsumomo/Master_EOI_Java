import java.lang.reflect.Array;
import java.util.Arrays;

public class Deberes {
    public static void main(String[] args) {
        //metodo que una dos matrices en una sola
        String[] colores1 = {"amarillo", "azul", "rojo"};
        String[] colores2 = {"caoba", "magenta", "cobalto"};

        myMethod(colores1,colores2);
        System.out.println("-------------");

        int[] numeros = {1,2,3,4,5,6,7};
        buscarValor(numeros);
        System.out.println("-------------");

        int[] numMax = {3,4,7,6,8,2};
        maximoEntreNumeros(numMax,9);
        System.out.println("-------------");

        int[] numMaxMin = {1,7,3,9,6};
        maxYMin(numMaxMin);
        System.out.println("-------------");

        int[] numbers = {6,3,8,4,2};
        ordenInverso(numbers);
        System.out.println("-------------");

        String[] colores = {"rojo", "marron", "caoba", "amarillo", "azul"};
        ordenInverso(colores);
        System.out.println("-------------");

        int[] delete = {2,5,6,4,7,3,9};
        eliminar(delete,3);
        System.out.println("-------------");

        int[] add = {6,3,8,4,2};
        anadir(add,17);
        System.out.println("-------------");
    }

    static void myMethod(String[] a, String[] b) {
        String[] resultado = new String[a.length + b.length];
        for(int i = 0; i < a.length; i++){
            resultado[i]=b[i];
        }
    }

    static void buscarValor(int[] a){
        for(int i:a){
            if (i == 5){
                System.out.println("valor --> " + a[i]);
            }
        }
    }

    static void maximoEntreNumeros(int[] a, int b){
        for (int i = 0; i < a.length; i++){
            int valor = a[i];
            if (valor > b){
                System.out.println(valor + " es mayor");
            }else{
                System.out.println(valor + " es menor");
            }
        }

        /*for (int i = 0; i < a.length; i++){
            for (int w = 0; w < a[i].length; w++){
                int resultado = [i][w];
                System.out.println(Math.max(resultado));
            }
        }*/
    }
    static void maxYMin(int [] a){
        for (int i = 0; i < a.length; i++){
            int valor = a[0];
            int recorrida = a[i + 1];
            if (valor < recorrida) {
                System.out.println(valor + " es el menor");
                break;
            }   //no se como buscar el maximo
        }
    }

    static void ordenInverso(int[] a) {
        Arrays.sort(a);
        int[] aux = Arrays.copyOf(a, a.length);
        for (int i = 0; i < a.length; i++) {
            int indice = a.length - i - 1;
            a[i] = aux[indice];
        }
    }

    static void ordenInverso(String[] a) {
        Arrays.sort(a);
        String[] aux = Arrays.copyOf(a, a.length);
        for (int i = 0; i < a.length; i++) {
            int indice = a.length - i - 1;
            a[i] = aux[indice];
        }
    }

    static void eliminar(int[] a,int del){
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++){
            if (del == a[i]){
                continue;
            }
            System.out.println(a[i]);
        }
    }

    static void delete(int[] a){

    }
    static void anadir(int[] a, int ad){
        Arrays.fill(a, ad);
        for(int i:a){
            System.out.println(i);
        }
    }
}
