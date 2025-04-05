// Leia a idade de uma pessoa expressa em ano, mês e dia e mostre-as em dias.

import java.util.Scanner;

public class Idade {
    public static void main(String[] args) throws Exception {
        Scanner meuScanner = new Scanner(System.in);

        System.out.println("Digite sua idade em anos: ");
        int anos = meuScanner.nextInt();

        System.out.print("Digite os meses: ");
        int meses = meuScanner.nextInt();

        System.out.print("Digite os dias: ");
        int dias = meuScanner.nextInt();

        int totalDias = (anos * 365) + (meses * 30) + dias;

        System.out.println("Idade expressa em dias é: " + totalDias);
        
    }
}
