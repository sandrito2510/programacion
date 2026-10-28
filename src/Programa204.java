public class Programa204 {
    public static void main(String[] args) {
        if (args.length != 4) {
            System.out.println("Uso incorrecto. Debes proporcionar cuatro calificaciones.");
            return;
        }

        // 2. Leer C1, C2, C3, C4
        double C1 = Double.parseDouble(args[0]);
        double C2 = Double.parseDouble(args[1]);
        double C3 = Double.parseDouble(args[2]);
        double C4 = Double.parseDouble(args[3]);

        // 3. Hacer S = C1 + C2 + C3 + C4
        double S = C1 + C2 + C3 + C4;

        // 4. Hacer P = S/4
        double P = S / 4;

        // 5. Escribir P
        System.out.println("El promedio es: " + P);
    }
}
