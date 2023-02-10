import java.util.Date;
import java.util.Scanner;

public class Boletin {
    public static void main(String[] args) {
        //introducir datos del alumno
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce datos del alumno");
        System.out.print("Nombre:");
        String nombre = entrada.nextLine();
        System.out.print("Apellidos:");
        String apellidos = entrada.nextLine();
        System.out.print("Direccion:");
        String direccion = entrada.nextLine();
        System.out.print("Contacto:");
        String contacto = entrada.nextLine();
        System.out.print("Grupo:");
        String grupo = entrada.nextLine();


        Alumno miAlumno = new Alumno(nombre,apellidos,direccion,contacto,grupo);
        System.out.println(miAlumno.toString());

        /*java.util.Date fechaACtual = new Date();
        System.out.println(fechaACtual);*/

        Scanner fechaIn = new Scanner(System.in);
        System.out.println("Introduce fecha");
        System.out.print("ciudad: ");
        String ciudad = fechaIn.nextLine();
        System.out.print("dia: ");
        String dia = fechaIn.nextLine();
        System.out.print("mes: ");
        String mes = fechaIn.nextLine();
        System.out.print("año: ");
        String año = fechaIn.nextLine();

        Fecha miFecha = new Fecha(ciudad,dia,mes,año);
        System.out.println(miFecha.toString());
        System.out.println("--------------------------------------------------------------------------");


        LineaCalificaciones[] lineaCalificaciones = new LineaCalificaciones[5];
        int indice = 0;
        for (int i = 0; i <= lineaCalificaciones.length; i++) {
            Scanner miNota = new Scanner(System.in);
            System.out.println("Introduzca la nota: ");
            String nota = miNota.nextLine();

            String calificacion;
            switch (nota) {
                case "5":
                    calificacion = "Aprobado";
                    break;
                case "6":
                    calificacion = "Aprobado";
                case "7":
                    calificacion = "Notable";
                case "8":
                    calificacion = "Notable";
                    break;
                case "9":
                    calificacion = "Notable";
                    break;
                case "10":
                    calificacion = "Matricula de honor";
                    break;
                default:
                    calificacion = "Suspenso";
            }

            Scanner asignaturaIn = new Scanner(System.in);
            System.out.println("Introduzca codigo de la asignatura");
            System.out.println("025-Matematicas, 043-Fisica, 044-Quimica, 067-Filosofia, 088-Historia");
            String tipoAsignatura = asignaturaIn.nextLine();

            Materia asignatura;
            switch (tipoAsignatura) {
                case "025":
                    asignatura = Materia.MATEMATICAS;
                    break;
                case "043":
                    asignatura = Materia.FISICA;
                    break;
                case "044":
                    asignatura = Materia.QUIMICA;
                    break;
                case "067":
                    asignatura = Materia.FILOSOFIA;
                    break;
                case "077":
                    asignatura = Materia.HISTORIA;
                default:
                    asignatura = Materia.FISICA;
            }

            LineaCalificaciones linea = new LineaCalificaciones(tipoAsignatura,asignatura,nota,calificacion);
            lineaCalificaciones[indice] = linea;
            indice++;
        }
    }
}
