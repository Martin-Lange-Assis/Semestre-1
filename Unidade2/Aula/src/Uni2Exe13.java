import java.util.Scanner;

public class Uni2Exe13 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int distY;
        int tempY;

        distY = teclado.nextInt();

        tempY = 2 * distY;

        System.out.println(tempY + " minutos");

        teclado.close();
    }
}
