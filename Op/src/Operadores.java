public class Operadores {
    public static void main(String[] args) {
        //incremento y decremento
        int a = 10;

        System.out.println("a = " + a);
        System.out.println("++a = " + ++a); //11
        System.out.println("a = " + a); //11
        System.out.println("a++ = " + a++); //11
        System.out.println("a = " + a); //12
        System.out.println("--a = " + --a); //11
        System.out.println("a-- = " + a--);
        System.out.println("a = " + a);

        //modulo resto de la division entera

        int b = 2;
        int c = 8;
        System.out.println("modulo = " + (c % b));

        //operadores de asignacion

        //+= -=
        c += b; //c = c + b
        System.out.println("c += b -> " + c); //muestra el que este almacenado en  c, la variable de la izquierda
        c -= b; //c = c - b    usa el 10 del anterior, 10-2
        System.out.println("c -= b -> " + c);

        // *= y /=
        c *= 2; //c = c * 2
        System.out.println("c *= 2 -> " + c); //16
        c /= 4; //c = c / 4       //16/4
        System.out.println("c /= 4 -> " + c);

        // %=
        c %= 3; //c = c % 3
        System.out.println("c %= 3 -> " + c);


        //operadores ralacionales (dan resultados booleanos)

        System.out.println("b > c = " + (b > c)); //true (c1 y b2)
        System.out.println("b >= c = " + (b >= c)); //true
        System.out.println("b < c = " + (b < c)); //false
        System.out.println("b <= c = " + (b <= c)); //false
        System.out.println("b == c = " + (b == c)); //false
        System.out.println("b != c = " + (b != c)); //true

        //operador ternario

        //tipo variable = (condicion) ? valor1(true) : valor2(false);
        // if(condicion) then {variable = valor1} else {variable = valor2}
        int resultado = (c < a) ? 3 : 5;
        System.out.println("resultado = " + resultado);
    }

}
