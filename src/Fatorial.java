//Receba um número e mostre o fatorial desse número.

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner meuScanner = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero = meuScanner.nextInt();

        long fatorial = 1;
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }

        System.out.println("O fatorial de " + numero + " é: " + fatorial);

        meuScanner.close();
    }
}
