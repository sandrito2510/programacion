import java.util.Scanner;

public class Programa323 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime el primer numero: ");
        int num1= teclado.nextInt();
        System.out.println("Dime el segundo numero: ");
        int num2= teclado.nextInt();
        System.out.println("Dime el tercer numero: ");
        int num3= teclado.nextInt();
        int aux=0;
        if (num1 >num2) {
            if (num1 > num3) {
                System.out.println("Este numero es el primero: " + num1);
            } else if (num1 == num3) {
                System.out.println("Estos numeros son iguales: " + num1 + " " + num3);
            } else if (num1 == num2) {
                System.out.println("Estos numeros son iguales: " + num1 + " " + num2);
            } else if (num2 > num3) {
                System.out.println("Este numero es mas grande: " + num2);
            } else if (num2 == num3) {
                System.out.println("Estos numeros son iguales: " + num2 + " " + num3);
            } else {
                System.out.println("Este numero es el mas grande: " + num3);
            }
        }
        }
    }
