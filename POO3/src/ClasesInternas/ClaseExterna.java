package ClasesInternas;

public class ClaseExterna {
    int x = 10;
    int y = 5;
    Vector miVector = new Vector(4,5);
    Vector tuVector = new Vector(2,3);

    public void moduloVector(Vector a){
        System.out.println("modulo = " + (Math.sqrt(Math.pow(a.x,2) + Math.pow(a.y,2))));
    }

    class Vector{
        int x;
        int y;
 
        //metodo de la clase vector
        public Vector(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    private class Interna1{
        int k= 23;
    }
    static class InternaStatic{
        int j = 89;
    }
}
