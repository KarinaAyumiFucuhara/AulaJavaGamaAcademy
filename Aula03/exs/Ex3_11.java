package exs;

import java.util.Scanner;

public class Ex3_11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n, soman, soma_alunos;
        final int q_alunos=5, q_notas=2;

        soma_alunos =0;
        for(int i=1; i<=q_alunos; i++) {
            System.out.println("\nAluno " + i);

            soman = 0;
            for(int j=1; j<=q_notas; j++) {
                do{
                    System.out.printf("Digite a nota %d: ", j);
                    n = in.nextDouble();
                    
                }while(n<0 || n>10);
                soman += n;
            }
            System.out.printf("A média é: %.1f\n", soman/q_notas);

           soma_alunos += soman;
        }
        System.out.println("\nA média da classe é: " + (soma_alunos/(q_alunos*q_notas)));
        in.close();
    }
}