package primos;

public class FactorizacaoInteiros {

    public static void factorizar(int numero) {

        for (int i = 2; i <= numero; i++) {

            while (numero % i == 0) {
                System.out.println(i);
                numero /= i;
            }
        }
    }
}