import java.util.Scanner;

public class Idea1 {
    public static void main(String[] args) {

        //definir datos del usuario
        String dataBaseName = "MioMao", dataBasePass = "1234hola";                                                                     //String[] dataBaseUser = {dataBaseName, dataBasePassword};

        //introducir datos
        String dataName, dataPass;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce el usuario: ");
        dataName = entrada.nextLine();
        System.out.print("Introduce la contraseña: ");
        dataPass = entrada.nextLine();


        //try and catch

        try{



        }catch (){
            System.out.println("ERROR - Has de introducir un numero entero");
            main(args); //vuelve a inicializar la rutina, desde 0
        }


        //
        System.out.println("Bienvenido de vuelta");

    }

}