public class CaixaAreia {

    private CaixaAreia() { // construtor
        // Assinatura
        int a = 2;
        int vet[] = new int[1];
        vet[0] = 9;
        System.out.println(a);
        System.out.println(vet[0]);
        metodoA(a, vet);
        System.out.println(a);
        System.out.println(vet[0]);

    }

    private void metodoA(int b, int dalton[]) { // entrada dos parâmetros
        System.out.println(b);
        System.out.println(dalton[0]);
        b++;
        dalton[0] = 10;
        System.out.println(b);
        System.out.println(dalton[0]);
    }

    public static void main(String[] args) { // porta entrada
        new CaixaAreia();
    }
}

// não importa a variável, mas a ordem em que são colocadas...