//presente os valores de conversão de graus Celsius em Fahrenheit, de 10 em 10 graus, iniciando a contagem em 10 graus Celsius e finalizando em 100 graus Celsius. O programa deve apresentar os valores das duas temperaturas.

import java.util.Scanner;

public class CelsiusF {
    public static void main(String[] args) {
        Scanner meuScanner = new Scanner(System.in);
        for (int celsius = 10; celsius <= 100; celsius += 10) {
            double fahrenheit = (celsius * 9.0 / 5.0) + 32;
            System.out.printf("C°: " + celsius + "F° " + fahrenheit);
        }
    }
}
