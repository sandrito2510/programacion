public class Programa105 {
    public static void main (String[] args) {
        if (args.length !=3) {
            System.out.println("Uso incorrecto. Debes proporcionar tres numeros.");
            return;
        }
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int num3 = Integer.parseInt(args[2]);

        int promedio = (num1 + num2 + num3) / 3;

        System.out.println("El promedio es: " + promedio);
    }
}
