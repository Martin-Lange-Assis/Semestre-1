import java.util.Scanner;

public class Uni5Exe32 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int diaInexistente = 0;
        int diaSemana = 0;
        int diasDoMes = 0;
        int contador = 1;
        int linha = 1;
        int coluna = 1;

        System.out.println("Informe o dia da semana em que cai o primeiro dia do mês: ");
        diaSemana = teclado.nextInt();
        System.out.println("Informe quantos dias o mês tem: ");
        diasDoMes = teclado.nextInt();

        diaSemana = coluna;
        System.out.println("          D            S             T           Q             Q           S           S");
        while (contador <= diasDoMes) {
            while (linha < 6) {
                while (coluna <= 7) {
                    while (diaInexistente < diaSemana) {
                        if (diaInexistente == diaSemana - 1) {
                            System.out.print("   ");
                        } else {
                            System.out.print("   ");
                        }
                        diaInexistente++;
                        if (contador < 8) {
                            System.out.println("             " + contador + "                ");
                        } else {
                            System.out.println("");
                        }
                    }
                    if (contador <= diasDoMes) {
                        System.out.print("          " + contador + " ");
                        coluna++;
                        contador++;
                    }
                }
                System.out.println("\n");
                linha++;
                coluna = 1;
            }
        }

        teclado.close();
    }

}
