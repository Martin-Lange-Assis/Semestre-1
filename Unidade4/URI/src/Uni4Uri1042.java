import java.util.Scanner;

public class Uni4Uri1042 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valorA;
        int valorB;
        int valorC;

        valorA = teclado.nextInt();
        valorB = teclado.nextInt();
        valorC = teclado.nextInt();

        if (valorA < valorB && valorA < valorC) {
            System.out.println(valorA);
            if (valorB < valorC) {
                System.out.println(valorB);
                System.out.println(valorC);
            } else {
                System.out.println(valorC);
                System.out.println(valorB);
            }
        } else if (valorB < valorC) {
            System.out.println(valorB);

            if (valorA < valorC) {
                System.out.println(valorA);
                System.out.println(valorC);
            } else {
                System.out.println(valorC);
                System.out.println(valorA);
            }
        } else {
            System.out.println(valorC);
            if (valorA < valorB) {
                System.out.println(valorA);
                System.out.println(valorB);
            } else {
                System.out.println(valorB);
                System.out.println(valorA);
            }
        }

        System.out.println("");
        System.out.println(valorA);
        System.out.println(valorB);
        System.out.println(valorC);

        teclado.close();
    }
}