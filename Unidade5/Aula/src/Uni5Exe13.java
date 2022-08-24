import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni5Exe13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

        double quilometragem = 0;
        double media = 0;
        double litros;
        double quilometrosPerc;

        System.out.println("Informe quantos km foram percorridos: ");
        quilometrosPerc = teclado.nextDouble();
        System.out.println("Informe a quantidade de litros gastos: ");
        litros = teclado.nextDouble();

        for (int r = 0; r < 3; r++) {
            quilometragem = quilometrosPerc / litros;
            media = quilometragem / litros;
            r++;

        }
        System.out.println("A quilometragem é: " + df_2.format(quilometragem));
        System.out.println("A quilometragem média é: " + df_2.format(media));

        teclado.close();

    }

}
