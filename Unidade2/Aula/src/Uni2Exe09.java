import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni2Exe09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double reais;
        double dolares;
        double cotacao;
        DecimalFormat df_2 = new DecimalFormat("0.00");

        System.out.println("Informe o valor em dólares: ");
        dolares = teclado.nextDouble();
        System.out.println("Informe quanto está 1 dólar convertendo para reais hoje: ");
        cotacao = teclado.nextDouble(); // No dia de hoje, 1 dólar equivale a aproximadamente 4,90 reais.

        reais = dolares * cotacao;

        System.out.println("O atendente deve devolver: " + "R$ " + df_2.format(reais));

        teclado.close();
    }
}
