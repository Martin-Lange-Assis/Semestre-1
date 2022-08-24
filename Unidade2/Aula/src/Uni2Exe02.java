/* 
//_Enunciado
Leia 2 valores inteiros e imprima sua multiplicação.

//_Análise
Ok

//_Gordura
//_Entrada
Leia 2 valores inteiros

//_Processos
valInt1
valInt2
multVal

//_Saída
imprima sua multiplicação.




*/

import java.util.Scanner;

public class Uni2Exe02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double valInt1 = 0;
        double valInt2 = 0;
        double multVal = 0;

        // _Entrada
        System.out.println("Informe a variável 1");
        valInt1 = teclado.nextDouble();
        System.out.println("Informe a variável 2");
        valInt2 = teclado.nextDouble();

        // _Processos
        multVal = valInt1 * valInt2;

        // _Saída
        System.out.println("A multiplicação desses números é igual a " + multVal);

        teclado.close();
    }
}