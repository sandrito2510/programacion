import java.util.Scanner;

public class PR312 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el dia: ");
        int dia = teclado.nextInt();

        System.out.print("Introduce el mes (1-12): ");
        int mes = teclado.nextInt();

        String signo = "";

        switch (mes) {
            case 1:
                if (dia <= 19) {
                    signo = "Capricornio";
                } else {
                    signo = "Acuario";
                }
                break;

            case 2:
                if (dia <= 18) {
                    signo = "Acuario";
                } else {
                    signo = "Piscis";
                }
                break;

            case 3:
                if (dia <= 20) {
                    signo = "Piscis";
                } else {
                    signo = "Aries";
                }
                break;

            case 4:
                if (dia <= 19) {
                    signo = "Aries";
                } else {
                    signo = "Tauro";
                }
                break;

            case 5:
                if (dia <= 20) {
                    signo = "Tauro";
                } else {
                    signo = "Geminis";
                }
                break;

            case 6:
                if (dia <= 20) {
                    signo = "Geminis";
                } else {
                    signo = "Cancer";
                }
                break;

            case 7:
                if (dia <= 22) {
                    signo = "Cancer";
                } else {
                    signo = "Leo";
                }
                break;

            case 8:
                if (dia <= 22) {
                    signo = "Leo";
                } else {
                    signo = "Virgo";
                }
                break;

            case 9:
                if (dia <= 22) {
                    signo = "Virgo";
                } else {
                    signo = "Libra";
                }
                break;

            case 10:
                if (dia <= 22) {
                    signo = "Libra";
                } else {
                    signo = "Escorpio";
                }
                break;

            case 11:
                if (dia <= 21) {
                    signo = "Escorpio";
                } else {
                    signo = "Sagitario";
                }
                break;

            case 12:
                if (dia <= 21) {
                    signo = "Sagitario";
                } else {
                    signo = "Capricornio";
                }
                break;

            default:
                System.out.println("Mes no valido.");
                teclado.close();
                return;
        }

        if (dia < 1 || dia > 31
                || (mes == 2 && dia > 29)
                || ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30)) {
            System.out.println("Fecha no valida.");
        } else {
            System.out.println("Tu signo del zodiaco es: " + signo);
        }

        teclado.close();
    }
}

