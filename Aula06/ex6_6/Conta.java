package ex6_6;

public abstract class Conta {
    //atributos
    private String num_conta;
    protected double saldo;

    public Conta(String num_conta) {
        this.num_conta = num_conta;
        this.saldo = 0;
    }

    public String ObterDadosConta (String num_conta) {
        return "NºConta: " + num_conta + "\nSaldo: " + saldo;
    }

    public boolean Depositar (double valor) {
        saldo += valor;
        return true;
    }

    public boolean saque (double sacado) {
        return true;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    




    
}