//

import java.util.Scanner;

public class MediaAluno {

    public static void lerNotas(double[] prova1, double[] prova2) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite a nota da primeira prova do aluno " + (i + 1) + ": ");
            prova1[i] = scanner.nextDouble();
            System.out.print("Digite a nota da segunda prova do aluno " + (i + 1) + ": ");
            prova2[i] = scanner.nextDouble();
        }
    }

    public static void calcularMedia(double[] prova1, double[] prova2) {
        for (int i = 0; i < 5; i++) {
            double media = (prova1[i] + prova2[i]) / 2;
            System.out.println("A média do aluno " + (i + 1) + " é: " + media);
        }
    }

    public static void main(String[] args) {
        double[] prova1 = new double[5];
        double[] prova2 = new double[5];

        lerNotas(prova1, prova2);

        calcularMedia(prova1, prova2);
    }
}