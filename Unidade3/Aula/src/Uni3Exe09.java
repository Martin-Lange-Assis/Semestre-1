/*
__ Enunciado: 
Descreva um programa que calcule o volume de uma lata de óleo. Fórmula: volume = π * raio^2 * altura

__ Análise: OK

__ Gordura: 


//__ Entradas: 
descreva um programa
Fórmula: volume = π * raio^2 * altura

//__ Processos: 
volLata
raioLata
altulaLata


//__ Saídas:
calcule o volume de uma lata de óleo.
*/

import java.util.Scanner;

public class Uni3Exe09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double volume;
        double π = 3.14;
        double raio = Math.pow(0, 2);
        double altura;

        System.out.println("Informe o valor do raio");
        raio = teclado.nextDouble();
        System.out.println("Informe o valor da altura");
        altura = teclado.nextDouble();

        volume = π * (raio * raio ) * altura;

        System.out.println("O volume da lata de óleo é " + volume + " m³");

        teclado.close();
    }
}
