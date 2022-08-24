import java.util.Scanner;

public class Uni6Exe03 {
    private Uni6Exe03() {
        Scanner teclado = new Scanner(System.in);
        double vet[] = new double[12];
        double ajuste = 0;
        vetorLer(teclado, vet);
        vetorAjuste(vet);
        vetorEscrever(ajuste, vet);

        teclado.close();

    }

    private void vetorLer(Scanner teclado, double vet[]) {
        for (int i = 0; i < vet.length; i++) {
            System.out.println("Informe um número real: ");
            vet[i] = teclado.nextDouble();
        }
    }

    private void vetorAjuste(double vet[]) {
        for (int i = 0; i < vet.length; i++) {
            if (i % 2 != 0) {
                double ajuste = 0.05;
                vet[i] = vet[i] + vet[i] * ajuste;

            } else {
                double ajuste = 0.02;
                vet[i] = vet[i] + vet[i] * ajuste;
            }
        }

    }

    private void vetorEscrever(double ajuste, double vet[]) {
        for (int i = 0; i < vet.length; i++) {
            System.out.println("vet[" + i + "]:" + vet[i]);
        }
    }

    public static void main(String[] args) {
        new Uni6Exe03();
    }
}
