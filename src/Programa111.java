public class Programa111 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Uso incorrecto. Debes pasar al menos un número.");
            return;
        }

        // N es simplemente cuántos números hemos pasado por terminal
        int N = args.length;

        System.out.println("=== Versión con MIENTRAS (while) ===");
        conMientras(args, N);

        System.out.println("\n=== Versión con REPITE HASTA (do-while) ===");
        conRepiteHasta(args, N);

        System.out.println("\n=== Versión con DESDE...HASTA (for) ===");
        conDesdeHasta(args, N);
    }

    // a) Mientras
    public static void conMientras(String[] args, int N) {
        int i = 1;
        int contMenoresIguales = 0;
        int contMayores = 0;

        while (i <= N) {
            int valor = Integer.parseInt(args[i - 1]);

            if (valor <= 0) {
                contMenoresIguales++;
            } else {
                contMayores++;
            }
            i++;
        }

        System.out.println("Menores o iguales a 0: " + contMenoresIguales);
        System.out.println("Mayores a 0: " + contMayores);
    }

    // b) Repite hasta
    public static void conRepiteHasta(String[] args, int N) {
        int i = 1;
        int contMenoresIguales = 0;
        int contMayores = 0;

        do {
            int valor = Integer.parseInt(args[i - 1]);

            if (valor <= 0) {
                contMenoresIguales++;
            } else {
                contMayores++;
            }
            i++;
        } while (i <= N);

        System.out.println("Menores o iguales a 0: " + contMenoresIguales);
        System.out.println("Mayores a 0: " + contMayores);
    }

    // c) Desde...hasta
    public static void conDesdeHasta(String[] args, int N) {
        int contMenoresIguales = 0;
        int contMayores = 0;

        for (int i = 1; i <= N; i++) {
            int valor = Integer.parseInt(args[i - 1]);

            if (valor <= 0) {
                contMenoresIguales++;
            } else {
                contMayores++;
            }
        }

        System.out.println("Menores o iguales a 0: " + contMenoresIguales);
        System.out.println("Mayores a 0: " + contMayores);
    }
}