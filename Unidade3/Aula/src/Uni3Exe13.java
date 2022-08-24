/*
__ Enunciado: 
Numa loja de materiais de construção, um azulejo estampado custa R$ 12,50. Faça um programa para ler o comprimento e altura de uma parede (em metros), e depois escrever o valor gasto com a compra de azulejos. Considere que um metro quadrado é formado por 9 azulejos.

__ Análise: OK

__ Gordura: 
Numa loja de materiais de construção,

//__ Entradas: 
um azulejo estampado custa R$ 12,50.
Faça um programa para ler o comprimento e altura de uma parede (em metros),
Considere que um metro quadrado é formado por 9 azulejos.


//__ Processos: 
compParede
alturaParede
custoAzulejo
custoTotal



//__ Saídas:
e depois escrever o valor gasto com a compra de azulejos.

*/

import java.util.Scanner;

public class Uni3Exe13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double compParede;
        double alturaParede;
        double areaParede;
        double numAzulejos;
        double custoAzulejo = 12.5;
        double custoTotal;

        System.out.println("Informe o comprimento da parede");
        compParede = teclado.nextDouble();
        System.out.println("Informe a altura da parede");
        alturaParede = teclado.nextDouble();

        areaParede = compParede * alturaParede;

        numAzulejos = areaParede * 9;

        custoTotal = numAzulejos * custoAzulejo;

        System.out.println("O valor gasto com a compra dos azulejos é de " + "R$" + custoTotal);

        teclado.close();

    }
}
