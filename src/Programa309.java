import java.util.Scanner;

public class Programa309 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dime el año para ver si es bisiesto: ");
        int año = scanner.nextInt();
        int prueba = año % 4;
        int prueba2 = año % 400;
        int prueba3 = año % 100;
        if ((prueba == 0 && prueba3 !=0) || prueba2 == 0 ) {
            System.out.println("Este anyo es bisiesto");
        } else {
            System.out.println("Este anyo no es bisiesto");
        }
    }
}