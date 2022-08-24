import java.util.Scanner;

public class Uni4Exe03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o valor de A");
        int valorA = teclado.nextInt();

        System.out.println("Informe o valor de B");
        int valorB = teclado.nextInt();

        if (valorA > valorB) {
            System.out.println("A é maior que B");
        } else {
            System.out.println("B é maior que A");
        }
        teclado.close();

    }
}
