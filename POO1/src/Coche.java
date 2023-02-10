public class Coche {
    //Atributos (estado/caracteristicas)
     String marca;
     String modelo;    //se definen como variables
    String color;
    String carroceria;
    float potencia;
    float cilindrada;
    String combustible;
    float rpm;
     float km;
    float deposito;
    final static String eCall = "112";  //constante
    static String distintivo = "E";
     String numeroSerie;

    //metodos (representa comportamiento)
    public void arrancar(){
        this.rpm = 800;
    }

    public void acelerar(float rpm){
        this.rpm += rpm;  //this.rpm --> el atributo
    }

    public void frenar(float deceleracion){
        this.rpm -= deceleracion;
    }

    public String detallesCoche(){   //sin public igual deja
        return "Marca: " + this.marca + "\nModelo: " + this.modelo + "\nColor: " + this.color;
    }

    public static void llamarEmergencias(){
        System.out.println("eCall = " + eCall);
    }

    public float consumo(float distancia){
        //siempre lleno el deposito y siempre lo vacio
        return this.deposito / distancia * 100;
    }

    public float consumo(float distancia, float repostado){
        return (repostado / distancia) * 100;
    }
}
