//Leia o código do item pedido, a quantidade e calcule o valor a ser pago por aquele lanche. Considere que a cada execução somente será calculado um item.

import java.util.Scanner;

public class Lanchonete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Cardápio:");
        System.out.println("100 - Cachorro quente      - R$ 1,20");
        System.out.println("101 - Bauru simples        - R$ 1,30");
        System.out.println("102 - Bauru com ovo        - R$ 1,50");
        System.out.println("103 - Hambúrguer           - R$ 1,20");
        System.out.println("104 - Cheeseburguer        - R$ 1,30");
        System.out.println("105 - Refrigerante         - R$ 1,00");
        
        System.out.print("Digite o código do item pedido: ");
        int codigo = scanner.nextInt();
        
        System.out.print("Digite a quantidade: ");
        int quantidade = scanner.nextInt();
        
        double valorTotal = 0;
        
        if (codigo == 100) {
            valorTotal = quantidade * 1.20;
        } else if (codigo == 101) {
            valorTotal = quantidade * 1.30;
        } else if (codigo == 102) {
            valorTotal = quantidade * 1.50;
        } else if (codigo == 103) {
            valorTotal = quantidade * 1.20;
        } else if (codigo == 104) {
            valorTotal = quantidade * 1.30;
        } else if (codigo == 105) {
            valorTotal = quantidade * 1.00;
        } else {
            System.out.println("Código inválido!");
            return;
        }
        
        System.out.printf("Valor total a pagar: " + valorTotal);
    }
}

