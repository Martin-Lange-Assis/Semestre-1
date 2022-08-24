import java.util.Scanner;

public class Uni6Exe04 {
    private Uni6Exe04() {
        Scanner teclado = new Scanner(System.in);
        int vet1[] = new int[3];
        int vet2[] = new int[3];
        int vet3[] = new int[3];
        vetorLer(teclado, vet1, vet2);
        vetorSomar(vet1, vet2, vet3);
        vetorEscrever(vet1, vet2, vet3);

        teclado.close();
    }

    private void vetorLer(Scanner teclado, int vet1[], int vet2[]) {
        for (int i = 0; i < vet1.length; i++) {
            System.out.println("Informe um valor inteiro para o vetor 1:");
            vet1[i] = teclado.nextInt();
        }
        for (int i = 0; i < vet2.length; i++) {
            System.out.println("Informe um valor inteiro para o vetor 2:");
            vet2[i] = teclado.nextInt();
        }
    }

    private void vetorSomar(int vet1[], int vet2[], int vet3[]) {
        for (int i = 0; i < vet3.length; i++) {
            vet3[i] = vet1[i] + vet2[i];
        }
    }

    private void vetorEscrever(int vet1[], int vet2[], int vet3[]) {
        for (int i = 0; i < vet1.length; i++) {
            System.out.println("vet[" + i + "]:" + vet1[i]);
        }
        for (int i = 0; i < vet2.length; i++) {
            System.out.println("vet[" + i + "]:" + vet2[i]);

        }
        for (int i = 0; i < vet3.length; i++) {
            System.out.println("vet[" + i + "]:" + vet3[i]);

        }
    }

    public static void main(String[] args) {
        new Uni6Exe04();
    }
}
