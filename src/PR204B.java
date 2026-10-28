import java.util.Scanner;
public class PR204 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Escribe el primer numero: ");
        int c1 = sc.nextInt();
        System.out.print("Escribe el segundo numero: ");
        int c2 = sc.nextInt();
        System.out.print("Escribe el tercer numero: ");
        int c3 = sc.nextInt();
        System.out.print("Escribe el cuarto numero: ");
        int c4 = sc.nextInt();
        int s = c1 + c2 + c3 + c4;
        int p = s / 4;
        System.out.println("El promedio de los 4 numeros es: " + p);

    }
}
