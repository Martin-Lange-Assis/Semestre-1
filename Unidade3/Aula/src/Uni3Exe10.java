/*
__ Enunciado: 
Descreva um programa que leia o comprimento dos catetos de um triângulo retângulo e calcule o comprimento da hipotenusa.
Fórmula: hipotenusa² = cateto1 ² + cateto2 ²

__ Análise: OK

__ Gordura: 


//__ Entradas: 
Descreva um programa que leia o comprimento dos catetos de um triângulo retângulo
Fórmula: hipotenusa² = cateto1 ² + cateto2 ²

//__ Processos: 
compHip
compCat1
compCat2



//__ Saídas:
calcule o comprimento da hipotenusa.
*/

import java.util.Scanner;

public class Uni3Exe10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double compHip;
        double compCat1;
        double compCat2;

        System.out.println("Informe o comprimento do cateto 1");
        compCat1 = teclado.nextDouble();
        System.out.println("Informe o comprimento do cateto 2");
        compCat2 = teclado.nextDouble();

        System.out.println("O comprimento do cateto 1 é " + compCat1 + " u.m.");
        System.out.println("O comprimento do cateto 2 é " + compCat2 + " u.m.");

        compHip = (compCat1 * compCat1) + (compCat2 * compCat2);
        Math.sqrt(compHip);

        System.out.println("O comprimento da hipotenusa é " + Math.sqrt(compHip) + " u.m");

        teclado.close();
    }
}
