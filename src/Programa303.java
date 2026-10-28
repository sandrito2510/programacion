import java.util.Scanner;

public class Programa303 {
    public static void main(String[] args) {
        final double impuesto = 0.05d;
        Scanner scanner = new Scanner(System.in);
        System.out.print("edad: ");
        int edad = scanner.nextInt();

        System.out.print("De cuanto saldo dinspone: ");
        int saldo = scanner.nextInt();

        if (edad >= 21 && saldo >= 10000) {
            System.out.println("Eres apto");
        } else {
            System.out.println("No eres apto");
        }

        //Podria alguien con 25 años y 10000 alquilar un coche?
        // Si porque cumple las dos condiciones la de la edad y el dinero
        // Y que pasa si tiene 21 y 9000? no porque no cumple las 2 condiciones
        //Y que pasaria si cambiamos el y por un o?
        if (edad >= 21 || saldo >= 10000) {
            System.out.println("Eres apto ahora");
        } else {
            System.out.println("No eres apto aun");
        }
        //Que solo tiene que cumplir una condición
        //En la primera pregunta, si tendriamos el mismo resultado
        // segunda pregunta, seria apto

    }
}