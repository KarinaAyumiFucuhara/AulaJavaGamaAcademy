package sample04;

import java.util.TreeSet;

public class sample04_Arvore {
    public static void main(String[] args) {
        TreeSet<Integer> arvore = new TreeSet<>();

        int [] vetor = {1, 4, 5, 7, 9, 3, 3};
        for (int i : vetor) {
            System.out.println(arvore.add(i) ? "inserido": "falha");
            //valores iguais são descartados
        }

        //percorre a árvore in-order
        for (int i : arvore) {
            System.out.println(i + " ");
        }
    }
}