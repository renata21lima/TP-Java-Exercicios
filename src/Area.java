//Calcule a área da circunferência.

import java.util.Scanner;

public class Area {
    public static void main(String[] args) throws Exception {
        Scanner meuScanner = new Scanner(System.in);

        System.out.println("Digite o Raio da Circunferência");
        float raio = meuScanner.nextFloat();
        final double PI = 3.14159;
        double area = PI * Math.pow(raio, 2);
        System.out.println("Area " + area);
    }
}
