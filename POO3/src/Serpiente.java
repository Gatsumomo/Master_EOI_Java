public class Serpiente {
    float longitud;
    boolean venenoso = true;
    boolean patas = false;


    public void desplazamiento(){
        System.out.println("Se arrastra por la arena");
    }
    public void cambiarPiel(){
        System.out.println("Cambia de piel");
    }
    public void sonido(String mensajeSon){   //lo sobrecargo añadiendo parametros
        System.out.println("El sonido es: " + mensajeSon);
    }
    public void sonido(){System.out.println("es muy silenciosa");}

}
