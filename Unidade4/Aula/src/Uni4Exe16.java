import java.util.Scanner;

public class Uni4Exe16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int idadeHomem1;
        int idadeHomem2;
        int idadeMulher1;
        int idadeMulher2;

        System.out.println("Informe a idade do homem 1");
        idadeHomem1 = teclado.nextInt();
        System.out.println("Informe a idade do homem 2");
        idadeHomem2 = teclado.nextInt();
        System.out.println("Informe a idade da mulher 1");
        idadeMulher1 = teclado.nextInt();
        System.out.println("Informe a idade da mulher 2");
        idadeMulher2 = teclado.nextInt();

        if (idadeHomem1 < idadeHomem2 && idadeMulher1 < idadeMulher2)
            System.out.println(idadeHomem2 + idadeMulher1);
        System.out.println(idadeHomem1 * idadeMulher2);

        if (idadeHomem1 < idadeHomem2 && idadeMulher1 > idadeMulher2)
            System.out.println(idadeHomem2 + idadeMulher2);
        System.out.println(idadeHomem1 * idadeMulher1);

        if (idadeHomem1 > idadeHomem2 && idadeMulher1 < idadeMulher2)
            System.out.println(idadeHomem1 + idadeMulher1);
        System.out.println(idadeHomem2 * idadeMulher2);

        if (idadeHomem1 > idadeHomem2 && idadeMulher1 > idadeMulher2)
            System.out.println(idadeHomem1 + idadeMulher2);
        System.out.println(idadeHomem2 * idadeMulher1);

        teclado.close();
    }

}
