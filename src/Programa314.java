import java.util.Scanner;

public class Programa314 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el importe del producto: ");
        int importe = teclado.nextInt();

        System.out.print("Introduce el tipo de descuento: ");
        String codigoDescuento = teclado.next();
        final double SIN = 0.00d;
        final double BRONCE= 0.05d;
        final double PLATA= 0.10d;
        final double ORO= 0.20d;
              double importeFInal=0.0d;

        String signo = "";

        switch (codigoDescuento) {
            case "SIN":
                double descuento=(importe * SIN);
                double importeFinal0 =importe - descuento;
                System.out.println("el precio original es: "+ importe+ " "+ "el importe aplicado es: "+descuento+ " "+ "y el importe final es: "+importeFinal0);
                break;

            case "BRONCE":
                double descuentoBronce=(importe * BRONCE);
                double importeFinal1=importe - descuentoBronce;
                System.out.println("el precio original es: "+ importe+ " "+ "el importe aplicado es: "+descuentoBronce+ " "+ "y el importe final es: "+importeFinal1);
                break;

            case "PLATA":
                double descuentoPlata=(importe * PLATA);
                double importeFinal2=importe - descuentoPlata;
                System.out.println("el precio original es: "+ importe+ " "+ "el importe aplicado es: "+descuentoPlata+ " "+ "y el importe final es: "+importeFinal2);
                break;

            case "ORO":
                double descuentoOro=(importe * ORO);
                double importeFinal3=importe - descuentoOro;
                System.out.println("el precio original es: "+ importe+ " "+ "el importe aplicado es: "+descuentoOro+ " "+ "y el importe final es: "+importeFinal3);
                break;
        }
    }
}