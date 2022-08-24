import java.util.Scanner;

public class Uni5Exe09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome;
        int idade;
        int totalAlunos;
        int quant20 = 0;

        System.out.println("Informe a quantidade de alunos da turma:  ");
        totalAlunos = teclado.nextInt();

        for (int i = 1; i <= totalAlunos; i++) {
            System.out.println("Informe o nome do aluno: ");
            nome = teclado.next();
            System.out.println("Informe a idade: ");
            idade = teclado.nextInt();

            if (idade == 18) {
                System.out.println(nome);

            }
            if (idade >= 20) {
                System.out.println(quant20);
                
            }

        }

        teclado.close();
    }
}
