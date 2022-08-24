import java.util.Scanner;

public class CaixaAreia {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        boolean teste1 = true;
        boolean teste2 = false;

        boolean teste = teste1 && teste2;

        System.out.println("A");
        if (teste) {
            System.out.println("B");
        }
        System.out.println("C");

        teclado.close();
    }
}
