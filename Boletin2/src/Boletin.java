import java.util.Scanner;

public class Boletin {
    //TENDRIA QUE HACER QUE NOTA, CALIF, COD, MATERIA SE GUARDEN EN UNA LINEA
    //IMPRIMIR ESA LINEA

    public static void main(String[] args) {

        //INTRODUCIR NOTA--> NOTA-CALIFICACION
        System.out.print("Introduzca la nota: ");
        Scanner entrada = new Scanner(System.in);
        float nota = Float.parseFloat(entrada.nextLine());

        for(int i = 0; i < 5; i++){

            String calificacion;
            switch ((int) nota) {
                case 5:
                    calificacion = "aprobado";
                    break;
                case 6:
                    calificacion = "aprobado";
                    break;
                case 7:
                    calificacion = "notable";
                    break;
                case 8:
                    calificacion = "notable";
                    break;
                case 9:
                    calificacion = "sobresaliente";
                    break;
                case 10:
                    calificacion = "matricula de honor";
                    break;
                default:
                    calificacion = "reprobado";
                    break;

            }

            //INTRODUCIR MATERIA--> MATERIA-CODIGO

            System.out.println("Introduzca COD: ");
            LineaAsignatura[] lineaAsignatura = new LineaAsignatura[5];
            int indice = 0;
            boolean salir = false;
            while (salir != true) {
                double codigo = Integer.parseInt(introduceDato("\"025-Matematicas, 043-Fisica, 044-Quimica, 067-Filosofia, 088-Historia\" para salir 0"));
                if (codigo == 0) {
                    salir = true;
                } else {
                    Materias asignatura;
                    switch ((int) codigo) {
                        case 025:
                            asignatura = Materias.MATEMATICAS;
                            break;
                        case 043:
                            asignatura = Materias.FISICA;
                            break;
                        case 044:
                            asignatura = Materias.QUIMICA;
                            break;
                        case 067:
                            asignatura = Materias.FILOSOFIA;
                            break;
                        case 077:
                            asignatura = Materias.HISTORIA;
                        default:
                            asignatura = Materias.FISICA;
                    }
                    LineaAsignatura linea = new LineaAsignatura
                            (codigo, asignatura, nota, calificacion);
                    System.out.println(linea);
                }
            }
        }

        //CALCULAR NOTA MEDIA (5 NOTAS INTRODUCIDAS --> MEDIA)
    }
    public static String introduceDato(String mensaje){
        Scanner entrada = new Scanner(System.in);
        System.out.print(mensaje + ": ");
        return entrada.nextLine();
    }
}
