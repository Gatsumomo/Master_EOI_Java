public enum Materia {
    MATEMATICAS(025),
    FISICA(043),
    QUIMICA(044),
    FILOSOFIA(067),
    HISTORIA(077);

    private int codigo;

    Materia(int codigo) {
        this.codigo = codigo;
    }
    public int getCodigo() {
        return codigo;
    }
}
