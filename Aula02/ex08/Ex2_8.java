package ex08;

import java.util.Scanner;

public class Ex2_8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float a, b, c; //lados do triângulo

        System.out.println("Digite o lado 1: ");
        a = in.nextFloat();
        System.out.println("Digite o lado 2: ");
        b = in.nextFloat();
        System.out.println("Digite o lado 3: ");
        c = in.nextFloat();

        in.close();

        if (a>b+c || b>a+c || c>a+b) {
            System.out.println("Não é um triângulo...");   
        } else{
            if (a == b && b == c) {
                System.out.println("É um triângulo equilátero!");
            }else {
                if (a == b || b == c || a == c) {
                    System.out.println("É um triângulo isósceles!");
                } else{
                    System.out.println("É um triângulo escaleno");
                }
            }
        }
    }
    
}