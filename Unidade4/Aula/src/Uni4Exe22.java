import java.util.Scanner;

public class Uni4Exe22 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcao;

        System.out.println("Informe a opção");
        opcao = teclado.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Bacharel em Ciências da Computação");
                break;
            case 2:
                System.out.println("Licenciado em Computação");
                break;
            case 3:
                System.out.println("Bacharel em Sistemas da Informação");
                break;

            default:
                System.out.println("Sem título");
        }

        teclado.close();
    }
}
