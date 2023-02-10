public class EjemploFiguraGeometrica {
    public static void main(String[] args) {

        //circulo
        FiguraGeometrica circulo = new FiguraGeometrica(0,"circulo",23);
        System.out.println(circulo.superficie());
        System.out.println(circulo.perimetro());
        System.out.println(circulo.info());

        //cuadrado
        FiguraGeometrica cuadrado = new FiguraGeometrica(4,"cuadrado",4,7);
        System.out.println(cuadrado.superficie());
        System.out.println(cuadrado.perimetro());
        System.out.println(cuadrado.info());

        //triangulo
        FiguraGeometrica triangulo = new FiguraGeometrica(3,"triangulo",3,1,60);
        System.out.println(triangulo.superficie());
        System.out.println(triangulo.perimetro());
        System.out.println(triangulo.info());
    }
}
