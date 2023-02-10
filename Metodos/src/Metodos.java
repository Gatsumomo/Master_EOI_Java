public class Metodos {
    public static void main(String[] args) {   //solo se crea metodo main si quieres que tu programa EJECUTE algo
        bienvenida();
        System.out.println("suma(3,4) = " + suma(3,5));
        int resultado = suma(3,6);
        System.out.println("resultado = " + resultado);
    }

    public static int suma(int a, int b){
        return a + b;
    }

    public static void bienvenida () {//el metodo que bi devuelve nada, void
        System.out.println("¡Hola, bienvenido a Narnia!");
    }
}
