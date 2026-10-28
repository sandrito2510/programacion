import java.util.Scanner;

public class Programa208 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Mostrar el menú de selección por pantalla
        System.out.println("**** MENU DE SELECCION ****");
        System.out.println("**** 1. Sentarse en el restaurante");
        System.out.println("**** 2. No sentarme en este restaurante porque... ****");

        // 2. Solicitar la opción al usuario
        System.out.print("Elige una opción: ");
        int opcion = scanner.nextInt();
        if (opcion == 2){
            System.out.println ("Has querido irte del restaurante ");
            return;
        }
        if (opcion == 1) {
            System.out.println("1. Ensalada Cesar ");
            System.out.println("2. Croquetas caseras ");
            System.out.println("3. Sopa de marisco ");
            System.out.println("Elige una opción: ");
            int opcion2 = scanner.nextInt();
            final String plato1= "Ensalada Cesar";
            final String plato2= "Croquetas caseras";
            final String plato3= "Sopa de marisco";
            String platoElegido1= "";
            if (opcion2 ==1) {
                platoElegido1 = plato1;

            } else if (opcion2 ==2) {
                platoElegido1 = plato2;

            } else if (opcion2 ==3) {
                platoElegido1 = plato3;
            }
            System.out.println("1. Chuleton de ternera ");
            System.out.println("2. Salmón a la plancha ");
            System.out.println("3. Paella valenciana ");
            System.out.println("Elige una opción: ");
            final String entrentante1= "Chuleton de ternera";
            final String entrentante2= "Salmon a la plancha";
            final String entrentante3= "Paella valenciana";
            int opcion3 = scanner.nextInt();
            String platoElegido2= "";
                if (opcion3 ==1) {
                  platoElegido2 = entrentante1;

                } else if (opcion3 ==2) {
                    platoElegido2 = entrentante2;

                } else if (opcion3 ==3){
                    platoElegido2 = entrentante3;
                }

            final String postre1= "Tiramisu";
            final String postre2= "Tarta de queso";
            final String postre3= "Miguelitos";
            System.out.println("Elige una opción: ");
            int opcion4 = scanner.nextInt();
            String platoElegido3= "";
            if (opcion4 ==1) {
                platoElegido3 = postre1;

            } else if (opcion4 ==2) {
                platoElegido3 = postre2;

            } else if (opcion4 ==3){
                platoElegido3 = postre3;
            }
            String pedidoFinal = platoElegido1 + ", " + platoElegido2 + " y " + platoElegido3;
            System.out.println("Este es tu pedido " +pedidoFinal);

            }

        }


    }
