//Receba um número e mostre o resto da divisão por 6.

import java.util.Scanner;

public class Resto {
    public static void main(String[] args) throws Exception {
        Scanner meuScanner = new Scanner(System.in);

        System.out.println("Digite o numero");
        float num = meuScanner.nextFloat();
        float resto = num % 6;
        System.out.println("Resto: " + resto);
    }
}
