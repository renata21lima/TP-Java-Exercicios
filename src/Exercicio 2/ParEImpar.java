//Efetue a leitura de um número inteiro e apresentar uma mensagem informando se o número é par ou ímpar.

import java.util.Scanner;

public class ParEImpar {
    public static void main(String[] args) throws Exception {
        Scanner meuScanner = new Scanner(System.in);

        System.out.println("Digite o numero");
        int num = meuScanner.nextInt();
        if(num % 2 == 0){
            System.out.println("Par");
        } else {
            System.out.println("Impar");
        }
    }
}
