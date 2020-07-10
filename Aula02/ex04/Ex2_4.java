package ex04;

import java.util.Scanner;

public class Ex2_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double salario, prest, val_max_prest;

        System.out.println("Qual é o salário bruto? ");
        salario = in.nextDouble();
        System.out.println("Qual o valor da prestação que deseja? ");
        prest = in.nextDouble();
        in.close();

        val_max_prest = 0.3*salario;

        if (prest <= val_max_prest) {
            System.out.println("Crédito concedido!");
        } else {
            System.out.println("Crédito não concedido...");
        }
    }
    
}