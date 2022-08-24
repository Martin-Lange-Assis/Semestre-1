/* 
//_Enunciado
Calcule a área da circunferência elevando o valor de raio ao quadrado e multiplicando por π (π = 3.14159).

//_Análise
Ok

//_Gordura

//_Entrada
π (π = 3.14159)

//_Processos
elevando o valor de raio ao quadrado e multiplicando por π
ler(raio)

//_Saída
área da circunferência




*/

import java.util.Scanner;

public class Uni2Exe03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double raio = Math.pow(0, 2);
        double π = 3.14159;
        double areaCirc = 0;

        // _Entrada
        System.out.println("Informe o valor do raio");
        raio = teclado.nextDouble();

        // _Processos
        areaCirc = Math.pow(raio, 2) * π;

        // _Saída
        System.out.println("A área da circunferência é " + areaCirc);

        teclado.close();
    }
}