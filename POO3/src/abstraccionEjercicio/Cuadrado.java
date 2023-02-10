package abstraccionEjercicio;

public class Cuadrado extends FiguraGeometrica{

    public int longitudLado;
    @Override
    public void superficie() {
        System.out.println("superficie = " + 2 * longitudLado + "cm");
    }

    @Override
    public void perimetro() {
        System.out.println("perimetro = " + 4 * longitudLado + "cm");
    }

    //constructor
    public Cuadrado(String nombre, int longitudLado) {
        super(nombre);
        this.longitudLado = longitudLado;
    }
}
