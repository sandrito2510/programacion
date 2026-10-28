import java.util.Scanner;

public class Programa324 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime un numero de la semana: ");
        int mes = teclado.nextInt();
            switch (mes){
                case 1:
                    System.out.println("Es lunes");
                    break;
                case 2:
                    System.out.println("Es martes");
                    break;
                case 3:
                    System.out.println("Es miercoles");
                    break;
                case 4:
                    System.out.println("Es jueves");
                    break;
                case 5:
                    System.out.println("Es viernes");
                    break;
                case 6:
                    System.out.println("Es sabado");
                    break;
                case 7:
                    System.out.println("Es domingo");
                    break;
                default:
                    System.out.println("No has puesto un numero de la semana");
                    break;

            }
   }
}