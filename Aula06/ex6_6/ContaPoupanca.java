package ex6_6;

public class ContaPoupanca extends Conta {

    private static double taxa;

    public ContaPoupanca(String num_conta) {
        super(num_conta);
    }

    public static void setTaxa(double taxa) {
        ContaPoupanca.taxa = taxa;
    }

    public boolean saque(double valor) {
        if(valor > 0 && saldo >= valor) {
            saldo -= valor;
            saldo -= taxa;
        }
        return false;
    }


    
}
    
