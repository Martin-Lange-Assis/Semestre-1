import java.util.Scanner;

public class Uni5Exe12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n;

        System.out.println("Informe a quantidade de linhas: ");
        n = teclado.nextInt();
        int numFloyd = 1;

        for (int qtdLinhas = 1; qtdLinhas <= n; qtdLinhas++) {

            for (int qtdColuna = 1; qtdColuna <= qtdLinhas; qtdColuna++) {
                if (numFloyd < 10) {
                    System.out.print(numFloyd + "   ");

                } else {
                    if (numFloyd < 100) {
                        System.out.print(numFloyd + "  ");

                    } else {
                        System.out.print(numFloyd + " ");
                    }

                }
                numFloyd++;

            }
            System.out.println();

        }

        teclado.close();

    }
}
