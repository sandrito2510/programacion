import java.util.Scanner;

public class Programa210 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe el numero de dias: ");
        int totalDias = sc.nextInt();
        final int diasAño = 360;
        final int diasMes = 30;
        int numeroAños = totalDias / diasAño;
        int diasRestantes= totalDias % diasAño;
        int numeroMeses= diasRestantes / diasMes;
        int numeroDias= diasRestantes % diasMes;
        System.out.print("Los dias corresponden a ");
        System.out.println(numeroAños + " años "+numeroMeses +" meses y "+numeroDias+" dias");
    }


}