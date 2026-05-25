import mdc.MaximoDivisorComum;
import euclides.AlgoritmoEuclides;
import primos.TestePrimalidade;
import primos.FactorizacaoInteiros;
import modular.Congruencia;
import modular.Fermat;
import modular.TeoremaChinesResto;
import euler.TotienteEuler;
import rsa.RSA;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        RSA rsa = new RSA();

        int opcao;

        do {
            System.out.println("\n===== ALGORITMOS DOS NÚMEROS =====");
            System.out.println("1 - MDC");
            System.out.println("2 - Algoritmo de Euclides");
            System.out.println("3 - Teste de Primalidade");
            System.out.println("4 - Factorização");
            System.out.println("5 - Congruência");
            System.out.println("6 - Fermat (potência modular)");
            System.out.println("7 - Totiente de Euler");
            System.out.println("8 - Teorema Chinês do Resto");
            System.out.println("9 - RSA");
            System.out.println("0 - Sair");

            System.out.print("Escolha uma opção: ");
            opcao = entrada.nextInt();

            switch (opcao) {

                case 1: {
                    System.out.print("Digite o primeiro número: ");
                    int a = entrada.nextInt();

                    System.out.print("Digite o segundo número: ");
                    int b = entrada.nextInt();

                    int mdc = MaximoDivisorComum.calcular(a, b);
                    System.out.println("MDC(" + a + "," + b + ") = " + mdc);
                    break;
                }

                case 2: {
                    System.out.print("Digite o primeiro número: ");
                    int a = entrada.nextInt();

                    System.out.print("Digite o segundo número: ");
                    int b = entrada.nextInt();

                    int res = AlgoritmoEuclides.calcularMDC(a, b);
                    System.out.println("Euclides MDC = " + res);
                    break;
                }

                case 3: {
                    System.out.print("Digite um número: ");
                    int n = entrada.nextInt();

                    System.out.println(n + " é primo? " + TestePrimalidade.ePrimo(n));
                    break;
                }

                case 4: {
                    System.out.print("Digite um número: ");
                    int n = entrada.nextInt();

                    System.out.println("Factores de " + n + ":");
                    FactorizacaoInteiros.factorizar(n);
                    break;
                }

                case 5: {
                    System.out.print("Digite a: ");
                    int a = entrada.nextInt();

                    System.out.print("Digite b: ");
                    int b = entrada.nextInt();

                    System.out.print("Digite mod: ");
                    int mod = entrada.nextInt();

                    Congruencia c = new Congruencia();
                    System.out.println(a + " ≡ " + b + " mod " + mod + " ? " + c.verificar(a, b, mod));
                    break;
                }

                case 6: {
                    System.out.print("Base: ");
                    int base = entrada.nextInt();

                    System.out.print("Expoente: ");
                    int exp = entrada.nextInt();

                    System.out.print("Mod: ");
                    int mod = entrada.nextInt();

                    Fermat f = new Fermat();
                    System.out.println(base + "^" + exp + " mod " + mod + " = "
                            + f.potenciaModular(base, exp, mod));
                    break;
                }

                case 7: {
                    System.out.print("Digite n: ");
                    int n = entrada.nextInt();

                    TotienteEuler e = new TotienteEuler();
                    System.out.println("φ(" + n + ") = " + e.calcular(n));
                    break;
                }

                case 8: {
                    System.out.print("Quantos sistemas? ");
                    int size = entrada.nextInt();

                    int[] restos = new int[size];
                    int[] modulos = new int[size];

                    for (int i = 0; i < size; i++) {
                        System.out.print("Resto " + (i + 1) + ": ");
                        restos[i] = entrada.nextInt();

                        System.out.print("Módulo " + (i + 1) + ": ");
                        modulos[i] = entrada.nextInt();
                    }

                    int res = TeoremaChinesResto.resolver(restos, modulos);
                    System.out.println("Resultado TCR = " + res);
                    break;
                }

                case 9: {
                    entrada.nextLine(); // limpar buffer

                    System.out.print("Digite uma mensagem: ");
                    String mensagem = entrada.nextLine();

                    int[] cifrada = rsa.cifrarTexto(mensagem);

                    System.out.print("Mensagem Cifrada: ");
                    for (int c : cifrada) {
                        System.out.print(c + " ");
                    }

                    System.out.println();

                    String decifrada = rsa.decifrarTexto(cifrada);

                    System.out.println("Mensagem Decifrada: " + decifrada);
                    break;
                }

                case 0:
                    System.out.println("A sair do programa...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        entrada.close();
    }
}