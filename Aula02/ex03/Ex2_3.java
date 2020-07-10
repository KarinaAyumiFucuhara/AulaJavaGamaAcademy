package ex03;

import java.util.Scanner;

public class Ex2_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float num1, num2;

        System.out.print("Digite o número 1: ");
        num1 = in.nextFloat();
        System.out.print("Digite o número 2: ");
        num2 = in.nextFloat();

        if (num1>num2) {
            System.out.println(String.format("A ordem decrescente é:\n%f \n%f", num1, num2));
        } else {
            System.out.println(String.format("A ordem decrescente é:\n%f \n%f", num2, num1));
        }

        in.close();
    }
    
}