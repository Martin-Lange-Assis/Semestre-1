/*
__ Enunciado:
Leia 2 valores de ponto flutuante de dupla precisão A e B, que correspondem a 2 notas de um aluno. A seguir, calcule a média do aluno, sabendo que a nota A tem peso 3.5 e a nota B tem peso 7.5 (A soma dos pesos portanto é 11). Assuma que cada nota pode ir de 0 até 10.0, sempre com uma casa decimal. 

__ Análise: Ok

__ Gordura: 

//__ Variáveis:
doubleA; doubleB; MEDIA; 

//__ Entradas:
O arquivo de entrada contém 2 valores com uma casa decimal cada um.

//__ Processos:
MEDIA =  A 

//__ Saídas: 
Imprima a mensagem "MEDIA" e a média do aluno conforme exemplo abaixo, com 5 dígitos após o ponto decimal e com um espaço em branco antes e depois da igualdade. Utilize variáveis de dupla precisão (double) e como todos os problemas, não esqueça de imprimir o fim de linha após o resultado, caso contrário, você receberá "Presentation Error".

*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Uri1005 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double notaA;
        double pesoA = 3.5;
        double notaB;
        double pesoB = 7.5;
        double MEDIA;
        DecimalFormat df_5 = new DecimalFormat("0.00000");

        notaA = teclado.nextDouble();
        notaB = teclado.nextDouble();

        MEDIA = (notaA * pesoA + notaB * pesoB) / (pesoA + pesoB);

        System.out.println("MEDIA = " + df_5.format(MEDIA));

        teclado.close();

    }

}
