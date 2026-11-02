import java.util.Scanner;

public class Programa403 {
   static Scanner teclado = new Scanner(System.in);
    public static double pedirNota(Scanner teclado) {

        System.out.print("Introduce una nota: ");
        double nota = teclado.nextDouble();

        while (nota < 0 || nota > 10) {
            System.out.println("ERROR: La nota debe estar entre 0 y 10.");
            System.out.print("Introduce una nota: ");
            nota = teclado.nextDouble();
        }

        return nota;
    }

    public static double calculoExamenes(Scanner teclado) {

        System.out.println("Introduce las notas de los examenes:");

        double nota1 = pedirNota(teclado);
        double nota2 = pedirNota(teclado);
        double nota3 = pedirNota(teclado);
        double nota4 = pedirNota(teclado);

        double total = nota1 + nota2 + nota3 + nota4;

        return total / 4;
    }

    public static double calculoTrabajos(Scanner teclado) {

        System.out.println("Introduce las notas de los trabajos:");

        double nota1 = pedirNota(teclado);
        double nota2 = pedirNota(teclado);
        double nota3 = pedirNota(teclado);
        double nota4 = pedirNota(teclado);

        double total = nota1 + nota2 + nota3 + nota4;

        return total / 4;
    }

    public static double calculoParticipacion(Scanner teclado) {

        System.out.println("Introduce la nota de participacion:");

        double participacion = pedirNota(teclado);

        return participacion;
    }

    public static void calculoNotaFinal(Scanner teclado) {
        double examenes = calculoExamenes(teclado);
        double trabajos = calculoTrabajos(teclado);
        double participacion = calculoParticipacion(teclado);
        double notafinal = (examenes * 0.5) + (trabajos * 0.4) + (participacion * 0.1);

        System.out.println("==================================");
        System.out.println("Media de los examenes: " + examenes);
        System.out.println("Media de los trabajos: " + trabajos);
        System.out.println("Nota de participacion: " + participacion);
        System.out.println("==================================");
        System.out.println("Nota final: " + notafinal);
    }
    public static void main(String[] args) {
        calculoNotaFinal(teclado);
    }
}