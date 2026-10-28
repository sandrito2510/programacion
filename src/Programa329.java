import java.util.Scanner;

public class Programa329 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int codigo = 1234;
        boolean code= false;
        int intentos=0;
        while (intentos<3 && !code){
            System.out.print("Dime el codigo de 4 numeros: ");
            int num1 = teclado.nextInt();
            intentos++;
                    if (num1 == codigo ){
                        code=true;

                    }else {
                        System.out.println("Codigo incorrecto vuelve a intentarlo");
                        System.out.println("Intento numero: "+intentos);
                        System.out.println("===============================");
                    }
        }
        if (code){
            System.out.println("Codigo correcto introducido");
        }else{
            System.out.println("Has fallado al poner el codigo");
        }
        }
    }
