package exs.ex5_1.aplicativo;

import exs.ex5_1.Placar;

public class App2 {
    public static void main(String[] args) {
        Placar placar1 = new Placar();

        //placar1.gols_time2 = -2;
        System.out.println("Gols: " + placar1.obterGolsTime1());

        placar1.time1FezGol();

        System.out.println(placar1.exibir_placar());
        
    }
}