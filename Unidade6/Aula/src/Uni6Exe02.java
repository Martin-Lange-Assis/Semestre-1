import java.util.Scanner;

public class Uni6Exe02 {
    private Uni6Exe02() {
        Scanner teclado = new Scanner(System.in);
        double vet[] = new double[12];
        double media = 0;
        vetorLer(teclado, vet);
        media = vetorCalcular( vet);
        vetorEscrever(media, vet);

        teclado.close();
    }

    private void vetorLer(Scanner teclado, double vet[]) {
        for (int i = 0; i < vet.length; i++) {
            System.out.println("Informe um número real: ");
            vet[i] = teclado.nextDouble();
        }
    }

    private double vetorCalcular( double vet[]) {
        double soma = 0, media;
        for (int i = 0; i < vet.length; i++) {
            soma += vet[i];
        }
        media = soma / vet.length;
        return media;
    }

    private void vetorEscrever( double media, double vet[]) {
        for (int i = 0; i < vet.length; i++) {
           
            if (vet[i] > media) {

                System.out.println(vet[i]);
            }
        }

    }

    public static void main(String[] args) {
        new Uni6Exe02();
    }
}
