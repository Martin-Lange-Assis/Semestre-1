/*
__ Enunciado:
Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Após, calcule e mostre o valor a ser pago.

__ Análise: Ok

__ Gordura: 

//__ Variáveis:
String codigoPeca; double numPecas; double valorPeca; double total;

//__ Entradas:
O arquivo de entrada contém duas linhas de dados. Em cada linha haverá 3 valores, respectivamente dois inteiros e um valor com 2 casas decimais.

//__ Processos:
valorTotal = (numPecas1 * valorPeca1) + (numPecas2 * valorPeca2);

//__ Saídas: 
A saída deverá ser uma mensagem conforme o exemplo fornecido abaixo, lembrando de deixar um espaço após os dois pontos e um espaço após o "R$". O valor deverá ser apresentado com 2 casas após o ponto.
*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Uri1010 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String codigoPeca1;
        double numPecas1;
        double valorPeca1;
        String codigoPeca2;
        double numPecas2;
        double valorPeca2;
        double valorTotal;
        DecimalFormat df_2 = new DecimalFormat("0.00");

        codigoPeca1 = teclado.next();
        numPecas1 = teclado.nextDouble();
        valorPeca1 = teclado.nextDouble();
        codigoPeca2 = teclado.next();
        numPecas2 = teclado.nextDouble();
        valorPeca2 = teclado.nextDouble();

        valorTotal = (numPecas1 * valorPeca1) + (numPecas2 * valorPeca2);

        System.out.println("Código de peças 1: " + codigoPeca1);
        System.out.println("Código de peças 2: " + codigoPeca2);
        System.out.println("VALOR A PAGAR: " + "R$ " + df_2.format(valorTotal));

        teclado.close();
    }
}
