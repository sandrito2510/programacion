import java.util.Scanner;

public class Programa327 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int num1=-1;
        do {
            System.out.println("Dime que quieres que se muestre por pantalla: ");
            System.out.println("1-HOLA");
            System.out.println("2-ADIOS");
            System.out.println("0-SALIR");
            num1=teclado.nextInt();
            if(num1==1){
                System.out.println("================================");
                System.out.println("Hola");
                System.out.println("================================");
            }else if(num1==2){
                System.out.println("================================");
                System.out.println("Adios");
                System.out.println("================================");
            }else if(num1 !=1 || num1 !=2){
                System.out.println("================================");
                System.out.println("Pon un numero del menu");
                System.out.println("================================");
            }
        }while(num1 !=0);
    }
}