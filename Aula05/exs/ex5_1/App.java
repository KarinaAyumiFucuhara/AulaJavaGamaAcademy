package exs.ex5_1;

public class App {
    public static void main(String[] args) {
        
        Placar placar1 = new Placar();
        Placar placar2 = new Placar("São Paulo", "Corinthians");
        Placar placar3 = new Placar("time1", "time2", 4, 5);

        System.out.println(placar1.exibir_placar());
        System.out.println(placar2.exibir_placar());
        System.out.println(placar3.exibir_placar());
    }
}