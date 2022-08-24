import java.util.Scanner;

public class Uni4Exe01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Entre com as horas trabalhadas no mês");
        int horasTrab = teclado.nextInt();
        System.out.println("Entre com o valor pago por hora");
        double valHora = teclado.nextInt();
        double salTot = horasTrab * valHora;

        int jornTrab = 40 * 4;
        
        if(horasTrab > jornTrab) {
            double salExtra = (horasTrab - 160) * (valHora);
            salTot = salTot + salExtra;
        }
        System.out.println("O salário total é:" + salTot);

        teclado.close();
    }
}
