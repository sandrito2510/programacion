import java.util.Scanner;

public class Programa319 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int opcion=0;

        do {
            System.out.println("MENU");
            System.out.println("1. Primera opción");
            System.out.println("2. Segunda opción");
            System.out.println("3. Tercera opción");
            System.out.println("4. Salir del programa");
            System.out.print("Escoge una opción: ");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Has escogido la opción 1");
                    break;

                case 2:
                    System.out.println("Has escogido la opción 2");
                    break;

                case 3:
                    System.out.println("Has escogido la opción 3");
                    break;

                case 4:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
            }

        } while (opcion != 0);

    }
}