import java.util.Scanner;

public class Programa318 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe el primer numero:");
        int n1 = teclado.nextInt();
        System.out.println("Escribe el segundo numero");
        int n2 = teclado.nextInt();
        int par = 0;
        int resto = 0;
        for (int i = n1+1; i < n2; i++) {
            if (i % 2 == 0) {
                par++;
            }
        }
        System.out.println("Hay estos numeros pares: " + par);
    }
}