package exs;

import java.util.Scanner;

public class Ex3_9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x, qpositivo;
        float soma, media;


        qpositivo=0;
        soma=0;
        for(int i=1; i<=10; i++) {
            System.out.println(String.format("Digite o %dº número: ", i));
            x = in.nextInt();
            soma += x;

            if(x>0) {
                qpositivo++;
            }

        }
        media = soma/10;
        System.out.print("1.Soma dos nºs digitados: " + soma);
        System.out.print("\n2.Quantidade dos números positivos digitados: " + qpositivo);
        System.out.print("\n3.Média dos nºs digitados: " + media);
        System.out.print("\n4.% de nºs positivos: " + ((float)qpositivo/10)*100);

        in.close();

    }
    
}