/*
__ Enunciado:
Dois carros (X e Y) partem em uma mesma direção. O carro X sai com velocidade constante de 60 Km/h e o carro Y sai com velocidade constante de 90 Km/h.

Em uma hora (60 minutos) o carro Y consegue se distanciar 30 quilômetros do carro X, ou seja, consegue se afastar um quilômetro a cada 2 minutos.

Leia a distância (em Km) e calcule quanto tempo leva (em minutos) para o carro Y tomar essa distância do outro carro.
__ Análise: Ok

__ Gordura: 

//__ Variáveis:
int distY; int tempY;


//__ Entradas:
O arquivo de entrada contém um número inteiro.

//__ Processos:



//__ Saídas: 
Imprima o tempo necessário seguido da mensagem "minutos".
*/

import java.util.Scanner;

public class Uni3Uri1016 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int distY;
        int tempY;

        distY = teclado.nextInt();

        tempY = 2 * distY;

        System.out.println(tempY + " minutos");

        teclado.close();
    }
}
