import java.util.Scanner;

public class Uni5Exe26 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double negPedagio;
        double custoPedagio;
        double distancia;
        int trechosNeg = 0;
        int trechos150 = 0;
        int trechos = 0;

        System.out.println("Informe o valor do pedágio que Astolfo se nega a pagar: ");
        negPedagio = teclado.nextDouble();

        System.out.println("Informe o valor do pedágio: ");
        custoPedagio = teclado.nextDouble();

        while (custoPedagio > 0) {
            System.out.println("Informe a distância(em Km) ");
            distancia = teclado.nextDouble();
            trechos += 1;

            if (custoPedagio > negPedagio) {
                trechosNeg += 1;
            }
            if (distancia >= 150 && custoPedagio <= negPedagio) {
                trechos150 += 1;
            }

            System.out.println("Informe o valor do pedágio: ");
            custoPedagio = teclado.nextDouble();

        }
        System.out.println(trechosNeg + "(trechos com valor acima do qual ele se nega a pagar)");
        System.out.println(trechos + "(quantidade de trechos informados)");
        System.out.println(trechos150 + "(trechos acima de 150km com valor aceito por ele)");

        teclado.close();

    }
}