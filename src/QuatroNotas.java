//Leia quatros valores referentes a quatro notas escolares de um aluno e imprimir uma mensagem dizendo que o aluno foi aprovado, se o valor da média escolar for maior ou igual a 7. Se o aluno não foi aprovado, indicar uma mensagem informando esta condição. Apresentar junto das mensagens o valor da média do aluno para qualquer condição.

import java.util.Scanner;

public class QuatroNotas{
    public static void main(String[] args) throws Exception {
        Scanner meuScanner = new Scanner(System.in);
    
        System.out.println("Digite quatro notas:");
        float notaUm = meuScanner.nextFloat();
        float notaDois = meuScanner.nextFloat();
        float notaTres = meuScanner.nextFloat();
        float notaQuatro = meuScanner.nextFloat();

        float media = (notaUm+notaDois+notaTres+notaQuatro)/4;

        if(media >= 7){
            System.out.println(media + ": Aprovado");
        } else{
            System.out.println(media + ": Reprovado");
        }
    }
}

