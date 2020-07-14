package ex7_2;

import java.util.Scanner;
import java.util.Stack;

public class Ex7_2 {
    public static void main(String[] args) {
        Stack <Character> pilha = new Stack<>();
        String frase;
        Scanner in = new Scanner(System.in);

        System.out.println("Digite uma frase: ");
        frase = in.nextLine();

        char [] vetor = frase.toCharArray();

        
        for (char c : vetor) {
            
            if(c!= ' ') {
                pilha.push(c); 
            } else {
                while (!pilha.isEmpty()) {
                    System.out.print(pilha.pop());                    
                }
                
            }
            
            System.out.print(" ");
        }


    }
    
}