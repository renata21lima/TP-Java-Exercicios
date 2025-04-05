//Efetue a leitura de cinco números inteiros e identificar o maior e o menor valor. Não execute a ordenação de valores.

import java.util.Arrays;
import java.util.Scanner;

public class MaiorEMenor {
    public static void main(String[] args) throws Exception {
        Scanner meuScanner = new Scanner(System.in);
    
        System.out.println("Digite Cinco números:");
        int[] numeros = {meuScanner.nextInt(), meuScanner.nextInt(), meuScanner.nextInt(), meuScanner.nextInt(), meuScanner.nextInt()};

        int maiorNumero = Arrays.stream(numeros).max().getAsInt();
        int menorNumero = Arrays.stream(numeros).min().getAsInt();
        
        System.out.println("O maior número é: " + maiorNumero);
        System.out.println("O menor número é: " + menorNumero);
    }
}

