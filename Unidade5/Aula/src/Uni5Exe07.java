import java.util.Scanner;

public class Uni5Exe07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double menor = 0;
        double maior = 0;
        double n = 0;

        int qtdnumeros;
        double numero;

        System.out.println("Informe a quantidade de números: ");
        qtdnumeros = teclado.nextInt();

        for (int i = 0; i < qtdnumeros; i++) {
            System.out.println("Informe um número");
            numero = teclado.nextDouble();
            if (numero < menor) {
                menor = numero;
            }
            if (numero > maior) {
                maior = numero;
                n = n + numero;

            }

        }
        System.out.println("O menor número é: " + menor);
        System.out.println("O maior número é: " + maior);

        teclado.close();

    }
}
