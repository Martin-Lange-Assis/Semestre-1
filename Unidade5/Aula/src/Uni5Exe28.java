import java.util.Scanner;

public class Uni5Exe28 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nenhumDeNos = 0;
        double cpm22 = 0;
        double skank = 0;
        double jotaQuest = 0;
        double percentual1 = 0;
        double percentual2 = 0;
        double percentual3 = 0;
        double percentual4 = 0;
        String voto;

        System.out.println("Deseja votar? s(SIM) ou n(NÃO) ");
        voto = teclado.next();

        while (!voto.equals("n")) {
            System.out.println("Informe seu voto: ");
            voto = teclado.next();

            switch (voto) {
                case "nenhum":
                    nenhumDeNos++;
                    break;
                case "cpm":
                    cpm22++;
                    break;
                case "skank":
                    skank++;
                    break;
                case "jota":
                    jotaQuest++;

            }
            percentual1 = nenhumDeNos / (nenhumDeNos + cpm22 + skank + jotaQuest) * 100;
            percentual2 = cpm22 / (nenhumDeNos + cpm22 + skank + jotaQuest) * 100;
            percentual3 = skank / (nenhumDeNos + cpm22 + skank + jotaQuest) * 100;
            percentual4 = jotaQuest / (nenhumDeNos + cpm22 + skank + jotaQuest) * 100;
            System.out.println("Deseja cadastrar mais um voto?");
            voto = teclado.next();

        }

        System.out.println("RESULTADO: ");
        System.out.println();
        System.out.println("Nenhum de Nós: ");
        System.out.println();
        System.out.println("Total de votos: " + nenhumDeNos);
        System.out.println("Percentual: " + percentual1 + " %");
        System.out.println();
        System.out.println("CPM22: ");
        System.out.println();
        System.out.println("Total de votos: " + cpm22);
        System.out.println("Percentual: " + percentual2 + " %");
        System.out.println();
        System.out.println("Skank: ");
        System.out.println();
        System.out.println("Total de votos: " + skank);
        System.out.println("Percentual: " + percentual3 + " %");
        System.out.println();
        System.out.println("JotaQuest: ");
        System.out.println();
        System.out.println("Total de votos: " + jotaQuest);
        System.out.println("Percentual: " + percentual4 + " %");

        if (percentual1 > percentual2 && percentual1 > percentual3 && percentual1 > percentual4) {
            System.out.println("Nenhum de Nós são os vencedores!");

        }

        if (percentual2 > percentual1 && percentual2 > percentual3 && percentual2 > percentual4) {
            System.out.println("CPM22 são os vencedores!");
        }
        if (percentual3 > percentual2 && percentual3 > percentual1 && percentual3 > percentual4) {
            System.out.println("Skank são os vencedores!");
        }
        if (percentual4 > percentual2 && percentual4 > percentual1 && percentual4 > percentual3) {
            System.out.println("JotaQuest são os vencedores!");
        }
        teclado.close();
    }
}
