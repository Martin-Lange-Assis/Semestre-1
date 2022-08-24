import java.util.Scanner;

public class Uni4Exe18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double diaVenc;
        double diaPag;
        double valPrest;
        double diasAtraso;
        double valPag = 0;

        System.out.println("Informe o dia do vencimento");
        diaVenc = teclado.nextDouble();
        System.out.println("Informe o dia do pagamento");
        diaPag = teclado.nextDouble();
        System.out.println("Informe o valor da prestação");
        valPrest = teclado.nextDouble();
        System.out.println("Informe o número de dias atrasados");
        diasAtraso = teclado.nextDouble();

        if (diaPag <= diaVenc) {
            System.out.println(valPag = valPrest - (valPrest * 0.1));
            System.out.println("O pagamento está em dia");
        } else {
            if (diaPag >= diaVenc + 5) {
                System.out.println(valPag == valPrest);

            } else {
                if (diaPag > diaVenc + 5) {
                    System.out.println(valPag == valPrest + (0.02 * diasAtraso));
                }
            }

            System.out.println("O valor a ser pago pelo cliente é " + valPag);

            teclado.close();
        }
    }
}