import java.util.Scanner;

public class Uni6Exe10 {
    private Uni6Exe10() {
        Scanner teclado = new Scanner(System.in);
        int vetorTamanho;
        do {
            System.out.println("Informe o tamanho do vetor entre os valores de 1 a 50: ");
            vetorTamanho = teclado.nextInt();
        } while ((vetorTamanho < 1) || (vetorTamanho > 50));
        int vet[] = new int[vetorTamanho];
        int opcao = 0;

        do {
            System.out.println("Informe a opção desejada: ");
            opcao = teclado.nextInt();
            switch (opcao) {
                case 1:
                    vetorIncluir(vet, teclado);
                    break;

                case 2:
                    vetorPesquisar(vet, teclado);
                    break;

                case 3:
                    vetorAlterar(vet, teclado);
                    break;

                case 4:
                    vetorExcluir(vet, teclado);

                    break;
                case 5:
                    vetorMostrar(vet, teclado);
                    break;
                case 6:
                    vetorOrdenar(vet);
                    break;
                case 7:
                    vetorInverter(vet);
                    break;

            }
        } while (opcao != 8);

        teclado.close();
    }

    void vetorIncluir(int vet[], Scanner teclado) {

        System.out.println("___Incluir valor___");
        int numero = teclado.nextInt();
        if (vet[vet.length - 1] == 0) {
            vet[vet.length - 1] = numero;
            System.out.println("um novo valor foi incluído");
        } else {
            System.out.println("Não houve adição de um novo valor. Vetor cheio!");
        }

    }

    void vetorPesquisar(int vet[], Scanner teclado) {

        System.out.println("___Pesquisar valor___");
        System.out.println("Informe o valor pesquisado: ");
        int pesquisa = teclado.nextInt();
        boolean aparece = false;
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] == pesquisa) {
                aparece = true;
                System.out.println("O número" + aparece + " está no vetor");
            }
            if (aparece = false) {
                System.out.println("O número não está no vetor!");
            }

        }

    }

    void vetorAlterar(int vet[], Scanner teclado) {
        System.out.println("___Alterar valor___");
        boolean elementoTroca = false;
        System.out.println("Informe o valor que deseja alterar: ");
        int valorAlterar = teclado.nextInt();
        System.out.println("Informe um novo valor: ");
        int alterado = teclado.nextInt();
        for (int i = 0; i < vet.length; i++) {
            if (elementoTroca == true && vet[i] == valorAlterar) {
                vet[i] = alterado;
                System.out.println("O número" + valorAlterar + " está no vetor");
            } else {
                if (elementoTroca == false) {
                    System.out.println("Número não encontrado");
                }
            }
        }
    }

    void vetorExcluir(int vet[], Scanner teclado) {
        System.out.println("___Excluir valor___");
        System.out.println("Informe o valor a ser excluído: ");
        int excluir = teclado.nextInt();
        boolean exclusao = false;
        for (int j = 0; j < vet.length; j++) {
            if (vet[j] == excluir && exclusao) {
                for (int k = 0; k < vet.length; k++) {

                    vet[j + k] = vet[j + k + 1];
                    exclusao = true;

                }
                System.out.println("O número foi excluído");
            }
        }
        if (exclusao == false) {
            System.out.println("Esse número não existe no vetor");
        }
    }

    void vetorMostrar(int vet[], Scanner teclado) {
        System.out.println("___Mostrar valores___");
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] != 0) {
                System.out.println(vet[i]);

            }
        }
    }

    void vetorOrdenar(int vet[]) {
        System.out.println("___Ordenar valores___");

        int bolha;
        for (int i = 0; i < vet.length; i++) {
            for (int j = 0; j < vet.length - 1; j++) {
                if (vet[j] > vet[j + 1]) {
                    bolha = vet[j];
                    vet[j] = vet[j + 1];
                    vet[j + 1] = bolha;
                    System.out.println(vet[i]);
                }

            }
        }
    }

    void vetorInverter(int vet[]) {
        System.out.println("___Inverter valores___");
        int aux;
        for (int i = 0; i < vet.length; i++) {
            for (int j = 0; j < i; j++) {
                aux = vet[i];
                vet[i] = vet[j];
                vet[j] = aux;
                System.out.println(vet[i]);

            }
        }
    }

    public static void main(String[] args) {
        new Uni6Exe10();
    }
}
