import java.util.Scanner;

public class Uni4Exe02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Entre com um valor inteiro maior que 0");
        int valInt = teclado.nextInt();

        if(valInt % 2 == 0) {
            System.out.println("Número é par");
        } else {
            System.out.println("Número é ímpar");
        }
        teclado.close();

    }
}
