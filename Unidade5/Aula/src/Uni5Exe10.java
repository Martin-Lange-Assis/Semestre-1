public class Uni5Exe10 {
    public static void main(String[] args) {

        int termo1 = 0;
        int termo2 = 0;
        int termo3 = 0;
        int termo4 = 0;
        int contador = 0;
        String termo1Str;
        String termo2Str;
        String termo4Str;

        while (contador < 10) {
            termo2++;
            if (termo2 == 100) {
                termo1++;
                termo2 = 0;

            }
            termo3 = 0;
            termo3 = termo1 + termo2;
            termo4 = (int) Math.pow(termo3, 2);

            termo1Str = Integer.toString(termo1);
            termo2Str = Integer.toString(termo2);
            termo4Str = Integer.toString(termo4);

            if (termo1 > 0 && termo2 < 10) {
                if (termo4Str.equals(termo1Str + "0" + termo2Str)) {
                    contador++;
                    System.out.println(termo4Str);
                    System.out.println(contador);
                }
            } else {
                if (termo4Str.equals(termo1Str + termo2Str)) {
                    contador++;
                    System.out.println(termo4Str);
                    System.out.println(contador);
                }
            }

        }

    }
}