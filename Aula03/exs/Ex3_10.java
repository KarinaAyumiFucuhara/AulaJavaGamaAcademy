package exs;

import java.util.Scanner;

public class Ex3_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int q_eleitores=5;
        int voto;
        double votosval, cand1=0, cand2=0, cand3=0, cand4=0, nulo=0, branco=0;

        for(int i=1; i<=q_eleitores; i++) {
            System.out.printf("Digite seu voto:");
            voto = in.nextInt();

            switch(voto) {
                case 1:
                cand1++;
                break;
                case 2:
                cand2++;
                break;
                case 3:
                cand3++;
                break;
                case 4:
                cand4++;
                break;
                case 5:
                nulo++;
                break;
                case 6:
                branco++;
                break;
            }

        }

        votosval = cand1 + cand2 + cand3 + cand4;
        System.out.printf("\nTotal de votos para cada candidato:\n");
        System.out.printf("Candidato 1: %.0f(%.1f%%)\nCandidato 2: %.0f(%.1f%%)\nCandidato 3: %.0f(%.1f%%)\nCandidato 4: %.0f(%.1f%%)\n", cand1, (cand1/votosval)*100, cand2, (cand2/votosval)*100, cand3, (cand3/votosval)*100, cand4, (cand4/votosval)*100);
        System.out.printf("\nTotal de votos nulos: %.0f(%.1f%%)", nulo, (nulo/q_eleitores*100));
        System.out.printf("\nTotal de votos em branco: %.0f(%.1f%%)", branco, (branco/q_eleitores*100));


        in.close();
    }
    
}