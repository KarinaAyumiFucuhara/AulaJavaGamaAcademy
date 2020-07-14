package sample02;

import java.util.Stack;

public class Sample02 {
    public static void main(String[] args) {
        Stack <Integer> pilha = new Stack <>();

        //adicionar na pilha
        pilha.push(1);
        pilha.push(2);
        pilha.push(3);
        pilha.push(4);
        pilha.push(5);
        pilha.push(6);
        pilha.push(7);
        
        //esvaziar a pilha
        while(!pilha.isEmpty()){
            System.out.println(pilha.pop());
        }

        System.out.println("FIM");


    }

    
}