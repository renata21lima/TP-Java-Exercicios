//Fazer um programa para ler os dados de um Aluno. Em seguida, mostrar a tela todos os atributos. Utilize classe e crie 2 métodos.


import java.util.Scanner;

class CadastroAluno {
    private int ra;
    private String nome;
    private String endereco;
    private String curso;

    public void definirDados(int ra, String nome, String endereco, String curso) {
        this.ra = ra;
        this.nome = nome;
        this.endereco = endereco;
        this.curso = curso;
    }

    public void mostrarDados() {
        System.out.println("RA: " + ra);
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Curso: " + curso);
    }
}

public class RaAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CadastroAluno aluno = new CadastroAluno();

        System.out.print("Digite o RA: ");
        int ra = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o Endereço: ");
        String endereco = scanner.nextLine();

        System.out.print("Digite o Curso: ");
        String curso = scanner.nextLine();

        aluno.definirDados(ra, nome, endereco, curso);

        System.out.println("\nDados do Aluno:");
        aluno.mostrarDados();
    }
}
