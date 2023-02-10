public class MetodosString {
    public static void main(String[] args) {
        String str1 = " En un lugar de La Mancha de cuyo ";
        String str2 = "Pepe Muñoz";
        String str3 = "PEPE Muñoz";

        //Longitud
        System.out.println("Longitud = " + str1.length());  //todos los caracteres cuentan

        //Igual
        System.out.println("Igual = " + str2.equals(str3));

        //Igual
        System.out.println("Igual = " + str2.equalsIgnoreCase(str3));

        //comparar com
        System.out.println("Comparar = " + str2.compareTo(str3)); //mas pesado lexicograficamente. si es 0 es que ambos son iguales. si no da 0 es que uno va antes que el otro

        //comparar con insensitivo
        System.out.println("Comparar = " + str2.compareToIgnoreCase(str3)); //ignorando el tipo/la caja

       //eliminar espacios a principio u al final
        System.out.println("Con espacios = |" + str1 + "|");
        System.out.println("Sin espacios = |" + str1.trim() + "|");

        //Extraer un caracter determinado
        System.out.println("Extrae un caracter 10 = " + str1.charAt(10));

        //convertir en matriz
        char[] matriz = str1.toCharArray();  //ha cogido todos los caracteres de str1 y los convirtio en matriz
        System.out.println("matriz 10 = " + matriz[10]);

        //extraer cadena de caracteres
        System.out.println("Extraer con inicio y con fin = " + str1.substring(0,9)); //9 no incluido
        System.out.println("Extraer desde un indice = " + str1.substring(9));

        //buscar
        System.out.println("Buscar el 1º caracter que coincida = " + str1.indexOf('u'));
        System.out.println("Buscar el 2º caracter que coincida = " + str1.indexOf('u',6)); //busca a partir del 6, un caracter '' un string ""
        System.out.println("Buscar palabra = " + str1.indexOf("lugar"));
        System.out.println("Buscar caracter ultima coincidencia = " + str1.lastIndexOf('u'));



    }
}
