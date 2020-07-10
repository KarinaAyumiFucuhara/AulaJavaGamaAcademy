package ex05;

import java.util.Scanner;

public class Ex2_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String senha;

        System.out.println("Qual é a senha?");
        senha = in.nextLine();

        in.close();

        if(senha.equals("R10p5")) {
            System.out.println("Acesso Concedido!");
        } else{
            System.out.println("Acesso Danado!");
        }

    }
}