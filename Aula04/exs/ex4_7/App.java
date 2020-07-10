package exs.ex4_7;

public class App {
    public static void main(String[] args) {
        Veiculo veiculo1 = new Veiculo("Fox", "VW", 30);

        System.out.printf("\n%s", veiculo1.dados());
        System.out.printf("\nO consumo é de %dkm/l",veiculo1.show_consumo());
    }
}