import java.text.DecimalFormat;

public class Uni5Exe06 {
    public static void main(String[] args) {
        DecimalFormat df_1 = new DecimalFormat("0.0");
        double media = 0;

        for (double altura = 180; altura < 200; altura++) {
            System.out.println(altura);
            media += altura / 20;
            }


            
       System.out.println("A média de altura é: " + df_1.format(media) + "cm " + " ou " + df_1.format(media / 100) + " m ");
    }
}
