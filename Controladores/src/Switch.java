public class Switch {
    public static void main(String[] args) {
        int mes = 6;
        String nombreMes = "";

        switch (mes){
            case 1:
                nombreMes = "Enero";
            case 2:
                nombreMes = "Febrero";
            case 3:
                nombreMes = "Marzo";
            case 4:
                nombreMes = "Abril";
            case 5:
                nombreMes = "Mayo";
                break;
            default:
                nombreMes = "despues de Mayo";
        }

        System.out.println("nombreMes = " + nombreMes);
    }
}
