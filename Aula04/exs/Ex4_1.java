package exs;

import java.util.Scanner;

public class Ex4_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double notas[], soma =0, media;
        int acima_media=0;

        notas = new double[10];
        
        for (int i = 0; i < notas.length; i++) {
            System.out.printf("Digite a nota do aluno %d: ", (i+1));
            notas[i] = in.nextDouble();
            soma += notas[i];

        }
        //Media das notas
        media = soma/10;

        //Mostrar a nota dos alunos e contar quem tá acima da média
        System.out.printf("\nAs notas dos alunos foram:");
        for (int i = 0; i < notas.length; i++) {
            System.out.printf("\nAluno %d: %.1f", (i+1), notas[i]);
            if(notas[i]>media) {
                acima_media++;
                System.out.printf(" - acima da média");
            }
        }
        
        System.out.printf("\n\nA média da turma foi: " + media);
        System.out.printf("\nA quantidade de alunos acima da média foi " + acima_media);
        in.close();
    }
    
}