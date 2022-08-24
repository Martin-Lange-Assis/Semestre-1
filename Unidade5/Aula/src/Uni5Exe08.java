import java.util.Scanner;

public class Uni5Exe08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double menor = 0;
        double n = 0;
        int contagem = 0;
        double numero;
        double j = 0;

        System.out.println("Informe a quantidade de números: ");
        n = teclado.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Informe um número");
            numero = teclado.nextDouble();
            if (numero < 0 && numero < menor) {
                menor = numero;

            }
            if (numero > 0) {
                j = j + numero;
                contagem++;

            }

        }
        System.out.println("A média é: " + j / contagem++);
        System.out.println("O menor número negativo é: " + menor);

        teclado.close();
    }

}
