public class GeneralidadesArrays {
    public static void main(String[] args) {
        //Declaraciones
        String[] colores1 = {"rojo", "azul", "verde", "amarillo", "naranja"};

        String[] colores2 = new String[5];

        for (int i = 0; i < colores1.length; i++){
            System.out.println("colores1[" + i +  "] = " + colores1[i]);
        }
        System.out.println("------------");

        //asignar valores
        colores2[0] = "purpura";
        colores2[1] = "azul";
        colores2[2] = "verde";
        colores2[3] = "amarillo";
        colores2[4] = "naranja";

        for (int i = 0; i < colores2.length; i++){
            System.out.println("colores2[" + i +  "] = " + colores2[i]);
        }
        System.out.println("------------");

        //copiar una matriz en otra
        for (int i = 0; i < colores1.length; i++){
            colores2[i] = colores1[i];
            System.out.println("colores2[" + i +  "] = " + colores2[i]);
        }


        //matriz inversa
        //colores2[0] = colores1[4]

        for (int i = 0; i < colores2.length; i++){
            int indice = colores2.length - i - 1;
            colores2[i] = colores1[indice];
            System.out.println("colores2[" + i +  "] = " + colores2[i]);
           // System.out.println("i -> " + i + " | indice = " + indice);
        }
    }
}
