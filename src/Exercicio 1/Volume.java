//Calcular e apresentar o valor do volume de uma lata de óleo, utilizando a fórmula:VOLUME <-- 3.14159 * RAIO2 * ALTURA.

import java.util.Scanner;

public class Volume {
    public static void main(String[] args) throws Exception {
        Scanner meuScanner = new Scanner(System.in);

        System.out.println("Digite a Altura da Lata");
        float altura = meuScanner.nextFloat();

        System.out.println("Digite o Raio Lata");
        float raio = meuScanner.nextFloat();

        final double PI = 3.14159;

        double volume = PI * Math.pow(raio, 2) * altura;

        System.out.println("Volume " + volume);
    }
}
