public class Usuario {

    public static String error(){
        String mensajeError =  "no se encuanta en nuestra base de datos";
        return mensajeError;
    }

    public static String correcto(){
        String mensajeCorr = "eres bienvenido";
        return mensajeCorr;
    }

    public static void Verificar (String usuario, String contrasena){
        String usuarioValido = "JovaniJoe";
        String contraValida = "JV";

        if (usuarioValido.equals(usuario) && contraValida.equals(usuario)){
            Usuario.correcto();
        }else {
            System.out.println(Usuario.error());
        }
    }

    int numeros(int x, int y){
        int suma = x + y;
        return suma;
    }

    public static void main(String[] args) {
        Usuario.Verificar("joe","1234");

        Usuario objeto = new Usuario();
        //System.out.println(objeto.numeros(2,3));
        objeto.numeros(2,3);
    }
}
