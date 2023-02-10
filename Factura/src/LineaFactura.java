public class LineaFactura {
    //Atributos
    private int unidades;
    private String descripcion;
    private float precioUnitario;
    private float totalLinea;  //p.uni * unidades

    //constructor

    public LineaFactura(int unidades, String descripcion, float precioUnitario) {
        this.unidades = unidades;
        this.descripcion = descripcion;
        this.precioUnitario = precioUnitario;
        this.totalLinea = unidades * precioUnitario;   //para este hace el calculo necesario
    }

    //metodo


    public String getDescripcion() {
        return descripcion;
    }

    public float getPrecioUnitario() {
        return precioUnitario;
    }

    public float getTotalLinea() {
        return totalLinea;
    }

    @Override
    public String toString() {
        return "LineaFactura: " +
                "unidades:" + unidades +
                "descripcion:" + descripcion + '\'' +
                "precioUnitario:" + precioUnitario +
                "totalLinea:" + totalLinea;
    }
}
