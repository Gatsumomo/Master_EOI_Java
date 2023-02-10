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
        if(dataBaseName.equals(dataName)){
            System.out.println("Usuario correcto");                                                                               //System.out.println(dataBaseName.equals(dataName) && dataBasePassword.equals(dataPassword));
        }else{
            System.out.println("Usuario incorrecto");
            main(args);
        }

        System.out.print("Introduce la contraseña: ");
        dataPass = entrada.nextLine();
        if(dataBasePass.equals(dataPass)){
            System.out.println("Contraseña correcta");                                                                               //System.out.println(dataBaseName.equals(dataName) && dataBasePassword.equals(dataPassword));
        }else{
            System.out.println("Contraseña incorrecta");
            dataPass(args);
        }

        System.out.println("Bienvenido de vuelta");

    }

}
