import java.util.Scanner;

public class Programa401 {

    public static boolean edadOptima(int edad) {
        if (edad > 18 && edad <= 65) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean ingresosPersona(int ingresos,int hipoteca){
        if (hipoteca < ingresos / 3){
            return true;
        } else {
            return false;
        }
    }
    public static void calculoHipoteca(boolean edadCorrecta, boolean ingresosCorrectos ) {
        if (edadCorrecta && ingresosCorrectos ) {
            System.out.println("Se concede la hipoteca.");
        } else {
            System.out.println("Se deniega la hipoteca.");

            if (!edadCorrecta) {
                System.out.println("Motivo: la edad no es adecuada.");
            }
            if (!ingresosCorrectos ) {
                System.out.println("Motivo: los ingresos son insuficientes.");
            }
        }
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int edad;
        int ingresos;
        int hipoteca;
        System.out.print("Introduce tu edad: ");
        edad = teclado.nextInt();
        System.out.print("Introduce tus ingresos: ");
        ingresos = teclado.nextInt();
        System.out.print("Introduce tu hipoteca: ");
        hipoteca = teclado.nextInt();
        boolean edadCorrecta = edadOptima(edad);
        boolean ingresosCorrectos = ingresosPersona(ingresos, hipoteca);
        calculoHipoteca(edadCorrecta, ingresosCorrectos);
    }
}
