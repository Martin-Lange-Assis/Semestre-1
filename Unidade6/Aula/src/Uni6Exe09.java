import java.util.Scanner;

public class Uni6Exe09 {
    private Uni6Exe09() {
        Scanner teclado = new Scanner(System.in);
        int vetorTamanho;
        do {
            System.out.println("Informe o tamanho do vetor entre os valores de 1 a 30: ");
            vetorTamanho = teclado.nextInt();
        } while ((vetorTamanho < 1) || (vetorTamanho > 30));

        int vet[] = new int[vetorTamanho];
        String sexo[] = new String[vetorTamanho];
        int notaCinema[] = new int[vetorTamanho];
        int idade[] = new int[vetorTamanho];
        double mediaCinema = 0;

        vetorLer(teclado, vet, sexo, notaCinema, idade);
        mediaCinema = vetorMediaCinema(vet, notaCinema);
        vetorMediaHomens(vet, sexo, notaCinema);
        vetorNotaMulherJovem(vet, sexo, idade, notaCinema);
        vetorMulheres50(vet, sexo, idade, notaCinema, mediaCinema);

        teclado.close();
    }

    private void vetorLer(Scanner teclado, int vet[], String sexo[], int notaCinema[], int idade[]) {
        for (int i = 0; i < vet.length; i++) {
            System.out.println("Informe o sexo: ");
            sexo[i] = teclado.next();
            System.out.println("Informe uma nota para o cinema (um valor inteiro de 0 a 10 )");
            notaCinema[i] = teclado.nextInt();
            System.out.println("Informe a idade: ");
            idade[i] = teclado.nextInt();

        }

    }

    private double vetorMediaCinema(int vet[], int notaCinema[]) {
        double somaCinema = 0, mediaCinema;
        for (int i = 0; i < vet.length; i++) {
            somaCinema += notaCinema[i];
        }
        mediaCinema = somaCinema / vet.length;
        System.out.println("A média do cinema é: " + mediaCinema);
        return mediaCinema;
    }

    private void vetorMediaHomens(int vet[], String sexo[], int notaCinema[]) {
        double somaHomens = 0;
        double mediaHomens = 0;
        int masculino = 0;
        for (int i = 0; i < vet.length; i++) {
            if (sexo[i].equals("2")) {
                somaHomens += notaCinema[i];
                masculino++;
            }
        }
        mediaHomens = somaHomens / masculino;
        System.out.println("A média do cinema atribuída pelos homens é: " + mediaHomens);

    }

    private void vetorNotaMulherJovem(int vet[], String sexo[], int idade[], int notaCinema[]) {
        int idadePesquisar;
        int idadeMulherJovem = idade[0];
        double notaMulherJovem = notaCinema[0];
        int feminino = 0;
        for (int i = 0; i < vet.length; i++) {

            if (sexo[i].equals("1")) {
                idadePesquisar = idade[i];
                if (idadeMulherJovem > idadePesquisar) {
                    idadeMulherJovem = idadePesquisar;
                    notaMulherJovem = notaCinema[i];
                }
                feminino++;
            }

        }
        if (feminino > 0) {
            System.out.println("A nota atribuída pela mulher mais jovem foi: " + notaMulherJovem);
        }
    }

    private void vetorMulheres50(int vet[], String sexo[], int idade[], int notaCinema[], double mediaCinema) {

        int mulheres50 = 0;
        for (int i = 0; i < vet.length; i++) {
            if (sexo[i].equals("1") && idade[i] > 50 && notaCinema[i] > mediaCinema) {
                mulheres50++;

            }
        }

        if (mulheres50 > 0) {
            System.out.println(
                    "O número de mulheres com mais de 50 anos e que deram nota acima da média para o cinema é de: "
                            + mulheres50);

        }

    }

    public static void main(String[] args) {
        new Uni6Exe09();
    }
}
