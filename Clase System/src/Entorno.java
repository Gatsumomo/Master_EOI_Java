import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Map;

public class Entorno {
    public static void main(String[] args) {
        //facilitar info a nuestro programa props de quien ejecuto el programa...

        //Variables de entorno 1 a 1
        System.out.println("Usuario = " + System.getProperty("user.name"));
        System.out.println("directorio = " + System.getProperty("user.dir"));
        System.out.println("version Java = " + System.getProperty("java.version"));
        System.out.println("-------------");

        //leer todas las variables de sistema
        Properties propiedades = System.getProperties();  //definir una sola variable que lea todas las propiedades del sistema
        propiedades.list(System.out);  //syst.out lo saca en la consola
        System.out.println("-------------");

        //Crear variables de sistema desde un archivo
        propiedades.setProperty("config.puerto.servidor", "8080"); //se le agrega propiedad al arg
        System.setProperties(propiedades); //se le agrega al sistema la propiedad

        propiedades = System.getProperties();
        propiedades.list(System.out);  //syst.out lo saca en la consola
        System.out.println("-------------");

        //Cargar variables de entorno desde un archivo
        try {
            FileInputStream archivo = new FileInputStream("src/config.properties");
            propiedades.load(archivo);  //le pedimos que cargue el contenido del archivo
            System.setProperties(propiedades); //anadir las propiedades al sistema
            propiedades.list(System.out);
        }catch(FileNotFoundException e){
            //Tratar el error de archivo no encontrado
            System.err.println("File not found"); //System.err --> llega hasta aca, lo imprime al final del programa y aborta la ejecucion
        }catch (IOException e){
            //Tratar el error de lectura del archivo
        }
        System.out.println("------------------");

        //variables del Entorno S0
        Map<String,String> varEntorno = System.getenv();  /*clave, valor devuelve todas las variables del sistema en un mapa, getenvironment*/
        System.out.println("varEntorno = " + varEntorno);
        System.out.println("Usuario = " + System.getenv("USERNAME"));
        System.out.println("JAVA_HOME = " + System.getenv("JAVA_HOME"));

        System.out.println("" + varEntorno.keySet()); //ese mapa tiene un conjunto de claves
        for(String clave: varEntorno.keySet()){
            System.out.println("clave = " + clave + " -> valor = " + System.getenv(clave));
        }
    }
}
