import java.util.Scanner;

public class Programa207 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Escribe la primera variable: ");
        int c1 = sc.nextInt();
        System.out.print("Escribe la segunda variable  : ");
        int c2 = sc.nextInt();
        System.out.println("La primera variable es: " + c1);
        System.out.println("La segunda variable es: " + c2);
        if (c1 == c2 ) {
            System.out.println("Esta mal hecho, escribe numeros diferentes");
            return;
        }
        if (c1 == c1 && c2 == c2) {
           int temporal = c2;
           c2=c1;
           c1 = temporal;
        }
        System.out.println("La primera variable es: " + c1);
        System.out.println("La segunda variable es: " + c2);
    }
}
