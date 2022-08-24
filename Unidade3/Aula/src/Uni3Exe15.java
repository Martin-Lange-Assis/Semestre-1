/*
__ Enunciado: 
Construa um programa para ler um número inteiro (assuma até 3 dígitos) e imprima a saída da seguinte forma:

X centena(s)  Y dezena(s) K unidade(s)  
Exemplo, se for submetido o número 384, o programa deverá exibir:

3 centena(s)  8 dezena(s) 4 unidade(s)  


__ Análise: OK

__ Gordura: 
que a partir da distância percorrida e o do tempo gasto por um motorista durante uma viagem de final de semana,

//__ Entradas: 
Construa um programa para ler um número inteiro (assuma até 3 dígitos).


//__ Processos: 
X
Y
K


//__ Saídas:
imprima a saída da seguinte forma:

X centena(s)  Y dezena(s) K unidade(s)  

*/

import java.util.Scanner;

public class Uni3Exe15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double X;
        double Y;
        double K;

        System.out.println("Informe o valor da centena");
        X = teclado.nextDouble();
        System.out.println("Informe o valor da dezena");
        Y = teclado.nextDouble();
        System.out.println("Informe o valor da unidade");
        K = teclado.nextDouble();

        System.out.println(X + "centena(s)" + Y + "dezena(s)" + K + "unidade(s)");

        teclado.close();

    }
}
