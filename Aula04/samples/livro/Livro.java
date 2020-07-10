package samples.livro;

public class Livro {
    //atributos
    String titulo, autor;
    int num_pags;

    //métodos

    //método construtor
    //this refere ao próprio objeto (atributo do objeto). Para diferenciar do parâmetro
    Livro(String titulo, String autor, int num_pags) {
        this.titulo = titulo;
        this.autor = autor;
        this.num_pags = num_pags;
    }

    String exibir() {
        return (titulo + ": " + autor + " (" + num_pags + 
        ")");
    }
}