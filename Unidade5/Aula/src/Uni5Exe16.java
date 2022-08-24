import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni5Exe16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");
        double alturaM = 0;
        int qtdM = 0;
        double alturaG = 0;
        int qtdG = 0;
        int altura;
        char sexo;
        double mediaM;
        double mediaG;

        System.out.println("Informe a altura em cm: ");
        altura = teclado.nextInt();

        while (altura != 0) {
            System.out.println("Informe o sexo: ");
            sexo = teclado.next().charAt(0);
            sexo = Character.toUpperCase(sexo);

            if (sexo == 'F') {
                alturaM += altura;
                qtdM++;

            }
            alturaG += altura;
            qtdG++;
            System.out.println("Informe a altura em cm: ");
            altura = teclado.nextInt();

        }
        mediaM = alturaM / qtdM;
        mediaG = alturaG / qtdG;
        System.out.println("A média da altura das mulheres é: " + df_2.format(mediaM));
        System.out.println("A média da altura das grupo é: " + df_2.format(mediaG));

        teclado.close();
    }

}
