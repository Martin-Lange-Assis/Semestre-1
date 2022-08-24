import java.util.Scanner;
public class Uni2Exe14 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cem;
        int cinquenta;
        int vinte;
        int dez;
        int cinco;
        int dois;
        int um;
        int numInteiro;
    
        System.out.println("Informe um número inteiro: ");
        numInteiro = teclado.nextInt();
    
        cem = numInteiro / 100;
        cinquenta = (numInteiro % 100) / 50;
        vinte = ((numInteiro % 100) % 50) / 20;
        dez = (((numInteiro % 100) % 50) % 20) / 10;
        cinco = ((((numInteiro % 100) % 50) % 20) % 10) / 5;
        dois = (((((numInteiro % 100) % 50) % 20) % 10) % 5) / 2;
        um = ((((((numInteiro % 100) % 50) % 20) % 10) % 5) % 2) / 1;
    
        System.out.println(numInteiro);
        System.out.println(cem + " nota(s) de R$ 100,00");
        System.out.println(cinquenta + " nota(s) de R$ 50,00");
        System.out.println(vinte + " nota(s) de R$ 20,00");
        System.out.println(dez + " nota(s) de R$ 10,00");
        System.out.println(cinco + " nota(s) de R$ 5,00");
        System.out.println(dois + " nota(s) de R$ 2,00");
        System.out.println(um + " nota(s) de R$ 1,00");
    
        teclado.close();
    }
}

