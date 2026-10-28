import java.util.Scanner;

public class CineMasterB {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 1. Mostrar el menú inicial
        System.out.println("==========================================");
        System.out.println("               CINE MASTER                ");
        System.out.println("==========================================");
        System.out.println("1. Entrada estándar");
        System.out.println("2. Entrada premium");
        System.out.println("3. Entrada VIP");
        System.out.println("==========================================");
        // 2. Solicitar datos al usuario
        System.out.print("Nombre del cliente: ");
        String nombre = scanner.nextLine();

        System.out.print("Opción seleccionada del menú: ");
        String menuElegido = "";
        int opcion = scanner.nextInt();
        if (opcion == 21){
            menuElegido = "entrada estandar";
        }   else if (opcion == 2){
            menuElegido = "entrada premium";
        } else if (opcion == 3){
            menuElegido = "entrada Vip";
        }
        System.out.print("Edad: ");
        int edad = scanner.nextInt();

        System.out.print("Precio de una entrada (€): ");
        double precioEntrada = scanner.nextDouble();

        System.out.print("Número de entradas que desea comprar: ");
        int numeroEntradas = scanner.nextInt();

        System.out.print("Dinero entregado para realizar el pago (€): ");
        double dineroEntregado = scanner.nextDouble();
        // 3. Operaciones requeridas

        // 1. Importe total de la compra
        double importeTotal = precioEntrada * numeroEntradas;

        // 2. Cambio
        double cambio = dineroEntregado - importeTotal;

        // 3. Precio medio por entrada
        double precioMedio = importeTotal / numeroEntradas;

        // 4. Años que faltan para cumplir 65 años
        int anosJubilacion = 65 - edad;

        // 5. Operador módulo (resto de dividir el número de entradas entre 2)
        double restoEntradas = (double) numeroEntradas % 2;

        // 6. Incremento y decremento
        int entradasIncrementadas = numeroEntradas;
        entradasIncrementadas++;

        int entradasDecrementadas = numeroEntradas;
        entradasDecrementadas--;

        // Casting (Conversiones de tipo)
        int importeTotalEntero = (int) importeTotal; // De double a int (pierde decimales)
        double edadDouble = (double) edad;           // De int a double


        // 4. Mostrar resultados por pantalla
        System.out.println("\n==========================================");
        System.out.println("           RESUMEN DE LA COMPRA           ");
        System.out.println("==========================================");
        System.out.println("Cliente: " + nombre);
        System.out.println("Opción elegida: " + menuElegido);
        System.out.println("Importe total de la compra: " + importeTotal + " €");
        
        if (cambio < 0) {
            System.out.println("Aún le falta por pagar: " + Math.abs(cambio) + " €");
        } else if (cambio == 0) {
            System.out.println("Importe exacto entregado. ¡Disfrute de la película!");
        } else {
            System.out.println("Cambio a devolver: " + cambio + " €");
        }

        System.out.println("Precio medio por entrada: " + precioMedio + " €");
        System.out.println("Años restantes para cumplir 65 años: " + anosJubilacion);
        System.out.println("Resto de dividir las entradas entre 2 (Módulo %): " + restoEntradas);
        System.out.println("Entradas incrementadas en una unidad (++): " + entradasIncrementadas);
        System.out.println("Entradas reducidas en una unidad (--): " + entradasDecrementadas);
        System.out.println("Importe total convertido a int (Casting): " + importeTotalEntero);
        System.out.println("Edad convertida a double (Casting): " + edadDouble);

        // 5. Comprobación de divisiones y casting explícito
        int divEntera = 7 / 2;
        double divDecimal = (double) 7 / 2;

        System.out.println("\n--- COMPROBACIÓN DE OPERACIONES CON CASTING ---");
        System.out.println("Resultado de 7 / 2: " + divEntera);
        System.out.println("Resultado de (double) 7 / 2: " + divDecimal);

        /*
         * EXPLICACIÓN DEL COMPORTAMIENTO:
         * La operación '7 / 2' realiza una división entera entre dos operandos numéricos enteros (int),
         * por lo que el resultado se trunca descartando la parte decimal (da 3).
         * Por el contrario, en '(double) 7 / 2', el casting convierte el entero 7 a tipo double,
         * forzando a que toda la operación aritmética se evalúe en coma flotante y conservando 
         * la precisión con decimales (da 3.5).
         */

    }
}