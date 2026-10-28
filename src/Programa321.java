import java.util.Scanner;

public class Programa321 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int opcion = -1;

        while (opcion != 0) {
            System.out.println("MENU");
            System.out.println("1. Cuantos dias tiene ese mes en el año indicado");
            System.out.println("0. Sino quieres analizar nada: ");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Dime el año que quieres analizar");
                    int año = teclado.nextInt();

                    System.out.println("Dime el mes que quieres analizar (1-12)");
                    int mes = teclado.nextInt();

                    if (año % 4 == 0 && año % 100 != 0 || año % 400 == 0) {
                        System.out.println("Este año es bisiesto");

                        switch (mes) {
                            case 1:
                            case 3:
                            case 5:
                            case 7:
                            case 8:
                            case 10:
                            case 12:
                                System.out.println("Este mes tiene 31 dias");
                                break;

                            case 4:
                            case 6:
                            case 9:
                            case 11:
                                System.out.println("Este mes tiene 30 dias");
                                break;

                            case 2:
                                System.out.println("Este mes tiene 29 dias");
                                break;

                            default:
                                System.out.println("Mes incorrecto");
                                break;
                        }

                    } else {
                        System.out.println("Este año no es bisiesto");

                        switch (mes) {
                            case 1:
                            case 3:
                            case 5:
                            case 7:
                            case 8:
                            case 10:
                            case 12:
                                System.out.println("Este mes tiene 31 dias");
                                break;

                            case 4:
                            case 6:
                            case 9:
                            case 11:
                                System.out.println("Este mes tiene 30 dias");
                                break;

                            case 2:
                                System.out.println("Este mes tiene 28 dias");
                                break;

                            default:
                                System.out.println("Mes incorrecto");
                                break;
                        }
                    }
                    System.out.println("===============================================");
                    System.out.println("Pulsa 1 si quieres volver a analizar otra fecha");
                    System.out.println("Pulsa 0 si quieres salir");
                    opcion = teclado.nextInt();
                    break;

                default:
                    opcion = 0;
                    break;
            }
        }

    }
}