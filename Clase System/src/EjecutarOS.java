public class EjecutarOS {
    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime(); //objeto que permite ejecutar un programa
        Process proceso;
        try{
           if(System.getProperty("os.name").toLowerCase().contains("windows")){
               proceso = rt.exec("notepad");
            }else{
               proceso = rt.exec("BBEdit");
            }
           proceso.waitFor();
        }catch(Exception e){
            System.out.println("Comando desconocido; " + e.getLocalizedMessage());
            System.exit(1);
        }
    }
}
