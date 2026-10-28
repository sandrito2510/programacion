import java.util.Scanner;

public class Programa326 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime un numero: ");
        int num1 = teclado.nextInt();
        int par=0;
        while(num1!=0) {
            if (num1 % 2 == 0) {
                par++;
            }
            System.out.println("Vuelve a introducir un numero: ");
            num1 = teclado.nextInt();
        }
        System.out.println("Este es el numero de pares: "+par);
    }
}