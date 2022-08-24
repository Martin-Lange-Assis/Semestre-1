
import java.util.Scanner;

public class Uni4Exe04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double numero;

        numero = teclado.nextDouble();

        if (numero - (int) numero != 0.0) {
            System.out.println("Foram digitadas casas decimais");
        } else {
            System.out.println("Não foram digitadas casas decimais");
        }
        teclado.close();
    }
}