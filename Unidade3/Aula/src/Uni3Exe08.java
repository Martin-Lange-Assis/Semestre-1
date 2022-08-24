/*
__ Enunciado: 
Uma pessoa foi até uma casa de câmbio trocar dólares por reais. Para isto ela entregou um valor em dólares para o atendente. Considerando que o atendente tem a cotação do dólar, descreva um programa para calcular quantos reais o atendente deve devolver para a pessoa.

__ Análise: OK

__ Gordura: 
Uma pessoa foi até uma casa de câmbio trocar dólares por reais.
Para isto ela entregou um valor em dólares para o atendente.
Considerando que o atendente tem a cotação do dólar

//__ Entradas: 
descreva um programa
1 dólar = 5.0236 reais

//__ Processos: 
valorDolar
valorReais


//__ Saídas:
calcular quantos reais o atendente deve devolver para a pessoa.
*/

import java.util.Scanner;

public class Uni3Exe08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double valorDolar;
        double valorReais;

        System.out.println("Informe o valor em dólar");
        valorDolar = teclado.nextDouble();

        valorReais = valorDolar * 5.0236;

        System.out.println("O atendente deve devolver " + valorReais + " reais");

        teclado.close();
    }
}
