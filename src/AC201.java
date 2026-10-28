public class AC201 {
    public static void main(String[] args) {

        // --- Variables con valor directo ---
        boolean isOccupied = false;          // solo true/false
        char lastKeyPressed = 'M';           // un único carácter
        int pago = 5000000;                   // supera el rango de short
        byte numero = 101;                   // cabe en byte (-128 a 127)
        short precioCoche = 21345;            // supera byte, cabe en short
        byte cantidadCoche = 3;               // valor pequeño, cabe en byte
        char scapedKey = '\t';                // carácter de escape (tabulador)
        long calculoVelocidad = 8999565321456L; // supera el rango de int
        String language = "Java";             // cadena de texto
        float impuesto = 2.98f;               // decimal
        float peso1 = 67.5f;                  // decimal
        float peso2 = 42.33f;                 // decimal
        String centro = "Severo Ochoa";       // cadena de texto
        float peso3 = 77.125f;                // decimal
        byte edad = 55;                       // cabe en byte
        String simbolo = "\uD83D\uDE98";      // emoji (par subrogado, no cabe en un char)

        // --- Variables calculadas (Fórmula) ---
        // byte + byte -> Java promociona el resultado a int automáticamente
        int totalCoches = cantidadCoche + numero;

        // float + float + float -> se mantiene en float
        float totalPeso = peso1 + peso2 + peso3;

        // float / int -> se mantiene en float
        float pesoMedio = totalPeso / 3;

        // --- Mostrar todas las variables por pantalla ---
        System.out.println("isOccupied: " + isOccupied);
        System.out.println("lastKeyPressed: " + lastKeyPressed);
        System.out.println("pago: " + pago);
        System.out.println("numero: " + numero);
        System.out.println("precioCoche: " + precioCoche);
        System.out.println("cantidadCoche: " + cantidadCoche);
        System.out.println("scapedKey: " + scapedKey);
        System.out.println("calculoVelocidad: " + calculoVelocidad);
        System.out.println("language: " + language);
        System.out.println("impuesto: " + impuesto);
        System.out.println("peso1: " + peso1);
        System.out.println("peso2: " + peso2);
        System.out.println("centro: " + centro);
        System.out.println("peso3: " + peso3);
        System.out.println("edad: " + edad);
        System.out.println("simbolo: " + simbolo);
        System.out.println("totalCoches: " + totalCoches);
        System.out.println("totalPeso: " + totalPeso);
        System.out.println("pesoMedio: " + pesoMedio);
    }
}
