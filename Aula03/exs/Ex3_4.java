package exs;

import java.util.Scanner;

public class Ex3_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i, x, par, impar;

        i=1;
        par=0;
        impar=0;
        while(i<=10) {
            System.out.print(String.format("Digite o %dº número: ", i));
            x = in.nextInt();
            i++;
            if (x%2 == 0) {
                par++;
            }else {
                impar++;
            }

        }
        in.close();
        System.out.println("Quantidade de pares: " + par);
        System.out.println("Quantidade de ímpares: " + impar);



    }
    
}