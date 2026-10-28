import java.util.Scanner;

public class Programa211 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el valor del lado del triángulo equilátero: ");
        final double base = scanner.nextDouble();
        double altura = (base * Math.sqrt(3)) / 2;
        double area = (base * altura) / 2;
        double perimetro = 3 * base;
        System.out.println("Perímetro del triángulo: " + perimetro);
        System.out.println("Área del triángulo: " + area);
    }
}