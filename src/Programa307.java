import java.util.Scanner;

public class Programa307 {

    public static void main(String[] args) {
        //Enero - Marzo = Invierno
        //Abril - Junio = Primavera
        //Julio - Septiembre = Verano
        //Octubre - diciembre = otoño
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dime un numero del mes: ");
        int mes = scanner.nextInt();
        switch (mes) {
            case 1:
                System.out.println("Invierno");
                break;
            case 2:
                System.out.println("Invierno");
                break;
            case 3:
                System.out.println("Invierno");
                break;
            case 4:
                System.out.println("Primavera");
                break;
            case 5:
                System.out.println("Primavera");
                break;
            case 6:
                System.out.println("Primavera");
                break;
            case 7:
                System.out.println("Verano");
                break;
            case 8:
                System.out.println("Verano");
                break;
            case 9:
                System.out.println("Verano");
                break;
            case 10:
                System.out.println("Otoño");
                break;
            case 11:
                System.out.println("Otoño");
                break;
            case 12:
                System.out.println("Otoño");
                break;
            default:
                System.out.println("No me has dicho un numero de un mes");
                break;
        }
    }
}