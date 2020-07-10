package exs;

import java.util.Scanner;

public class Ex4_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String palavra;
        int total;
        

        System.out.println("Digite uma palavra: ");
        palavra = in.nextLine();

        total = conta_vogais(palavra);
        System.out.println("Quantidade de vogais: " + total);
        
        in.close();
            
        }

    static int conta_vogais (String palavra) {
        int vogais=0;
        palavra = palavra.toLowerCase();
        
        for (int i = 0; i < palavra.length(); i++) {
            char letra;
            letra = palavra.charAt(i);
            if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                vogais++;
            }
        }
        return vogais;

    }
}