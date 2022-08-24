import java.util.Scanner;

public class Uni4Exe25 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int val1;
        int val2;
        int opcao;

        System.out.println("Informe a opção");
        opcao = teclado.nextInt();
        System.out.println("Informe o valor 1");
        val1 = teclado.nextInt();
        System.out.println("Informe o valor 2");
        val2 = teclado.nextInt();

        switch (opcao) {
            case 1:
                System.out.println(val1 + val2);
                break;
            case 2:
                System.out.println(val1 - val2);
                break;
            case 3:
                System.out.println(val1 * val2);
                break;
            case 4:
                if (val2 != 0) {
                    System.out.println(val1 / val2);
                }
                break;
        }

        teclado.close();
    }
}