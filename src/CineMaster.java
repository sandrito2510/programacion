import java.util.Scanner;

public class CineMaster {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Mostrar el menú de selección por pantalla
        System.out.println("**** MENU DE SELECCION ****");
        System.out.println("**** 1. Entrada Estándar****");
        System.out.println("**** 2. Entrada premium ****");
        System.out.println("**** 2. Entrada VIP ****");

        // 2. Solicitar la opción al usuario
        System.out.print("Dime tu nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Dime tu edad: ");
        int edad = scanner.nextInt();
        System.out.print("Elige la opcin que mas te guste: ");
        final int estandar=8;
        final int premium=10;
        final int vip=15;
        final int edadFinal=65;
        int opcion = scanner.nextInt();
        if (opcion == 1){
            System.out.println ("Has elegido la opcion estandard ");
            System.out.println ("Este es el precio de la entrada " + estandar + "€");
            System.out.println("Cuantas entradas quieres? ");
            int numeroEntradas = scanner.nextInt();
            int precioEntradas = numeroEntradas * estandar;
            System.out.println("Has elegido este numero de entradas " + numeroEntradas +" y este es el precio "+ precioEntradas +" €" );
            System.out.println("Deposite el importe ");
            int dinero = scanner.nextInt();
            int vuelta = dinero - precioEntradas;
            if (vuelta <0) {
                System.out.println("Aun te falta esta cantidad de dinero " + vuelta + "€");
            } else if (vuelta ==0){
                System.out.println("Disfrute de la pelicula");
            } else {
                System.out.println("Te tengo que dar este dinero " + vuelta + "€" );
            }
            int jubilacion= edadFinal - edad;
            System.out.println("Y te faltan estos años para estar jubilado " + jubilacion);
            double resto = (double) numeroEntradas % 2;
            System.out.println("Este es el resto del numero de entradas " + resto);
            return;
        }
        if (opcion == 2){
            System.out.println ("Has elegido la opcion premium ");
            System.out.println ("Este es el precio de la entrada " + premium + "€");
            System.out.println("Cuantas entradas quieres? ");
            int numeroEntradas = scanner.nextInt();
            int precioEntradas = numeroEntradas * premium;
            System.out.println("Has elegido este numero de entradas " + numeroEntradas +" y este es el precio "+ precioEntradas +" €" );
            System.out.println("Deposite el importe ");
            int dinero = scanner.nextInt();
            int vuelta = precioEntradas - dinero;
            System.out.println("esto es lo que sobra " + vuelta + " €");
            int jubilacion= edadFinal - edad;
            System.out.println("Y te faltan estos años para estar jubilado " + jubilacion);
            double resto = (double) numeroEntradas % 2;
            System.out.println("Este es el resto del numero de entradas " + resto);
            // for (int i=1; i <numeroEntradas;)
            return;
        }
        if (opcion == 3){
            System.out.println ("Has elegido la opcion VIP ");
            System.out.println ("Este es el precio de la entrada " + vip + "€");
            System.out.println("Cuantas entradas quieres? ");
            int numeroEntradas = scanner.nextInt();
            int precioEntradas = numeroEntradas * vip;
            System.out.println("Has elegido este numero de entradas " + numeroEntradas +" y este es el precio "+ precioEntradas +" €" );
            System.out.println("Deposite el importe ");
            int dinero = scanner.nextInt();
            int vuelta = precioEntradas - dinero;
            System.out.println("esto es lo que sobra " + vuelta + " €");
            int jubilacion= edadFinal - edad;
            System.out.println("Y te faltan estos años para estar jubilado " + jubilacion);
            double resto = (double) numeroEntradas % 2;
            System.out.println("Este es el resto del numero de entradas " + resto);
            return;
        }



    }




}

