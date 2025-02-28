//Efetuar o cálculo e a apresentação do valor de uma prestação em atraso, utilizando a fórmula PRESTAÇÃO <-- VALOR + (VALOR * (TAXA/100) * TEMPO).

import java.util.Scanner;

public class Taxa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da prestação: ");
        double valor = scanner.nextDouble();

        System.out.print("Digite a taxa de juros (% ao mês): ");
        double taxa = scanner.nextDouble();

        System.out.print("Digite o tempo de atraso (em meses): ");
        int tempo = scanner.nextInt();

        double prestacao = valor + (valor * (taxa / 100) * tempo);

        System.out.printf("O valor da prestação em atraso é: R$ ", prestacao);
    }
}
