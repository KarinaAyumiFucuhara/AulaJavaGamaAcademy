package ex7_3;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

    Queue<Pessoa> filanormal;
    Queue<Pessoa> filapriori;
    int prox_atend = 0;

    public Fila() {
        this.filanormal = new LinkedList<>();
        this.filapriori = new LinkedList<>();
    }

    public void adicionar_pessoa(String nome, String senha) {
        Pessoa p = new Pessoa(nome, senha);

        if(senha.charAt(0) == 'N') {
            filanormal.add(p);
        }else {
            filapriori.add(p);
        }
    }

    public String remover_pessoa() {
        if(prox_atend<2 && !filapriori.isEmpty()){
            prox_atend ++;
            return filapriori.remove().getNome();
        }else{
            if(!filanormal.isEmpty()){
                prox_atend = 0;
                return filanormal.remove().getNome();
            
            }    
        }
        new Pessoa("Fila vazia", "0000");
        return "A fila está vazia!";
    }

    public String exibir_fila() {
        String pessoas_filanormal="", pessoas_filapriori="";
        for (Pessoa pessoa : filanormal) {
            pessoas_filanormal += pessoa.getNome() + "\n";
        }

        for (Pessoa pessoa : filapriori) {
            pessoas_filapriori += pessoa.getNome() + "\n";
        }
        
        return "Fila normal:\n" + pessoas_filanormal + "\nFila Prioritária:\n" + pessoas_filapriori;       
    }

    public Integer size() {
        return filanormal.size() + filapriori.size(); 
    }
    
}