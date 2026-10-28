import java.util.Scanner;

public class Programa340 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Dime cuantos numeros quieres ver de la serie de Fibonacci11: ");
        int num = teclado.nextInt();

        int aux = 1;
        int suma =0;
        int total = 0;
        int pares = 0;

        for (int i = 0, j = 1; j <= num; j++) {
            System.out.print(i + ",");
            total = total + i;

            if (i % 2 == 0) {
                pares++;
            }
            suma = i + aux;
            aux = i;
            
            i = suma;
        }

        System.out.println();
        System.out.println("Suma total: " + total);
        System.out.println("Cantidad de numeros pares: " + pares);
    }
}