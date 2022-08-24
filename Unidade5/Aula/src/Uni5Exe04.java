public class Uni5Exe04 {
    public static void main(String[] args) {
        double s = 0;
        double numerador = 3;
        double denominador = 2;
        double numPar = 4;

        for (int i = 1; i <= 20; i++) {
            s += numerador / denominador;
            numerador = numerador + 2;
            denominador = denominador + numPar;
            numPar += 2;

        }
        System.out.println("O valor de 'S' é: " + s);
    }
}
