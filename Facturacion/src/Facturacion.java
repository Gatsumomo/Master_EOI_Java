import java.util.Scanner;

public class Facturacion {
    // 1 - Introducir los datos del cliente por consola y mostarlos
    // a - leo los datos en variables independientes y uso constructor
    // b - creo objeto cliente vacio y voy rellenando con los datos introducidos

    public static void main(String[] args) {

        /*
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce datos del cliente:");
        System.out.print("Nombre: ");
        String nombre = entrada.nextLine();
        System.out.print("Apellidos: ");
        String apellidos = entrada.nextLine();
        System.out.print("DNI: ");
        String dni = entrada.nextLine();
        System.out.print("Dirección: ");
        String direccion = entrada.nextLine();
        System.out.print("Email: ");
        String email = entrada.nextLine();
        */
/*        System.out.println("Introduce datos del cliente:");
        String nombre = introduceDato("Nombre");
        String apellidos = introduceDato("Apellidos");
        String dni = introduceDato("DNI");
        String direccion = introduceDato("Dirección");
        String email = introduceDato("Email");
        Cliente comprador = new Cliente(nombre,apellidos,dni,direccion,email);
        //System.out.println(comprador.toString());
*/
        System.out.println("\n\nIntroduce los productos:");
        LineaFactura[] lineasFactura = new LineaFactura[10];
        boolean salir = false;
        int indice = 0;
        while (salir != true) {
            int uds = Integer.parseInt(introduceDato("Unidades (0=Salir)"));
            if(uds == 0) {
                salir = true;
            }else {
                String tipoProducto = introduceDato("Tipo de producto: 1 - Portátil, 2 - Pantalla, 3 - Ratón, 4 - HDD");
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
                LineaFactura linea = new LineaFactura(uds, producto.getDescripcion(), producto.getPrecio());
                lineasFactura[indice] = linea;
                indice++;
                //System.out.println(linea.toString());
            }
        }








        float totalFactura = 0;
        for (LineaFactura lin:lineasFactura){
            if(lin != null){
                System.out.println(lin.toString());
                totalFactura += lin.getTotalLinea();
            }
        }
        float tipoIVA = 21;
        float cantidadPagar = totalFactura * (1 + tipoIVA / 100); //totalFactura + totalFactura * tipoIVA / 100;

        System.out.println("totalFactura " + totalFactura +
                            "\nIVA " + (totalFactura * tipoIVA / 100) +
                            "\nA pagar " + cantidadPagar) ;

        System.out.printf("Total Factura \t %.2f\nIVA \t\t\t %.2f\nA pagar \t\t %.2f",totalFactura,(totalFactura * tipoIVA / 100),cantidadPagar);
    }

    public static String introduceDato(String mensaje){
        Scanner entrada = new Scanner(System.in);
        System.out.print(mensaje + ": ");
        return entrada.nextLine();
    }

    // TODO
    // generar el número de factura
    // obtener la fecha actual
    // imprimir factura completa


}
