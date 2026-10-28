import java.util.Scanner;
public class Programa205 {
    public static void main(String[] args) {
        final double pi = 3.14;
        Scanner sc = new Scanner (System.in);
        System.out.print("Escribe el area del cuadrado: ");
        int c1 = sc.nextInt();
        int areaCuadrado = c1 * c1;
        System.out.println("El resultado del cuadrado es: " + areaCuadrado + "cm.");
        System.out.print("Escribe la primera medida del rectangulo  : ");
        int c2 = sc.nextInt();
        System.out.print("Escribe la segunda medida del rectangulo  : ");
        int c3 = sc.nextInt();
        int areaRectangulo = 2 * (c2 + c3);
        System.out.println("El resultado del rectangulo es: " + areaRectangulo + "cm.");
        System.out.print("Escribe la primera medida del triangulo  : ");
        int c4 = sc.nextInt();
        System.out.print("Escribe la segunda medida del triangulo  : ");
        int c5 = sc.nextInt();
        int areaTriangulo = (c4 * c5) / 2;
        System.out.println("El resultado del triangulo es: " + areaTriangulo + "cm.");
        System.out.print("Escribe el radio del circulo  : ");
        double c6 = sc.nextDouble();
        double areaCirculo = pi * c6 * c6;
        double perimetroCirculo = 2 * pi * c6;
        System.out.printf("El area del circulo es: " + areaCirculo + "cm." + " Y el perimetro del Circulo es: " + perimetroCirculo);
    }
}
