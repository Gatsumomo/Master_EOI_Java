public class Prueba {

    static int x = 0;
    static int z = 6;
    private static final int suma(){
        return x + z;
    }

    private static void nombre(){
        System.out.println(x + z);;
    }

    static boolean metodoBoolean(boolean n, String mensaje){
        if (n){
            System.out.println(mensaje);;
        }
        return n;          //usar return dentro del if hace inservible el if
    }

    int suma2(){
        int suma = 5 + 5;  // return 5 + 5;
        return suma;
    }

    void procedimiento(int n, String nombre)
    {
        if(n > 0 && !nombre.equals(""))
        {
            System.out.println("hola " + nombre);
            return; //Si no ponemos este return se mostraría hola y luego adiós
        }
        //También podríamos usar un else en vez del return
        System.out.println("adios");
    }

    public static void main(String[] args) {
        System.out.println("suma = " + Prueba.suma());
        Prueba.nombre();
    }
}
