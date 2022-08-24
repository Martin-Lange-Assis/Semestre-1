/*
__ Enunciado: 
Uma fábrica de refrigerantes vende seu produto em três formatos: lata de 350 ml, garrafa de 600 ml e garrafa de 2 litros. Se um comerciante compra uma determinada quantidade de cada formato, faça um programa para calcular quantos litros de refrigerante ele comprou.


__ Análise: OK

__ Gordura: 
Uma fábrica de refrigerantes vende seu produto em três formatos: 
Se um comerciante compra uma determinada quantidade de cada formato
faça um programa

//__ Entradas: 
 lata de 350 ml, garrafa de 600 ml e garrafa de 2 litros.

//__ Processos: 
lata350
garrafa600
garrafa2L

//__ Saídas:
calcular quantos litros de refrigerante ele comprou
*/

import java.util.Scanner;

public class Uni3Exe07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double lata350;
        double garrafa600;
        double garrafa2L;
        double qtdeLitros;

        System.out.println("Informe a quantidade de latas de 350ml");
        lata350 = teclado.nextDouble();
        System.out.println("Informe a quantidade de latas de 600ml");
        garrafa600 = teclado.nextDouble();
        System.out.println("Informe a quantidade de latas de 2l");
        garrafa2L = teclado.nextDouble();

        qtdeLitros = lata350 * 0.350 + garrafa600 * 0.600 + garrafa2L * 2;

        System.out.println("O total de litros que ele comprou é " + qtdeLitros);

        teclado.close();
    }

}
