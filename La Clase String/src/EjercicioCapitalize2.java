public class EjercicioCapitalize2 {
    public static void main(String[] args) {
        // 1- Definir variables, nombre, apellido1 y apellido2
        // 2- Convertir cada una en nombre propio (mayusc)
        // 3- Imprimir el nombre completo

        nombre = "Juan Antonio";
        apellido1 = "DE LA ROSA";
        apellido2 = "San Pablo";

        String nombreCompleto= nombre + " " + apellido1 + " " + apellido2;
        nombreCompleto = nombreCompleto.replace("-"," - ");
        System.out.println("nombreCompleto = " + nombreCompleto);
        String[] matriz = nombreCompleto.split(" ");

        String nombreCapitalizado = "";
        for (int i=0; i < matriz.length; i++){
            //System.out.println("matriz[" + i + "] = " + matriz[i]); // recorrer la matriz
            //System.out.println("matriz[ " + i + "] = " + matriz[i].substring(0,1).toUpperCase() + matriz[i].substring(1).toLowerCase());
            nombreCapitalizado = matriz[i].substring(0,1).toUpperCase() + matriz[i].substring(1).toLowerCase();
        }

        nombreCapitalizado = nombreCapitalizado.replace(" - ","-");
        System.out.println("nombrecompleto = " + nombreCompleto);

    }
}
