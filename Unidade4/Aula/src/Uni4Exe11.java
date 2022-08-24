import java.util.Scanner;

public class Uni4Exe11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int irmao1;
        int irmao2;
        int irmao3;

        System.out.println("Informe a idade do irmão 1");
        irmao1 = teclado.nextInt();

        System.out.println("Informe a idade do irmão 2");
        irmao2 = teclado.nextInt();

        System.out.println("Informe a idade do irmão 3");
        irmao3 = teclado.nextInt();

        if (irmao1 == irmao2 && irmao2 == irmao3) {
            System.out.println("São trigêmeos");
        } else {
            if (irmao1 == irmao2 || irmao1 == irmao3 || irmao2 == irmao3) {
                System.out.println("São gêmeos e um apenas irmão");
            } else {
                if (irmao1 != irmao2 && irmao1 != irmao3 && irmao2 != irmao3) {
                    System.out.println("São apenas irmãos");
                }

            }
        }

        teclado.close();
    }
}
