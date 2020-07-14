package exemplo3;


public class Funcionario {
    //atributos
    private String nome;
    private int horas;
    private double valor_pago;

    public Funcionario(String nome, int horas, double valor_pago) {
        this.nome = nome;
        this.horas = horas;
        this.valor_pago = valor_pago;
    }

    

    /*public double calculo_salario() {
        salario = valor_pago*horas;
        return salario;

    }
    */

    public double getSalario() {
        return valor_pago*horas;
    }

    public String getNome() {
        return nome;
    }


    public int getHoras() {
        return horas;
    }

    public double getValor_pago() {
        return valor_pago;
    }

    @Override
    public String toString() {
        //getSalario();
        return "O salário de " + nome + " é: " + getSalario();
    }
    

    
}