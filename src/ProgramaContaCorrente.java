//Fazer um programa para ler os dados de uma Conta corrente. Em seguida, mostrar a tela todos os atributos. Utilize classe e crie 2 métodos.

*

import java.util.Scanner;

class ContaCorrente {
    private String numeroConta;
    private String nomeCliente;
    private String cpf;
    private double saldo;


    public void definirDados(String numeroConta, String nomeCliente, String cpf, double saldo) {
        this.numeroConta = numeroConta;
        this.nomeCliente = nomeCliente;
        this.cpf = cpf;
        this.saldo = saldo;
    }

    public void mostrarDados() {
        System.out.println("Número da Conta: " + numeroConta);
        System.out.println("Nome do Cliente: " + nomeCliente);
        System.out.println("CPF: " + cpf);
        System.out.println("Saldo da Conta: R$ " + saldo);
    }
}

public class ProgramaContaCorrente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaCorrente conta = new ContaCorrente();
        System.out.print("Digite o número da conta: ");
        String numeroConta = scanner.nextLine();
        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();
        System.out.print("Digite o CPF do cliente: ");
        String cpf = scanner.nextLine();
        System.out.print("Digite o saldo da conta: R$ ");
        double saldo = scanner.nextDouble();

        conta.definirDados(numeroConta, nomeCliente, cpf, saldo);

        System.out.println("\nDados da Conta Corrente:");
        conta.mostrarDados();
    }
}
