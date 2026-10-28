public class Programa106 {
    public static void main (String[] args) {
        if (args.length != 1) {
            System.out.println("Uso incorrecto. Debes proporcionar un numero.");
            return;
        }

        int num1 = Integer.parseInt(args[0]);
        int cuadrado = (num1 * num1);

        System.out.println("El cuadrado del numero es: " + cuadrado);
    }
}
