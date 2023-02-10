public class BreakContinue {
    public static void main(String[] args) {
        //break y continue
        //break, interrumpe la ejecucion

        String[] coches = {"Volvo","Renault","Seat","Citroen"};

        for (String marca:coches){
            System.out.println("marca = " + marca);
            if (marca == "Seat"){
                break;
            }
            System.out.println("marca = " + marca);
        }

        System.out.println("Resto del programa");



        int i = 0;
        while(i < coches.length){
            System.out.println("coches[" + i +"] = " + coches[i]);
            if(coches[i] == "Seat") break;   //salida del bucle
            i++;
        }
        System.out.println("----------------------");



        //continue   se salta el resto del codigo que haya en el bloque
        for (String marca :coches) {
            if(marca == "Seat"){
                System.out.println("coches[" + i +"] = " + coches[i]);
            }
            System.out.println("marca = " + marca);
        }


        i = 0;
        while(i < coches.length){
            if(coches[i] == "Seat"){
                i++;  //si estuviera despues del continue lo leee
                continue;
            }
            System.out.println("coches[" + i +"] = " + coches[i]);
        }
        System.out.println("----------------------");
    }

}
