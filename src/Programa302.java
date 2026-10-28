import java.util.Scanner;

public class Programa302 {
    public static void main(String[] args) {
        final double impuesto= 0.05d;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Precio del articulo: ");
        int precio = scanner.nextInt();
        if (precio >=300){
            double calculoimpuesto = (double)precio * impuesto;
            double precioFinal = (double) calculoimpuesto + precio;
            System.out.println("Este es el precio final del articulo " + precioFinal + "€");
        } else {
            System.out.println("Este es el precio final del articulo " + precio + "€");
        }


    }

}
