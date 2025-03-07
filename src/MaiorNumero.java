//Leia 3 números inteiros e mostre o maior deles.

import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) throws Exception {
        Scanner meuScanner = new Scanner(System.in);
    
        System.out.println("Digite três números:");
        int numUm = meuScanner.nextInt();
        int numDois = meuScanner.nextInt();
        int numTres = meuScanner.nextInt();

        if(numUm > numDois && numUm > numTres){
            System.out.println("Numero Um é maior");
        } else if(numDois > numTres){
            System.out.println("Numero Dois é maior");
        } else{
            System.out.println("Numero Três é maior");
        }
    }
}
