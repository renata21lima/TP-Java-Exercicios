//Efetue a apresentação do valor da conversão em real de um valor lido em dólar. O programa deve solicitar o valor da cotação do dólar e também a quantidade de dólares disponível com o usuário, para que seja apresentado o valor em moeda brasileira.

import java.util.Scanner;

public class Dolar {
        public static void main(String[] args) throws Exception {
        Scanner meuScanner = new Scanner(System.in);

        System.out.println("Digite a cotação do dolar");
        double dolarCot = meuScanner.nextDouble();

        System.out.println("Digite a quantidade de dolar");
        double dolar = meuScanner.nextDouble();

        double real =  dolar * dolarCot;
        System.out.println("Real: R$" + real);

    }
}
