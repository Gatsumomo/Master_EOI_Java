public class Vehiculo {
    String marca;
    String modelo;
    float potencia;
    protected String disenador = "Pepe Perez";

    //getter para diseñador, esta en private
    public String getDisenador() {
        return disenador;
    }

    public void claxon(){
        System.out.println("tuu, tuu");
    }

    public void avanzar(){
        System.out.println("Avanzo");
    }
}
