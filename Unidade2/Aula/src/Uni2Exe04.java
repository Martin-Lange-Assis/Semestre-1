/* 
//_Enunciado
Leia dois valores de ponto flutuante e calcule a média ponderada sabendo que a note A tem peso 3.5 e nota B 7.5 (a soma dos pesos é 11), sendo que a nota vai de 0.0 a 10.0.

//_Análise
Ok

//_Gordura
ponto flutuante = Números Reais

//_Entrada
nota A tem peso 3.5 e nota B 7.5 (a soma dos pesos é 11)
sendo que a nota vai de 0.0 a 10.0.

//_Processos
ler(notaA)
ler(notaB)
imprimir(mediaAB)

//_Saída
calcule a média ponderada



*/

import java.util.Scanner;

public class Uni2Exe04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double notaA = 0;
        double notaB = 0;
        double pesoA = 3.5;
        double pesoB = 7.5;
        double pesoAB = 11;
        double mediaAB = 0;

        // _Entrada
        System.out.printf("Informe a nota A");
        notaA = teclado.nextDouble();
        System.out.printf("Informe a nota B");
        notaB = teclado.nextDouble();

        // _Processos
        mediaAB = (notaA * pesoA) + (notaB * pesoB) / pesoAB;

        // _Saída
        System.out.printf("A média ponderada é " + mediaAB);

        teclado.close();
    }
}
