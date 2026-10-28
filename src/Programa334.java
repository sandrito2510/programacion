import java.util.Scanner;

public class Programa334 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Dime los numeros de alumnos: ");
        int alumnos= teclado.nextInt();
        int mayor=0;
        int menor=0;
        int acumu=0;
        int media=0;
        int aux=0;
        for (int i=1;i<=alumnos;i++) {
            System.out.print("Dime la nota del alumno " + i +": ");
             int nota = teclado.nextInt();
                if (mayor < nota){
                     mayor = nota;
                }
            if (nota < menor || aux == 0) {
                aux = nota;
                menor = aux;
            }
                acumu +=nota;
                media = acumu / i;
        }
        System.out.println("Esta es la nota media de la clase: "+media);
        System.out.println("Esta es la nota mas baja de la clase: "+menor);
        System.out.println("Esta es la nota mas alta de la clase: "+mayor);
    }
    }