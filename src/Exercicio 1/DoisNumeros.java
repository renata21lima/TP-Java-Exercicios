//Receba 2 números e apresente a multiplicação dos dois números.

import java.util.Scanner;

public class DoisNumeros {
    public static void main(String[] args) throws Exception {
        Scanner meuScanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero");
        int A = meuScanner.nextInt();

        System.out.println("Digite o segundo numero");
        int B = meuScanner.nextInt();

        int multiplicacao = A * B;

        System.out.println("Total: " + multiplicacao);
    }
}
