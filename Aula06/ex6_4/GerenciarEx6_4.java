package ex6_4;

import java.util.ArrayList;

public class GerenciarEx6_4 {
    private ArrayList<Animal> animais;

    public GerenciarEx6_4() {
        animais = new ArrayList<>();
    }

    public void addAnimal (String nome, String raça, String cor, int ano_nasc, String nomeProp, String telefone) {
        Proprietario proprietario = new Proprietario(nomeProp, telefone);
        Animal animal = new Animal(nome, raça, cor, ano_nasc, proprietario);
        animais.add(animal);
    }

    /*
    public void addProp (String nome, String telefone) {
        Proprietario prop = new Proprietario(nome, telefone);
        animais.add(prop);
    }
    */

    public String listarAnimais() {
        String saida = "";
        
        for (Animal animal : animais) {
            if(animal instanceof Animal) {
                saida += animal.toString() + "\n";
            }
        }
        return saida;
    }

    public String listarProp_dadoRaçaAnimal(String raca) {
       String saida = ""; 
       int i=0;
       for (Animal animal : animais) {
           if(animal.getRaca().equals(raca)) {
            saida += animal.getPropName() + "\n";
            i++;
           }
       }
        return saida + i;
    }

    



}