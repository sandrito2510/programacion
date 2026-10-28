import java.util.Scanner;

public class Programa316 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
         int fila =1;
         int ordenador=1;

         do {
             System.out.println("este es el primer ordenador: "+fila+"."+ordenador);
             ordenador++;
             if(ordenador >6){
                 fila++;
                 ordenador=1;
             }
         }while(fila<=7);
    }
}
