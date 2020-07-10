package ex11;

import java.util.Scanner;

public class Ex2_11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int dia;

        System.out.print("Digite o dia (entre 1 e 7): ");
        dia = in.nextInt();

        in.close();

        switch(dia) {
            case 6:
            case 7:
            System.out.println("Uhhhh! Final de semana!");
            break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            System.out.println("Dia útil");
            break;
            default:
            System.out.println("Dia inválido.");
        }
    }
}