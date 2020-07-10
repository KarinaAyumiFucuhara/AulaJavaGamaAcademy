package exs;

import java.util.Scanner;

public class Ex3_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x, i, result;

        System.out.print("Qual número você deseja multiplicar? ");
        x = in.nextInt();
        in.close();

        i=0;
        while(i<=10) {
            result = i*x;
            System.out.println(String.format("%d x %d = %d", x, i, result));
            i++;

        }
    }
    
}