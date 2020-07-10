package ex04;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double med_km, med_milha, med_jarda, med_pe, med_pol;

        System.out.print("Qual é a medida em km? ");
        med_km = entrada.nextDouble();
        med_milha = med_km*0.62137;
        med_jarda = med_milha*1.760;
        med_pe = med_jarda*3;
        med_pol = med_pe*12;

        System.out.print(String.format("Em pés: %f\nEm polegadas: %f\nEm jardas: %f\nEm milhas: %f", med_pe, med_pol, med_jarda, med_milha));
        entrada.close();
        
    }
    
}