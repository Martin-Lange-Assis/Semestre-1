import java.util.Scanner;

public class Uni4Exe26 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        char opcao;
        int b;
        int h;
        int areaTriang;
        int l;
        int areaQuad;
        int areaRet;
        int r;
        double areaCirc;

        System.out.println("Escolha uma opção");
        opcao = teclado.next().charAt(0);

        switch (opcao) {
            case 'T':
                System.out.println("Calcular a área de um triângulo de base 'b' e altura 'h");
                System.out.println("Informe o valor de 'b");
                b = teclado.nextInt();
                System.out.println("Informe o valor de 'h");
                h = teclado.nextInt();
                System.out.println(areaTriang = +b * h / 2);
                System.out.println("A área do triângulo é " + areaTriang);
                break;

            case 'Q':
                System.out.println("Calcular a área de um quadrado de lado 'l'");
                System.out.println("Informe o valor de 'l'");
                l = teclado.nextInt();
                System.out.println(areaQuad = l * l);
                System.out.println("A área do quadrado é " + areaQuad);
                break;

            case 'R':
                System.out.println("Calcular a áre de um retângulo de base 'b' e altura 'h'");
                System.out.println("Informe o valor de 'b'");
                b = teclado.nextInt();
                System.out.println("Informe o valor de 'h'");
                h = teclado.nextInt();
                System.out.println(areaRet = +b * h);
                System.out.println("A área do retângulo é " + areaRet);
                break;

            case 'C':
                System.out.println("Calcule a área de um círculo de raio 'r'");
                System.out.println("Informe o valor de 'r'");
                r = teclado.nextInt();
                System.out.println(areaCirc = +Math.PI * Math.pow(r, 2));
                System.out.println("A área do círculo é " + areaCirc);
                break;
            default:
                System.out.println("Opção Inválida");
        }

        teclado.close();
    }

}
