package exemplo4;

public class Pessoa {
    private String nome;
    private  Endereco ender;

    public Pessoa(String nome) {
        this.nome = nome;
        ender = new Endereco(); //precisa criar o objeto, se não vai dar erro no código
    }

    public String exibir() {
        return nome + ": " + ender.exibir();
    }
}