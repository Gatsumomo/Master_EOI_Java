public class Automovil extends Vehiculo{  //hereda los meteodos, atributos de la clase vehiculo
    int ruedas;
    String combustible;

    public void abrirMaletero(){
        System.out.println("Abro el maletero");
    }


    public String toString() {
        return "Automovil{" +
                "ruedas=" + ruedas +
                ", combustible='" + combustible + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", potencia=" + potencia +
                '}';
    }
}
