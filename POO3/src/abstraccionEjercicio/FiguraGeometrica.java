package abstraccionEjercicio;

abstract class FiguraGeometrica {

    //atributos
    protected String nombre;
    protected final float PI = 3.1415f;

    //metodos abstractos
    abstract public void superficie();
    abstract public void perimetro();

    //constructor
    public FiguraGeometrica(String nombre) {
        this.nombre = nombre;
    }
}
