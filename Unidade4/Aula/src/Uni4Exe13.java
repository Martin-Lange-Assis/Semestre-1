import java.util.Scanner;

public class Uni4Exe13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int carta1;
        int carta2;
        int carta3;
        int qtdCartasBoas = 0;

        System.out.println("Informe a carta 1");
        carta1 = teclado.nextInt();
        System.out.println("Informe a carta 2");
        carta2 = teclado.nextInt();
        System.out.println("Informe a carta 3");
        carta3 = teclado.nextInt();

        if (carta1 == 1 || carta1 == 2 || carta1 == 3) {
            qtdCartasBoas += 1;
        }
        if (carta2 == 1 || carta2 == 2 || carta2 == 3) {
            qtdCartasBoas = qtdCartasBoas + 1;
        }
        if (carta3 == 1 || carta3 == 2 || carta3 == 3) {
            qtdCartasBoas++;
        }
        if (qtdCartasBoas == 1) {
            System.out.println("TRUCO!!!");
        }
        if (qtdCartasBoas == 2) {
            System.out.println("Seis");
        }
        if (qtdCartasBoas == 3) {
            System.out.println("Nove");
        }

        teclado.close();
    }

}
