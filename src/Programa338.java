import java.util.Scanner;

public class Programa338 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int N=0;
        double temperatura;
        double suma = 0;
        double media;
        double maxima = 0;
        double minima = 0;

        System.out.print("Cuantas temperaturas quieres introducir: ");
        N = teclado.nextInt();

        while (N < 1) {
            System.out.println("Error. Debes introducir al menos una temperatura.");
            System.out.print("Cuantas temperaturas quieres introducir: ");
            N = teclado.nextInt();
        }

        for (int i = 1; i <= N; i++) {

            System.out.print("Introduce la temperatura " + i + ": ");
            temperatura = teclado.nextDouble();

            suma = suma + temperatura;

            if (i == 1) {
                maxima = temperatura;
                minima = temperatura;
            } else {
                if (temperatura > maxima) {
                    maxima = temperatura;
                }

                if (temperatura < minima) {
                    minima = temperatura;
                }
            }
        }

        media = suma / N;

        System.out.println("Temperatura media: " + media);
        System.out.println("Temperatura maxima: " + maxima);
        System.out.println("Temperatura minima: " + minima);
    }
}