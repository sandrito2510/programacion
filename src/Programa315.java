import java.util.Scanner;

public class Programa315 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("cuantas veces quieres probar si el numero es menor que 0: ");
        int prueba = teclado.nextInt();
        int menor = 0;
        int mayor = 0;

        while (prueba != 0) {
            System.out.println("Dime el numero que quieras probar: ");
            int importe = teclado.nextInt();
            prueba--;
            if (importe >= 0) {
                mayor++;
            } else {
                menor++;
            }
        }
        System.out.println("Han salido estos numeros menores que 0: "+menor);
        System.out.println("Han salido estos numeros mayores que 0: "+mayor);
    }
}
