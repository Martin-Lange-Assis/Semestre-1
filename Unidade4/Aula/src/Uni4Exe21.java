import java.util.Scanner;

public class Uni4Exe21 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double massa;
        double altura;
        double imc;

        System.out.println("Informe a massa");
        massa = teclado.nextDouble();

        System.out.println("Informe a altura");
        altura = teclado.nextDouble();

        imc = massa / Math.pow(altura, 2);

        if (imc < 18.5) {
            System.out.println(imc);
            System.out.println("Magreza");
        }
        if (imc >= 18.5 && imc <= 24.9) {
            System.out.println(imc);
            System.out.println("Saudável");
        }
        if (imc >= 25 && imc <= 29.9) {
            System.out.println(imc);
            System.out.println("Sobrepeso");
        }
        if (imc >= 30 && imc <= 34.9) {
            System.out.println(imc);
            System.out.println("Obesidade Grau 1");
        }
        if (imc >= 35 && imc <= 39.9) {
            System.out.println(imc);
            System.out.println("Obesidade Grau 2 (severa)");
        }
        if (imc >= 40.0) {
            System.out.println(imc);
            System.out.println("Obesidade Grau 3 (mórbida)");
        }

        teclado.close();
    }
}
