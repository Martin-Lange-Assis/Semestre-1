/*
__ Enunciado:
Escreva um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas decimais.

__ Análise: Ok

__ Gordura: 

//__ Variáveis:
int numero; int horasTrab; salHora

//__ Entradas:
O arquivo de entrada contém 2 números inteiros e 1 número com duas casas decimais, representando o número, quantidade de horas trabalhadas e o valor que o funcionário recebe por hora trabalhada, respectivamente.

//__ Processos:
SALARY = (salHora * horasTrab) 

//__ Saídas: 
Imprima o número e o salário do funcionário, conforme exemplo fornecido, com um espaço em branco antes e depois da igualdade. No caso do salário, também deve haver um espaço em branco após o $.
*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Uri1008 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String NUMBER;
        double horasTrab;
        double salHora;
        double SALARY;
        DecimalFormat df_2 = new DecimalFormat("0.00");

        NUMBER = teclado.next();
        horasTrab = teclado.nextDouble();
        salHora = teclado.nextDouble();

        SALARY = (salHora * horasTrab);

        System.out.println("NUMBER = " + NUMBER);
        System.out.println("SALARY = " + "U$ " + df_2.format(SALARY));

        teclado.close();
    }
}
