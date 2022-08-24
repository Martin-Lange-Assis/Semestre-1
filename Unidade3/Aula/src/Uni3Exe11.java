/*
__ Enunciado: 
Descreva um programa que dado uma temperatura em °C informe o seu valor em °F. Fórmula:

°F = (9/5) °C + 32

__ Análise: OK

__ Gordura: 


//__ Entradas: 
Descreva um programa que dado uma temperatura em °C
°F = (9/5) °C + 32

//__ Processos: 
tempC
tempF



//__ Saídas:
informe o seu valor em °F.
*/

import java.util.Scanner;

public class Uni3Exe11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double tempC;
        double tempF;

        System.out.println("Informe a temperatura em Celsius");
        tempC = teclado.nextDouble();

        tempF = (9 * tempC / 5) + 32;

        System.out.println(" A temperatura é " + tempF + " °F");

        teclado.close();
    }
}
