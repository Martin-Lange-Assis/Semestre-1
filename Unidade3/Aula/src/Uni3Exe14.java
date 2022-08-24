/*
__ Enunciado: 
Descreva um programa que a partir da distância percorrida e o do tempo gasto por um motorista durante uma viagem de final de semana, calcule a velocidade média e a quantidade de combustível gasto na viagem, sabendo que o automóvel faz 12 km por litro.

__ Análise: OK

__ Gordura: 
que a partir da distância percorrida e o do tempo gasto por um motorista durante uma viagem de final de semana,

//__ Entradas: 
Descreva um programa
sabendo que o automóvel faz 12 km por litro.



//__ Processos: 
dist
tempo
velMedia
qtdeComb


//__ Saídas:
calcule a velocidade média e a quantidade de combustível gasto na viagem,

*/

import java.util.Scanner;

public class Uni3Exe14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double dist;
        double tempo;
        double velMedia;
        double qtdeComb;

        System.out.println("Informe a distância");
        dist = teclado.nextDouble();
        System.out.println("Informe o tempo");
        tempo = teclado.nextDouble();

        velMedia = dist / tempo;
        System.out.println("A velocidade média é de " + velMedia + "m/s");

        qtdeComb = dist / 12;
        System.out.println("A quantidade de combustível gasto na viagem é de " + qtdeComb + "L");

        teclado.close();
    }
}
