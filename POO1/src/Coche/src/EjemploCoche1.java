package Coche.src;

public class EjemploCoche1 {
    public static void main(String[] args) {

        Coche1 cocheMaria = new Coche1();
        System.out.println("km =" + cocheMaria.getKm());
        cocheMaria.setMarca("Citroen");
        System.out.println("cocheMaria = " + cocheMaria.getMarca());
        cocheMaria.setDeposito(50);
        System.out.println("-----------------");

        // solo lectura
        System.out.println("cocheMaria.consumo(800) = " + cocheMaria.consumo(800));
        System.out.println("cocheMaria.consumo(700) = " + cocheMaria.consumo(700));
        // cocheMaria.setKm(400); //no se puede modificar porque no existe el metodo set
        System.out.println("cocheMaria.getKm() = " + cocheMaria.getKm());
        System.out.println("-----------------");

        //constructures
        Coche1 elCoche = new Coche1("Ford");
        System.out.println("marca = " + elCoche.getMarca());
        System.out.println("km = " + elCoche.getKm());

        Coche1 tuCoche = new Coche1("Ford", "Fiesta");
        System.out.println("marca = " + elCoche.getMarca());
        System.out.println("marca = " + elCoche.getModelo());
        System.out.println("km = " + elCoche.getKm());

    }
}
