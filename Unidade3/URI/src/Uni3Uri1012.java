/*
__ Enunciado:
Escreva um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.
__ Análise: Ok

__ Gordura: 

//__ Variáveis:
double A; double B; double C; double areaTriang; double areaCirc; double areaTrap; double areaQuad;
double areaRet; double pi; double raio;

//__ Entradas:
O arquivo de entrada contém três valores com um dígito após o ponto decimal.

//__ Processos:
areaTriang = A * C / 2;
areaCirc = pi * raio * raio;
areaTrap = (A + B) * C / 2;
areaQuad = B * B;
areaRet = A * B;


//__ Saídas: 
O arquivo de saída deverá conter 5 linhas de dados. Cada linha corresponde a uma das áreas descritas acima, sempre com mensagem correspondente e um espaço entre os dois pontos e o valor. O valor calculado deve ser apresentado com 3 dígitos após o ponto decimal.
*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Uri1012 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double A;
        double B;
        double C;
        double areaTriang;
        double areaCirc;
        double areaTrap;
        double areaQuad;
        double areaRet;
        double pi = 3.14159;
        DecimalFormat df_3 = new DecimalFormat("0.000");

        A = teclado.nextDouble();
        B = teclado.nextDouble();
        C = teclado.nextDouble();

        areaTriang = (A * C) / 2;
        areaCirc = pi * Math.pow(C, 2) ;
        areaTrap = (A + B) * C / 2;
        areaQuad = B * B;
        areaRet = A * B;

        System.out.println("TRIANGULO: " + df_3.format(areaTriang));
        System.out.println("CIRCULO: " + df_3.format(areaCirc));
        System.out.println("TRAPEZIO: " + df_3.format(areaTrap));
        System.out.println("QUADRADO: " + df_3.format(areaQuad));
        System.out.println("RETANGULO: " + df_3.format(areaRet));

        teclado.close();
    }
}
