package abstraccionEjercicio;

public class Circulo extends FiguraGeometrica{
    public int radio;
    public int diametro;

    @Override
    public void superficie() {
        System.out.println("superficie = " + PI * Math.sqrt(this.radio) + "cm");
    }

    @Override
    public void perimetro() {
        System.out.println("perimetro = " + PI * this.diametro + "cm");
    }

    //constructor
    public Circulo(String nombre, int radio, int diametro) {
        super(nombre);
        this.radio = radio;
        this.diametro = diametro;
    }
}
