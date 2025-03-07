//Apresentar o total da soma obtida dos cem primeiros números inteiros ( 1 + 2 + 3 + 4 + .... 98+ 99+ 100).
import java.util.Scanner;

public class ProgAritimetica {
    public static void main(String[] args) {
        Scanner meuScanner = new Scanner(System.in);
        int primeiroTermo = 1;
        int ultimoTermo = 99;
        int razao = 1;

        int n = (ultimoTermo - primeiroTermo) / razao + 1;
        int soma = n * (primeiroTermo + ultimoTermo) / 2;
        System.out.println(soma);
    }
}
