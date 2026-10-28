import java.util.Scanner;

public class Programa306 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dime el primer numero: ");
        int primero = scanner.nextInt();
        System.out.print("Dime el segundo numero: ");
        int segundo = scanner.nextInt();
        System.out.print("Dime el tercer numero: ");
        int tercero = scanner.nextInt();
            if (primero == segundo && primero == tercero) {
                System.out.println("Los tres numeros son iguales");
            } else if (primero >= segundo && primero >= tercero){
                System.out.println("Este numero es el mas grande " + primero);
            } else if ( segundo >= primero && segundo >= tercero){
                System.out.println("Este numero es el mas grande " + segundo);
            } else if ( tercero >= primero && tercero >= segundo) {
                System.out.println("Este numero es el mas grande " + tercero);
            }
    }
}