package exs;

import java.util.Scanner;

public class Ex3_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x, i;
        String result;

        System.out.print("Digite um número: ");
        x = in.nextInt();

        //System.out.print("Sequência impressa: ");
        i=1;
        result = "";
        while(i<=x) {
            result = result + i + " ";
            //System.out.print(" " + i);
            i *=2;
        }
        System.out.println("Sequência impressa: " + result);
        in.close();
    }
    
}