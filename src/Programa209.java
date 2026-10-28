import java.util.Scanner;

public class Programa209 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Solicitar los dos apellidos por teclado mediante nextLine()
        System.out.print("Introduce tu primer apellido: ");
        String primerApellido = scanner.nextLine();

        System.out.print("Introduce tu segundo apellido: ");
        String segundoApellido = scanner.nextLine();

        // 2. Mostrar los valores iniciales
        System.out.println("--- VALORES ORIGINALES ---");
        System.out.println("Primer apellido: " + primerApellido);
        System.out.println("Segundo apellido: " + segundoApellido);

        // 3. Intercambiar los valores utilizando una variable auxiliar (aux)
        String aux = primerApellido;
        primerApellido = segundoApellido;
        segundoApellido = aux;

        // 4. Mostrar los valores intercambiados
        System.out.println("--- VALORES INTERCAMBIADOS ---");
        System.out.println("Primer apellido: " + primerApellido);
        System.out.println("Segundo apellido: " + segundoApellido);

    }
}