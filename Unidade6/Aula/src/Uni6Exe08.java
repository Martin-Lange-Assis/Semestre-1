import java.util.Scanner;

public class Uni6Exe08 {
    private Uni6Exe08() {
        Scanner teclado = new Scanner(System.in);
        int vetorTamanho;
        do {
            System.out.println("Informe o tamanho do vetor entre os valores de 1 a 20: ");
            vetorTamanho = teclado.nextInt();
        } while ((vetorTamanho < 1) || (vetorTamanho > 20));
        double vetN[] = new double[vetorTamanho];
        vetLer(vetN, teclado);
        System.out.println("---");
        vetImprimir(vetN);
        System.out.println("---");
        vetAcharIgual(vetN);
        System.out.println("---");

        teclado.close();
    }

    private void vetLer(double vetN[], Scanner teclado) {

        for (int i = 0; i < vetN.length; i++) {

            System.out.println("Vet[" + i + "]: ");
            vetN[i] = teclado.nextDouble();

        }

    }

    private void vetImprimir(double vetN[]) {
        for (int i = 0; i < vetN.length; i++) {
            System.out.println(vetN[i]);
        }
    }

    private void vetAcharIgual(double vetN[]) {
        boolean vetInserir[] = new boolean[vetN.length];
        for (int i = 0; i < vetInserir.length; i++) {
            vetInserir[i] = false;
        }
        System.out.println();
        System.out.println("VALOR   |  FREQUÊNCIA  ");
        int frequencia;
        for (int i = 0; i < vetN.length; i++) {
            frequencia = 0;
            for (int j = 0; j < vetN.length; j++) {
                if (!vetInserir[j]) {

                    if (vetN[i] == vetN[j]) {
                        vetInserir[j] = true;
                        frequencia++;
                    }
                }
            }
            if (frequencia > 0) {
                System.out.println(vetN[i] + " aparece " + frequencia);

            }
        }

    }

    public static void main(String[] args) {
        new Uni6Exe08();
    }
}
