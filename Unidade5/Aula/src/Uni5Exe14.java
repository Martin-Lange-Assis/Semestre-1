import java.util.Scanner;

public class Uni5Exe14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double pc = 0;
        double pv = 0;
        double lucro;
        int mercadorias1 = 0;
        int mercadorias2 = 0;
        int mercadorias3 = 0;
        double lucroTotal;

        for (int i = 1; i < 20; i++) {

            System.out.println("Informe o preço de compra das mercadorias: ");
            pc = teclado.nextDouble();

            System.out.println("Informe o preço de venda das mercadorias: ");
            pv = teclado.nextDouble();

            lucro = (pv - pc) / pc * 100;

            if (lucro < 10 / 100) {
                mercadorias1++;

            } else {
                if (lucro >= 10 / 100 && lucro <= 20 / 100) {
                    mercadorias2++;
                } else {
                    if (lucro > 20 / 100) {
                        mercadorias3++;
                    }
                }

            }
            
        }
        
        lucroTotal = pv - pc;
        System.out.println("O total de mercadorias que tem menos de 10% de lucro é: " + mercadorias1);
        System.out.println("O total de mercadorias que tem entre 10% e 20% de lucro é: " + mercadorias2);
        System.out.println("O total de mercadorias que tem mais de 20% de lucro é: " + mercadorias3);
        System.out.println("O lucro total é: " + lucroTotal);

        teclado.close();
    }

}
