package exemplo1;

public class App {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Fulano", 73463764, 5);
        Func func = new Func("Ana", 765677);

        //gerente.teste();
        System.out.println(gerente.exibir());
        System.out.println(func.exibir());
        System.out.println(func);
        System.out.println(gerente);
    }
}