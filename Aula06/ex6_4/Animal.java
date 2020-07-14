package ex6_4;

public class Animal {
    private String nome, raca, cor;
    private int ano_nasc;
    private Proprietario prop;

    public Animal(String nome, String raca, String cor, int ano_nasc) {
        this.nome = nome;
        this.raca = raca;
        this.cor = cor;
        this.ano_nasc = ano_nasc;
        prop = new Proprietario();

    }

    public Animal(String nome, String raca, String cor, int ano_nasc, Proprietario prop) {
        this.nome = nome;
        this.raca = raca;
        this.cor = cor;
        this.ano_nasc = ano_nasc;
        prop = new Proprietario();
    }

    @Override
    public String toString() {
        return "Nome_animal:" + nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getPropName() {
        return prop.getNomeProp();
    }

    public void setProp(Proprietario prop) {
        this.prop = prop;
    }

    

    


    


}