public class For {
    public static void main(String[] args) {
        //Mostrar del 1 al 20 co diferentes incrementos
        //incremento 1
        for(int i = 1; i <= 20; i++) { //i = i + 1. i--> puede ser a. pepe
            System.out.println("i = " + i);
        }

        //for(int i = 1; i <= 20; i--) {
        //System.out.println("i = " + i);
        //}

        System.out.println("----------");

        //incremento 2
        for(int i = 1; i <= 20; i = i + 2) { //i+=2. i--> puede ser a. pepe
            System.out.println("i = " + i);
        }
        System.out.println("----------");

        //incremento negativo
        for(int i = 20; i > 0; i--) {
            System.out.println("i = " + i);
        }
        System.out.println("----------");

        //sumar del 1 al 20
        int suma = 0; //(0, elemento neutro de la suma)
        for(int i = 1; i <= 20; i++) {
            //suma = suma + 1;
            suma += i;
            System.out.println("suma = " + suma);
        }
        System.out.println("----------");

        //mostrar los caracteres cuyo codigo ASCII 65 al 90

        char MyVariable = 65;
        for(int i = 65; i <= 90; i++) {
            MyVariable += i;
            System.out.println("MyVariable = " + MyVariable);
        }

        char caracter = 'k';
        for(int i = 65; i <= 90; i++) {
            caracter = (char)i;
            System.out.println("MyVariable = " + MyVariable);
        }

        //recorrer matriz
        String[] coches = {"Volvo","Renault","Seat","Citroen"};
        for (int i = 0; i < coches.length; i++){  //lenght da el numero de variables dentro de la matriz, numero total de elementos que contiene
            System.out.println("coches [" + i + "] = " + coches[i]);
        }

        //for each Recorrer matriz.     en lugar de usar el indice, no lo usa, sabe donde empieza y donde acaba, sintaxis:
        for (String marca: coches){
            System.out.println("marca = " + marca);
        }

        //Bucles for anidados
        int [][] numeros = {{1,2,3},{4,5,6},{7,8,9}}; //bidimensional matrix
        for(int i = 0; i < numeros.length; i ++){
            System.out.println("numeros = " + numeros[i][0]); //se varia el primer indice de la matriz
        }

        int [][] numeros2 = {{1,2,3},{4,5,6},{7,8,9}}; //bidimensional matrix
        for(int i = 0; i < numeros2.length; i ++){
            for(int k = 0; k < numeros2[i].length; k++) { //obteniedno la longitud de la cada i
                System.out.println("numeros [" + i + "][" + k + "]= " + numeros2[i][k]);
            }
        }

        //con for each, poco util

        for(int[] mat:numeros){
            for (int valor:mat){
                System.out.println("mat = " + mat);
            }
        }
    }
}
