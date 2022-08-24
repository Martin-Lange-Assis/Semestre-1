import java.util.Scanner;

public class Uni2Exe16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double lata350;
        double garrafa600;
        double garrafa2l;
        double totalLitros;

        System.out.println("Informe quantas latas de 350ml foram compradas: ");
        lata350 = teclado.nextDouble();
        System.out.println("Informe quantas garrafas de 600ml foram compradas: ");
        garrafa600 = teclado.nextDouble();
        System.out.println("Informe quantas garrafas de 2l foram compradas: ");
        garrafa2l = teclado.nextDouble();

        totalLitros = lata350 * (0.35) + garrafa600 * (0.6) + garrafa2l * (2);

        System.out.println("O comerciante comprou " + totalLitros + " litro(s) de refrigerante.");

        teclado.close();
    }
}
