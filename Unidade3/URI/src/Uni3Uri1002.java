/*
__ Enunciado:
A fórmula para calcular a área de uma circunferência é: area = π . raio2. Considerando para este problema que π = 3.14159:

- Efetue o cálculo da área, elevando o valor de raio ao quadrado e multiplicando por π. __ Análise: Ok
__ Gordura: 

//__ Variáveis:
A;  π; raio;

//__ Entradas:
A entrada contém um valor de ponto flutuante (dupla precisão), no caso, a variável raio.
π = 3.14159
//__ Processos:
area = π . raio2

//__ Saídas: 
Efetue o cálculo da área, elevando o valor de raio ao quadrado e multiplicando por π.
Apresentar a mensagem "A=" seguido pelo valor da variável area, conforme exemplo abaixo, com 4 casas após o ponto decimal. Utilize variáveis de dupla precisão (double). Como todos os problemas, não esqueça de imprimir o fim de linha após o resultado, caso contrário, você receberá "Presentation Error".


*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Uri1002 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double pi = 3.14159;
        double raio;
        double A;
        DecimalFormat df_4 = new DecimalFormat("0.0000");

        raio = teclado.nextDouble();

        A = pi * Math.pow(raio, 2);

        System.out.println("A=" + df_4.format(A));

        teclado.close();
    }
}
