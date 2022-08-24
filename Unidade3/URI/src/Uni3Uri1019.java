/*
__ Enunciado:
Leia um valor inteiro, que é o tempo de duração em segundos de um determinado evento em uma fábrica, e informe-o expresso no formato horas:minutos:segundos.
__ Análise: Ok

__ Gordura: 

//__ Variáveis:
int horas; int minutos; int segundos;


//__ Entradas:
O arquivo de entrada contém um valor inteiro N.

//__ Processos:
Calcular segundos, minutos e horas


//__ Saídas: 
Imprima o tempo lido no arquivo de entrada (segundos), convertido para horas:minutos:segundos, conforme exemplo fornecido.
*/

import java.util.Scanner;

public class Uni3Uri1019 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numInteiro;
        int horas;
        int minutos;
        int segundos;

        numInteiro = teclado.nextInt();

        segundos = numInteiro % 60 % 60;
        minutos = numInteiro % 3600 / 60;
        horas = numInteiro / 3600;

        System.out.println(horas + ":" + minutos + ":" + segundos);

        teclado.close();
    }
}
