import java.util.Scanner;

public class Programa339 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion=-1;
        int saldo=0;
        int ingreso=0;
        while (opcion!=0){
            System.out.println("1-Ingresar Dinero.");
            System.out.println("2-Retirar Dinero.");
            System.out.println("3-Consultar Dinero.");
            System.out.println("0-Salir.");
            System.out.print("Elige tu opcion: ");
            opcion=teclado.nextInt();
                    switch (opcion) {
                        case 1:
                            System.out.print("Añade la cantidad de dinero que quieres ingresar: ");
                            ingreso =teclado.nextInt();
                                if (ingreso >0){
                                    saldo += ingreso;
                                }else {
                                    System.out.println("Error vuelve a intentarlo.");
                                }
                            System.out.println("=========================");
                            break;
                        case 2:
                            System.out.print("Que cantidad quieres retirar de dinero: ");
                            ingreso=teclado.nextInt();
                                if (ingreso >saldo){
                                    System.out.println("Error vuelve a intentarlo");
                                }else {
                                    saldo-=ingreso;
                                }
                            System.out.println("=========================");
                            break;
                        case 3:
                            System.out.println("Este es tu dinero actualmente: "+saldo);
                            System.out.println("=========================");
                            break;
                        case 0:
                            break;
                        default:
                            System.out.println("No has seleccionado ninguna opcion correcta, vuelve a intentarlo.");
                            System.out.println("=========================");

            }
        }
        System.out.println("Gracias por su visita.");
    }
}
