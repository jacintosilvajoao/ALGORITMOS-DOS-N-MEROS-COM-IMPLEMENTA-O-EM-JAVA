package modular;

public class TeoremaChinesResto {

    public static int resolver(int[] restos, int[] modulos) {

        int produto = 1;

        for (int modulo : modulos) {
            produto *= modulo;
        }

        int resultado = 0;

        for (int i = 0; i < modulos.length; i++) {

            int pp = produto / modulos[i];

            resultado += restos[i] *
                    inverso(pp, modulos[i]) * pp;
        }

        return resultado % produto;
    }

    private static int inverso(int a, int mod) {

        a = a % mod;

        for (int x = 1; x < mod; x++) {

            if ((a * x) % mod == 1) {
                return x;
            }
        }

        return 1;
    }
}