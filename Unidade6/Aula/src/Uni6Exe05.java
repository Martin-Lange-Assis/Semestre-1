
import java.util.Scanner;

public class Uni6Exe05 {
    private Uni6Exe05() {
        Scanner teclado = new Scanner(System.in);
        String vetMoca[] = new String[5];
        String vetRapaz[] = new String[5];
        int afinidade = 0;
        vetorLer(teclado, vetMoca, vetRapaz);
        afinidade = vetorCalcular(vetMoca, vetRapaz);
        vetorEscrever(afinidade);

        teclado.close();
    }

    private void vetorLer(Scanner teclado, String vetMoca[], String vetRapaz[]) {
        System.out.println("Responda com SIM, NAO ou IND: ");
        System.out.println();
        System.out.println("MOÇA");
        System.out.println();
        System.out.println("Gosta de música sertaneja?");
        vetMoca[0] = teclado.next();
        System.out.println("Gosta de futebol?");
        vetMoca[1] = teclado.next();
        System.out.println("Gosta de seriados?");
        vetMoca[2] = teclado.next();
        System.out.println("Gosta de redes sociais?");
        vetMoca[3] = teclado.next();
        System.out.println("Gosta da Oktoberfest?");
        vetMoca[4] = teclado.next();
        System.out.println();
        System.out.println("RAPAZ:");
        System.out.println();
        System.out.println("Gosta de música sertaneja?");
        vetRapaz[0] = teclado.next();
        System.out.println("Gosta de futebol?");
        vetRapaz[1] = teclado.next();
        System.out.println("Gosta de seriados?");
        vetRapaz[2] = teclado.next();
        System.out.println("Gosta de redes sociais?");
        vetRapaz[3] = teclado.next();
        System.out.println("Gosta da Oktoberfest?");
        vetRapaz[4] = teclado.next();

    }

    private int vetorCalcular(String vetRapaz[], String vetMoca[]) {
        int afinidade = 0;
        for (int i = 0; i < vetMoca.length; i++) {
            if (vetMoca[i].equals("SIM") && vetRapaz[i].equals("SIM")
                    || vetMoca[i].equals("IND") && vetRapaz[i].equals("IND")
                    || vetMoca[i].equals("NAO") && vetRapaz[i].equals("NAO")) {
                afinidade += 3;
            } else {

                if (vetMoca[i].equals("IND") && vetRapaz[i].equals("SIM")
                        || vetMoca[i].equals("IND") && vetRapaz[i].equals("NAO")
                        || vetRapaz[i].equals("IND") && vetMoca[i].equals("SIM")
                        || vetRapaz[i].equals("IND") && vetMoca[i].equals("NAO")) {

                    afinidade += 1;
                } else {

                    if (vetMoca[i].equals("SIM") && vetRapaz[i].equals("NAO")
                            || vetMoca[i].equals("NAO") && vetRapaz[i].equals("SIM")) {
                        afinidade -= 2;
                    }
                }

            }

        }
        return afinidade;
    }

    private void vetorEscrever(double afinidade) {
        if (afinidade == 15) {
            System.out.println("Casem!");
        } else {

            if (afinidade >= 10 && afinidade <= 14) {
                System.out.println("Vocês têm muita coisa em comum!");
            } else {

                if (afinidade >= 5 && afinidade <= 9) {
                    System.out.println("Talvez não dê certo :(");
                } else {

                    if (afinidade >= 0 && afinidade <= 4) {
                        System.out.println("Vale um encontro.");
                    } else {

                        if (afinidade <= -1 && afinidade >= -9) {
                            System.out.println("Melhor não perder tempo.");
                        } else {

                            if (afinidade == -10) {
                                System.out.println("Vocês se odeiam!");
                            }
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        new Uni6Exe05();
    }
}
