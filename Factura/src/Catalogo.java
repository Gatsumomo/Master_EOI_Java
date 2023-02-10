public enum Catalogo {
    PORTATIL("Ordenador portatil i7, 32GB RAM, HDD", 678.99f),
    PANTALLA("Resolucion GOD",123.3f),
    RATON("Con ruedita fachera",23),
    HDD("no puede procesar a tu mama",213.77f);

    //Atributos

    private final String descripcion;
    private final float precio;

    //constructor

    Catalogo(String descripcion, float precio) {
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public float getPrecio() {
        return precio;
    }
}
