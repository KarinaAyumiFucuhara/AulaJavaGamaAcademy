package ex07;

import java.util.Scanner;

public class Ex2_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double salario;

        System.out.println("Qual é o seu salário? ");
        salario = in.nextDouble();

        in.close();

        if(salario<=600) {
            System.out.print("Está isento de desconto do INSS.");
        } else {
            if(salario<=1200) { //não precisa testar de novo pois já foi testado no if anterior Ex: if(salario>600 && salario<=1200)
                System.out.println("O desconto é de 20%");
            } else {
                if(salario<=2000) {
                    System.out.println("O desconto é de 25%");
                }else {
                    System.out.println("O desconto é de 30%");
                }
            }
        }
    }
}