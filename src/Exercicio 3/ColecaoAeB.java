//Criar uma coleção “A” com 10 elementos – Inserir os elementos de 1 a 10 na coleção – Criar uma outra coleção B que conterá o elemento da coleção A multiplicado por 2 – Mostrar as duas coleçõesObs. Não efetuar a leitura de 10 elementos

public class ColecaoAeB {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        int[] b = new int[a.length];
        for(int i = 1; i < a.length; i++){
            b[i] = a[i] * 2;
        }
        for (int num : a) {
            System.out.print(num + " ");
        }
        for (int num : b) {
            System.out.print(num + " ");
        }
    }
}
