public class Programa104 {
    public static void main (String[] args) {
        if (args.length !=1)

    {
        System.out.println("Uso incorrecto. Debes proporcionar un día.");
        return;
    }

    String dia = args[0];
    System.out.println("el día introducido es: "+dia);
    }
}
