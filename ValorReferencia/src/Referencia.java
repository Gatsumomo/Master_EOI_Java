import org.jetbrains.annotations.NotNull;

public class Referencia {
    public static void main(String[] args) {
        int[] argumento = {10,20,30,40};
        for(int i = 0; i < argumento.length; i++){
            System.out.println("argumento[" + i + "] = " + argumento[i]);
        }

        miMetodo(argumento);
        for(int i = 0; i < argumento.length; i++){
            System.out.println("argumento[" + i + "] = " + argumento[i]);
        }
    }
    public static void miMetodo(int[] argumento){   //se puede cambiar por metodo y es igual, lo que pasamos es la referencia, los cambibos dentro del metodo quedan reflejados en todo el programa
        for (int i = 0; i < argumento.length; i++){   //le dices donde esta la cosa para modificarla
            argumento[i] += 5;
        }
    }
}
