import java.util.Scanner;

public class Uni4Exe15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int mes;

        System.out.println("Informe a quantidade de meses que o funcionário foi admitido");
        mes = teclado.nextInt();

        if (mes < 12) {
            System.out.println("O reajuste será de 5%");
        } else {
            if (mes >= 13 || mes <= 48) {
                System.out.println("O reajuste será de 7%");
            }
        }

        teclado.close();
    }
}
