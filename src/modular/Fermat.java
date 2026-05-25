package modular;

public class Fermat {

    public static int potenciaModular(int base, int expoente, int mod) {

        int resultado = 1;

        base = base % mod;

        while (expoente > 0) {

            if (expoente % 2 == 1) {
                resultado = (resultado * base) % mod;
            }

            expoente = expoente / 2;
            base = (base * base) % mod;
        }

        return resultado;
    }
}