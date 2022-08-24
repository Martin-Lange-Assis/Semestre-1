/*
__ Enunciado:
Leia os quatro valores correspondentes aos eixos x e y de dois pontos quaisquer no plano, p1(x1,y1) e p2(x2,y2) e calcule a distância entre eles, mostrando 4 casas decimais após a vírgula, segundo a fórmula: 

Distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
__ Análise: Ok

__ Gordura: 

//__ Variáveis:
double x1; double y1; double x2; double y2;

//__ Entradas:
O arquivo de entrada contém duas linhas de dados. A primeira linha contém dois valores de ponto flutuante: x1 y1 e a segunda linha contém dois valores de ponto flutuante x2 y2.

//__ Processos:
distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));


//__ Saídas: 
Calcule e imprima o valor da distância segundo a fórmula fornecida, com 4 casas após o ponto decimal.
*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Uri1015 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double x1;
        double y1;
        double x2;
        double y2;
        double distancia;
        DecimalFormat df_4 = new DecimalFormat("0.0000");

        x1 = teclado.nextDouble();
        y1 = teclado.nextDouble();
        x2 = teclado.nextDouble();
        y2 = teclado.nextDouble();

        distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.println(df_4.format(distancia));

        teclado.close();
    }
}