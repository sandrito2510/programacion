import java.util.Scanner;

public class Programa335 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int mayor = 0;
        int menor = 0;
        int acumu = 0;
        int media = 0;
        int aux = 0;

        System.out.print("Dime el numero de barcos que quieres comparar: ");
        int num = teclado.nextInt();

        for (int i = 1; i <= num; i++) {
            System.out.print("Dime el nombre del barco " + i + ": ");
            String barco = teclado.next();
            int numcarac = barco.length();

            if (mayor < numcarac) {
                mayor = numcarac;
            }
            if (numcarac < menor || aux == 0) {
                aux = numcarac;
                menor = aux;
            }
            acumu += numcarac;
            media = acumu / i;
        }

        System.out.println("Esta es la longitud media de los nombres: " + media);
        System.out.println("Esta es la longitud mas baja: " + menor);
        System.out.println("Esta es la longitud mas alta: " + mayor);

    }
}