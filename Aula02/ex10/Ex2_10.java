package ex10;

import java.util.Scanner;

public class Ex2_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float num1, num2;
        char op;

        System.out.println("Digite dois números:");
        num1 = in.nextFloat();
        num2 = in.nextFloat();

        System.out.println("Digite o operador lógico (+, -, *, /):");
        in.nextLine();
        op = in.next().charAt(0);

        in.close();

        switch(op) {
            case '+': 
            System.out.println("O resultado é: " + (num1+num2));
            break;

            case '-':
            System.out.println("O resultado é: " + (num1-num2));
            break;

            case '*':
            System.out.println("O resultado é: " + (num1*num2));
            break;

            case '/':
            if (num2 == 0) {
                System.out.println("Não é possível dividir...");
            }else {
                System.out.println("O resultado é: " + num1/num2);
            }
            break;
    
            default:
            System.out.println("O operador não é válido. Tente de novo!");
        }
    }   
    
}