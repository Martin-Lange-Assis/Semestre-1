/*
__ Enunciado: 
Um restaurante cobra R$ 25,00 por cada quilo de refeição. Escreva um programa que leia o peso do prato montado pelo cliente (em quilos) e imprima o valor a pagar. O peso do prato é de 750 gramas.

__ Análise: OK

__ Gordura: 
Escreva um programa

//__ Entradas: 
leia o peso do prato montado pelo cliente (em quilos)
O peso do prato é de 750 gramas.

//__ Processos: 
kgRefeição
pesoPratoMontado
pesoPrato

//__ Saídas:
imprima o valor a pagar.
*/

import java.util.Scanner;

public class Uni3Exe06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double kgRefeição;
        double pesoPratoMontado;
        double pesoPrato = 0.750;

        System.out.println("Informe o peso");
        kgRefeição = teclado.nextDouble();

        pesoPratoMontado = (kgRefeição * 25) - pesoPrato;

        System.out.println("O valor a ser pago é " + pesoPratoMontado);

        teclado.close();

    }
}
