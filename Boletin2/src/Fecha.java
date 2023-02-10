public class Fecha {
    String ciudad;
    String dia;
    String mes;
    String año;

    //constructor
    public Fecha(String ciudad, String dia, String mes, String año) {
        this.ciudad = ciudad;
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    //obtener fecha

    @Override
    public String toString() {
        return ciudad + ", a " + dia + "de " + mes + " de " + año;
    }
}
