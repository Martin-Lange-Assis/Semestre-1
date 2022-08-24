import java.util.Scanner;

public class Uni5Exe19 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double valorCompra = 1;
        double desconto;
        double totalPag = 0;
        double retorno = 0;

        while (valorCompra != 0) {
            System.out.println("Informe o valor da compra: ");
            valorCompra = teclado.nextDouble();
            if (valorCompra > 500) {
                desconto = valorCompra * 20 / 100;
                totalPag = valorCompra - desconto;
                valorCompra++;
                System.out.println("O valor total pago foi de: " + " R$ " + totalPag);

            } else {
                if (valorCompra <= 500) {
                    desconto = valorCompra * 15 / 100;
                    totalPag = valorCompra - desconto;
                    System.out.println("O valor total pago foi de: " + " R$ " + totalPag);
                }

            }
            retorno = totalPag;
            System.out.println("O retorno da loja foi de: " + " R$ " + retorno);
        }

        teclado.close();

    }

}
