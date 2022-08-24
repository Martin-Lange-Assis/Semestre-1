import java.util.Scanner;

public class Uni5Exe20 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int tempo = 0;
        double massaInicial;
        System.out.println("Informe a massa inicial em gramas: ");
        massaInicial = teclado.nextDouble();
        double massaFinal = massaInicial;
        int horas;
        int minutos;
        int segundos;

        while (massaFinal > 0.5) {
            massaFinal /= 2;
            tempo += 50;
        }

        System.out.println("A massa inicial é =  " + massaInicial + " gramas ");
        System.out.println("A massa final é = " + massaFinal + "gramas");

        horas = (tempo / 3600);
        minutos = (tempo % 3600) / 60;
        segundos = (tempo % 3600) % 60;
        System.out.println(horas + " horas " + minutos + " minutos " + segundos + " segundos ");

        teclado.close();
    }

}
