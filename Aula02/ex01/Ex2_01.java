package ex01;

import java.util.Scanner;

public class Ex2_01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;

        System.out.println("Digite um número: ");
        num = entrada.nextInt();

        if (num > 20) {
            System.out.println("A metade deste número é: " + ((float)num/2)); //deve colocar o (float) na frente de num e NÃO na frente de (num/2), pois se for feito em (num/2) esse cálculo já será feito com num como inteiro e o resultado da conta será dada em int
        }

        entrada.close();
    }
    
}