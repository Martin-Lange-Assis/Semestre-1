/*
__ Enunciado:
Leia dois valores inteiros. A seguir, calcule o produto entre estes dois valores e atribua esta operação à variável PROD. A seguir mostre a variável PROD com mensagem correspondente. __ Análise: Ok

__ Gordura: 

//__ Variáveis:
intA; intB; PROD;

//__ Entradas:
O arquivo de entrada contém 2 valores inteiros.

//__ Processos:
PROD = intA * intB

//__ Saídas: 
Imprima a mensagem "PROD" e a variável PROD conforme exemplo abaixo, com um espaço em branco antes e depois da igualdade. Não esqueça de imprimir o fim de linha após o produto, caso contrário seu programa apresentará a mensagem: “Presentation Error”.

*/
import java.util.Scanner;

public class Uni3Uri1004 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int A;
        int B;
        int PROD;

        A = teclado.nextInt();
        B = teclado.nextInt();

        PROD = A * B;

        System.out.println("PROD = " + PROD);

        teclado.close();
    }
}