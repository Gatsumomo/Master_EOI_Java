public class EjemploParametros {
    public static void main(String[] args) {
        TipoCoche miCoche = TipoCoche.SEDAN;
        System.out.println(miCoche);

        System.out.println(miCoche.getDescripcion());
        System.out.println(miCoche.getNombre());
        System.out.println(miCoche.getNumPuertas());

    }
}
