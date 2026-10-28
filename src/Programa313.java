import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Programa313 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce una hora en formato hh:mm: ");
        String entrada = scanner.nextLine();
        String[] partes = entrada.split(":");
        int horas = Integer.parseInt(partes[0]);
        int minutos = Integer.parseInt(partes[1]);
        if (horas <0 || horas >24) {
            System.out.println("Has puesto mal las horas");
        } else if (minutos >60 || minutos < 0) {
            System.out.println("Has puesto mal los minutos");
        }else if (horas >=6 && horas <=12){
            System.out.println("Buenos Dias");
        } else if(horas >12 && horas <=20){
            System.out.println("Buenas Tardes");
        } else if(horas >20 && horas <6) {
            System.out.println("Buenas Noches");
        }

        }
    }
