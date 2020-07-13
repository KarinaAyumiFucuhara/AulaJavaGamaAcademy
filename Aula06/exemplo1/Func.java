package exemplo1;

//classe implicita Object

public class Func {

    private String nome;
    private double salario;
    

    //public Func(){}

    public Func(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }
    

    public double getSalario() {
        return salario;
    }

    public String getNome() {
        return nome;
    }

    public String exibir() {
        return nome + ":" + salario;
    }

        @Override
        public String toString() {
            return nome + ":" + salario;
        }
    
}