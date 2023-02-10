public class LineaAsignatura {
    private double codigo;
    private String asignatura;
    private float nota;
    String calificacion;
    //private float notaMedia;

    public LineaAsignatura(double codigo, Materias asignatura, float nota, String calificacion) {
        this.codigo = codigo;
        this.asignatura = String.valueOf(asignatura);
        this.nota = nota;
        this.calificacion = calificacion;

    }
}
