public class Programa110 {
    public static void main(String[] args) {
        if (args.length !=1) {
            System.out.println("Uso incorrecto. Debes proporcionar el numero de citas");
            return;
        }
        int NC = Integer.parseInt(args[0]);
        int total = 0;
        int Costo;

        for (int i = 1; i <= NC; i++) {
            if (i <= 3) {
                Costo = 50;
            } else if ( i <= 5 ) {
                Costo = 40;
            } else {
                Costo = 30;
            }

            total = total + Costo;
            System.out.println ("Cita " + i + ": " + Costo  +" €");
        }

        System.out.println("Total del tratamiento: " + total + " €");
    }
}
