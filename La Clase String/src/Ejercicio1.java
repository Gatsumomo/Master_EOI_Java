
public class Ejercicio1 {
    public static void main(String[] args) {

        //extraer nombre y extension de un archivo
        String archivo = "Imagen.png";
        int punto = archivo.lastIndexOf('.');

        System.out.println("Nombre = " + archivo.substring(0,punto));
        System.out.println("Extension = " + archivo.substring(punto));

    }
}
