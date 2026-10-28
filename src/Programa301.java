import java.util.Scanner;

public class Programa301 {
    public static void main(String[] args) {
        final int niño = 15;
        final int adulto = 20;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Edad del cliente: ");
        int edad = scanner.nextInt();
            if (edad <13){
               System.out.println("Al ser menor de 13 años, te cobro tarifa niño que es " + niño + "€");
            } else {
                System.out.println("Al ser menor de 13 años, te cobro tarifa niño que es " + adulto + "€");
            }

    }

}
