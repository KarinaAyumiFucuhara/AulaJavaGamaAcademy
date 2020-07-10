package ex01;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota01, nota02, media;

        System.out.println("Qual é a nota de Matemática?");
        nota01 = entrada.nextDouble();

        System.out.println("Qual é a nota de Geografia?");
        nota02 = entrada.nextDouble();

        media = (nota01 + nota02)/2;

        System.out.println("A média das notas é: " + media);

        entrada.close();
    }
    
}