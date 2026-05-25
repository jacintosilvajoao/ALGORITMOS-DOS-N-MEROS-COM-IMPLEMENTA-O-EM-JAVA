package euler;

public class TotienteEuler {

    public static int calcular(int n) {

        int resultado = n;

        for (int p = 2; p * p <= n; p++) {

            if (n % p == 0) {

                while (n % p == 0) {
                    n /= p;
                }

                resultado -= resultado / p;
            }
        }

        if (n > 1) {
            resultado -= resultado / n;
        }

        return resultado;
    }
}