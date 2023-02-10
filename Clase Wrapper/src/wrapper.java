public class wrapper {
    public static void main(String[] args) {

        //INT
        //Integer i = 123456;  forma no recomendada
        Integer i = Integer.valueOf(123456);
        Integer e = 123456;
        System.out.println("e == i --> " + (e == i));  //es falso porque son distintos objetos

        System.out.println("i = " + i); //numero
        String s = i.toString();       //(convertir objeto integer en un String)
        System.out.println("s = " + s); //texto

        int j = i.intValue();
        long l = i.longValue();
        float f = i.floatValue();
        double d = i.doubleValue();
        System.out.println("int, long. float, double --> " + j + " " + l + " " + f + " " + d);

        System.out.println(i.getClass());  //no funciona con tipo primitivos pq son objetos, string si

        int k = Integer.parseInt("123456"); //es un metodo estatico, no hace falta instanciar/ccrear un objeto
        System.out.println("k = " + k);

        System.out.println("To Hex = " + Integer.toHexString(123456));
        System.out.println("To Oct = " + Integer.toOctalString(123456));
        System.out.println("To Bin = " + Integer.toBinaryString(13456));

        //comparar objetos
        System.out.println("i.equals(e) = " + i.equals(e));  //compara el valor de los objetos
        System.out.println("e == i --> " + (e == i));  //es falso porque son distintos objetos
        System.out.println("i.compareTo(e) = " + i.compareTo(e));


        //LONG
        Long varlong = 1234567899L;
        String str = varlong.toString();
        System.out.println("str = " + str);
        d = varlong.doubleValue();
        System.out.println("d = " + d);
        System.out.println("bits = " + Long.bitCount(123546465));

        //Float y Double (igual que el anterior)
        char varchar = 'g';
        System.out.println(Double.isNaN(varchar));  //cuando sale falso si es un numero. Logica reversa NaN-->not an Number

        //Character
        Character c = Character.valueOf('1');
        Character c1 = '2';
        char c2 = c.charValue();
        System.out.println("c.charValue = " + c2); //devuelve una variable tipo char. metodo propio de instancia
        System.out.println("Character.isDigit() = " + Character.isDigit(c)); //o char, los metodos tambien son aplicables a la instancia
        System.out.println("Character.isAlphabetic(c)" + Character.isAlphabetic(c)); //saber si un caracter es alfanumerico
        System.out.println("Character.isUpperCase(c1) = " + Character.isUpperCase(c1));
        System.out.println("Character.toLowerCase(c1) = " + Character.toLowerCase(c1));


    }
}
