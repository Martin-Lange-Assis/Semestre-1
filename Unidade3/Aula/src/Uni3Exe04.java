/*
__ Enunciado: 
Faça um programa para ler três notas de um aluno em uma disciplina e imprimir a sua média ponderada (as notas tem pesos respectivos de 5, 3 e 2).

__ Análise: OK

__ Gordura: 
Faça um programa para

//__ Entradas: 
ler três notas de um aluno

//__ Processos: 
pesoNota1 = 5
pesoNota2 = 3
pesoNota3 = 2

//__ Saídas: 
imprimir a sua média ponderada
*/


import java.util.Scanner;

public class Uni3Exe04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double pesoNota1 = 5;
        double pesoNota2 = 3;
        double pesoNota3 = 2;
        double nota1 = 0;
        double nota2 = 0;
        double nota3 = 0;
        double media = 0;

        System.out.println("Informe a nota 1");
        nota1 = teclado.nextDouble();
        System.out.println("Informe a nota 2");
        nota2 = teclado.nextDouble();
        System.out.println("Informe a nota 3");
        nota3 = teclado.nextDouble();

        media = (nota1 * pesoNota1 + nota2 * pesoNota2 + nota3 * pesoNota3) / (pesoNota1 + pesoNota2 + pesoNota3);

        System.out.println("A média ponderada do aluno é " + media);

        teclado.close();
    }
}
