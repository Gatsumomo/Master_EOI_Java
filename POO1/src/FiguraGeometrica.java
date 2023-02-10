public class FiguraGeometrica {
    String nombre;
    int numLados;
    final double PI = 3.141516;
    float largo;
    float ancho;
    float base;
    double altura;
    double radio;


    //Metodos de ("comportamiento")
    // perimetro, superficie, info

    // comportamientos
    public float superficie(){
        float superficie = 0;
        if (numLados == 4){
           superficie = largo * ancho;
        }else if (numLados == 3){
            superficie = (float)((base * altura) / 2);
        }else{
            superficie = ((float)(Math.sqrt(radio)) * (float)PI);
        }
        return superficie;
    }

    public float perimetro(){
        float perimetro = 0;
        if (numLados == 4){
            perimetro = largo * ancho;
        }else if (numLados == 3){
            perimetro = (float)PI * base;
        }else{
            perimetro = 0;
        }
        return perimetro;
    }

    public String info() {
        return "FiguraGeometrica{" +
                "nombre='" + nombre + '\'' +
                ", numLados=" + numLados +
                ", perimetro=" + perimetro() +
                ", superficie=" + superficie() +
                '}';
    }

    //constructores

    public FiguraGeometrica(int numLados, String nombre) {
        this.numLados = numLados;
        this.nombre = nombre;
    }

    //para circulos
    public FiguraGeometrica(int numLados, String nombre, float radio) {
        this(numLados, nombre);
        this.radio = radio;
    }

    //para triangulos
    public FiguraGeometrica(int numLados, String nombre, float altura, float base, float radio) {
        this(numLados, nombre, radio);
        this.altura = altura;
        this.base = base;
        this.radio = radio;
    }

    //para cuadrados
    public FiguraGeometrica(int numLados, String nombre, float largo, float ancho) {
        this(numLados, nombre);
        this.largo = largo;
        this.ancho = ancho;
    }
}
