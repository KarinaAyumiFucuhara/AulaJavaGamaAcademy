package ex7_1;

import java.util.Scanner;
import java.util.Stack;

public class ex7_1 {
    public static void main(String[] args) {
        Stack <Character> pilha = new Stack<>();
        String frase;
        Scanner in = new Scanner(System.in);

        //char [] vetor = frase.toCharArray();
        //para transformar a String em um vetor de char

        System.out.print("Escreva uma frase: ");
        frase = in.nextLine();

        for (int i = 0; i < frase.length(); i++) {
            pilha.push(frase.charAt(i));
        }

        System.out.print("Ao contrário: ");
        while(!pilha.isEmpty()) {
            System.out.print(pilha.pop());
        }

        in.close();

    }
}