package ex02;

import java.util.Scanner;



public class Ex02 {
    public static void main(String[] args) {
        double salario;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Qual seu salário atual? R$");
        salario = entrada.nextDouble();

        System.out.println("Seu novo salário será: R$" + (1.25*salario) );
        entrada.close();
    }
    
}