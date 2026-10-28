import java.util.Scanner;

public class Programa328 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Dime un numero: ");
        int num1 = teclado.nextInt();
        int resultado=0;
        for(int i=1 ;i<=10;i++){
            resultado = num1 * i;
            if (resultado % 2 == 0) {
                System.out.println(num1 + " * " + i + " = " + resultado+" *");
            }else{
                System.out.println(num1 + " * " + i + " = " + resultado);
            }
        }
    }
}