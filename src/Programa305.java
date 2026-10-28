import java.util.Scanner;

public class Programa305 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Numero de alumnos: ");
        int alumnos = scanner.nextInt();
        if (alumnos >=100) {
            double precio = 65.0d;
            double precioTotal= (double) precio * alumnos;
            System.out.println("Este es el precio total de todos los alumnos " + precioTotal + "€");
        } else if ( alumnos >=50 && alumnos <100 ) {
            double precio = 70.5d;
            double precioTotal= (double) precio * alumnos;
            System.out.println("Este es el precio total de todos los alumnos " + precioTotal + "€");
        } else if (alumnos >=30 && alumnos <50) {
            double precio = 95.0d;
            double precioTotal= (double) precio * alumnos;
            System.out.println("Este es el precio total de todos los alumnos " + precioTotal + "€");
        } else {
            double precio = 400.0d;
            double precioTotal= (double) precio * alumnos;
            System.out.println("Este es el precio total de todos los alumnos " + precioTotal + "€");
        }
    }
}