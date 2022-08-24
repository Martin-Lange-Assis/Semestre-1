/* 
//_Enunciado
Escreva um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas decimais.

//_Análise
Ok

//_Gordura
//_Entrada




//_Processos

numFunc
horasTrab
salHora
salTot


//_Saída
leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário.

mostre o número e o salário do funcionário, com duas casas decimais.




*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni2Exe06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int NUMBER;
        int horasTrab;
        int salHora;
        int SALARY;
        DecimalFormat df_2 = new DecimalFormat("0.00");

        NUMBER = teclado.nextInt();
        horasTrab = teclado.nextInt();
        salHora = teclado.nextInt();

        SALARY = (salHora * horasTrab);

        System.out.println("NUMBER = " + NUMBER);
        System.out.println("SALARY = " + "U$ " + df_2.format(SALARY));

        teclado.close();
    }
}
