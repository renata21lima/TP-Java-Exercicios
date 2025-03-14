// Criar um vetor A do tipo inteiro de 5 elementos–	Solicitar os valores para o usuário e inserir no vetor A–	Criar um vetor B do tipo inteiro  –	Ler o vetor A e para cada elemento lido calcular o fatorial e gravar no B–	Após de todos os elementos do vetor A, mostrar os dois vetores
import java.util.Scanner;

public class FatorialAeB {
    public static void main(String[] args) {
        Scanner meuScanner = new Scanner(System.in);
        
        int[] a = new int[5];
        int[] b = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o número para a posição " + (i + 1) + " de A: ");
            a[i] = meuScanner.nextInt();
        }

        for (int i = 0; i < a.length; i++) {
            b[i] = calcularFatorial(a[i]);
        }

        System.out.println("\nVetor A:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println("\nFatoriais:");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }

        meuScanner.close();
    }

    public static int calcularFatorial(int num) {
        int fatorial = 1;
        for (int i = 1; i <= num; i++) {
            fatorial *= i;
        }
        return fatorial;
    }
}

