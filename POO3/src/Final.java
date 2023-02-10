public class Final {
    public static void main(String[] args) {
       Telefono miTelefono = new Telefono("+34dhsakjda", "sdsa","fewf");
       miTelefono.marcar("911");
       miTelefono.colgar();
       System.out.println("-----------------------------");

       SamsungS23 miSamsung = new SamsungS23("+3462656641","231","321312","rfedew","dewdew");
       miSamsung.marcar("911");
       miSamsung.marcar("112",3);
       miTelefono.colgar();

    }
}
//final class --> no se puede heredar
class Telefono{    //superclase - padre
    protected String numero;
    protected String linea;
    protected String modelo;

    public final void marcar(String num){
        System.out.println("llamando al " + num);
    }

    public void colgar(){
        System.out.println("colgando la llamada");
    }

    public Telefono(String numero, String linea, String modelo) {
        this.numero = numero;
        this.linea = linea;
        this.modelo = modelo;
    }
}

class SamsungS23 extends Telefono{  //subclase - hija
    private String memoria;
    private String comunicacion;

    //al ser final en la clase padre no se puede anular
    /*public void marcar(String num){
        System.out.println("marcando a " + num);
    }*/

    public void marcar(String num, int reintentos) {
        System.out.println("marcando desde mi Samsung " + num + "con " + reintentos + " reintentos");
    }

    public SamsungS23(String numero, String linea, String modelo, String memoria, String comunicacion) {
        super(numero, linea, modelo);
        this.memoria = memoria;
        this.comunicacion = comunicacion;
    }
}

