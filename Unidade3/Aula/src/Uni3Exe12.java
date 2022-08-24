/*
__ Enunciado: 
Uma empresa tem para um funcionário os seguintes dados: o nome, o número de horas trabalhadas mensais e o número de dependentes. A empresa paga R$ 10,00 por hora (valor para cálculo do salário trabalho) e R$ 60,00 por dependente (valor para cálculo do salário família) e são feitos descontos de 8,5% sobre o salário trabalho para o INSS e de 5% sobre o salário trabalho para o imposto de renda. Descreva um programa que informe o nome, o salário bruto e o salário líquido do funcionário.

__ Análise: OK

__ Gordura: 
Uma empresa tem para um funcionário os seguintes dados:

//__ Entradas: 
o nome, o número de horas trabalhadas mensais e o número de dependentes.


//__ Processos: 
A empresa paga R$ 10,00 por hora (valor para cálculo do salário trabalho) e R$ 60,00 por dependente (valor para cálculo do salário família) e são feitos descontos de 8,5% sobre o salário trabalho para o INSS e de 5% sobre o salário trabalho para o imposto de renda.

nomeFunc
horasTrab
numDep



//__ Saídas:
Descreva um programa que informe o nome, o salário bruto e o salário líquido do funcionário.

*/

import java.util.Scanner;

public class Uni3Exe12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nomeFunc;
        double salBruto;
        double salLiquido;
        double horasTrab;
        double numDep;
        double salHorasTrab = 10;
        double salTrab;
        double salDep = 60;
        double descINSS = 0.085;
        double descIR = 0.05;

        System.out.println("Informe o nome do funcionário");
        nomeFunc = teclado.next();
        System.out.println("Informe o número de horas trabalhadas mensais");
        horasTrab = teclado.nextDouble();
        System.out.println("Informe o número de dependentes");
        numDep = teclado.nextDouble();

        salTrab = horasTrab + salHorasTrab;

        salBruto = (horasTrab * salHorasTrab) + (salDep * numDep);
        System.out.println("O salário Bruto do(a)" + nomeFunc + " é" + " R$" + salBruto);

        salLiquido = salBruto - (descINSS * salTrab) - (descIR * salTrab);
        System.out.println("O salário líquido do(a)" + nomeFunc + " é" + " R$" + salLiquido);

        teclado.close();

    }
}
