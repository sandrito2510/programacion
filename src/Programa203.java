import java.time.LocalDate;
import java.time.LocalTime;
public class Programa203 {
    public static void main(String[] args) {

        // Definimos las variables
        int edad = 30;
        long codigoPostal = 03660;
        double altura = 1.80d;
        char genero = 'V';
        String nombre = "Sandro";
        byte numeroHijos = 0;
        int iva = 21;
        byte tallaCamisa = 20;
        double peso = 90.5d;
        double precio = 9.99d;
        boolean alumnoRepetidor = false;
        String mensaje = "Hola";
        char letra = 'S';
        boolean mayorEdad = true;
        int minutos = LocalTime.now().getMinute() ;
        int dias = LocalDate.now().getDayOfMonth();
        String matriculaCoche = "879875CDE";
        int contador = 0;
        boolean mayorDeEdad = true;
        String tallaCamiseta = "XL";
        // Mostramos todas las variables por pantalla
        System.out.println(edad);
        System.out.println(codigoPostal);
        System.out.println(altura);
        System.out.println(genero);
        System.out.println(nombre);
        System.out.println(numeroHijos);
        System.out.println(iva);
        System.out.println(tallaCamisa);
        System.out.println(peso);
        System.out.println(precio);
        System.out.println(alumnoRepetidor);
        System.out.println(mensaje);
        System.out.println(letra);
        System.out.println(mayorEdad);
        System.out.println(minutos);
        System.out.println(dias);
        System.out.println(matriculaCoche);
        System.out.println(contador);
        System.out.println(mayorDeEdad);
        System.out.println(tallaCamiseta);
    }
}
