import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni5Exe27 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int dia = 0;
        int totalPecasManha = 0;
        int totalPecasTarde = 0;
        int totalPecasDia;
        double salario = 0;
        String novoFunc = " ";
        int diaTop = 0;
        int pecasDiaTop = 0;
        DecimalFormat df_2 = new DecimalFormat("0.00");

        while (!novoFunc.equals("2")) {
            System.out.println("Novo funcionário(1.sim 2.não)? ");
            novoFunc = teclado.next();
            if (novoFunc.equals("1")) {
                System.out.println("Informe o dia: ");
                dia = teclado.nextInt();
                while (dia < 1 || dia > 30) {
                    System.out.println("Dia Inválido");
                    dia = teclado.nextInt();

                }
                System.out.println("Informe o total de peças produzidas no período da manhã:");
                totalPecasManha = teclado.nextInt();
                System.out.println("Informe o total de peças produzidas no período da tarde: ");
                totalPecasTarde = teclado.nextInt();
                totalPecasDia = totalPecasManha + totalPecasTarde;
                if (totalPecasDia > pecasDiaTop) {
                    pecasDiaTop = totalPecasDia;
                    diaTop = dia;
                }
                if (dia >= 1 && dia <= 15 && totalPecasDia >= 100 && totalPecasManha >= 30
                        && totalPecasTarde >= 30) {
                    salario = 0.8 * totalPecasDia;

                } else {
                    salario = 0.5 * totalPecasDia;

                }
            } else {

                if (dia >= 16 && dia <= 30) {
                    salario = (0.4 * totalPecasManha) + (0.3 * totalPecasTarde);

                }
                System.out.println("O salário do funcionário foi de: " + df_2.format(salario));
                if (totalPecasManha > totalPecasTarde) {
                    System.out.println("O funcionário produziu mais no período da manhã, com um total de: "
                            + totalPecasManha + " peças.");
                } else {
                    System.out.println("O funcionário produziu mais no período da tarde, com um total de: "
                            + totalPecasTarde + " peças.");
                }
            }
        }

        System.out.println("O dia com maior produção foi: " + diaTop);
        teclado.close();
    }

}
