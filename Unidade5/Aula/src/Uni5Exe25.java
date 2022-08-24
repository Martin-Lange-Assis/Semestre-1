
import java.util.Scanner;

public class Uni5Exe25 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int pontoD = 0;
        int pontoE = 0;
        String ponto;

        System.out.println("Quem marcou o ponto? ");
        ponto = teclado.next();
        for (int i = 1; i < 21; i++) {
            while (ponto.equals("D")) {
                pontoD++;
                System.out.println("Quem marcou o ponto? ");
                ponto = teclado.next();
                if (pontoD == 21 && pontoD - pontoE >= 2) {
                    break;
                } else {
                    if (pontoD > 21 && pontoD - pontoE == 2) {
                        break;
                    }

                }
                break;
            }
            while (ponto.equals("E")) {
                pontoE++;
                System.out.println("Quem marcou o ponto? ");
                ponto = teclado.next();
                if (pontoE == 21 && pontoE - pontoD >= 2) {
                    System.out.println("O jogador da esquerda é o vencedor");
                    break;
                } else {
                    if (pontoE > 21 && pontoE - pontoD == 2) {
                        System.out.println("O jogador da esquerda é o vencedor");
                        break;
                    }
                }
                break;
            }
        }
        if (pontoD > pontoE) {
            System.out.println("O jogador da direita é o vencedor");
        } else {
            System.out.println("O jogador da esquerda é o vencedor");
        }

        teclado.close();
    }
}
