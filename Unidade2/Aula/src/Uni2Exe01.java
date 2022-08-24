/* 
//_Enunciado
Leia 2 valores inteiros e imprima sua soma.

//_Análise
Ok

//_Gordura
//_Entrada
Leia 2 valores inteiros

//_Processos
valInt1
valInt2
somaVal

//_Saída
imprima sua soma.




*/

import java.util.Scanner;

public class Uni2Exe01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double valInt1 = 0;
        double valInt2 = 0;
        double somaVal = 0;

        // _Entrada
        System.out.println("Informe a variável 1");
        System.out.println("Informe a variável 2");
        valInt1 = teclado.nextDouble();
        valInt2 = teclado.nextDouble();

        // _Processos
        somaVal = valInt1 + valInt2;

        // _Saída
        System.out.println("A soma desses números é igual a " + somaVal);

        teclado.close();
    }
}
