/*
 * CHULETA UT2 - ELEMENTOS BÁSICOS DE UN LENGUAJE DE PROGRAMACIÓN
 * 1º DAM - Java
 *
 * Basado en la UT2 proporcionada por el profesor.
 * Úsalo como referencia de estudio: cada bloque contiene ejemplos.
 */

import java.util.Scanner;

public class UT2Chuleta {

    public static void main(String[] args) {

        // =========================================================
        // 1. TIPOS DE DATOS PRIMITIVOS
        // =========================================================

        byte miByte = 100;              // -128 a 127
        short miShort = 30000;          // -32768 a 32767
        int miInt = 100000;             // entero habitual
        long miLong = 10000000000L;     // entero grande: L

        float miFloat = 3.14f;          // decimal: f
        double miDouble = 3.14159265;   // decimal habitual

        boolean verdadero = true;
        boolean falso = false;

        char letra = 'A';               // UN carácter, comillas simples

        // String NO es primitivo
        String nombre = "Sandro";       // cadena, comillas dobles


        // =========================================================
        // 2. VARIABLES
        // =========================================================

        int edad = 31;                  // declarar + asignar
        edad = 32;                      // cambiar el valor

        int numero;                     // declarar
        numero = 10;                    // asignar después

        final double PI = 3.14159;      // constante: no se puede cambiar
        // PI = 4;                      // ERROR


        // =========================================================
        // 3. LITERALES
        // =========================================================

        int entero = 25;
        double decimal = 25.5;
        char caracter = 'A';
        String texto = "Hola";
        boolean activo = true;

        // Secuencias de escape frecuentes:
        System.out.println("Hola\\nMundo");  // \n = salto de línea
        System.out.println("Hola\\tMundo");  // \t = tabulación
        System.out.println("\"Hola\"");      // \" = comillas


        // =========================================================
        // 4. STRING
        // =========================================================

        String nombre1 = "Sandro";
        String nombre2 = "Delgado";

        // Concatenar con +
        String nombreCompleto = nombre1 + " " + nombre2;
        System.out.println(nombreCompleto);

        // String empieza en índice 0
        String palabra = "Java";
        // índice:                 0 1 2 3
        // carácter:               J a v a

        System.out.println(palabra.charAt(0)); // J
        System.out.println(palabra.charAt(2)); // v

        // Longitud
        System.out.println(palabra.length());  // 4

        // IMPORTANTE:
        // último índice = length() - 1
        System.out.println(palabra.charAt(palabra.length() - 1)); // a


        // =========================================================
        // 5. MÉTODOS IMPORTANTES DE STRING
        // =========================================================

        String frase = "Hola Mundo";

        frase.length();             // número de caracteres
        frase.charAt(0);            // carácter en una posición

        frase.toUpperCase();        // MAYÚSCULAS
        frase.toLowerCase();        // minúsculas

        frase.equals("Hola Mundo"); // comparar contenido
        frase.equalsIgnoreCase("hola mundo");

        // Concatenación
        String resultado = "Hola " + "Mundo";

        /*
         * OJO:
         * Los String son objetos y no se deben comparar con ==.
         *
         * MAL:
         * if (nombre1 == nombre2)
         *
         * BIEN:
         * if (nombre1.equals(nombre2))
         */


        // =========================================================
        // 6. CHAR
        // =========================================================

        char a = 'a';
        char b = 'b';

        // char usa COMILLAS SIMPLES
        // String usa COMILLAS DOBLES

        if (a < b) {
            System.out.println("'a' es menor que 'b'");
        }

        if (a == 'a') {
            System.out.println("Es la letra a");
        }

        // Un char puede concatenarse con un String
        System.out.println("Letra: " + a);


        // =========================================================
        // 7. OPERADORES ARITMÉTICOS
        // =========================================================

        int x = 10;
        int y = 3;

        int suma = x + y;          // 13
        int resta = x - y;         // 7
        int multiplicacion = x * y;// 30
        int division = x / y;      // 3 (división entera)
        int resto = x % y;         // 1

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
        System.out.println("Resto: " + resto);

        // Para división decimal:
        double divisionDecimal = (double) x / y;
        System.out.println(divisionDecimal);


        // =========================================================
        // 8. INCREMENTO Y DECREMENTO
        // =========================================================

        int contador = 5;

        contador++; // contador = 6
        contador--; // contador = 5

        // También:
        contador += 2; // suma 2
        contador -= 2; // resta 2
        contador *= 2; // multiplica por 2
        contador /= 2; // divide entre 2


        // =========================================================
        // 9. OPERADORES RELACIONALES
        // =========================================================

        int n1 = 10;
        int n2 = 20;

        n1 == n2;   // igual
        n1 != n2;   // diferente
        n1 > n2;    // mayor
        n1 < n2;    // menor
        n1 >= n2;   // mayor o igual
        n1 <= n2;   // menor o igual

        System.out.println(n1 < n2);  // true


        // =========================================================
        // 10. OPERADORES LÓGICOS
        // =========================================================

        boolean tieneEdad = true;
        boolean tieneEntrada = false;

        // && = AND: las dos condiciones deben ser true
        System.out.println(tieneEdad && tieneEntrada);

        // || = OR: al menos una debe ser true
        System.out.println(tieneEdad || tieneEntrada);

        // ! = NOT: invierte true/false
        System.out.println(!tieneEdad);


        // =========================================================
        // 11. OPERADOR TERNARIO
        // =========================================================

        int edadPersona = 20;

        String mensaje = edadPersona >= 18
                ? "Es mayor de edad"
                : "Es menor de edad";

        System.out.println(mensaje);


        // =========================================================
        // 12. PRECEDENCIA DE OPERADORES
        // =========================================================

        /*
         * Primero se resuelven los paréntesis.
         * Después multiplicación, división y resto.
         * Después suma y resta.
         *
         * Ejemplo:
         */
        int resultado1 = 2 + 3 * 4;       // 14
        int resultado2 = (2 + 3) * 4;     // 20

        System.out.println(resultado1);
        System.out.println(resultado2);

        /*
         * Consejo:
         * Si dudas de la precedencia, usa PARÉNTESIS.
         */


        // =========================================================
        // 13. CASTING
        // =========================================================

        // Convertir un tipo en otro

        double decimalNumero = 9.8;
        int enteroNumero = (int) decimalNumero;

        System.out.println(enteroNumero); // 9

        // Casting para evitar división entera
        int a1 = 5;
        int b1 = 2;

        double divisionCorrecta = (double) a1 / b1;
        System.out.println(divisionCorrecta); // 2.5

        /*
         * CUIDADO:
         * (int) 9.8 -> 9
         * No redondea, elimina la parte decimal.
         */


        // =========================================================
        // 14. ENTRADA POR CONSOLA - SCANNER
        // =========================================================

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce tu nombre: ");
        String nombreUsuario = sc.nextLine();

        System.out.print("Introduce tu edad: ");
        int edadUsuario = sc.nextInt();

        System.out.println("Hola " + nombreUsuario);
        System.out.println("Tienes " + edadUsuario + " años");


        // Otros tipos:
        /*
         * int       -> sc.nextInt()
         * double    -> sc.nextDouble()
         * float     -> sc.nextFloat()
         * long      -> sc.nextLong()
         * short     -> sc.nextShort()
         * byte      -> sc.nextByte()
         * boolean   -> sc.nextBoolean()
         * String    -> sc.nextLine()
         * char      -> sc.next().charAt(0)
         */

        System.out.print("Introduce una letra: ");
        char letraUsuario = sc.next().charAt(0);
        System.out.println("Has introducido: " + letraUsuario);


        // =========================================================
        // 15. SALIDA POR CONSOLA
        // =========================================================

        System.out.println("Esto escribe y cambia de línea.");
        System.out.print("Esto NO cambia de línea.");
        System.out.printf(" Número: %d%n", 10);

        /*
         * %d -> enteros
         * %f -> decimales
         * %s -> String
         * %c -> char
         * %b -> boolean
         */


        // =========================================================
        // 16. EJEMPLO COMPLETO TIPO EXAMEN
        // =========================================================

        System.out.println("\n--- EJEMPLO TIPO EXAMEN ---");

        System.out.print("Introduce el primer número: ");
        int num1 = sc.nextInt();

        System.out.print("Introduce el segundo número: ");
        int num2 = sc.nextInt();

        int sumaNumeros = num1 + num2;
        int restaNumeros = num1 - num2;
        int multiplicacionNumeros = num1 * num2;

        System.out.println("Suma: " + sumaNumeros);
        System.out.println("Resta: " + restaNumeros);
        System.out.println("Multiplicación: " + multiplicacionNumeros);

        if (num2 != 0) {
            double divisionNumeros = (double) num1 / num2;
            System.out.println("División: " + divisionNumeros);
        } else {
            System.out.println("No se puede dividir entre cero.");
        }


        // =========================================================
        // 17. MINI EJEMPLO DE STRING + CHAR
        // =========================================================

        String ciudad = "Novelda";

        System.out.println("Texto: " + ciudad);
        System.out.println("Longitud: " + ciudad.length());
        System.out.println("Primera letra: " + ciudad.charAt(0));
        System.out.println("Última letra: " + ciudad.charAt(ciudad.length() - 1));
        System.out.println("Mayúsculas: " + ciudad.toUpperCase());
        System.out.println("Minúsculas: " + ciudad.toLowerCase());

        if (ciudad.equals("Novelda")) {
            System.out.println("La ciudad es Novelda.");
        }


        // =========================================================
        // 18. ERRORES TÍPICOS DE EXAMEN
        // =========================================================

        /*
         * 1. String -> comillas dobles
         *    String nombre = "Juan";
         *
         *    char -> comillas simples
         *    char inicial = 'J';
         *
         * 2. String se compara con equals()
         *    nombre.equals("Juan")
         *
         * 3. Índices empiezan en 0
         *    "Java"
         *     0123
         *
         * 4. Último carácter:
         *    texto.charAt(texto.length() - 1)
         *
         * 5. División entre int:
         *    5 / 2 = 2
         *
         *    Para obtener 2.5:
         *    (double) 5 / 2
         *
         * 6. Casting:
         *    (int) 9.8 = 9
         *
         * 7. No olvidar L en long cuando sea necesario:
         *    long numero = 10000000000L;
         *
         * 8. No olvidar f en float:
         *    float numero = 3.14f;
         */


        // =========================================================
        // 19. EJERCICIOS RÁPIDOS PARA PRACTICAR
        // =========================================================

        /*
         * EJERCICIO 1
         * Crea dos variables int y muestra:
         * - suma
         * - resta
         * - multiplicación
         * - división
         * - resto
         *
         * EJERCICIO 2
         * Pide un nombre y muestra:
         * - nombre completo
         * - longitud
         * - primera letra
         * - última letra
         *
         * EJERCICIO 3
         * Pide dos números y muestra si:
         * - el primero es mayor
         * - el segundo es mayor
         * - son iguales
         *
         * EJERCICIO 4
         * Pide una edad y muestra si es mayor o menor de edad.
         *
         * EJERCICIO 5
         * Pide un número decimal y conviértelo a int usando casting.
         *
         * EJERCICIO 6
         * Pide una letra y comprueba si es igual a 'A'.
         *
         * EJERCICIO 7
         * Pide dos números y muestra si:
         * - ambos son positivos
         * - al menos uno es positivo
         *
         * EJERCICIO 8
         * Explica qué resultado producen:
         *
         * int a = 10;
         * int b = 3;
         *
         * System.out.println(a / b);
         * System.out.println((double) a / b);
         * System.out.println(a % b);
         */


        sc.close();
    }
}
