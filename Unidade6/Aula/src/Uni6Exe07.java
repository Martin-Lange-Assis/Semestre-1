import java.util.Scanner;

public class Uni6Exe07 {
    private Uni6Exe07() {
        Scanner teclado = new Scanner(System.in);
        int vetTamanho;
        int bolha = 0;
        do {
            System.out.println("Informe um valor inteiro para N: ");
            vetTamanho = teclado.nextInt();

        } while (vetTamanho < 1 || vetTamanho > 20);
        int vetN[] = new int[vetTamanho];

        vetorInformar(vetN, teclado);
        vetorOrdenar(vetN, bolha);
        vetorResultante(vetN);

        teclado.close();
    }

    private void vetorInformar(int vetN[], Scanner teclado) {
        System.out.println("__ vetorInformar");
        int valor;
        int vetPos = 0;
        int i = 0;
        while (i < vetN.length) {
            System.out.println("Vet[" + i + "]: ");
            valor = teclado.nextInt();
            if (!vetorPesquisa(vetN, valor, vetPos)) {
                vetN[i] = valor;
                vetPos++;
                i++;
            }
        }
    }

    private boolean vetorPesquisa(int vetN[], int valor, int vetPos) {
        System.out.println("__vetorPesquisa");
        for (int i = 0; i < vetPos; i++) {
            if (valor == vetN[i]) {
                return true;
            }
        }
        return false;
    }

    private void vetorOrdenar(int vetn[], int bolha) {
        System.out.println("__vetorOrdenar");
        for (int i = 0; i < vetn.length; i++) {

            for (int j = 0; j < vetn.length - 1; j++) {
                if (vetn[j] > vetn[j + 1]) {
                    bolha = vetn[j];
                    vetn[j] = vetn[j + 1];
                    vetn[j + 1] = bolha;

                }

            }
        }

    }

    private void vetorResultante(int vet[]) {
        System.out.println("__vetorResultante");
        for (int i = 0; i < vet.length; i++) {

            System.out.println("vet[" + i + "]:" + vet[i]);
        }
    }

    public static void main(String[] args) {
        new Uni6Exe07();
    }
}
