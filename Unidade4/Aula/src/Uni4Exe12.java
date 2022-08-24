import java.util.Scanner;

public class Uni4Exe12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int lado1;
        int lado2;
        int lado3;

        System.out.println("Informe o valor do lado 1");
        lado1 = teclado.nextInt();
        System.out.println("Informe o valor do lado 2");
        lado2 = teclado.nextInt();
        System.out.println("Informe o valor do lado 3");
        lado3 = teclado.nextInt();

        if (lado1 < (lado2 + lado3) && lado2 < (lado1 + lado3) && lado3 < (lado1 + lado2)) {
            if (lado1 == lado2 && lado1 == lado3) {
                System.out.println("É equilátero");
            } else {
                if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
                    System.out.println("É isósceles");
                } else {
                System.out.println("É escaleno");
                }
            }
        } else {
            System.out.println("Não formam um triângulo ");
        }
        teclado.close();
    }

}
