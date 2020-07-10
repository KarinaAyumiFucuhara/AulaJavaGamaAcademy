package exs.exRelogio;

public class App {
    public static void main(String[] args) {
        Relogio horario1 = new Relogio();

        horario1.setHora(26);
        horario1.setMin(45);
        horario1.setSegundo(54);

        System.out.println(horario1.exibirRelogio());


    }
}