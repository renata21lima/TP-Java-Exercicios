// Leia uma temperatura em graus Fahrenheit e apresentá-la convertida em graus Celsius. A formula de conversão é C <-- (F - 32) * (5/9), sendo f a temperatura em Fahrenheit e C a temperatura em Celsius.

import java.util.Scanner;

public class TemperaturaF {
    public static void main(String[] args) throws Exception {
        Scanner meuScanner = new Scanner(System.in);
        System.out.println("Digite quantos graus C");
        float C = meuScanner.nextFloat();
        float F = (9 * C + 160)/5 ;
        System.out.println("Total: " + F);
    }
}
