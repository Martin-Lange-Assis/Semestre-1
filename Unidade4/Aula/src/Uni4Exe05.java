import java.util.Scanner;

public class Uni4Exe05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean cor;
        System.out.println("A cor é azul?");

        cor = teclado.nextBoolean();

        if (cor == true) {
            System.out.println("Sim");
        } else {
            System.out.println("Não");
        }
        teclado.close();
    }
}
