package ex02;

import java.util.Scanner;

public class Ex2_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double nota1, nota2, media;

        System.out.print("Qual é a nota1: ");
        nota1 = in.nextDouble();
        System.out.print("Qual é a nota2: ");
        nota2 = in.nextDouble();

        media = 0.4*nota1 + 0.6*nota2;

        if (media >= 6) {
            System.out.println(String.format("O aluno, com a média %f, foi aprovado! :D", media));
        } else {
            System.out.println(String.format("O aluno, com a média %f, foi reprovado... :(", media));
        }

        in.close();

    }
    
}