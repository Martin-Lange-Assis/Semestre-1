import java.util.Scanner;

public class Uni2Exe10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numInteiro;
        int horas;
        int minutos;
        int segundos;

        numInteiro = teclado.nextInt();

        segundos = numInteiro % 60 % 60;
        minutos = numInteiro % 3600 / 60;
        horas = numInteiro / 3600;

        System.out.println(horas + ":" + minutos + ":" + segundos);

        teclado.close();
    }
}
