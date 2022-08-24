import java.util.Scanner;

public class Uni4Exe10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int idadeMarquinhos;
        int idadeZezinho;
        int idadeLuluzinha;

        System.out.println("Informe a idade de Marquinhos");
        idadeMarquinhos = teclado.nextInt();

        System.out.println("Informe a idade de Zezinho ");
        idadeZezinho = teclado.nextInt();

        System.out.println("Informe a idade de Luluzinha ");
        idadeLuluzinha = teclado.nextInt();

        if (idadeMarquinhos < idadeZezinho && idadeMarquinhos < idadeLuluzinha) {
            System.out.println("Marquinhos é o caçula");
        } else {
            if (idadeZezinho < idadeMarquinhos && idadeZezinho < idadeLuluzinha) {
                System.out.println("Zezinho é o caçula");
            } else {
                if (idadeLuluzinha < idadeMarquinhos && idadeLuluzinha < idadeZezinho) {
                    System.out.println("Luluzinha é a caçula");
                }
            }
        }

        teclado.close();
    }
}
