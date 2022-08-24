/*
__ Enunciado:
Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis (cédulas) no qual o valor pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2 e 1. A seguir mostre o valor lido e a relação de notas necessárias.
__ Análise: Ok

__ Gordura: 

//__ Variáveis:
int cem; int cinquenta; int vinte; int dez; int cinco; int dois; int um; int numInteiro;


//__ Entradas:
O arquivo de entrada contém um valor inteiro N (0 < N < 1000000).

//__ Processos:
cem = numInteiro / 100;
        cinquenta = (numInteiro % 100) / 50;
        vinte = ((numInteiro % 100) % 50) / 20;
        dez = (((numInteiro % 100) % 50) % 20) / 10;
        cinco = ((((numInteiro % 100) % 50) % 20) % 10) / 5;
        dois = (((((numInteiro % 100) % 50) % 20) % 10) % 5) / 2;
        um = ((((((numInteiro % 100) % 50) % 20) % 10) % 5) % 2) / 1;


//__ Saídas: 
Imprima o valor lido e, em seguida, a quantidade mínima de notas de cada tipo necessárias, conforme o exemplo fornecido. Não esqueça de imprimir o fim de linha após cada linha, caso contrário seu programa apresentará a mensagem: “Presentation Error”.
*/

import java.util.Scanner;

public class Uni3Uri1018 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cem;
        int cinquenta;
        int vinte;
        int dez;
        int cinco;
        int dois;
        //int um;
        int numInteiro;

        numInteiro = teclado.nextInt();

        cem = numInteiro / 100;
        cinquenta = (numInteiro % 100) / 50;
        vinte = ((numInteiro % 100) % 50) / 20;
        dez = (((numInteiro % 100) % 50) % 20) / 10;
        cinco = ((((numInteiro % 100) % 50) % 20) % 10) / 5;
        dois = (((((numInteiro % 100) % 50) % 20) % 10) % 5) / 2;
        //um = ((((((numInteiro % 100) % 50) % 20) % 10) % 5) % 2) / 1;

        System.out.println(numInteiro);
        System.out.println(cem + " nota(s) de R$ 100,00");
        System.out.println(cinquenta + " nota(s) de R$ 50,00");
        System.out.println(vinte + " nota(s) de R$ 20,00");
        System.out.println(dez + " nota(s) de R$ 10,00");
        System.out.println(cinco + " nota(s) de R$ 5,00");
        System.out.println(dois + " nota(s) de R$ 2,00");
        //System.out.println(um + " nota(s) de R$ 1,00");

        teclado.close();
    }

}