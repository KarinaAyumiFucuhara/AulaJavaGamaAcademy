package exs;

import java.util.Scanner;

public class Ex3_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, m, max, i=1;

            System.out.printf("\n%d.Digite um número: ", i);
            n = in.nextInt();
            max = n;
            for(int j=2; j<=10; j++) {
                System.out.printf("\n%d.Digite um número: ", j);
                m = in.nextInt();
                if(m>max) {
                    max = m;
            }
        }
        in.close();
        System.out.println("\nO maior número é: " + max);


    }
    
}
