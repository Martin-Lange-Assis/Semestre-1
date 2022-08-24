import java.util.Scanner;

public class Uni5Exe17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numInsc;
        double altura = 0;
        double atletaAlto = 0;
        double atletaBaixo = 0;
        int inscAlto = 0;
        int inscBaixo = 0;
        double media;
        double totalAtl = 0;
        int contador = 0;

        System.out.println("Informe o número da inscrição: ");
        numInsc = teclado.nextInt();

        while (numInsc != 0) {
            contador = contador + 1;
            System.out.println("Informe a altura");
            altura = teclado.nextDouble();
            totalAtl = totalAtl + altura;

            if (altura > atletaAlto) {
                atletaAlto = altura;
                inscAlto = numInsc;

            }
            if (altura < atletaBaixo) {
                atletaBaixo = altura;
                inscBaixo = numInsc;

            }

            System.out.println("Informe o número de inscrição: ");
            numInsc = teclado.nextInt();

        }
        
        System.out.println("A altura do atleta mais alto é: " + atletaAlto + "cujo(a) número de inscrição é: " + inscAlto);
        System.out.println("A altura do atleta baixo é: " + atletaBaixo + "cujo(a) número de inscrição é: " + inscBaixo);
        
        media = totalAtl / contador;
        System.out.println("A média é: " + media);
        teclado.close();

    }
}
        

