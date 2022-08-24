import java.util.Scanner;

public class Uni5Exe05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n;
        double termo1;
        double termo2;

        System.out.println("Informe o valor de 'n'");
        n = teclado.nextInt();

        for (int i = 2; i <= n; i++) {

            termo1 = Math.pow(2, i);
            System.out.println(termo1);
            termo2 = termo1 + 2;
            System.out.println(termo2);

        }

        teclado.close();
    }
}
