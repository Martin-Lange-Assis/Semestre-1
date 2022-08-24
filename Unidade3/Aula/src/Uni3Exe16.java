/*
__ Enunciado: 
Suponha que um caixa disponha apenas de notas de 100, 10 e 1 reais. Considerando que alguém está pagando uma compra, faça um programa que determine e escreva o número mínimo de notas que o caixa deve fornecer como troco. Escreva também o número de cada tipo de nota a ser fornecido como troco. Suponha que o sistema monetário não utilize centavos.


__ Análise: OK

__ Gordura: 
Considerando que alguém está pagando uma compra,

//__ Entradas: 
Suponha que um caixa disponha apenas de notas de 100, 10 e 1 reais.
faça um programa
Suponha que o sistema monetário não utilize centavos.


//__ Processos: 
valorTroco
centena
dezena
unidade


//__ Saídas:
 determine e escreva o número mínimo de notas que o caixa deve fornecer como troco. Escreva também o número de cada tipo de nota a ser fornecido como troco.

*/

import java.util.Scanner;

public class Uni3Exe16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double centena;
        double dezena;
        double unidade;
        double valorTroco;
        double valorPago;
        double custo;

        System.out.println("Informe o custo");
        custo = teclado.nextDouble();
        System.out.println("Informe o valor pago");
        valorPago = teclado.nextDouble();

        valorTroco = valorPago - custo;

        System.out.println("O valor do troco é " + "R$" + valorTroco);

        centena = valorTroco / 100;

        dezena = (valorTroco % 100) / 10;

        unidade = ((valorTroco % 100) % 10) / 1;

        System.out.println("NOTAS:");
        System.out.println(centena + " nota(s) de R$ 100.00");
        System.out.println(dezena + " nota(s) de R$ 10.00");
        System.out.println(unidade + " nota(s) de R$ 1.00");

        teclado.close();
    }
}
