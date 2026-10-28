import java.util.Scanner;

public class Programa322 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Antes de todo dime cual es tu numero objetivo: ");
        int objetivo = teclado.nextInt();
        int contador2=0;
        int opcion = 0;
        int suma=0;
        int seguir=0;
        int contador=0;
        int impar=0;
        do  {
            System.out.println("MENU");
            System.out.println("1. Numeros para sumar");
            System.out.println("0. Sino quieres analizar nada: ");
            seguir = teclado.nextInt();
            if (seguir ==1){
                System.out.println("======================================");
            System.out.println("Introduce el numero a la suma: ");
            opcion = teclado.nextInt();
            if (opcion!=0) {
                suma += opcion;
                contador++;
            if (opcion == objetivo){
                contador2++;
            }
            if (opcion % 2 !=0){
                impar++;
            }
                System.out.println("==============================================");
            }else {
                break;
            }
            }
        } while (seguir !=0);
        System.out.println("esta es la suma total de numeros: "+suma);
        System.out.println("este es el numero de numeros introducidos: "+contador);
        System.out.println("este es el numero de numero impar introducido: "+impar);
        System.out.println("este es el numero de numeros objetivos introducidos: "+contador2);
    }
}