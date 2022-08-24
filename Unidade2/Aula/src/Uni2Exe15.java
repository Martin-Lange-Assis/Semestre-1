import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni2Exe15 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double notaCem;
        double notaCinquenta;
        double notaVinte;
        double notaDez;
        double notaCinco;
        double notaDois;
        double numInteiro;
        double moedaUm;
        double moedaCinquenta;
        double moedaVinteECinco;
        double moedaDez;
        double moedaCinco;
        double moedaUmCent;
        DecimalFormat df_0 = new DecimalFormat("0");

        numInteiro = teclado.nextDouble();

        notaCem = (int) numInteiro / 100;
        notaCinquenta = (int) (numInteiro % 100) / 50;
        notaVinte = (int) ((numInteiro % 100) % 50) / 20;
        notaDez = (int) (((numInteiro % 100) % 50) % 20) / 10;
        notaCinco = (int) ((((numInteiro % 100) % 50) % 20) % 10) / 5;
        notaDois = (int) (((((numInteiro % 100) % 50) % 20) % 10) % 5) / 2;
        moedaUm = (int) ((((((numInteiro % 100) % 50) % 20) % 10) % 5) % 2) / 1;
        double valor100 = numInteiro * 100;
        moedaCinquenta = (int) ((valor100 % 100) / 50);
        moedaVinteECinco = (int) (((valor100 % 100) % 50) / 25);
        moedaDez = (int) ((((valor100 % 100) % 50) % 25) / 10);
        moedaCinco = (int) (((((valor100 % 100) % 50) % 25) % 10) / 5);
        moedaUmCent = (int) (((((((valor100 % 100) % 50) % 25) % 10) % 5) / 1));

        System.out.println("NOTAS:");
        System.out.println(df_0.format(notaCem) + " nota(s) de R$ 100.00");
        System.out.println(df_0.format(notaCinquenta) + " nota(s) de R$ 50.00");
        System.out.println(df_0.format(notaVinte) + " nota(s) de R$ 20.00");
        System.out.println(df_0.format(notaDez) + " nota(s) de R$ 10.00");
        System.out.println(df_0.format(notaCinco) + " nota(s) de R$ 5.00");
        System.out.println(df_0.format(notaDois) + " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println(df_0.format(moedaUm) + " moeda(s) de R$ 1.00");
        System.out.println(df_0.format(moedaCinquenta) + " moeda(s) de R$ 0.50");
        System.out.println(df_0.format(moedaVinteECinco) + " moeda(s) de R$ 0.25");
        System.out.println(df_0.format(moedaDez) + " moeda(s) de R$ 0.10");
        System.out.println(df_0.format(moedaCinco) + " moeda(s) de R$ 0.05");
        System.out.println(df_0.format(moedaUmCent) + " moeda(s) de R$ 0.01");

        teclado.close();

    }
}
