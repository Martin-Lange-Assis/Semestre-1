import java.util.Scanner;

public class Uni4Exe06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        char caractere;

        System.out.println("Informe o caractere");
        caractere = teclado.next().charAt(0);

        if (caractere == 'M') {
            System.out.println("Masculino");
        } else {
            if (caractere == 'F') {
                System.out.println("Feminino");
            }
            else {
                if (caractere == 'I') {
                    System.out.println("Indefinido");
                }
                else {
                    System.out.println("Entrada Incorreta");
                }
            }
        }

        teclado.close();

    }
}
