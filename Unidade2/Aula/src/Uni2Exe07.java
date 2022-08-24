import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni2Exe07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome;
        double salarioFixo;
        double salarioTotal;
        int totalVendas;
        DecimalFormat df_2 = new DecimalFormat("0.00");

        System.out.println("Infore o nome do funcionário: ");
        nome = teclado.next();
        System.out.println("Informe o salário fixo do(a) " + nome);
        salarioFixo = teclado.nextDouble();
        System.out.println("Quantas vendas " + nome + " fez? ");
        totalVendas = teclado.nextInt();

        salarioTotal = totalVendas * 0.15 + salarioFixo;

        System.out.println("O salário do(a) " + nome + " é de " + " R$ " + df_2.format(salarioTotal));

        teclado.close();
    }
}
