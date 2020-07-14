package exemplo4;

public class Endereco {
    private String logradouro;
    private int num;

    public Endereco(){}

    public Endereco(String logradouro, int num) {
        this.logradouro = logradouro;
        this.num = num;
    }

    public String exibir() {
        return logradouro + num;
    }
}