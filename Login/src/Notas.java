public class Notas {
    public static void main(String[] args) {
        int a, b, c;
        a = 2;
        b = 2;
        c = 2;

        if(a <= b){
            System.out.println("a < b");
        }else if (b < c){
            System.out.println("b < c");
        }else {
            System.out.println("Ninguna de las anteriores");
        }

        // comentarios en funcion de la nota

        int nota = 4;
        if(nota < 5){
            System.out.println("Suspenso");
        }else if (nota < 7) {
            System.out.println("Aprobado");
        }else if (nota < 9){
            System.out.println("Notable");
        }else if (nota < 10){
            System.out.println("Sobresaliente");
        }else{
            System.out.println("Matricula de honor");
        }

    }
}