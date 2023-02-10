public class ElseIf {
    public static void main(String[] args) {

        int mes = 4;
        String nombreMes = "";

        if (mes == 1){
            nombreMes = "Enero";
        }else if (mes == 2){
            nombreMes = "Febrero";
        }else{
            nombreMes = "Despues de Mayo";
        }

        System.out.println("nombreMes = " + nombreMes);
    }
}
