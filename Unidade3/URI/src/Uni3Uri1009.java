/*
__ Enunciado:
Faça um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o total a receber no final do mês, com duas casas decimais

__ Análise: Ok

__ Gordura: 

//__ Variáveis:
String nomeVendedor; double salFix; double TOTAL;

//__ Entradas:
O arquivo de entrada contém um texto (primeiro nome do vendedor) e 2 valores de dupla precisão (double) com duas casas decimais, representando o salário fixo do vendedor e montante total das vendas efetuadas por este vendedor, respectivamente.

//__ Processos:


//__ Saídas: 
Imprima o total que o funcionário deverá receber, conforme exemplo fornecido.
*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Uri1009 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nomeVendedor;
        double salFix;
        double vendas;
        double TOTAL;
        double comissão = 0.15;
        DecimalFormat df_2 = new DecimalFormat("0.00");

        nomeVendedor = teclado.next();
        salFix = teclado.nextDouble();
        vendas = teclado.nextDouble();

        TOTAL = salFix + (vendas * comissão);

        System.out.println("nome vendedor = " + nomeVendedor);
        System.out.println("TOTAL = " + "R$ " + df_2.format(TOTAL));

        teclado.close();

    }
}
