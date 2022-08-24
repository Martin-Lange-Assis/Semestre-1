/* 
//_Enunciado
Leia quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

//_Análise
Ok

//_Gordura
//_Entrada
Leia 4 valores inteiros

//_Processos
valA
valB
valC
valD

//_Saída
DIFERENCA = (A * B - C * D).




*/

import java.util.Scanner;

public class Uni2Exe05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valA;
        int valB;
        int valC;
        int valD;
        int DIFERENCA;

        valA = teclado.nextInt();
        valB = teclado.nextInt();
        valC = teclado.nextInt();
        valD = teclado.nextInt();

        DIFERENCA = (valA * valB - valC * valD);

        System.out.println("DIFERENCA = " + DIFERENCA);

        teclado.close();
    }
}
