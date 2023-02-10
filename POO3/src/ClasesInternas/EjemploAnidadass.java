package ClasesInternas;

public class EjemploAnidadass {
    public static void main(String[] args) {
        ClaseExterna objetoExterno = new ClaseExterna();
        System.out.println("objetoExterno = " + objetoExterno.x);
        objetoExterno.moduloVector(objetoExterno.miVector);

        //instanciar objeto de una clase interna
        //ClaseExterna.Vector unVector = new objetoExterno.new Vector(5,6);
        //System.out.println(unVector.x);



        //ClaseExterna.Vector miVector = new ClaseExterna.Vector();
        ClaseExterna.InternaStatic miStatic = new ClaseExterna.InternaStatic();
    }
}
