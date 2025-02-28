// Efetuar a leitura de um número inteiro e apresentar o resultado do quadrado desse número.

import java.util.Scanner;

public class Quadrado {
    public static void main(String[] args) throws Exception {
        Scanner meuScanner = new Scanner(System.in);

        System.out.println("Digite o numero");
        int num = meuScanner.nextInt();
        int quadrado = (int) Math.pow(num, 4);
        System.out.println("O quadrado de " + num + " é: " + quadrado);
    }
}
