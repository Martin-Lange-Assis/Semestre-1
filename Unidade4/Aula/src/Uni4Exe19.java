import java.util.Scanner;

public class Uni4Exe19 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int x;
        int y;

        System.out.println("Informe o valor de X");
        x = teclado.nextInt();

        System.out.println("Informe o valor de Y");
        y = teclado.nextInt();

        if (x == 0 && y == 0) {
            System.out.println("Quadrante 0");
        } else {
            if (x > 0 && y > 0) {
                System.out.println("Quadrante 1");
            } else {
                if (x > 0 && y < 0) {
                    System.out.println("Quadrante 2");
                } else {
                    if (x < 0 && y < 0) {
                        System.out.println("Quadrante 3");
                    } else {
                        if (x < 0 && y > 0) {
                            System.out.println("Quadrante 4");
                        }
                    }
                }
            }
        }

        teclado.close();
    }
}
