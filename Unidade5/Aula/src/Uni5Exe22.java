import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni5Exe22 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");
        double salFunc = 2000;
        double aumento = 1.5;
        int ano;

        System.out.println("Informe o ano: ");
        ano = teclado.nextInt();

        for (int i = 1996; i <= ano; i++) {
            while (i == 1996) {
                salFunc = salFunc + (salFunc * aumento / 100);
                break;

            }
            if (i >= 1997) {

                salFunc = salFunc + (salFunc * aumento / 100);
                aumento *= 2;

            }
        }

        System.out.println("O salário atual do funcionário é: " + df_2.format(salFunc));

        teclado.close();
    }

}
