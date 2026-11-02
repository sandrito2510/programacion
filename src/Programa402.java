import java.util.Scanner;

public class Programa402 {

    private static final double COSTE_ENTRADA = 9.99;
    public static double calculoAutobus(int alu) {
        if (alu >= 100) {
            return 65.0;
        } else if (alu >= 50) {
            return 70.5;
        } else if (alu >= 30) {
            return 95.0;
        } else {
            return 400.0 / alu;
        }
    }

    public static double calculoEntradas(int alu) {
        if (alu >= 100) {
            return COSTE_ENTRADA / 2;
        } else if (alu >= 50) {
            return COSTE_ENTRADA * 2 / 3;
        } else {
            return COSTE_ENTRADA;
        }
    }


    public static void calculoExcursion(double autobus, double entrada) {
        double total = autobus + entrada;

        System.out.println("Coste del autobus por alumno: " + autobus + " euros");
        System.out.println("Coste de la entrada por alumno: " + entrada + " euros");
        System.out.println("Coste total por alumno: " + total + " euros");
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el numero de alumnos: ");
        int alu = teclado.nextInt();

        if (alu > 0) {
            double autobus = calculoAutobus(alu);
            double entrada = calculoEntradas(alu);
            calculoExcursion(autobus, entrada);
        } else {
            System.out.println("El numero de alumnos debe ser mayor que 0.");
        }
    }
}