package ex6_6;

public class ContaCorrente extends Conta{

    public ContaCorrente(String num_conta) {
        super(num_conta);
    }

    public boolean saque (double valor) {
        if (valor>0 && getSaldo()>=valor) {
            saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

   
    
}