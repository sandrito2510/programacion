import java.util.Scanner;

public class Programa310 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce tu nota del examen: ");

        if (scanner.hasNextInt()) {
            int nota = scanner.nextInt();

            switch (nota) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                    System.out.println("Suspenso");
                    break;
                case 5:
                    System.out.println("Aprobado");
                    break;
                case 6:
                    System.out.println("Bien");
                    break;
                case 7:
                case 8:
                    System.out.println("Notable");
                    break;
                case 9:
                case 10:
                    System.out.println("Sobresaliente");
                    break;
                default:
                    System.out.println("Error: La nota debe estar entre 0 y 10.");
                    break;
            }
        } else {
            System.out.println("Error: Debes introducir un número entero válido.");
        }
    }
}