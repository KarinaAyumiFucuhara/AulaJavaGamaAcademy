package ex09;

import java.util.Scanner;

public class Ex2_9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n1, n2, n3, n4, nexame, media1, media2;
        int qfalta;

        System.out.println("Qual é a nota 1:");
        n1 = in.nextDouble();
        System.out.println("Qual é a nota 2:");
        n2 = in.nextDouble();
        System.out.println("Qual é a nota 3:");
        n3 = in.nextDouble();
        System.out.println("Qual é a nota 4:");
        n4 = in.nextDouble();
        System.out.println("Qual é a quantidade de faltas?");
        qfalta = in.nextInt();

        media1 = (n1+n2+n3+n4)/4;

        if (qfalta>=16) {
            System.out.println("Reprovado por falta? Ai...");
        }else {
            if (media1 >= 6) {
                System.out.println("Aprovado!!!");
                
            }else {
                System.out.println("Qual foi a nota do Exame?");
                nexame = in.nextDouble();
                media2 = (media1+nexame)/2;
                if (media2 >= 5) {
                    System.out.println("Aprovado!!!");
                }else{
                    System.out.println("Sorry...Reprovado...");
                }
                in.close();

            }
        }
    }
}

/*
   int valor = 10;
        int result;

        if (valor > 0) {
            result = 10;
        } else {
            result = 20;
        }

        result = (valor > 0) ? 10 : 20;        é exatamente igual as linhas do if else

        System.out.println(result);
*/