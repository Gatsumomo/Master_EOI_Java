public enum TipoCoche {
    SEDAN("Sedan", "Mediano", 4),
    STATION_WAGON("Familiar","Grande",5),
    HATCHBACK("Hatchback","Compacto",5),
    COUPE("Coupe","Furgoneta abierta",2),
    SUV("suv","Todo terreno urbano", 5);

    private final String nombre;
    private final String descripcion;
    private final String numPuertas;

    TipoCoche(String nombre, String descripcion, String numPuertas) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.numPuertas = numPuertas;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getNumPuertas() {
        return numPuertas;
    }
}
