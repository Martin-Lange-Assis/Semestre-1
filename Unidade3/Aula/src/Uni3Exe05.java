/*
__ Enunciado: 
Uma granja possui um controle automatizado de cada frango da sua produção. No pé direito do frango há um anel com um chip de identificação; no pé esquerdo são dois anéis para indicar o tipo de alimento que ele deve consumir. Sabendo que o anel com chip custa R$ 4,00 e o anel de alimento custa R$ 3,50, faça um programa para calcular o gasto total da granja para marcar todos os seus frangos.

__ Análise: OK

__ Gordura: 
Uma granja possui um controle automatizado de cada frango da sua produção.

//__ Entradas: 
Sabendo que o anel com chip custa R$ 4,00 e o anel de alimento custa R$ 3,50

//__ Processos: 
anelId = 4
anelAlim = 7
valorAneis = 11

//__ Saídas:
calcular o gasto total da granja para marcar todos os seus frangos.
*/

import java.util.Scanner;

public class Uni3Exe05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double valorAneis = 11;
        double qtdeFrango = 0;

        System.out.println("Informe a quantidade de frangos");
        qtdeFrango = teclado.nextDouble();

        valorAneis = qtdeFrango * 11;

        System.out.println("O gasto total da granja para marcar todos os seus frangos é " + valorAneis);

        teclado.close();
    }
}