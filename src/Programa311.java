import java.util.Scanner;

public class Programa311 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el primer numero: ");
        int num1 = teclado.nextInt();

        System.out.print("Introduce el segundo numero: ");
        int num2 = teclado.nextInt();

        System.out.print("Introduce el tercer numero: ");
        int num3 = teclado.nextInt();

        // Ordenamos los numeros de menor a mayor
        int aux;

        if (num1 > num2) {
            aux = num1;
            num1 = num2;
            num2 = aux;
        }

        if (num1 > num3) {
            aux = num1;
            num1 = num3;
            num3 = aux;
        }

        if (num2 > num3) {
            aux = num2;
            num2 = num3;
            num3 = aux;
        }

        System.out.println("Ordenados de menor a mayor: " + num1 + ", " + num2 + ", " + num3);
    }
}
