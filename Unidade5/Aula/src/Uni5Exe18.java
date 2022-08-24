import java.util.Scanner;

public class Uni5Exe18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String numCanal = " 4, 5, 7, 12";
        int telespectadores = 0;

        System.out.println("Informe o canal: ");
        numCanal = teclado.next();

        while (!numCanal.equals("0")) {
            System.out.println("Informe o número de telescpectadores: ");
            telespectadores = teclado.nextInt();
            System.out.println("Informe o número do canal: ");
            numCanal = teclado.next();

        }
        System.out.println("O percentual é: " + telespectadores + "%");

        teclado.close();
    }

}
