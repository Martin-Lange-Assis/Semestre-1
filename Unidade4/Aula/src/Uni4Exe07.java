import java.util.Scanner;

public class Uni4Exe07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double peso;
        double valTot = 0;

        System.out.println("Informe o peso da carta");
        peso = teclado.nextDouble();

        if (peso <= 50) {
            System.out.println("O valor total será de 0,45");
        } else {
            double pesoExcesso = peso - 50;
            double qtdAdic = (pesoExcesso / 20 + 1);
            valTot = 0.45f + 0.45f * qtdAdic;
        }
        System.out.println("Custo do selo: " + valTot);
        teclado.close();
    }
}
