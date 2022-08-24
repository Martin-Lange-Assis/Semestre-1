import java.util.Scanner;

public class Uni4Exe20 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota1;
        double nota2;
        double nota3;
        double mediaExe;
        double mediaAprov;

        System.out.println("Informe a nota 1");
        nota1 = teclado.nextDouble();
        System.out.println("Informe a nota 2");
        nota2 = teclado.nextDouble();
        System.out.println("Informe a nota 3");
        nota3 = teclado.nextDouble();
        System.out.println("Informe a média dos exercícios");
        mediaExe = teclado.nextDouble();

        mediaAprov = (nota1 + nota2 * 2 + nota3 * 3 + mediaExe) / 7;

        if (mediaAprov >= 9.0) {
            System.out.println("Conceito = A");
            System.out.println("Aprovado");
        }
        if (mediaAprov >= 7.5 && mediaAprov < 9.0) {
            System.out.println("Conceito = B");
            System.out.println("Aprovado");

        }
        if (mediaAprov >= 6.0 && mediaAprov < 7.5) {
            System.out.println("Conceito = C");
            System.out.println("Aprovado");

        }
        if (mediaAprov >= 4.0 && mediaAprov < 6.0) {
            System.out.println("Conceito = D");
            System.out.println("Reprovado");
        }
        if (mediaAprov < 4.0) {
            System.out.println("Conceito = E");
            System.out.println("Reprovado");
        }

        teclado.close();
    }
}