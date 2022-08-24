import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni2Exe11 {
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
        areaCirc = pi * Math.pow(C, 2);
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
