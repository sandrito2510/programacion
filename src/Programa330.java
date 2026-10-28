import java.util.Scanner;

public class Programa330 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Dime el numero de comprobaciones de numeros: ");
        int compro = teclado.nextInt();
        while (compro <= 0) {
            System.out.print("Dime un numero valido de comprobaciones: ");
            compro = teclado.nextInt();
        }
        for (int i=0;i<compro;i++){
            System.out.print("Dime el numero a comprobar:");
            int num1 = teclado.nextInt();
            if (num1 >0){
                System.out.println("Este numero es positivo");
            }else{
                System.out.println("Este numero es negativo");
                }
                                    }
                            }
    }
