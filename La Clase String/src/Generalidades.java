public class Generalidades {
    public static void main(String[] args) {     //metodo main hace ejecutable una clase
        //Declaraciones
        String nombre = new String("Eduardo");
        System.out.println("nombre = " + nombre);

        String apellido = "Corral";
        System.out.println("apellido = " + apellido);

        //
        String bienvenida = "El nombre \n \"autentico\" de Pepe es \"Jose";
        System.out.println("bienvenida = " + bienvenida);

        //concatenar
        System.out.println("El nombre completo es = " + nombre + " " + apellido); /*es un espacio " "*/
        String nombreCompleto = nombre + " " + apellido;
        System.out.println("nombreCompleto = " + nombreCompleto);

        //comparar dos objetos
        String uno = "Eduardo Corral";
        String dos = new String("Eduardo Corral");
        System.out.println("Uno = " + uno);
        System.out.println("dos = " + dos);

        System.out.println("uno == dos -> " + (uno == dos));    //"incorrecto". tienen el mismo valor son objetos diferentes. compara el contenido. dependiendo de la ejecucion les dara propiedades distintas
        System.out.println("uno.equeals(dos) -> " + uno.equals(dos)); //correcto. comparar mayusculas y minusculas

    }
}
