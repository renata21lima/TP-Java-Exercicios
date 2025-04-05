//Criar uma coleção com 10 elementos – Inserir os elementos de 1 a 10 no vetor–	Após a inserção, somente após a inserção mostrar o vetor.Obs. Não efetuar a leitura de 10 elementos

public class VetorUmADez {
    public static void main(String[] args) {
        int[] vetor = new int[10];

        for (int i = 0; i < 10; i++) {
            vetor[i] = i + 1;
        }

        System.out.print("Vetor: ");
        for (int num : vetor) {
            System.out.print(num + " ");
        }
    }
}
