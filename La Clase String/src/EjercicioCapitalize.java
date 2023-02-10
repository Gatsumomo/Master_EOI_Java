public class EjercicioCapitalize {
    public static void main(String[] args) {
        // 1- Definir variables, nombre, apellido1 y apellido2
        // 2- Convertir cada una en nombre propio (mayusc)
        // 3- Imprimir el nombre completo


        //solucion 1
        String nombre = "EDUARDO";
        String apellido1 = "corral";
        String apellido2 = "MUñoZ";

        //procesar el nombre y apellidos
        //System.out.println(nombre.toUpperCase().charAt(0) + nombre.substring(1).toLowerCase()); //touppercase
        nombre = nombre.substring(0,1).toUpperCase() + nombre.substring(1).toLowerCase();
        apellido1 = apellido1.substring(0,1).toUpperCase() + apellido1.substring(1).toLowerCase();
        apellido2 = apellido2.substring(0,1).toUpperCase() + apellido2.substring(1).toLowerCase();

        //nombre completo
        System.out.println("Nombre completo = " + nombre + " " + apellido1 + " " + apellido2);

        //solucion 2
        nombre = "Juan Antonio";
        apellido1 = "DE LA ROSA";
        apellido2 = "San Pablo";
        String nombreCompleto= nombre + " " + apellido1 + " " + apellido2;
        String[] matriz = nombreCompleto.split(" ");

        String nombreCapitalizado = "";
        for (int i=0; i < matriz.length; i++){
            //System.out.println("matriz[" + i + "] = " + matriz[i]); // recorrer la matriz
            System.out.println("matriz[ " + i + "] = " + matriz[i].substring(0,1).toUpperCase() + matriz[i].substring(1).toLowerCase());
            nombreCapitalizado = matriz[i].substring(0,1).toUpperCase() + matriz[i].substring(1).toLowerCase();
        }

        System.out.println("nombrecompleto = " + nombreCompleto);

    }
}
