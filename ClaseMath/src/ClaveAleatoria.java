import java.util.Random;

public class ClaveAleatoria {
    public static String generaPass(int longitud){
            // Generar una clave aleatoria de n digitos
            // y que contenga letras de la a ... z, A ... Z, 0 ... , $%&_
            // y se almacena en String password

        String password = "";
        String base = "ASDFGHJKOIUYTREWqwertyuiokljhgfds098765431!·$%&/";
        Random objRnd = new Random();
        for (int i = 0; i < longitud; i++){
            int n = objRnd.nextInt(base.length());
            password += base.charAt(n);
        }
        return password;
    }

        static void Pass(){
        int [] dataBase = new int[10];
        int cont = 0;
        while(cont < dataBase.length) {
            for (int i = 0; i < dataBase.length; i++) {
                int n = (int)(Math.random() * 5);
                dataBase[n] = n;
                System.out.println(dataBase);
                cont++;
            }
        }
        //System.out.println(dataBase);
    }

    public static void main(String[] args) {
        ClaveAleatoria.Pass();
    }

}
