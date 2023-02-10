public class While {
    public static void main(String[] args) {

        //Recorrer los 20 primeros numeros naturales

        //while
        int contador = 0;//variable de control, cualquier numero
        while (contador <= 20){
            System.out.println("contador = " + contador);
            contador++; //hay que indicarle la variacion, se debe indicar que la condicion de salida se cumpla
        }
        System.out.println("----------------------");

        //do while.              peculiaridad: la comparacion se ejecuta al menos una vez, ya que la condicion esta despues  (en for/foreach cuando no se cumple la condicion lo ignora y se sale)
        contador = 0;
        do{
            System.out.println("contador = " + contador);
            contador++;
        }while(contador <= 20);
        System.out.println("----------------------");

        //Recorrer matriz
        String[] coches = {"Volvo","Renault","Seat","Citroen"};
        //while
        int i = 0;
        while(i < coches.length){
            System.out.println("coches[" + i +"] = " + coches[i]);
                     i++;
        }
        System.out.println("----------------------");

        //do while
        i = 0;
        do{
            System.out.println("coches[" + i +"] = " + coches[i]);
            i++;
        }while(i <= coches.length);
        System.out.println("----------------------");

        //diferente condicion de salida
        boolean salir = false;
        i = 0;  //hay que iniciar con una variable siosi
        //while (salir == false){
        while (!salir){
            System.out.println("coches[" + i +"] = " + coches[i]);

            //i++ ---> seria seat ahora, se sale en el if y no imprime seat
            if (coches[i] == "Seat"){
                //salir = true;      se fuerza el cambio del valor de salida para que termine el programa
                salir = !salir;
            }
            i++;
        }


    }

}
