package exs;

import java.util.Scanner;

public class Ex3_12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char cont;
        int n, max=Integer.MIN_VALUE, min=Integer.MAX_VALUE, somapares=0, p=0, i=0, t=0;
        double mediapares=0, p_impares=0;

        cont = 'y';
        while(cont == 'y' || cont == 'Y') {
            t++; //Contagem dos números inseridos
            do {
                System.out.printf("%d.Insira um número positivo: ", t);
                n = in.nextInt();
            } while(n<0);
            

            //Verificar o maior número digitado
            if(n>max) {
                max = n;
            }

            //Verificar o menor número digitado
            if(n<min) {
                min = n;
            }

            //Média dos números pares
            if(n%2 == 0) {
                somapares += n;
                p++;
                
            }

            //Porcentagem dos núemeros ímpares entre todos os números digitados
            if(n%2 == 1) {
                i++;
                
            }           
            System.out.print("\nVocê deseja inserir mais números? (Y/N) ");
            cont = in.next().charAt(0);

        }
        in.close();
        mediapares = (double)somapares/p;
        p_impares = (double)i/t*100;
        System.out.println("O maior número digitado é " + max);
        System.out.println("O menor número digitado é: " + min);
        System.out.printf("A media dos pares é: %.1f\n", mediapares);
        System.out.printf("A porcentagem dos números ímpares é: %.1f%%", p_impares);

    }
    
}