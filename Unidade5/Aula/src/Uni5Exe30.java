import java.util.Scanner;

public class Uni5Exe30 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n;
        int k;
        int m;
        String elementosColocar = " ";
        String elementosColocados = " ";
        String elementosFora = " ";
        int somaEntra = 0;
        int somaFora = 0;

        System.out.println("Informe o valor de 'n':");
        n = teclado.nextInt();
        System.out.println("Informe o valor de 'k'");
        k = teclado.nextInt();
        System.out.println("Informe o tamanho da mochila");
        m = teclado.nextInt();

        while (n > 0) {
            if (n <= m) {
                m -= n;
                somaEntra += n;
                elementosColocados = elementosColocados + n;
            } else {
                elementosFora += n;
                somaFora += n;
            }
            elementosColocar = elementosColocar + n;
            n -= k;
        }

        System.out.println("Os elementos a serem colocados na mochila são: " + elementosColocar);
        System.out.println("Os elementos que entraram na mochila são: " + elementosColocados);
        System.out.println("Os elementos que ficaram fora da mochila são: " + elementosFora);
        System.out.println("A soma dos elementos que entraram na mochila são: " + somaEntra);
        System.out.println("A soma dos elementos queficaram fora da mochila são: " + somaFora);

        teclado.close();

    }

}
