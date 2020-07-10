package ex03;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salmin;
        double energia;
        double rel_salmin_energia;
        double conta_energia;
        double conta_energia_desc;
        final float desc = 0.85f; //final é um valor estático => constante


        System.out.print("Quanto é o salário minímo? R$");
        salmin = entrada.nextDouble();

        System.out.print("Qual é o consumo de energia em kW?");
        energia = entrada.nextDouble();

        rel_salmin_energia = salmin/500;
        conta_energia = rel_salmin_energia*energia;
        conta_energia_desc = (conta_energia*desc);

        System.out.println("O valor, em reais, de cada KW é " + rel_salmin_energia);
        System.out.println("O valor, em reais, a ser pago por essa residência: " + conta_energia);
        System.out.println("O valor, em reais, com desconto de 15%: " + conta_energia_desc);

        entrada.close();







        
    }
    
}