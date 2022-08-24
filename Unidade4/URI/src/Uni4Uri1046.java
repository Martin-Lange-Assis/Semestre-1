import java.util.Scanner;

public class Uni4Uri1046 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int horaInicio;
        int horaFinal;

        horaInicio = teclado.nextInt();
        horaFinal = teclado.nextInt();

        if (horaInicio > horaFinal) {
            System.out.println("O JOGO DUROU " + (24 - (horaInicio - horaFinal)) + " HORA(S)");
        }
        if (horaInicio < horaFinal) {
            System.out.println("O JOGO DUROU " + (horaFinal - horaInicio) + " HORA(S)");
        }
        if (horaInicio == horaFinal) {
            System.out.println("O JOGO DUROU 24 HORA(S)");
        }

        teclado.close();
    }
}
