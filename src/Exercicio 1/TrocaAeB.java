//Ler dois valores inteiros para as variáveis A e B e efetuar a troca dos valores de forma que a variável A passe a possuir o valor da variável B e a variável B passe a possuir o valor da variável A. Apresentar os valores trocados.

import java.util.Scanner;

public class TrocaAeB {
    public static void main(String[] args) throws Exception {
        Scanner meuScanner = new Scanner(System.in);
        System.out.print("Digite o valor de A: ");
        int a = meuScanner.nextInt();

        System.out.print("Digite o valor de B: ");
        int b = meuScanner.nextInt();

        System.out.println("Antes da troca:");
        System.out.println("A = " + a + ", B = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("Depois da troca:");
        System.out.println("A = " + a + ", B = " + b);
    }
}
