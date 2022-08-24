import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni5Exe29 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int saque;
        DecimalFormat df_0 = new DecimalFormat("0");
        double notaVinte = 0;
        double notaDez = 0;
        double notaCinco = 0;
        double notaDois = 0;
        double notaUm = 0;
        String saqueDesejo = " ";

        System.out.println("Deseja fazer um saque?(s ou n");
        saqueDesejo = teclado.next();

        while (!saqueDesejo.equals("n")) {
            System.out.println("Informe o valor do saque");
            saque = teclado.nextInt();

            notaVinte = (int) ((saque % 100) % 50) / 20;
            notaDez = (int) (((saque % 100) % 50) % 20) / 10;
            notaCinco = (int) ((((saque % 100) % 50) % 20) % 10) / 5;
            notaDois = (int) (((((saque % 100) % 50) % 20) % 10) % 5) / 2;
            notaUm = (int) ((((((saque % 100) % 50) % 20) % 10) % 5) % 2) / 1;

            System.out.println("NOTAS:");
            System.out.println(df_0.format(notaVinte) + " nota(s) de R$ 20.00");
            System.out.println(df_0.format(notaDez) + " nota(s) de R$ 10.00");
            System.out.println(df_0.format(notaCinco) + " nota(s) de R$ 5.00");
            System.out.println(df_0.format(notaDois) + " nota(s) de R$ 2.00");
            System.out.println(df_0.format(notaUm));

            System.out.println("Deseja um novo saque? ");
            saqueDesejo = teclado.next();
            while (saqueDesejo.equals("n")) {
                break;
            }
            
        }

        teclado.close();
    }

}
