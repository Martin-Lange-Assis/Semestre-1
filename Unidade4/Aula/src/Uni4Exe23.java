import java.util.Scanner;

public class Uni4Exe23 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int mes;

        System.out.println("Informe o mês");
        mes = teclado.nextInt();

        switch (mes) {
            case 1:
                if (mes == 1) {
                    System.out.println("Janeiro");
                }
                break;
            case 2:
                if (mes == 2) {
                    System.out.println("Fevereiro");
                }
                break;
            case 3:
                if (mes == 3) {
                    System.out.println("Março");
                }
                break;
            case 4:
                if (mes == 4) {
                    System.out.println("Abril");
                }
                break;
            case 5:
                if (mes == 5) {
                    System.out.println("Maio");
                }
                break;
            case 6:
                if (mes == 6) {
                    System.out.println("Junho");
                }
                break;
            case 7:
                if (mes == 7) {
                    System.out.println("Julho");
                }
                break;
            case 8:
                if (mes == 8) {
                    System.out.println("Agosto");
                }
                break;
            case 9:
                if (mes == 9) {
                    System.out.println("Setembro");
                }
                break;
            case 10:
                if (mes == 10) {
                    System.out.println("Outubro");
                }
                break;
            case 11:
                if (mes == 11) {
                    System.out.println("Novembro");
                }
                break;
            case 12:
                if (mes == 12) {
                    System.out.println("Dezembro");
                }
                break;
            default:
                if (mes > 12) {
                    System.out.println("Inválido");
                }
        }

        teclado.close();
    }
}
