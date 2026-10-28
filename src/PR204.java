public class PR204 {
    public static void main(String[] args) {
        if (args.length != 4) {
            System.out.println("Uso incorrecto. Debes proporcionar 4 numeros");
        }
        int c1 = Integer.parseInt(args[0]);
        int c2 = Integer.parseInt(args[1]);
        int c3 = Integer.parseInt(args[2]);
        int c4 = Integer.parseInt(args[3]);
        int s = c1 + c2 + c3 + c4;
        int p = s / 4;
        System.out.println("El promedio de los 4 numeros es: " + p);

    }
}
