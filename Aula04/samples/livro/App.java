package samples.livro;

public class App {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Uma nova chance para o sr. Dobler","Seni Glaister", 436);

        /*
        livro1.titulo = "Uma nova chance para o sr. Dobler";
        livro1.autor = "Seni Glaister";
        livro1.num_pags = 436;
        */
        System.out.println(livro1.exibir());
    }
    
}