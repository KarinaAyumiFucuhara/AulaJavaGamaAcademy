package exemplo1;

public class Gerente extends Func {
    private int q_func;
    public Gerente(String nome, double salario, int q_func) {
        super(nome, salario);
    }

    public void teste() {
        System.out.println(getNome());
        System.out.println(getSalario());

    }

    //Polimorfismo
    @Override //Deixa claro que está sobrecarregando um método da class super (func)
    public String exibir() {
        return getNome() + ":" + getSalario() + ":" + q_func;
    }

    @Override
    public String toString() {
        return super.toString() + ":" + q_func;
    }


}