import javax.sound.sampled.Line;
import java.util.Scanner;

public class Factura {

    // Introducir los datos del cliente por consola y mostrarlos
    // a. leo los datos en variables independientes y udo constructor
    //b. creo objeto cliente vacio y voy metiendo los datos introducidos
    public static void main(String[] args) {
        float tipoIVA = 21; //con iva
        float totalFactura = 0; //total de la factura sin iva

        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce datos del cliente: ");

        System.out.print("nombre: ");
        String nombre = entrada.nextLine();
        System.out.print("apellidos: ");
        String apellidos = entrada.nextLine();
        System.out.print("dni: ");
        String dni = entrada.nextLine();
        System.out.print("direccion: ");
        String direccion = entrada.nextLine();
        System.out.print("email: ");
        String email = entrada.nextLine();

        System.out.println("\n\nIntroduce los productos: ");
        LineaFactura[] lineasFacturas = new LineaFactura[10];
        int indice = 0;
        boolean salir = false;
        while (salir != true) {
            int unidades = Integer.parseInt(introduceDato("Unidades (0=salir)"));
            if (unidades == 0) {
                salir = true;
            } else {
                String tipoProducto = introduceDato("tipo de producto: 1- Portatil, 2 - Pantalla, 3 - Raton, 4 - HDD");

                Catalogo producto;
                switch (tipoProducto) {
                    case "1":
                        producto = Catalogo.PORTATIL;
                        break;
                    case "2":
                        producto = Catalogo.PANTALLA;
                        break;
                    case "3":
                        producto = Catalogo.RATON;
                        break;
                    case "4":
                        producto = Catalogo.HDD;
                        break;
                    default:
                        producto = Catalogo.RATON;

                }
                LineaFactura linea = new LineaFactura(unidades, producto.getDescripcion(), producto.getPrecio());
                LineasFactura[indice] = linea;
                indice++;
                //System.out.println(linea.toString());
            }


            for (LineaFactura lin:lineasFacturas){
                if(lin != null){
                    System.out.println(lin.toString());
                    totalFactura += lin.getTotalLinea();
                }
            }

            float cantidadPagar =  totalFactura * (1 + tipoIVA / 100); //

            System.out.println("totalFactura" + totalFactura +
                               "IVA" + (totalFactura * tipoIVA / 100) +
                               "A pagar " + cantidadPagar);


            Cliente comprador = new Cliente(nombre, apellidos, dni, direccion, email);
            System.out.println(comprador.toString());
        }

    }
    public static String introduceDato(String mensaje){
        Scanner entrada1 = new Scanner(System.in);
        System.out.print(mensaje + ": ");
        return entrada1.nextLine();
    }

}
