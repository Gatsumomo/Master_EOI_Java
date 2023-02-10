import java.util.Scanner;

public class Login2 {
    public static void main(String[] args) {

        //definir datos del usuario
        String dataBaseName = "MioMao", dataBasePass = "1234hola";                                                                     //String[] dataBaseUser = {dataBaseName, dataBasePassword};

        //introducir datos en la consola

        String dataName, dataPass;

        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce el usuario: ");
        dataName = entrada.nextLine();   //next line lee toda una linea, y solo next lee lo que escriba a continuacion. No hay mucha variacion aqui. Next espera un retorno de cargo, da la posibilidad de escrbir datos en la consola, osea: hay un hueco para que escribas y espera el retorno de cargo
        System.out.print("Introduce la contraseña: ");
        dataPass = entrada.nextLine();
        // entrada.close();  cerrar el escaner, ya no se va a usar


        //comparar datos

        if(dataBaseName.equals(dataName) && dataBasePass.equals(dataPass)){
            System.out.println("Contraseña y usuario correctos");                                                                               //System.out.println(dataBaseName.equals(dataName) && dataBasePassword.equals(dataPassword));
        }else{
            System.out.println("No estas registrado");
            main(args);        //vuelve a inicializar la rutina siuuuuuu, nuestra carta de triunfo
            System.exit(0);
        }

        entrada.close();

        // String mensaje = ((usuario.equals(us) && password.equals.(ps)) ? "Has accedido al programa" : "Credenciales erroneas"
        //System.out.println("mensaje = " + mensaje);

        // boolean login = (usuario.equals(us) && password.equals.(ps);
        // sout ("login = " + login);

    }
}
