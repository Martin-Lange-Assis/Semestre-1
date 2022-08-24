import java.util.Scanner;

public class Uni4Exe27 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int horasCheg;
        double minutosCheg;
        int horasPart;
        double minutosPart;
        double valorPag = 0;
        int horaTot;
        double minTot;

        System.out.println("Informe as horas de chegada");
        horasCheg = teclado.nextInt();
        System.out.println("Informe os minutos de chegada");
        minutosCheg = teclado.nextDouble();
        System.out.println("Informe as horas de partida");
        horasPart = teclado.nextInt();
        System.out.println("Informe os minutos de partida");
        minutosPart = teclado.nextDouble();

        if (horasCheg > horasPart) {
            horasPart = horasPart + 24;
        }
        if (minutosCheg > minutosPart) {
            minutosPart = minutosPart + 60;
            horasPart = horasPart + 1;
        }

        horaTot = horasPart - horasCheg;
        System.out.println("O número total de horas é " + horaTot);
        minTot = minutosPart - minutosCheg;
        System.out.println("O número total de minutos é " + minTot);

        if (minTot >= 30 && minTot < 60) {
            horaTot = horaTot + 1;

        }

        if (horaTot < 24) {
            System.out.println(horaTot);
            switch (horaTot) {
                case 0:
                    System.out.println(valorPag = 5);
                    break;
                case 1:
                    System.out.println(valorPag = 5);
                    break;
                case 2:
                    System.out.println(valorPag = 5 + 5);
                    break;
                case 3:
                    System.out.println(valorPag = 5 + 5 + 7.5);
                    break;
                case 4:
                    System.out.println(valorPag = 5 + 5 + 7.5 + 7.5);
                    break;
                default:
                    System.out.println(valorPag = 5 + 5 + 7.5 + 7.5 + (10 * (horaTot - 4)));
                    break;

            }
            System.out.println("O valor a ser pago é " + valorPag);
        } else {
            System.out.println("Hora/Minuto ERRADO");
        }
        teclado.close();
    }
}