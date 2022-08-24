import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni2Exe12 {

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