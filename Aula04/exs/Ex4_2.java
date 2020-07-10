package exs;

import java.util.Scanner;

public class Ex4_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nomes[];

        nomes = new String[7];

        for (int i = 0; i < nomes.length; i++) {
            System.out.printf("%d.Digite o nome: ", i+1);
            nomes[i] = in.nextLine();

        }

        for (int i = nomes.length-1; i >=0; i--) {
            System.out.println(nomes[i]);    
        }
        in.close();
    }
    
    
}