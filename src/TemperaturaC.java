//Leia uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. A fórmula de conversão é F <-- (9 * C + 160) /5, sendo f a temperatura em Fahrenheit e C a temperatura em Celsius.

import java.util.Scanner;

public class TemperaturaC {
    public static void main(String[] args) throws Exception {
        Scanner meuScanner = new Scanner(System.in);
        System.out.println("Digite a temperatura em F");
        float F = meuScanner.nextFloat();
        Double C = (F-32)*(5.0/9.0);
        System.out.println("Temperatura " + C);
    }
}
