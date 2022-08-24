import java.util.Scanner;

public class Uni3Uri1007 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valA;
        int valB;
        int valC;
        int valD;
        int DIFERENCA;

        valA = teclado.nextInt();
        valB = teclado.nextInt();
        valC = teclado.nextInt();
        valD = teclado.nextInt();

        DIFERENCA = (valA * valB - valC * valD);

        System.out.println("DIFERENCA = " + DIFERENCA);

        teclado.close();
    }
}