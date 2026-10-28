import java.util.Scanner;

public class Programa333 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Dime el numero hasta donde quieras contar: ");
        int num2 = teclado.nextInt();
        int par = 0;
        int impar = 1;
        int i = 1;
        System.out.println("Este es el metodo For: ");
        for ( i = 1; i <= num2; i++) {
            if (i % 2 == 0) {
                par += 2;
                System.out.print(par + ",");
            } else if (i<=num2){
                impar -= 2;
                System.out.print(impar + ",");
            }
            if (i>=num2){
                System.out.println();
            }
        }

        System.out.println("Este es el metodo While: ");
        i=1;
        par=0;
        impar=1;
        while (i <=num2) {
            if (i % 2 == 0) {
                par += 2;
                System.out.print(par + ",");
            } else {
                impar -= 2;
                System.out.print(impar + ",");
            }
            i++;
            if (i>num2){
                System.out.println();
            }
        }
        System.out.println("Este es el metodo DoWhile: ");
        i=1;
        par=0;
        impar=1;
        do {
            if (i % 2 == 0) {
                par += 2;
                System.out.print(par + ",");
            } else {
                impar -= 2;
                System.out.print(impar + ",");
            }
            i++;
            if (i>num2){
                System.out.println();
            }
        }while (i <=num2);

    }
}