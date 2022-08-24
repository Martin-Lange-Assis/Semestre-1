import java.util.Scanner;

public class Uni2Exe08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String codigo1;
        int numPecas1;
        double valor1;
        double valor1Pagar;
        String codigo2;
        int numPecas2;
        double valor2;
        double valor2Pagar;

        System.out.println("Informe o código da peça 1: ");
        codigo1 = teclado.next();
        System.out.println("Informe o número de peças 1: ");
        numPecas1 = teclado.nextInt();
        System.out.println("Informe o valor de cada peça 1: ");
        valor1 = teclado.nextDouble();
        System.out.println("Informe o código da peça 2: ");
        codigo2 = teclado.next();
        System.out.println("Informe o número de peças 2: ");
        numPecas2 = teclado.nextInt();
        System.out.println("Informe o valor de cada peça 2: ");
        valor2 = teclado.nextDouble();

        valor1Pagar = valor1 * numPecas1;

        valor2Pagar = valor2 * numPecas2;

        System.out.println("O valor a ser pago pelo: " + codigo1 + " é de R$ " + valor1Pagar);
        System.out.println("O valor a ser pago pelo: " + codigo2 + " é de R$ " + valor2Pagar);

        teclado.close();
    }
}
