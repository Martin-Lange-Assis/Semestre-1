import java.util.Scanner;

public class Uni5Exe23 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String dados = "";
        String nome = "";
        int totalVendas;
        double salario;

        System.out.println("Deseja digitar os dados de mais um vendedor? ");
        dados = teclado.next();

        while (!dados.equals("Não")) {
            if (dados.equals("Sim")) {
                System.out.println("Informe o nome: ");
            nome = teclado.next();
            System.out.println("Informe o total de vendas do funcionário: ");
            totalVendas = teclado.nextInt();

            salario = (totalVendas + (totalVendas * 0.3)) * 30;

            System.out.println("O funcionário: " + nome + " vendeu " + totalVendas + " produtos "
                    + " e obteve um salário de: " + " R$ " + salario);
            }
            
            break;
        }

        teclado.close();
    }

}
