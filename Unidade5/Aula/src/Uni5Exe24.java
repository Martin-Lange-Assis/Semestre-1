import java.util.Scanner;

public class Uni5Exe24 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double limiteDiario;
        double peso;
        double pesoTotal = 0;
        String dados = "";

        System.out.println("Informe o limite diário  do peso (em kg)");
        limiteDiario = teclado.nextDouble();

        System.out.println("Deseja informar o peso de um peixe?(Sim ou Não) ");
        dados = teclado.next();

        while (dados.equals("Não")) {

            while (dados.equals("Sim")) {
                System.out.println("Informe o peso do peixe (em g): ");
                peso = teclado.nextDouble();
                peso = peso / 1000;
                pesoTotal += peso;

                if (peso > limiteDiario) {
                    System.out.println("O limite diário foi excedido");
                    break;
                } else {
                    System.out.println("Deseja informar o peso de mais um peixe?(Sim ou Não) ");
                    dados = teclado.next();
                }
            }
            break;
        }

        System.out.println("O peso total da pesca foi de: " + pesoTotal + "kg");

        teclado.close();
    }
}
