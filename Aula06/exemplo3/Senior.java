package exemplo3;

public class Senior extends Funcionario {
    private int bonus;

    public Senior(String nome, int horas, double valor_pago, int bonus) {
        super(nome, horas, valor_pago);
        this.bonus = bonus;
    }

    @Override
    public double getSalario() {
        int q_bonus = getHoras()/10;
        return q_bonus*bonus + super.getSalario();

    }

    @Override
    public String toString() {
        //getSalario();
        return "O salário de " + getNome() + " é: " + getSalario();
    }




}