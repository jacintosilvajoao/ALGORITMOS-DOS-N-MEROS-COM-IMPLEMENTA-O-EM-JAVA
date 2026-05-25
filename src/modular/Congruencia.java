package modular;

public class Congruencia {

    public static boolean verificar(int a, int b, int mod) {

        return (a - b) % mod == 0;
    }
}