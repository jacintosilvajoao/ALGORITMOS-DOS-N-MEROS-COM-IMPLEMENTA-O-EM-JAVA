package rsa;

public class RSA {

    private int p = 3;
    private int q = 11;

    private int n = p * q;
    private int e = 7;
    private int d = 3;

    // Cifrar uma letra (char)
    public int cifrarChar(char letra) {
        int valor = (int) letra;
        return potencia(valor, e, n);
    }

    // Decifrar para letra
    public char decifrarChar(int cifra) {
        int valor = potencia(cifra, d, n);
        return (char) valor;
    }

    // Cifrar palavra
    public int[] cifrarTexto(String texto) {

        int[] resultado = new int[texto.length()];

        for (int i = 0; i < texto.length(); i++) {
            resultado[i] = cifrarChar(texto.charAt(i));
        }

        return resultado;
    }

    // Decifrar palavra
    public String decifrarTexto(int[] cifras) {

        StringBuilder texto = new StringBuilder();

        for (int c : cifras) {
            texto.append(decifrarChar(c));
        }

        return texto.toString();
    }

    // Potência modular
    private int potencia(int base, int expoente, int mod) {

        int resultado = 1;
        base = base % mod;

        while (expoente > 0) {

            if (expoente % 2 == 1) {
                resultado = (resultado * base) % mod;
            }

            base = (base * base) % mod;
            expoente /= 2;
        }

        return resultado;
    }
}