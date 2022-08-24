import java.util.Scanner;

public class Uni2Exe17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nomeFunc;
        double salBruto;
        double salLiquido;
        double horasTrab;
        double numDep;
        double salHorasTrab = 10;
        double salTrab;
        double salDep = 60;
        double descINSS = 0.085;
        double descIR = 0.05;

        System.out.println("Informe o nome do funcionário");
        nomeFunc = teclado.next();
        System.out.println("Informe o número de horas trabalhadas mensais");
        horasTrab = teclado.nextDouble();
        System.out.println("Informe o número de dependentes");
        numDep = teclado.nextDouble();

        salTrab = horasTrab + salHorasTrab;

        salBruto = (horasTrab * salHorasTrab) + (salDep * numDep);
        System.out.println("O salário Bruto do(a)" + nomeFunc + " é" + " R$" + salBruto);

        salLiquido = salBruto - (descINSS * salTrab) - (descIR * salTrab);
        System.out.println("O salário líquido do(a)" + nomeFunc + " é" + " R$" + salLiquido);

        teclado.close();
    }
}
