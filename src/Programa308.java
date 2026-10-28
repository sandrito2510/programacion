import java.util.Scanner;
import static java.lang.Math.random;

public class Programa308 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Número aleatorio entre 0 y 100, si no pones el import static java.lang.math.random, no funciona
        int numeroRandom = (int) (random() * 100);

        int intento;        // número que escribe el usuario
        int intentos = 0;   // contador de intentos

        do {
            System.out.print("Introduce un numero: ");
            intento = sc.nextInt();
            intentos++;

            if (intento < numeroRandom) {
                System.out.println("El numero es MAYOR que: " + intento);
            } else if (intento > numeroRandom) {
                System.out.println("El número es MENOR que: " + intento);
            }
        } while (intento != numeroRandom);
        System.out.println("El número era: " + numeroRandom);
        System.out.println("Lo has conseguido en: " + intentos + " intentos.");
    }
}
