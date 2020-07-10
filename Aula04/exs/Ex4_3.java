package exs;

import java.util.Random;
import java.util.Scanner;

public class Ex4_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int dados[], face1=0, face2=0, face3=0, face4=0, face5=0, face6=0;
        Random random = new Random();

        dados = new int[100];

        for (int i = 0; i < dados.length; i++) {
            dados[i] = 1 + random.nextInt(6);
            
            switch(dados[i]) {
                case 1:
                face1++;
                break;
                case 2:
                face2++;
                break;
                case 3:
                face3++;
                break;
                case 4:
                face4++;
                break;
                case 5:
                face5++;
                break;
                default:
                face6++;
                break;
            }
            

        }
        in.close();
        System.out.println("Face 1:" + face1);
        System.out.println("Face 2:" + face2);
        System.out.println("Face 3:" + face3);
        System.out.println("Face 4:" + face4);
        System.out.println("Face 5:" + face5);
        System.out.println("Face 6:" + face6);

    }
    
}