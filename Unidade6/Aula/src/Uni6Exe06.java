import java.util.Scanner;

public class Uni6Exe06 {
    private Uni6Exe06() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o tamanho do vetor (N): ");
        int vetorTamanho = teclado.nextInt();
        double vetor[] = new double[vetorTamanho];

        vetorLer(teclado, vetor);
        boolean achou;
        achou = vetorPesquisa(teclado, vetor);
        if (achou) {
            System.out.println("Encontrou..");
        }

        teclado.close();
    }

    private void vetorLer(Scanner teclado, double vetor[]) {

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Valor: ");
            vetor[i] = teclado.nextInt();

        }
    }

    private boolean vetorPesquisa(Scanner teclado, double vetor[]) {
        System.out.println("Informe o valor pesquisado: ");
        double valorPesquisado = teclado.nextInt();
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == valorPesquisado) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        new Uni6Exe06();
    }
}
