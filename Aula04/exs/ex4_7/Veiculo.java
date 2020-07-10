package exs.ex4_7;

public class Veiculo {
    String modelo, marca;   
    int consumo;

    Veiculo (String modelo, String marca, int consumo) {
        this.modelo = modelo;
        this.consumo = consumo;
        this.marca = marca;
    }

    String dados() {
        return ("Modelo: " + modelo + " (" + marca + ")");
    }

    int show_consumo() {
        //System.out.printf("\nO consumo é de %dkm/l", consumo);
        return (consumo);
    }
    
}