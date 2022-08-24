import java.util.Scanner;

public class Uni4Exe17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double rendaLiq;
        double rendaAnual;
        double dependente;

        System.out.println("Informe a renda anual");
        rendaAnual = teclado.nextInt();
        System.out.println("Informe o número de dependentes do contribuinte");
        dependente = teclado.nextInt();

        rendaLiq = rendaAnual - (dependente * 0.02);

        if (rendaLiq < 2000) {
            System.out.println("Imposto zerado");
        }

        if (rendaLiq >= 2000 && rendaLiq <= 5000) {
            System.out.println("Imposto de 5%");
        }

        if (rendaLiq > 5000 && rendaLiq < 1000) {
            System.out.println("Imposto de 10%");
        }

        if (rendaLiq > 10000) {
            System.out.println("Imposto de 15%");
        }

        teclado.close();
    }
}
