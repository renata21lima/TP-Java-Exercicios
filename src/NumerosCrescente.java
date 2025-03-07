//eia 3 (três) valores inteiros e apresente os 3 números em ordem crescente

import java.util.Arrays;
import java.util.Scanner;

public class NumerosCrescente {
    public static void main(String[] args) throws Exception {
        Scanner meuScanner = new Scanner(System.in);

        System.out.println("Digite três números inteiros:");
        int[] numeros = {meuScanner.nextInt(), meuScanner.nextInt(), meuScanner.nextInt()};

        Arrays.sort(numeros);

        System.out.println("Números em ordem crescente: " + Arrays.toString(numeros));

        meuScanner.close();
    }
}

