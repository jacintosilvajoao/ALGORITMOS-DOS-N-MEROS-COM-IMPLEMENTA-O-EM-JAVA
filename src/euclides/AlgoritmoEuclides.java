package euclides;

public class AlgoritmoEuclides {

    public static int calcularMDC(int a, int b) {

        if (b == 0) {
            return a;
        }

        return calcularMDC(b, a % b);
    }
}