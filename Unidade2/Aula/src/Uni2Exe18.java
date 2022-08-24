import java.util.Scanner;

public class Uni2Exe18 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double compParede;
        double alturaParede;
        double areaParede;
        double numAzulejos;
        double custoAzulejo = 12.5;
        double custoTotal;

        System.out.println("Informe o comprimento da parede");
        compParede = teclado.nextDouble();
        System.out.println("Informe a altura da parede");
        alturaParede = teclado.nextDouble();

        areaParede = compParede * alturaParede;

        numAzulejos = areaParede * 9;

        custoTotal = numAzulejos * custoAzulejo;

        System.out.println("O valor gasto com a compra dos azulejos é de " + "R$" + custoTotal);

        teclado.close();

    }

}
